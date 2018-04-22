Feature: This is a sample feature file on homeoffice project
  Scenario: Test vehicle registration and color of the vehicle
    Given I am on a vehicle enquires page
    When I click on Start button to begin the enquiry
    And I enter the vehicle registration number and click on Continue button
    Then I see the vehicle details and validate
