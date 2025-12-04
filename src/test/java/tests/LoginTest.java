package tests;

import org.example.base.BaseTest;
import org.example.pages.LoginPage;
import org.example.utils.ConfigReader;
import org.testng.annotations.Test;

public class LoginTest  extends BaseTest {

    @Test
    protected void loginTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(ConfigReader.getProperty("username"),ConfigReader.getProperty("password"));

    }

}
