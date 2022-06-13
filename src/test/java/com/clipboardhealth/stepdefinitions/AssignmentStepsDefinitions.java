package com.clipboardhealth.stepdefinitions;

import com.clipboardhealth.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class AssignmentStepsDefinitions {

    @Steps
    HomePage home;


    @Given("User navigates to amazon")
    public void userNavigatesToAmazon() {
        home.openApplication();
    }

    @Given("user clicks on hamburger menu")
    public void userClicksOnHamburgerMenu() {
        home.clickOnHamburgerMenu();
    }

    @Then("user scrolls down to {string} menu section")
    public void userScrollsDownToMenuSection(String option) {
        home.scrollDownTo(option);
    }

    @And("user selects {string} under the desired menu")
    public void userSelectsUnderTheDesiredMenu(String element) {
        home.SelectfromMainMenu(element);


    }

    @Then("user selects {string} from the filtered department")
    public void userSelectsFromTheFilteredDepartment(String element) {
        home.SelectCategory(element);
    }



    @And("user Selects {string} under {string}")
    public void userSelectsUnder(String brandType, String brand) {
        home.ScrollDownToFilter(brand);
        home.SelectBrand(brandType);
    }

    @Then("user sorts by {string}")
    public void userSortsBy(String type) {
        home.SortBy(type);
    }

    @And("user selects the second item listed")
    public void userSelectsTheSecondItemListed() {
        home.SelectProductListed();
    }


    @Then("user confirms the section {string}")
    public void userConfirmsTheSection(String text) {
        home.validateLabel(text);
    }
}
