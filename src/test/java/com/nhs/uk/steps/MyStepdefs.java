package com.nhs.uk.steps;

import com.nhs.uk.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    @Given("^I am person from welsh$")
    public void iAmPersonFromWelsh() {

    }

    @And("^I am on start page$")
    public void iAmOnStartPage() {
    }

    @When("^I click on start button$")
    public void iClickOnStartButton() {
        new StartPage().clickStartButton();
    }

    @And("^I select country and click on next button$")
    public void iSelectCountryAndClickOnNextButton() {
    }

    @And("^I click on welsh$")
    public void iClickOnWelsh() {
        new CountryPage().Country();
        new CountryPage().NextButton();
    }

    @And("^I select gp welsh$")
    public void iSelectGpWelsh() {
        new WhereGPPage().slctGp();
        new WhereGPPage().NextButton();
    }

    @And("^I select dental$")
    public void iSelectDental() {
        new DentalPage().DentalPractice();
        new DentalPage().NextButton();
    }

    @And("^I enter day \"([^\"]*)\" month \"([^\"]*)\" year \"([^\"]*)\"$")
    public void iEnterDayMonthYear(String day, String month, String year)  {
         new BirthPage().day(day);
         new BirthPage().month(month);
         new BirthPage().year(year);
         new BirthPage().NextButton();
    }

    @And("^I select partner$")
    public void iSelectPartner() {
        new PartnerPage().Partner();
        new PartnerPage().NextButton();
    }

    @And("^I Select benefits$")
    public void iSelectBenefits() {
        new BenefitsPage().NO();
        new BenefitsPage().NextButton();
    }

    @And("^I Select, i am not pregnant$")
    public void iSelectIAmNotPregnant() {
        new PregnantPage().noButton();
        new PregnantPage().NextButton();
    }

    @And("^I select no injury$")
    public void iSelectNoInjury() {
        new InjuryPage().No();
        new InjuryPage().NextButton();
    }

    @And("^I Select no diabetes$")
    public void iSelectNoDiabetes() {
        new DiabetesPage().NO();
        new DiabetesPage().NextButton();
    }

    @And("^I select no glaucoma$")
    public void iSelectNoGlaucoma() {
        new GlaucomaPage().NO();
        new GlaucomaPage().NextButton();

    }

    @And("^I select no care home$")
    public void iSelectNoCareHome() {
        new CarehomePage().NO();
        new CarehomePage().NextButton();
    }

    @And("^I select yes for savings$")
    public void iSelectYesForSavings() {
        new SavingsPage().yes();
        new SavingsPage().NextButton();
    }

    @Then("^I should get result what help i can get$")
    public void iShouldGetResultWhatHelpICanGet() {
        String actText = "If your prescription is dispensed in Wales or you have an Entitlement Card";
       String expText = new ResultPage().result();
        Assert.assertEquals("Error",actText,expText);
    }
}
