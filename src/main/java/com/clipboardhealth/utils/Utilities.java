package com.clipboardhealth.utils;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.time.InternalSystemClock;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Utilities extends PageObject {

    public void waitForVisibility(WebElement element){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitToBeClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitingDuring(int seconds ){
        new InternalSystemClock().pauseFor((seconds * 1000));
    }


}
