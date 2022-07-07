package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class FidexioResetPasswordPage {

    public FidexioResetPasswordPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public String getTitle(){
        return Driver.getDriver().getTitle();
    }
    public String getURL(){
        return Driver.getDriver().getCurrentUrl();
    }




}
