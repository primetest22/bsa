package com.nhs.uk.pages;

import com.nhs.uk.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CountryPage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    public CountryPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "radio-wales")
    WebElement Country;


    @FindBy(id = "next-button")
    WebElement next;

    public void NextButton(){
        clickOnElement(next);
    }

    public void Country(){
        clickOnElement(Country);
    }

}
