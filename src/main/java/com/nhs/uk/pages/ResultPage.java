package com.nhs.uk.pages;

import com.nhs.uk.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//li[@class='form-hint-list-item form-hint-list-item--valid']//span[3]")
    WebElement result;

    public String result(){
      return getTextFromElement(result);
    }


}
