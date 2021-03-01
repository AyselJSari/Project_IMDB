package com.imdb.step_definitions;

import com.imdb.pages.ReleasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ReleaseStepDefinition {

    ReleasePage releasePage= new ReleasePage();

    @And("User clicks on the Menu")
    public void userClicksOnTheMenu() {
        releasePage.clickMenu();
    }

    @And("User clicks on Release Calendar")
    public void userClicksOnReleaseCalendar() {
        releasePage.clickReleaseCalendar();
    }

    @Then("User should see {string} in the list")
    public void userShouldSeeInTheList(String name) {
   releasePage.assertMovieName(name);
    }
}
