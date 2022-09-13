package com.nhs.uk.pages;

import com.nhs.uk.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiabetesPage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    public DiabetesPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "radio-no")
    WebElement diabetes;


    @FindBy(id = "next-button")
    WebElement start;

    public void NextButton(){
        clickOnElement(start);
    }

    public void NO() {
        clickOnElement(diabetes);
    }


}
