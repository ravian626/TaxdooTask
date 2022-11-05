Feature: To test Taxdoo Summary Page functionality

Scenario: Check if the summary step of Taxdoo is working
    Given user is on the summary page
    And user selects How did you come across Taxdoo 
    And user accepts Term and Conditions
    When user hits the Complet Booking button
    Then successfully completed booking