Feature: US008
  Scenario: Kullanici giris yaptiginda Password sekmesi duzenlenebilir olmalidir.
    Given medunna ana sayfasina gider
    And ana sayfa giris ikonuna tiklar
    And Sign in secenegini secer
    And Kullanici Adini ve Sifresini girer
    And Sign in Butonuna tiklar
    And Kullanici Adina tiklar
    And Password sekmesini secer
    And Mevcut sifreyi girer
    And New password yerine bes harfli ilk harfi buyuk bir sifre girer
    And herhangi bir rakam girer
    Then Strength Barin bir arttigini Test eder
    And Ozel bir karakter girer
    Then Strengt Barin bir defa daha arttigini test eder
    And New password confirmation girer
    Then New Passwordun confirme oldugunu test eder
    Then eski sifrenin kullanilamayacagini test eder
    And Tarayiciyi kapatir