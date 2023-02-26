
Feature: Features to test login functionality

  Scenario: Check login is successful with login credentials
  Given     User is on login page.
  
  When      User enter lginpage and password
  And       Click on login button
  Then      User is navigated to home page.