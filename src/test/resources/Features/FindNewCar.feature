@Regression 
Feature: Searching new Cars
  In order to serch new cars as user
  I have to go carwale.com

  Scenario: Finding new car
    Given user navigates to carwale.com
    When user mouseover to Newcars
    Then user clicks FindNewCars
    And user clicks Toyota cars
    And user verifies as a car title as Toyota Cars
