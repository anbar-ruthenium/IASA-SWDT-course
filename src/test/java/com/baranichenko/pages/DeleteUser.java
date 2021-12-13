package com.baranichenko.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class DeleteUser {
    By deleteButton = By.id("btnDelete");
    By checkBox = By.id("ohrmList_chkSelectAll");
    By dialogDelete = By.id("dialogDeleteBtn");
    ChromeDriver driver;

    public DeleteUser(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void CheckAndDelete(ChromeDriver driver) {
        driver.findElement(checkBox).click();
        driver.findElement(deleteButton).click();
        driver.findElement(dialogDelete).click();      
    }
}
