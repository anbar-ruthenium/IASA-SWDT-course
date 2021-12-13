package com.baranichenko.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchUser {
    By resetButton = By.id("resetBtn");
    By searchButton = By.id("searchBtn");
    ChromeDriver driver;

    public SearchUser(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickResetButton(ChromeDriver driver) {
        driver.findElement(resetButton).click();
    }
    
    public void searchEnter(ChromeDriver driver, String Username) {
        WebElement userSearch = driver.findElement(By.id("searchSystemUser_userName"));
        userSearch.sendKeys(Username);
        driver.findElement(searchButton).click();
    }
    
}
