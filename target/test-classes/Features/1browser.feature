Feature: To open the browser

  Scenario: Check the browser is open successfully
    Given the browser name
    When user sets the browser properties
    And user maximize the browser
    Then browser is open