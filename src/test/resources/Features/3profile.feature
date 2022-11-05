Feature: To test Profile functionality

  Scenario Outline: Check if the system allow to enter the profile
    Given user is on the profile page
    And user enters the <companyname>
    And user selects the company type
    And user selects the salutation
    And user entered <firstname>
    And provided <lastname>
    And user clicks on the EnterAddressManually button
    And enter your <street>
    And provide the <houseNumber>
    And added the <city>
    And input your <zip>
    And user gives the <state>
    And country <country>
    And your <VATID>
    And user email address <emailaddress>
    And user tells the <phonenumber>
    When user clicks the next button
    Then user is navigated to the summary page


    Examples: 
      | companyname 			|	firstname	|	lastname	|	street 				|	houseNumber	|	city		|	zip		|	state		|	country	|	VATID				|	emailaddress	|	phonenumber			|
      | Abdul Waheed Test	|	Abdul			|	Waheed		|	Valentinskamp	|	70					|	Hamburg	|	20355	|	Hamburg	|	Germany	| DE123456789	|	a@b.com				|	+4919886737249	|
