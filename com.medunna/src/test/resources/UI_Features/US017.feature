@us017
Feature:US017
  Scenario:Admin can create new test items
    Given Medunna ana sayfasina gider
    And   Login as admin
    And   Clicks on items and titles
    And   Clicks on Test Item
    Then   Tests that there is a "create a new item button" on the page.
    And   tarayiciyi kapatir

  Scenario: there should be following items for creating/ updating  test items; Name, Description, price
  Default min value, Default max value and created date as MM/DAY/YEAR
    Given Medunna ana sayfasina gider
    And   Login as admin
    And   Clicks on items and titles
    And   Clicks on Test Item
    And   Cliks on Create a New Item
    Then  Tests there are test items when creating or updating.
    And   tarayiciyi kapatir

  Scenario: Admin can view test items
    Given Medunna ana sayfasina gider
    And   Login as admin
    And   Clicks on items and titles
    And   Clicks on Test Item
    And   Tests the visibility of Test Items
    And   tarayiciyi kapatir

  Scenario: Admin can delete test items
    Given Medunna ana sayfasina gider
    And   Login as admin
    And   Clicks on items and titles
    And   Clicks on Test Item
    And   Tests the visibility of delete button
    And   tarayiciyi kapatir








