Feature: US004
  Scenario: Giris yapmak icin basarı mesajini dogrulayan, gecerli bir kullanici adi ve sifre olmalıdır.
    Given medunna ana sayfasina gider
    And   anasayfada giris ikonuna tiklar
    And   Sign in secenegini secer
    And   kullanici adini ve sifresini girer
    And   Sign in butonuna tiklar
    Then  uygulamada oturum actigini test eder
    And   tarayiciyi kapatir

  Scenario: Login sayfasinda dogrulamalar yapar.
    Given medunna ana sayfasina gider
    And   anasayfada giris ikonuna tiklar
    And   Sign in secenegini secer
    Then  beni hatirla seceneginin oldugunu test eder
    Then  Did you forget your password? secenegi oldugunu test eder
    Then  You don't have an account yet? Register a new account secenegi oldugunu test eder
    Then  Cancel secenegi oldugunu test eder
    And   tarayiciyi kapatir