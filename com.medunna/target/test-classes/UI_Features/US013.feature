@us013
Feature: US013
  Scenario: Test sonuçları talep edildikten ve Staff test sonuçlarını güncelledikten sonra
  doktor "id, name(Urea, Sodium, Glucose etc..), default max value, default min value, test,
  description and the date" bilgilerini görebilmeli
    Given medunna ana sayfasina gider
    Then  anasayfada giris ikonuna tiklar
    And   Sign in secenegini secer
    And   kullanici olusturdugu adini ve sifresini girer
    And   Sign in butonuna tiklar
    And   Mypages butonuna tiklar
    Then  MyAppointmenti secer
    And   Edit butonuna tiklar
    And   Show test results butonuna tiklar
    And   View results butonuna tiklar
    Then  Test sonuclarinin gorulebildigini test eder
    And   tarayiciyi kapatir

  Scenario: Doktor "Request Impatient" (hastanın yatılı tedavi görmesi) isteğinde bulunabilmeli
    Given medunna ana sayfasina gider
    Then  anasayfada giris ikonuna tiklar
    And   Sign in secenegini secer
    And   kullanici olusturdugu adini ve sifresini girer
    And   Sign in butonuna tiklar
    And   Mypages butonuna tiklar
    Then  MyAppointmenti secer
    And   Edit butonuna tiklar
    Then  Request inpatient butonunun oldugunu test eder
    And   tarayiciyi kapatir
