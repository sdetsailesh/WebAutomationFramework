package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By txtUser = By.id("username");
    By txtPass = By.id("password");
    By submit = By.id("submit");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void enterUsername(String user) {
        driver.findElement(txtUser).sendKeys(user);
    }

    public void enterPassword(String pass) {
        driver.findElement(txtPass).sendKeys(pass);
    }

    public void clickSubmit() {
        driver.findElement(submit).click();
    }

    public void login(String user, String pass) {
        enterUsername(user);
        enterPassword(pass);
        clickSubmit();
    }
}

