package com.nhs.uk.pages;

import com.nhs.uk.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InjuryPage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    public InjuryPage() {
        PageFactory.initElements(driver, this);
    }



    @FindBy(id = "next-button")
    WebElement next;

    public void NextButton(){
        clickOnElement(next);
    }


    @FindBy(id = "radio-no")
    WebElement no;

    public void No() {
        clickOnElement(no);

    }


}
