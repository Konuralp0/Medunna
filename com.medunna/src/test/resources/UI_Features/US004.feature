Feature: US004

  Scenario: Giris yapmak icin basarı mesajini dogrulayan, gecerli bir kullanici adi ve sifre olmalıdır.
    Given medunna ana sayfasina gider
    And anasayfada giris ikonuna tiklar
    And Sign in secenegini secer
    And kullanici adini ve sifresini girer
    And Sign in butonuna tiklar
    Then uygulamada oturum actigini test eder
    And tarayiciyi kapatir

  Scenario: Kullanicinin mevcut kimlik bilgilerini her zaman kullanabilecegi bir beni hatirla seçenegi olmalidir.
    Given medunna ana sayfasina gider
    And anasayfada giris ikonuna tiklar
    Then beni hatirla seceneginin oldugunu test eder
    And tarayiciyi kapatir

  Scenario: Eger sifre unutulursa diye "Did you forget your password?" secenegi olmalidir.
    Given medunna Login sayfasina gider
    Then "Did you forget your password?" secenegi oldugunu test eder
    And tarayiciyi kapatir

  Scenario: "You don't have an account yet? Register a new account" secenegi olmalidir.
    Given medunna Login sayfasina gider
    Then "You don't have an account yet? Register a new account" secenegi oldugunu test eder
    And tarayiciyi kapatir

  Scenario: "Cancel" secenegi olmalidir.
    Given medunna Login sayfasina gider
    Then "Cancel" secenegi oldugunu test eder
    And tarayiciyi kapatir