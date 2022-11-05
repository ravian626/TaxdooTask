Feature: To test Taxdoo Price Page functionality

Scenario: Check if the price step of Taxdoo is working
    Given open the Taxdoo page
    And user clicks the Price option
    And user choose package
    When user hits the Next button
    Then Proceed to next step