Feature: US024
  Scenario: Patient sign into their account if they created account and see the test results there as show test results, then they will have
  id, name for test, default max and min value, test date and description
    Given medunna ana sayfasina gider
    And ana sayfa giris ikonuna tiklar
    And Sign in secenegini secer
    And Patient olarak giris yapar
    And My Pages Patient menusu tiklanir
    And My Appointmentsi secer
    And Show Test sekmesini secer
    And View Results sekmesine tiklar
    Then Test verilerinin tamamini gorebildigini test eder
    And Tarayiciyi kapatir

  Scenario: Patient can also view their invoice (payment information)
    Given medunna ana sayfasina gider
    And ana sayfa giris ikonuna tiklar
    And Sign in secenegini secer
    And Baska bir Patient olarak giris yapar
    And My Pages Patient menusu tiklanir
    And My Appointmentsi secer
    And Show Invoice sekmesine tiklar
    Then Odeme bilgilerini gordugunu test eder
    And Tarayiciyi kapatir


