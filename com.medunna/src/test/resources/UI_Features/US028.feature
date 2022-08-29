Feature: US028
  Scenario: User can create countries as Admin
    Given medunna ana sayfasina gider
    And Login as admin
    And Clicks on items and titles
    And Clicks on country
    Then Clicks on create new country
    And Writes a country name
    Then clicks save
    And test whether the country is succesfully created
    Then tarayiciyi kapatir



    Scenario: User can delete countries as Admin
      Given medunna ana sayfasina gider
      And Login as admin
      And Clicks on items and titles
      And Clicks on country
      And clicks on delete a country button
      Then test whether the country is deleted
      And tarayiciyi kapatir




      Scenario: User should create related states or cities based on the country
        Given medunna ana sayfasina gider
        And Login as admin
        And Clicks on items and titles
        And clicks on state or city
        Then clicks on create new city
        And writes a city name
        Then clicks on save
        Then test whether the city is succesfully created
        And tarayiciyi kapatir


        Scenario: User should validate them with API
          Given User creates a country
          And Posts the country
          Then With request compares both countries

