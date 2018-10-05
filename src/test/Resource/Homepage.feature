
Feature: Verify Homepage Functionality
  @Smoke
  Scenario: Launch Homepage Screen
    Given Launch Browser and Application
    When  User Input Valid username and password
    Then  Homepage Screen Open

  @Smoke
    Scenario: Verify User Profile
      Given Launch Browser and Application
      When  Login Application successfuly
      Then  Verify User Profile Icon exist
