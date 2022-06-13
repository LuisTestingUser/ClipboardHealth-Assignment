package com.clipboardhealth.pages;

import com.clipboardhealth.utils.Utilities;
import net.serenitybdd.core.pages.PageObject;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class AmazonHomePage extends PageObject {
    java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());

    Utilities utils;

    @FindBy(id = "nav-hamburger-menu")
    WebElement hamburgerMenu;

    @FindBy(id= "s-result-sort-select")
    WebElement SortDD;

    @FindBy(xpath = "//span[@class='a-dropdown-container']")
    WebElement dropdown;

    @FindBy(xpath = "//div[@data-component-type='s-search-result'][2]")
    WebElement productListed;

    @FindBy(xpath = "//h1[contains(text(), 'About this item')]")
    WebElement label;

    @FindBy(xpath = "//ul[@class='a-unordered-list a-vertical a-spacing-mini']")
    WebElement aboutThisItemTxt;

    public void clickOnHamburgerMenu() {
        utils.waitToBeClickable(hamburgerMenu);
        hamburgerMenu.click();
    }
    public void ScrollDownTo(String option){
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(true);", findBy("//div[contains(text(),'"+option+"')]"));
        utils.waitingDuring(3);

    }

    public  void ScrollDownToBySpan(String option){
        Actions action = new Actions(getDriver());
        action.moveToElement(findBy("//span[contains(text(),'"+option+"')]"));
        action.perform();
       // ((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(true);", findBy("//span[contains(text(),'"+option+"')]"));
        utils.waitingDuring(5);
    }
    public void SelectFromMenu(String element) {
        findBy("//div[contains(text(),'"+element+"')]").click();
        utils.waitingDuring(3);

    }
    public void SelectFromSuBMenu(String element) {
        findBy("//a[contains(text(),'"+element+"')]").click();
        utils.waitingDuring(3);

    }

    public void SelectCheckboxByText(String element) {
        findBy("//span[text() = '"+element+"']").click();
        utils.waitingDuring(3);

    }

    public void SelectSortBy(String Type){
        utils.waitToBeClickable(dropdown);
        dropdown.click();
        Select SortBy = new Select(SortDD);
        SortBy.selectByVisibleText(Type);
        utils.waitingDuring(3);

    }
    public void SelectProduct(){
        utils.waitToBeClickable(productListed);
        productListed.click();
        utils.waitingDuring(3);

    }

    public void validateTheMessage(String message){
       for (String windowHandle : getDriver().getWindowHandles()){
           getDriver().switchTo().window(windowHandle);
       }
        utils.waitForVisibility(label);
        MatcherAssert.assertThat(label.getText(),
                CoreMatchers.equalTo(message));
        utils.waitingDuring(3);
        logger.info(aboutThisItemTxt.getText());


    }




}
