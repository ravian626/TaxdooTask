Feature: To test Profile functionality

  Scenario Outline: Check if the system allow to update the profile
    Given user is on the login page
    And user clicks on the profile button
    And user clicks on the profile option
    And user clicks on the first name field
    And user puts the <profilelastname>
    And user clicks on the update button
    And again clicks on the profile button
    When user clicks on the logout button
    Then user is navigated to the login page

    Examples: 
      | profilelastname |
      | Afzal1          |
