@us006

Feature: Kullanıcı bilgisi sekmesi anasayfada düzenlenebilir olmalıdır
  Scenario: Kullanici bilgileri, doldurulan bilgilerden olusmali ve güncelleme secenegi olmalidir
    Given Medunna ana sayfasina gider
    And anasayfada giris ikonuna tiklar
    And Sign in secenegini secer
    And kullanici adini ve sifresini girer
    And Sign in butonuna tiklar
    And Kullanici menusu butonuna tiklar
    And Settings butonuna tiklar
    Then Kullanici bilgilerinin dogrulugunu test eder
    And Save butonuna tiklar
    Then Firstname, lastname ve Email guncelleme seceneginin oldugunu kontrol eder
    And tarayiciyi kapatir.

