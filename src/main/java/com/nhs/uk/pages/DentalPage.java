package com.nhs.uk.pages;

import com.nhs.uk.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DentalPage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    public DentalPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "radio-not-registered")
    WebElement DentalPractice;


    @FindBy(id = "next-button")
    WebElement start;

    public void NextButton(){
        clickOnElement(start);
    }

    public void DentalPractice(){
        clickOnElement(DentalPractice);
    }

}
