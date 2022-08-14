Feature: US008
  Scenario: Kullanıcı giriş yaptığında Password sekmesi düzenlenebilir olmalıdır.

    Given Medunna Ana sayfasina gider
    And Anasayfada giris ikonuna tiklar
    And Sign in Secenegini Secer
    And Kullanici Adini ve Sifresini girer
    And Sign in Butonuna tiklar
    And Kullanici Adina tiklar
    And Password sekmesini secer
    And Mevcut sifreyi girer
    And New password yerine iki harfli ilk harfi büyük bir sifre girer
    And herhangi bir rakam girer
    Then Strength Barin bir arttgini Test eder
    And Ozel bir karakter girer
    Then Strengt Barin bir defa daha arttgini test eder
    And New password confirmation girer
    And Save Butonuna tiklar
    Then sifrenin degistigini test eder
    And Save butonuna tekrar tiklar
    Then eski sifrenin kullanilamayacagini test eder
    And Tarayiciyi kapatir