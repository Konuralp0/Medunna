@us018

Feature: Admin olarak Yeni Physicians Olustur  Guncelle  Goruntule ve Sil
  Background: Admin olarak giris yapilir
    Given Medunna ana sayfasina gider
    And ana sayfa giris ikonuna tiklar
    And Sign in secenegini secer
    And admin kullanici adini ve sifresini girer
    Then Sign in butonuna tiklar




  Scenario: Admin SSN ID ye gore kayitli bir kisiyi arayabilir
    Given Items&titles butonuna tiklar
    And Physicians menusune giris yapar
    And Create a new Physician butonuna tiklar
    And Use Search kutusunu isaretle
    And Istenilen kisinin SSN kimligini girer
    And Search User butonuna tiklar
    Then Verilerin goruntulendigini kontrol eder
    And tarayiciyi kapatir

  Scenario: Doktor bilgilerinde adi soyadi dogum tarihi vb olmalidir
    Given Items&titles butonuna tiklar
    And Physicians menusune giris yapar
    And Create a new Physician butonuna tiklar
    And Use Search kutusunu isaretle
    And Istenilen kisinin SSN kimligini girer
    And Search User butonuna tiklar
    Then adi soyadi dogum tarihi vb bilgilerinin oldugunu test eder
    And tarayiciyi kapatir

  Scenario: Admin doktor uzmanligi muayene ucreti girebilmelidir
    Given Physicians menusune giris yapar
    And Create a new Physician butonuna tiklar
    And Speciality menusune tiklar ve bir uzmanlik dali secer
    Then secimi kontrol eder
    And Exam fee ye tiklar Muayene ucreti verisi girer
    Then Girildiginin kontrolunu yapar
    And tarayiciyi kapatir


  Scenario: Admin doktor fotografi yukleyebilmelidir
    Given Physicians menusune giris yapar
    And Create a new Physician butonuna tiklar
    And image file butonuna tiklar  ve doktor fotografi yukler
    Then fotografin yuklendigini test eder
    And tarayiciyi kapatir


  Scenario: Admin mevcut kullanicilar arasindan doktoru secebilmelidir
    Given Admin menusune gider
    And User Management butonuna tiklar
    And Kullanicilar arasindan doktor secer
    Then doktor rolu oldugunu test eder
    And tarayiciyi kapatir


  Scenario:  Admin doktor bilgilerini view modu ile goruntuleyebilir
    Given Physicians menusune giris yapar
    And view butonuna tiklar
    Then bilgilerin goruntulandigini test eder



  Scenario:  Admin yeni veriler kullanarak doktor bilgilerini guncelleyebilir
    Given Physicians menusune giris yapar
    And degistirecegi doktor satirinda edit butonuna tiklar
    And secilen doktor bilgilerinde degisiklik yapilir
    And save butonuna basilir
    Then guncellemerin yapildigi test edilir
    And tarayiciyi kapatir



  Scenario: Admin girilmis doktorlari silebilir
    Given Physicians menusune giris yapar
    Then secilen doktorun silinebildigini test eder
    And tarayiciyi kapatir
