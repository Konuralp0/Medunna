@us022

Feature: Hasta Test sonuclari (Staff)
  Scenario: user (Staff) can search about patient by SSN id
    Given Medunna ana sayfasina gider
    And Staff olarak giris yapar
    And Staff My Pages sekmesine tiklar
    And Search patient sekmesine tiklar
    And Patient SSN bolumune hasta SSN ID si girer
    Then  Hasta bilgilerini gorebildigini test eder
    And   tarayiciyi kapatir

  Scenario: User should navigate to Show appointments, edit patient tests clicking on Show test Then
  click on view results edit results where they will see selected tests by Doctor and
  they will provide results by numbers (60, 70 etc..)
    Given Medunna ana sayfasina gider
    And Staff olarak giris yapar
    And My Pages sekmesine tiklar
    And Search patient sekmesine tiklar
    And Patient SSN bolumune hasta SSN ID si girer
    And show appointments a tiklar
    And show tests e tiklar
    Then Testlerin gorundugunu kontrol eder
    And view result a tiklar
    And secilen test icin edit butonuna tiklar
    Then secilen testlerin gorunebilecegini ve duzenleyebilecegini test eder
    And tarayiciyi kapatir.


  Scenario: Staff will view or update the result info such as ID, Date, Result, description, Created date etc.
    Given Medunna ana sayfasina gider
    And Staff olarak giris yapar
    And My Pages sekmesine tiklar
    And Search patient sekmesine tiklar
    And Patient SSN bolumune hasta SSN ID si girer
    And show appointments a tiklar
    And show tests e tiklar
    And view result a tiklar
    And secilen test icin edit butonuna tiklar
    Then Bilgilerin gorulabilecegini yada girilebilecegini test eder
    And tarayiciyi kapatir.



