Feature: Check login functionality

  Scenario: Check login is successful with valid credentials
    Given browser is open
    And user in on login page
    When user enters the username and password
    And user click on login
    Then user is navigated to the home page
