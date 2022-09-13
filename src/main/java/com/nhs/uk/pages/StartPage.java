package com.nhs.uk.pages;

import com.nhs.uk.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class StartPage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    public StartPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "next-button")
    WebElement start;

    public void clickStartButton() {
        clickOnElement(start);
    }


}


