package io.github.telepnev;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitLabTest {
    private WebDriver driver;
    @BeforeEach
    public void initDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testMainGitLab() {
        driver.get("https://gitlab.com");
    }

    @AfterEach
    public void stopDriver() {
        driver.quit();
    }
}
