package com.imdb.pages;

import com.imdb.util.ConfigurationReader;
import com.imdb.util.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[.='Sign In']")
   private WebElement singInButton;

    public void clickSingIn(){
        singInButton.click();
    }

@FindBy(xpath = "//span[.='Sign in with IMDb']")
    private  WebElement signIn;

    public void clickSingInLink(){
        signIn.click();
    }

   @FindBy(id = "ap_email")
    private WebElement emailBox;

    @FindBy(id = "ap_password")
    private WebElement passwordBox;

    @FindBy(id = "signInSubmit")
    private WebElement SignInButton;

public void login(){

    String usernameValue = ConfigurationReader.getProperty("email");
    String passwordValue = ConfigurationReader.getProperty("password");

    emailBox.sendKeys(usernameValue);
    passwordBox.sendKeys(passwordValue);
    SignInButton.click();

}


}
