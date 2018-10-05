
Feature: Authenticate Login Functonality
  @Smoke
  Scenario: Veify with valid username and password
    Given Launch Browser and Application
    When  User Input Valid username and password
    Then  Login Successful
    And   Browser Close

    @Smoke
    Scenario: Verify with invalid usernamd and password
      Given Launch Browser and Application
      When  User Input Invalid username and password
      Then  System Warn for Input valid username and password
      And   Browser Close