package tests;

import org.example.base.BaseTest;
import org.example.pages.DashboardPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DashboardTest extends LoginTest {

    @Override
    protected void loginTest() {
        super.loginTest();

    }

    @Test
    public void DashboardTestClickFunctionality(){
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.clickBlogButton();
        dashboardPage.clickPracticeButton();
        dashboardPage.clickHomeButton();
        dashboardPage.clickContactButton();
        dashboardPage.clickCoursesButton();
    }

}
