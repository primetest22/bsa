package com.nhs.uk.utility;

import com.nhs.uk.drivermanager.ManageDriver;
import org.openqa.selenium.WebElement;

public class Utility extends ManageDriver {


    public void clickOnElement(WebElement element) {
        element.click();
    }




    public String getTextFromElement(WebElement element) {
        return element.getText();
    }


    public void sendTextToElement(WebElement element, String str) {
        element.sendKeys(str);
    }



}
