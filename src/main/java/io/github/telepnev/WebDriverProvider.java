package io.github.telepnev;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.function.Supplier;

public class WebDriverProvider implements Supplier<WebDriver> {
    @Override
    public WebDriver get() {
        final String isRemoteString = System.getProperty("webdriver.remote");
        final boolean isRemote = Boolean.parseBoolean(isRemoteString);
        if (isRemote) {
            final String remoteUrlString = System.getProperty("webdriver.remote.url");
            try {
                final URL remoteURL = new URL(remoteUrlString);
                return new RemoteWebDriver(remoteURL, DesiredCapabilities.chrome());

            } catch (MalformedURLException e) {
               throw new RuntimeException(e);

            }
        } else {
            final String browserName = System.getProperty("browser.name");
            if ("chrome".equals(browserName)) {
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            }
            if ("firefox".equals(browserName)) {
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            }
            throw new RuntimeException("Unknown browser name: " + browserName);
        }
    }

    private String getBrowserName() {
        return System.getProperty("browser.name", "chrome");
    }

}
