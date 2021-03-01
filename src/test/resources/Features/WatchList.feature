Feature: Add movie to the watch list Feature

  Background: common Step
  Given User is on the Home page

       @searchMovie
  Scenario: Search movie
    When User clicks on the search box and enter movie name
    Then same movie names should display

       @enterWatchList
    Scenario: Enter desired movie to watch list
      When User clicks the movie name
      And User clicks on the add button
      Then The movie should be added to the watch list

       @deleteWatchList
    Scenario: Delete movie from watch list
      When User clicks the check button
      Then The movie should be moved from watch list




