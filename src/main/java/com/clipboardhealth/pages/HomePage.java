package com.clipboardhealth.pages;

import com.clipboardhealth.utils.Utilities;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage {

    AmazonHomePage homePage;


    @Step
    public void openApplication(){
        homePage.open();
    }
    @Step
    public void clickOnHamburgerMenu() {
        homePage.clickOnHamburgerMenu();
    }
    @Step
    public void scrollDownTo(String option){
        homePage.ScrollDownTo(option);
    }
    @Step
    public void SelectfromMainMenu(String element){
        homePage.SelectFromMenu(element);
    }
    @Step
    public void SelectCategory(String element){
        homePage.SelectFromSuBMenu(element);
    }
    @Step
    public void ScrollDownToFilter(String element){
        homePage.ScrollDownToBySpan(element);
    }
    @Step
    public void SelectBrand(String element){
        homePage.SelectCheckboxByText(element);
    }
    @Step
    public void SortBy(String element){
        homePage.SelectSortBy(element);
    }
    @Step
    public void SelectProductListed(){
        homePage.SelectProduct();
    }
    @Step
    public void validateLabel(String element){
        homePage.validateTheMessage(element);
    }
}
