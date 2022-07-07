package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class FidexioHomePageAfterLogin extends FidexioBasePage{

    public FidexioHomePageAfterLogin(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
