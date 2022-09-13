package com.nhs.uk.pages;

import com.nhs.uk.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BirthPage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    public BirthPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "dob-day")
    WebElement day;


    @FindBy(id = "dob-month")
    WebElement month;


    @FindBy(id = "dob-year")
    WebElement year;


    @FindBy(id = "next-button")
    WebElement start;

    public void day(String day1){
        sendTextToElement(day,day1);
    }
    public void month(String day2){
        sendTextToElement(month,day2);
    }
    public void year(String day3){
        sendTextToElement(year,day3);
    }
    public void NextButton(){
        clickOnElement(start);
    }


}
