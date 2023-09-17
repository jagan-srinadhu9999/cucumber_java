@Smoke
Feature: Searching new Cars
  In order to serch new cars as user
  I have to go carwale.com

  Scenario Outline: Finding new car and verify car titles as expected
    Given user navigates to carwale.com
    When user mouseover to Newcars
    Then user clicks FindNewCars
    And user clicks "<carBrand>" cars
    And user verifies as a car title as "<carTitle>"

    Examples: 
      | carBrand | carTitle      |
      | Toyota   | Toyota Cars   |
      | BMW      | BMW Cars      |
      | Ki       | Kia Carsss    |
      | Audi     | Audi Cars     |
      | Mahindra | Mahindra Cars |
      | Hyundai  | Hyundai Cars  |
