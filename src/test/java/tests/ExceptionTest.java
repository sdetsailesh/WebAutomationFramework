package tests;

import org.example.pages.DashboardPage;
import org.example.pages.ExceptionPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExceptionTest extends LoginTest{

    @Override
    protected void loginTest() {
        super.loginTest();

    }

    @Test
    public void exceptionTest() throws InterruptedException {
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.clickPracticeButton();
        ExceptionPage exceptionPage = new ExceptionPage(driver);
        exceptionPage.clickAddButton();
    }



}
