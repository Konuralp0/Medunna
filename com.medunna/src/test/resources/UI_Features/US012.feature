Feature: Doktor test isteyebilmeli

  Scenario: Doktor arzu ettigi iceriklerile test isteyebilmeli
    Given medunna ana sayfasina gider
    Then anasayfada giris ikonuna tiklar
    And Sign in secenegini secer
    And kullanici olusturdugu adini ve sifresini girer
    And Sign in butonuna tiklar
    And Mypages butonuna tiklar
    Then MyAppointmenti secer
    And Edit butonuna tiklar
    When Request a Test butonuna tiklar
    And Sodium ve Urea secer
    And Save butonuna  tiklar
    And Show test results butonuna tiklar
    And View results butonuna tiklar
    Then Sodium ve Urea test iceriginde oldugu gorulur
    And tarayiciyi kapatir
