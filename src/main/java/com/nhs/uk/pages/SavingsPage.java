package com.nhs.uk.pages;

import com.nhs.uk.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SavingsPage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    public SavingsPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "next-button")
    WebElement start;


    @FindBy(id = "radio-yes")
    WebElement yes;

    public void NextButton(){
        clickOnElement(start);
    }

    public void yes() {
        clickOnElement(yes);

    }


}
