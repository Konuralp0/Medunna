@us021
Feature:
  Scenario:Staff can only update appointments
    Given Medunna ana sayfasina gider
    And   Staff olarak giris yapar
    And   My Pages sekmesine tiklar
    And   Search patient sekmesine tiklar
    And   Show appointments butonuna tiklar
    And   Appointmen'i duzenlemek icin edit butonuna tiklar
    Then  Appointment duzenleme sayfasinda oldugunu test eder
    And   tarayiciyi kapatir

  Scenario: Staff can make the status UNAPPROVED, PENDING or CANCELLED, but cannot make
  it COMPLETED
    Given Medunna ana sayfasina gider
    And   Staff olarak giris yapar
    And   My Pages sekmesine tiklar
    And   Search patient sekmesine tiklar
    And   Show appointments butonuna tiklar
    And   Appointmen'i duzenlemek icin edit butonuna tiklar
    And   Status acilir menusune tiklar
    Then  Menude UNAPPROVED, PENDING or CANCELLED opsiyonlarinin aktif oldugunu test eder
    And   tarayiciyi kapatir

  Scenario: Staff does not need to provide Anamnesis, Treatment or Diagnosis as required fields
    Given Medunna ana sayfasina gider
    And   Staff olarak giris yapar
    And   My Pages sekmesine tiklar
    And   Search patient sekmesine tiklar
    And   Show appointments butonuna tiklar
    And   Appointmen'i duzenlemek icin edit butonuna tiklar
    Then  Anamnesis, Treatment or Diagnosis bolumlerini bos birakabildigini test eder
    And   tarayiciyi kapatir

  Scenario: They can select the current doctor that needs to be selected for the patient
    Given Medunna ana sayfasina gider
    And   Staff olarak giris yapar
    And   My Pages sekmesine tiklar
    And   Search patient sekmesine tiklar
    And   Show appointments butonuna tiklar
    And   Appointmen'i duzenlemek icin edit butonuna tiklar
    And   Hasta icin bir doktor secebilecegini test eder
    And   tarayiciyi kapatir

  Scenario: They can view the patients test results
    Given Medunna ana sayfasina gider
    And   Staff olarak giris yapar
    And   My Pages sekmesine tiklar
    And   Search patient sekmesine tiklar
    And   Show appointments butonuna tiklar
    And   Show tests butonuna tiklar
    And   Kullanicinin test sonuclari sayfasinda oldugunu test eder
    And   tarayiciyi kapatir