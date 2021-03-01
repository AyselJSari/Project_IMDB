package com.imdb.pages;

import com.imdb.util.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @FindBy(name = "q")
    private WebElement searchBox;

    public void searchMovie(){

        searchBox.sendKeys("Black Widow"+ Keys.ENTER);
    }

    @FindBy(xpath = "//span[@class='findSearchTerm']")
    private WebElement title;

    public void assertTitle(){
        wait.until(ExpectedConditions.visibilityOf(title));
        String expectedTitle="Black Widow";
        String actualTitle= title.getText();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        System.out.println(actualTitle);
    }


    @FindBy(xpath = "//a[.='Black Widow']")
    private WebElement movieName;

    public  void movieInfo(){
        wait.until(ExpectedConditions.visibilityOf(movieName));
         movieName.click();
    }


   @FindBy(xpath = "//div[@class='ribbonize']")
    private WebElement watchListButton;

    public void addMovieToWatchList(){
       wait.until(ExpectedConditions.visibilityOf(watchListButton) );
        watchListButton.click();
    }


    @FindBy(xpath = "(//div[@class='ipc-button__text'])[5]")
    private WebElement watchList;

    public void WatchList(){
        watchList.click();
    }


    @FindBy(xpath = "//a[.='Black Widow']")
    private WebElement movieNameInWatchlist;

    public void assertTitleOfMovies(){
        String movieTitle= movieNameInWatchlist.getText();
        String  expected ="Black Widow";
        Assert.assertEquals(movieTitle, expected);
    }




    @FindBy(xpath = "//div[@class='wl-ribbon poster inWL']")
    private WebElement checkButton;

    public void removeFromWatchList(){
        wait.until(ExpectedConditions.visibilityOf(checkButton));
        checkButton.click();
    }

    @FindBy(xpath = "//span[@class='empty-watchlist-text']")
    private WebElement emptyList;

    public void assertEmptyList(){
        String text= "Your Watchlist is empty";
        String actualText= emptyList.getText();
        Assert.assertTrue(text.contains(actualText));
        System.out.println(text);
    }

}
