package com.fidexio.step_definitions;

import com.fidexio.pages.FidexioHomePageAfterLogin;
import com.fidexio.pages.FidexioLoginPage;
import com.fidexio.pages.FidexioResetPasswordPage;
import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Login_Step_Definitions {
    FidexioLoginPage fidexioLoginPage = new FidexioLoginPage();
    FidexioHomePageAfterLogin fidexioHomePageAfterLogin = new FidexioHomePageAfterLogin();
    FidexioResetPasswordPage fidexioResetPasswordPage = new FidexioResetPasswordPage();

    @Given("user is on the Login page")
    public void user_is_on_the_login_page() {
        //Using configuration.properties file for avoiding hard coding
        String link = ConfigurationReader.getProperty("fidexioPage");
        Driver.getDriver().get(link);
    }


    @When("User enter username {string}")
    public void enter(String username) {
        fidexioLoginPage.loginInput.sendKeys(username);
    }



    @And("User click login button")
    public void clickLoginButton() {
        fidexioLoginPage.loginButton.click();
    }

    @Then("User should Login and see {string} in the title")
    public void userShouldLoginAndSeeInTheTitle(String ExpectedTitle) {
        String actualTitle = fidexioHomePageAfterLogin.getTitle();
                //Driver.getDriver().getTitle();
        Assert.assertEquals(ExpectedTitle,actualTitle);
    }

    @And("User enter password {string}")
    public void enterPassword(String psw) {
        fidexioLoginPage.passwordInput.sendKeys(psw);
    }

    @Then("User should see Wrong login password alert on the page")
    public void userShouldSeeWrongLoginPasswordAlertOnThePage() {

        Assert.assertTrue(fidexioLoginPage.wrongLoginAlert.isDisplayed());

    }

    @Then("User should see {string} message on username input")
    public void userShouldSeeMessage(String message) {
        //required attribute must be true for getting validation message
       boolean isRequiredTrue = fidexioLoginPage.loginInput.getAttribute("required").equalsIgnoreCase("true");
       //Validation message must be same as expected message
       boolean isValidationMessageSame = fidexioLoginPage.loginInput.getAttribute("validationMessage").equals(message);

       Assert.assertTrue(isRequiredTrue && isValidationMessageSame);
    }

    @Then("User should see {string} message on password input")
    public void userShouldSeeMessageOnPasswordInput(String message) {
        //required attribute must be true for getting validation message
        boolean isRequiredTrue = fidexioLoginPage.passwordInput.getAttribute("required").equalsIgnoreCase("true");
        //Validation message must be same as expected message
        boolean isValidationMessageSame = fidexioLoginPage.passwordInput.getAttribute("validationMessage").equals(message);

        Assert.assertTrue(isRequiredTrue && isValidationMessageSame);
    }

    @When("User clicks reset password link")
    public void userClicksResetPasswordLink() {
        fidexioLoginPage.resetPasswordLink.click();
    }



    @Then("User should land reset password page and see {string} inside title")
    public void userShouldLandResetPasswordPageAndSeeInsideTitle(String expectedIntitle) {
        String actualTitle = fidexioResetPasswordPage.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedIntitle));
    }

    @Then("User should see password as bullet signs")
    public void userShouldSeePasswordAsBulletSigns() {
        Assert.assertEquals ("password",fidexioLoginPage.passwordInput.getAttribute("type"));
    }

    @And("user press Enter key")
    public void userPressEnterButton() {
        fidexioLoginPage.passwordInput.sendKeys(Keys.ENTER);
    }
}
