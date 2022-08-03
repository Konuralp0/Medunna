Feature: US023
  Scenario: Staff can navigate to payment invoice process
    Given medunna ana sayfasina gider
    And Staff olarak giris yapar
    And   My Pages sekmesine tiklar
    And   Search patient sekmesine tiklar
    And Onceden tedavisi biten hastasini bulur ve show appointmentsa tiklar
    And Payment Invoice Processesin tiklanabilir oldugunu test eder ve tiklar
    And Examfee ve toplam tutarin gorulebildigini test eder
    Then Create Invoice tiklanabilir oldugunu test eder
    And tarayiciyi kapatir


    Scenario: Staff can check up on old Payments
      Given medunna ana sayfasina gider
      And Staff olarak giris yapar
      And   My Pages sekmesine tiklar
      And   Search patient sekmesine tiklar
      And Odemesi tamamlanmis olan eski hastayi bulur ve appointmentsa tiklar
      And Payment Invoice Processesin tiklanabilir oldugunu test eder ve tiklar
      Then show invoice in tiklanabilir oldugunu test eder
      And show invoice a tiklar
      Then invoice sayfasinda oldugunu ve gorebildigini test eder
      And tarayiciyi kapatir





