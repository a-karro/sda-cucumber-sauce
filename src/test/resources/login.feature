Feature: Check login page for https://www.saucedemo.com/
  Background:
    Given user navigates to "https://www.saucedemo.com/"

  Scenario: Log in with standard user
     When user enters "standard_user" in user name field
      And user enters "secret_sauce" in password field
      And user clicks Login button
     Then user is logged in the application

