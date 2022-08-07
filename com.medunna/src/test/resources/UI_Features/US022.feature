@us022

Feature: Hasta Test sonuçları (Staff)
  Background: Staff olarak giris yapilir
    Given Medunna ana sayfasina gider
    And ana sayfa giris ikonuna tiklar
    And Sign in secenegini secer
    And staff kullanici adini ve sifresini girer
    Then Sign in butonuna tiklar

  Scenario: user (Staff) can search about patient by SSN id
    Given My Pages sekmesine tiklar
    And Search patient sekmesine tiklar
    And Patient SSN bolumune hasta SSN ID si girer
    Then  Hasta bilgilerini gorebildigini test eder
    And   tarayiciyi kapatir

  Scenario: User should navigate to Show appointments, edit patient tests clicking on Show test
  click on view results edit results where they will see selected tests by Doctor and
  they will provide results by numbers (60, 70 etc..)
    Given My Pages sekmesine tiklar
    And Search patient sekmesine tiklar
    And show appointments a tiklar
    And show tests e tiklar
    And view result a tiklar
    Then Sonuclari sayilarla duzenleyebilecegini test eder


  Scenario: Staff will view or update the result info such as ID, Date, Result, description, Created date etc.
    Given My Pages sekmesine tiklar
    And Search patient sekmesine tiklar