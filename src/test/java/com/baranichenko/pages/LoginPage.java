package com.baranichenko.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void UserName(WebDriver driver, String Username)
    {
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys(Username);
    }
    public void Password(WebDriver driver, String Password)
    {
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys(Password);
    }
    public void ClickLogin(WebDriver driver)
    {
        WebElement login = driver.findElement(By.id("btnLogin"));
        login.click();
    }
}