Feature: US020

  Scenario: Admin can view registered people info as firstname, lastname, email etc. from User Management
    Given Medunna ana sayfasina gider
    And Admin olarak giris yapar
    And Admin menusune gider
    And User Management butonuna tiklar
    Then Admin can view registered people info as firstname, lastname, email etc. from User Management test eder
    And tarayiciyi kapatir

  Scenario: Admin can edit existing user info such as activating user, giving them roles as ADMIN, USER, PATIENT, STAFF and PHYSICIAN
    Given Medunna ana sayfasina gider
    And Admin olarak giris yapar
    And Admin menusune gider
    And User Management butonuna tiklar
    And User activating
    Then User activation test edilir
    And giving them roles as ADMIN, USER, PATIENT, STAFF and PHYSICIAN
    Then All new Roles test edilir
    And tarayiciyi kapatir

    Scenario: Admin can delete users
      Given Medunna ana sayfasina gider
      And Admin olarak giris yapar
      And Admin menusune gider
      And User Management butonuna tiklar
      Then Delete seceginin basilabilir oldugunu test eder
      And tarayiciyi kapatir

