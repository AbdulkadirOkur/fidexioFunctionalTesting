package com.fidexio.step_definitions;

import com.fidexio.pages.FidexioHomePageAfterLogin;
import com.fidexio.pages.FidexioLoginPage;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Logout_Step_definitions {
    FidexioHomePageAfterLogin fidexioHomePageAfterLogin =new FidexioHomePageAfterLogin();
    FidexioLoginPage fidexioLoginPage = new FidexioLoginPage();

    @When("User click logout link")
    public void user_click_logout_link() {
        fidexioHomePageAfterLogin.logoutLink.click();

    }
    @Then("User should log out and land on login page")
    public void user_should_log_out_and_land_on_login_page() {
        String expectedInTitle = "Login";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));


    }


    @When("open user dropdown")
    public void openUserDropdown() {
        fidexioHomePageAfterLogin.userDropdown.click();
    }

    @Given("PosManager is already logged in with {string} and {string}")
    public void posmanagerIsAlreadyLoggedInWithAnd(String username, String password) {
        fidexioLoginPage.loginPosManager(username,password);
    }

    @Given("SalesManager is already logged in with {string} and {string}")
    public void salesmanagerIsAlreadyLoggedInWithAnd(String username, String password) {
        fidexioLoginPage.loginSalesManager(username,password);
    }

    @Then("click step back button")
    public void clickStepBackButton() {
        Driver.getDriver().navigate().back();
    }

    @Then("User should not go to home page after logged out")
    public void userShouldNotGoToHomePageAfterLoggedOut() {
      WebElement sessionExpired = Driver.getDriver().findElement(By.xpath("//h4[.='Odoo Session Expired']"));
      Assert.assertTrue(sessionExpired.isDisplayed());
    }
}
