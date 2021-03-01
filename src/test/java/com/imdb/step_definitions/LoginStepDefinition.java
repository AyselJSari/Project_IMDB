package com.imdb.step_definitions;

import com.imdb.pages.LoginPage;
import com.imdb.util.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinition {
    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page")
    public void userIsOnTheLoginPage() {

        Driver.getDriver().get("https://imdb.com");
    }

    @When("User click on the sign in button")
    public void userClickOnTheSignInButton() {
        loginPage.clickSingIn();
        loginPage.clickSingInLink();
    }

    @And("User enter valid credentials")
    public void userEnterValidCredentials() {
        loginPage.login();
    }

    @Then("User should see Home page")
    public void userShouldSeeHomePage() {
        String title= Driver.getDriver().getTitle();
        Assert.assertEquals(title, "IMDb Sign-In");
    }
}
