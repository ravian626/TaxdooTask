Feature: To test Register functionality

  Scenario Outline: Check if the registeration functionality is working for carrier
    Given open the saloodo page
    And user clicks the Register link
    And user clicks on I am a carrier option
    And user selects <country>
    And user enter <companyname>
    And user inputs <firstname> and <lastname>
    And user gives the <countrycode>
    And user enters <phonenumber>
    And user provides the <emailaddress>
    And enters <password>
    And user checks the Term & Conditions checkbox
    When user hits the Register button
    Then user is registered successfully

    Examples: 
      | country | companyname | firstname | lastname | countrycode | phonenumber | emailaddress | password |
      |         |             |           |          |             |             |              |          |
      | BE      | Company A   |           |          |             |             |              |          |
      | BE      | Company A   | Ali       |          |             |             |              |          |
      | BE      | Company A   | Ali       | Afzal    |             |             |              |          |
      | BE      | Company A   | Ali       | Afzal    | belgium     |             |              |          |
      | BE      | Company A   | Ali       | Afzal    | belgium     | ads         |              |          |
      | BE      | Company A   | Ali       | Afzal    | belgium     |  3434000005 |              |          |
      | BE      | Company A   | Ali       | Afzal    | belgium     |  3434000005 | a@b4         |          |
      | BE      | Company A   | Ali       | Afzal    | belgium     |  3434000005 | a@b4.com     |          |
      | BE      | Company A   | Ali       | Afzal    | belgium     |  3434000005 | a@b4.com     |      123 |
      | BE      | Company A   | Ali       | Afzal    | belgium     |  3434000005 | a@b4.com     | 12345678 |
      | BE      | Company A   | Ali       | Afzal    | belgium     |  3434000005 | a@b4.com     | 123abc4d |
      | BE      | Company A   | Ali       | Afzal    | belgium     |  3434000005 | a@b4.com     | 123abc!@ |
      | BE      | Company A   | Ali       | Afzal    | belgium     |  3434000005 | a@b4.com     | dEm0!@#$ |
