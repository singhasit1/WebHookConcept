
Feature: Verify Logout Functionality

  @Smoke
  Scenario: Launch Homepage Screen
    Given Launch Browser and Application
    When  User Input Valid username and password
    Then  Homepage Screen Open
    Then  Logout Option should Available

  @Smoke
  Scenario: Verify User Profile
    Given Launch Browser and Application
    When  Login Application successfuly
    Then  Verify Logout Icon exist
    Then Click on Logout Application Lof off
