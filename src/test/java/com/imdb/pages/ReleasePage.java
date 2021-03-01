package com.imdb.pages;

import com.imdb.util.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReleasePage {

   public ReleasePage(){
       PageFactory.initElements(Driver.getDriver(),this);
   }
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);


    @FindBy(xpath = "//div[.='Menu']")
    private WebElement menuButton;

   public void clickMenu(){
menuButton.click();
   }

    @FindBy(xpath = "(//a[@role='menuitem'])[2]")
    private WebElement releaseCalendarButton;

    public void clickReleaseCalendar(){
       wait.until(ExpectedConditions.visibilityOf(releaseCalendarButton));
releaseCalendarButton.click();
    }

@FindBy(xpath = "//a[.='Cherry']")
    protected WebElement movieCherry;

    public void assertMovieName(String name){
        Assert.assertTrue(movieCherry.getText().contains(name));
    }



}
