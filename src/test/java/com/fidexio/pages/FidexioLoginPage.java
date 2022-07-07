package com.fidexio.pages;

import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FidexioLoginPage {

    public FidexioLoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    public String title = Driver.getDriver().getTitle();

    @FindBy(id = "login")
    public WebElement loginInput;


    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(xpath = " //button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement wrongLoginAlert;

    @FindBy(xpath = "//a[.='Reset Password']")
    public WebElement resetPasswordLink;


    //Default login for PosManager
    public void loginPosManager(){
        loginInput.sendKeys("posmanager32@info.com");
        passwordInput.sendKeys("posmanager", Keys.ENTER);
    }

    //login with username and password for PosManager
    public void loginPosManager(String username,String password){
        loginInput.sendKeys(username);
        passwordInput.sendKeys(password, Keys.ENTER);
    }

    //login with configuration.properties for PosManager
    public void loginPosManagerWithConfiguration(){
        String username = ConfigurationReader.getProperty("salesManagerUsername");
        String password = ConfigurationReader.getProperty("salesManagerPassword");
        loginInput.sendKeys(username);
        passwordInput.sendKeys(password, Keys.ENTER);
    }

    //Default login for SalesManager
    public void loginSalesManager(){
        loginInput.sendKeys("salesmanager15@info.com");
        passwordInput.sendKeys("salesmanager", Keys.ENTER);
    }

    //login with username and password for SalesManager
    public void loginSalesManager(String username,String password){
        loginInput.sendKeys(username);
        passwordInput.sendKeys(password, Keys.ENTER);
    }

    //login with configuration.properties for SalesManager
    public void loginSalesManagerWithConfiguration(){
        String username = ConfigurationReader.getProperty("posManagerUsername");
        String password = ConfigurationReader.getProperty("posManagerPassword");
        loginInput.sendKeys(username);
        passwordInput.sendKeys(password, Keys.ENTER);
    }





}