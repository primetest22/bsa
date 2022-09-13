package com.nhs.uk.pages;

import com.nhs.uk.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PregnantPage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    public PregnantPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "radio-no")
    WebElement no;


    @FindBy(id = "next-button")
    WebElement start;

    public void NextButton(){
        clickOnElement(start);
    }

    public void noButton() {
        clickOnElement(no);
    }


}


