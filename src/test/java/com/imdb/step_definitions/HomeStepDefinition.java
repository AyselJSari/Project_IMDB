package com.imdb.step_definitions;

import com.imdb.pages.HomePage;
import com.imdb.util.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStepDefinition {

    HomePage homePage= new HomePage();

    @Given("User is on the Home page")
    public void userIsOnTheHomePage() {

    }

    @When("User clicks on the search box and enter movie name")
    public void userClicksOnTheSearchBoxAndEnterMovieName() {
        homePage.searchMovie();
    }


    @Then("same movie names should display")
    public void sameMovieNamesShouldDisplay() {
homePage.assertTitle();
    }



    @When("User clicks the movie name")
    public void userClicksTheMovieName() {
        homePage.movieInfo();
    }

    @And("User clicks on the add button")
    public void userClicksOnTheAddButton() {
        homePage.addMovieToWatchList();
        homePage.WatchList();
    }

    @Then("The movie should be added to the watch list")
    public void theMovieShouldBeAddedToTheWatchList() {
        homePage.assertTitleOfMovies();

    }




    @When("User clicks the check button")
    public void userClicksTheCheckButton() {
        homePage.removeFromWatchList();
        Driver.getDriver().navigate().refresh();
    }

    @Then("The movie should be moved from watch list")
    public void theMovieShouldBeMovedFromWatchList() {
    homePage.assertEmptyList();
    }



}
