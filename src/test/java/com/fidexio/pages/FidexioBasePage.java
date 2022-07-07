package com.fidexio.pages;


import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FidexioBasePage {
    //this class contains common constant elements for the different pages

    public FidexioBasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public String getTitle(){
      return Driver.getDriver().getTitle();
    }
    public String getURL(){
        return Driver.getDriver().getCurrentUrl();
    }

    @FindBy(xpath = "//a[.='Log out']")
    public WebElement logoutLink;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement userDropdown;







}
