package com.baranichenko;

import com.baranichenko.pages.LoginPage;
import com.baranichenko.pages.UserManagement;
import com.baranichenko.pages.NewUser;
import com.baranichenko.pages.SearchUser;
import com.baranichenko.pages.DeleteUser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StepDefinition {
    private LoginPage loginPage;
    private UserManagement userManagement;
    private NewUser newUser;
    private SearchUser searchUser;
    private DeleteUser deleteUser;

    private static ChromeDriver driver;

    @Before
    public void driverSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

    @Given("^that I'm on Login page$")
    public void goToLoginPage() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        loginPage = new LoginPage(driver);
    }

    @When("^I enter username \"([^\"]*)\"$")
    public void enterUsername(String username) throws Exception {
        loginPage.UserName(driver, username);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void enterPassword(String passwd) throws Exception {
        loginPage.Password(driver, passwd);
    }

    @Then("^I get logged in$")
    public void isLoggedIn() throws Exception {
        loginPage.ClickLogin(driver);
    }

    @Given("^that I'm on System Users page$")
    public void goToSystemPage() {
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
        userManagement = new UserManagement(driver);
    }

    @When("^I press add button$")
    public void addButton() throws Exception {
        userManagement.clickAddButton(driver);
    }

    @And("^I enter employee name \"([^\"]*)\"$")
    public void employeeName(String employeeName) throws Exception {
        newUser.enterEmployeeName(driver, employeeName);
    }

    @And("^enter username \"([^\"]*)\"$")
    public void userName(String UserName) throws Exception {
        newUser.enterUsername(driver, UserName);
    }

    @And("^enter password \"([^\"]*)\"$")
    public void userPassword(String password) throws Exception {
        newUser.enterPassword(driver, password);
    }

    @And("^confirm password \"([^\"]*)\"$")
    public void confirmPassword(String confirmPassword) throws Exception {
        newUser.ConfirmPassword(driver, confirmPassword);
    }

    @And("^click save button$")
    public void clickSave() throws Exception {
        newUser.clickSaveButton(driver);
    }

    @Then("^I see new user \"([^\"]*)\" in the table$")
    public void userInTable() throws Exception {
        
    }

    @When("^I press search button entering the username$")
    public void searchUsername(String username) throws Exception {
        searchUser.searchEnter(driver, username);
    }

    @Then("^I see username in the short-table$")
    public void foundUser() throws Exception {
        
    }

    @When("^I delete user \"([^\"]*)\"$")
    public void deleteUsername() throws Exception {
        deleteUser.CheckAndDelete(driver);
    }

    @Then("^I see \"([^\"]*)\" user deleted$")
    public void deletedUser() throws Exception {
        
    }

}
