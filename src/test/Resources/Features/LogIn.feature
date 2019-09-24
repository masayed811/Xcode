@login

Feature: LogIn

  Background:
    Given User is on the login page

  Scenario Outline:
  User should not be able to login with invalid credential

    When User enters invalid "<Email>" and/or "<Password>" and click on login button
    Then User should be able to see "<Related Message>"