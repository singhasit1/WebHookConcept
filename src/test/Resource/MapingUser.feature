
Feature: Verify User Mapping

  @Smoke
  Scenario: User Not Mapped in Application
    Given User not Mapped
    When  Trying To Launch the Applcation
    Then  System warn a Message that User Not Mapped

    @Smoke
    Scenario: User Mapped in Application
      Given User Mapped in Application
      When  Trying To Launch the Application
      Then  Application Loaded Properly