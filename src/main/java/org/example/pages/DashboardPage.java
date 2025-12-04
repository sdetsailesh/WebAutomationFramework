package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    WebDriver driver;

    // Locators
    By home = By.xpath("//div[@id='menu-primary']//a[@aria-current='page']");
    By practice = By.xpath("//div[@id='menu-primary']//li[@id='menu-item-20']");
    By courses = By.xpath("//div[@id='menu-primary']//li[@id='menu-item-21']");
    By blog = By.xpath("//div[@id='menu-primary']//li[@id='menu-item-19']");
    By contact = By.xpath("//div[@id='menu-primary']//li[@id='menu-item-18']");

    // Constructor
    public DashboardPage(WebDriver driver){
        this.driver = driver;
    }

    // Action Methods
    public void clickHomeButton(){
        driver.findElement(home).click();
    }

    public void clickPracticeButton(){
        driver.findElement(practice).click();
    }

    public void clickCoursesButton(){
        driver.findElement(courses).click();
    }

    public void clickBlogButton(){
        driver.findElement(blog).click();
    }

    public void clickContactButton(){
        driver.findElement(contact).click();
    }
}
