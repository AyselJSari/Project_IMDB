Feature: Login Feature

  @login
  Scenario: Login scenario
    Given User is on the login page
    When User click on the sign in button
    And User enter valid credentials
    Then User should see Home page
