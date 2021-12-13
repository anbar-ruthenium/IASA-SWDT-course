package com.baranichenko.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class NewUser {
    By saveButton = By.id("btnSave");
    ChromeDriver driver;

    public NewUser(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterEmployeeName(ChromeDriver driver, String employeeName)
    {
        WebElement employee = driver.findElement(By.id("systemUser_employeeName_empName"));
        employee.sendKeys(employeeName);
    }
    public void enterUsername(ChromeDriver driver, String Username)
    {
        WebElement username = driver.findElement(By.id("systemUser_userName"));
        username.sendKeys(Username);
    }
    public void enterPassword(ChromeDriver driver, String Password)
    {
        WebElement password = driver.findElement(By.id("systemUser_password"));
        password.sendKeys(Password);
    }
    public void ConfirmPassword(ChromeDriver driver, String ConfirmPassword)
    {
        WebElement confirmPassword = driver.findElement(By.id("systemUser_confirmPassword"));
        confirmPassword.sendKeys(ConfirmPassword);
    }
    public void clickSaveButton(ChromeDriver driver) {
        driver.findElement(saveButton).click();
    }
}