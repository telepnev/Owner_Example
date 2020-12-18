package io.github.telepnev;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class GitHubTest {
    private WebDriver driver;
    @BeforeEach
    public void initDriver() {
        driver = new WebDriverProvider().get();
        driver.manage().window().maximize();
    }

    @Test
    public void testMainGitHub() {
        driver.get("https://github.com");
    }

    @AfterEach
    public void stopDriver() {
        driver.quit();
    }
}
