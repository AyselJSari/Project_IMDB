Feature: Verify that Upcoming releases contains movie name Cherry

  @release
  Scenario: Verifying desired movie name is among the Release Calender
Given User is on the login page
When User click on the sign in button
And User enter valid credentials
  And User is on the Home page
  And User clicks on the Menu
  And User clicks on Release Calendar
  Then User should see "Cherry" in the list






