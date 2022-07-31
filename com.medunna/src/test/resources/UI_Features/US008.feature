Feature: US008

  Scenario: Giris yapmak icin basarı mesajini dogrulayan, gecerli bir kullanici adi ve sifre olmalıdır.
    Given medunna ana sayfasina gider
    And anasayfada giris ikonuna tiklar
    And Sign in secenegini secer
    And kullanici adini ve sifresini girer
    And Sign in butonuna tiklar
    Then uygulamada oturum actigini test eder
    And tarayiciyi kapatir