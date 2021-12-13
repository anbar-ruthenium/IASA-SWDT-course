package com.baranichenko.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class UserManagement {
    By adminMenu = By.id("menu_admin_viewAdminModule");
    By adminUserManagementSubmenu = By.id("menu_admin_UserManagement");
    By viewSystemUsers = By.id("menu_admin_viewSystemUsers");
    By addButton = By.id("btnAdd");
    ChromeDriver driver;

    public UserManagement(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToUsersPage(ChromeDriver driver) {
        driver.findElement(adminMenu).click();
        driver.findElement(adminUserManagementSubmenu).click();
        driver.findElement(viewSystemUsers).click();
    }
    public void clickAddButton(ChromeDriver driver) {
        driver.findElement(addButton).click();
    }
}

