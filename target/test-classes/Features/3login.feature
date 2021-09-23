Feature: To test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    When user puts valid <username> and <password>
    And user clicks on login button
    Then user is navigated to the dashboard page

    Examples: 
      | username | password |
      |          |          |
      | a@b3.com |          |
      |          | dEm0!@#$ |
      | a@b3     | dEm0!    |
      | a@b3.com | dEm0!@#$ |
