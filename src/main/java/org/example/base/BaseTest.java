package org.example.base;

import org.example.utils.ConfigReader;
import org.example.utils.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public WebDriver driver;

    @BeforeMethod
    public void setup() {

        ConfigReader.loadProperties();

        driver = DriverFactory.initDriver(ConfigReader.getProperty("browser"));

        driver.get(ConfigReader.getProperty("test-loginurl"));

    }
    @AfterMethod
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}
