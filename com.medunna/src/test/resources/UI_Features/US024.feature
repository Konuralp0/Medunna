Feature: US024
  Scenario: Patient sign into their account if they created account and see the test results there as show test results, then they will have
  id, name for test, default max and min value, test date and description
    Given Medunna ana sayfasina gider
    And Anasayfada giris ikonuna tiklar
    And Patient olarak giris yapar
    And My Pages(Patient) sekmesine tiklar
    And My Appointmentsi secer
    Then

  Scenario: Patient can also view their invoice (payment information)
  Anasayfada giris ikonuna tiklar
    And Patient olarak giris yapar
    And My Pages(Patient) sekmesine tiklar
    And My Appointmentsi secer


