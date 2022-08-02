Feature: US019
  Scenario: Admin can search new Staff among registered people using their SSN
    Given medunna ana sayfasina gider
    And Login as admin
    And admin items ve titles a tiklar
    And Clicks on staff
    And Clicks on create a new Staff
    And Inputs SSN
    And Clicks on Use Search
    Then Tests whether the given SSN number searchs the wanted user
    And Tests whether personal information can be left blank
    And tarayiciyi kapatir

    Scenario: All information should be populated
      Given medunna ana sayfasina gider
      And Login as admin
      And admin items ve titles a tiklar
      And Clicks on staff
      And Clicks on create a new Staff
      And Inputs SSN
      And Clicks on Use Search
      Then Tests whether personal information can be left blank
      And tarayiciyi kapatir

      Scenario: Admin can select user from existing users
        Given medunna ana sayfasina gider
        And Login as admin
        And admin items ve titles a tiklar
        And Clicks on staff
        And Clicks on create a new Staff
        And Test whether selecting user from registered users is enabled
        And tarayiciyi kapatir



        Scenario: Admin can edit and delete current staff personnel
          Given medunna ana sayfasina gider
          And Login as admin
          And admin items ve titles a tiklar
          And Clicks on staff
          Then Tests whether Deleting and Editing Buttons are enabled
          And tarayiciyi kapatir

          Scenario: Validation with API
            Given User creates Staff
            And User posts the created Staff
            Then tests whether they match




