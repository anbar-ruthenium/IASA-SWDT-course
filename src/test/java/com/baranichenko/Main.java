package com.baranichenko;

import com.baranichenko.pages.LoginPage;
import com.baranichenko.pages.UserManagement;
import com.baranichenko.pages.NewUser;
import com.baranichenko.pages.SearchUser;
import com.baranichenko.pages.DeleteUser;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class Main {
    public static void main(String args[]) {
        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        LoginPage authorization = new LoginPage(driver);
        authorization.UserName(driver, "Admin"); 
        authorization.Password(driver,"admin123"); 
        authorization.ClickLogin(driver);

        UserManagement user = new UserManagement(driver);
        user.goToUsersPage(driver);
        user.clickAddButton(driver);

        NewUser newUser = new NewUser(driver);
        newUser.enterEmployeeName(driver, "Harry Kane");
        newUser.enterUsername(driver, "Andrii.Baranichenko");
        newUser.enterPassword(driver, "iamfrom$ka95");
        newUser.ConfirmPassword(driver, "iamfrom$ka95");
        newUser.clickSaveButton(driver);

        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(5));
        SearchUser search = new SearchUser(driver);
        search.clickResetButton(driver);
        search.searchEnter(driver, "Andrii.Baranichenko");  

        DeleteUser delete = new DeleteUser(driver);
        delete.CheckAndDelete(driver);
        search.clickResetButton(driver);

        driver.quit();
    }
}
