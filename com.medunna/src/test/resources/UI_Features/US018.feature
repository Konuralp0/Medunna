@us018

Feature: Admin olarak Yeni Physicians Olustur  Guncelle  Goruntule ve Sil
  Scenario: Admin SSN ID ye gore kayitli bir kisiyi arayabilir
    Given Medunna ana sayfasina gider
    And admin username ve sifresini girer
    And Items&titles butonuna tiklar
    And Physicians menusune giris yapar
    And Create a new Physician butonuna tiklar
    And Use Search kutusunu isaretle
    And Istenilen kisinin SSN kimligini girer
    And Search User butonuna tiklar
    Then Verilerin goruntulendigini kontrol eder
    And tarayiciyi kapatir

  Scenario: Doktor bilgilerinde adi soyadi dogum tarihi vb olmalidir
    Given Medunna ana sayfasina gider
    And admin username ve sifresini girer
    And Items&titles butonuna tiklar
    And Physicians menusune giris yapar
    And Create a new Physician butonuna tiklar
    And Use Search kutusunu isaretle
    And Istenilen kisinin SSN kimligini girer
    And Search User butonuna tiklar
    Then adi soyadi dogum tarihi vb bilgilerinin oldugunu test eder
    And tarayiciyi kapatir

  Scenario: Admin doktor uzmanligi muayene ucreti girebilmelidir
    Given Medunna ana sayfasina gider
    And admin username ve sifresini girer
    And Items&titles butonuna tiklar
    And Physicians menusune giris yapar
    And Create a new Physician butonuna tiklar
    And Speciality menusune tiklar ve bir uzmanlik dali secer
    Then secimi kontrol eder
    And Exam fee ye tiklar Muayene ucreti verisi girer
    Then Girildiginin kontrolunu yapar
    And tarayiciyi kapatir


  Scenario: Admin doktor fotografi yukleyebilmelidir
    Given Medunna ana sayfasina gider
    And admin username ve sifresini girer
    And Items&titles butonuna tiklar
    And Physicians menusune giris yapar
    And Create a new Physician butonuna tiklar
    And image file butonuna tiklar  ve doktor fotografi yukler
    Then fotografin yuklendigini test eder
    And tarayiciyi kapatir


  Scenario: Admin mevcut kullanicilar arasindan doktoru secebilmelidir
    Given Medunna ana sayfasina gider
    And admin username ve sifresini girer
    And Items&titles butonuna tiklar
    And Admin menusune gider
    And User Management butonuna tiklar
    And Kullanicilar arasindan doktor secer
    Then doktor rolu oldugunu test eder
    And tarayiciyi kapatir


  Scenario:  Admin doktor bilgilerini view modu ile goruntuleyebilir
    Given Medunna ana sayfasina gider
    And admin username ve sifresini girer
    And Physicians menusune giris yapar
    And view butonuna tiklar
    Then bilgilerin goruntulandigini test eder
    And tarayiciyi kapatir



  Scenario:  Admin yeni veriler kullanarak doktor bilgilerini guncelleyebilir
    Given Medunna ana sayfasina gider
    And admin username ve sifresini girer
    And Physicians menusune giris yapar
    And degistirecegi doktor satirinda edit butonuna tiklar
    And secilen doktor bilgilerinde degisiklik yapilir
    And save butonuna basilir
    Then guncellemerin yapildigi test edilir
    And tarayiciyi kapatir



  Scenario: Admin girilmis doktorlari silebilir
    Given Medunna ana sayfasina gider
    And admin username ve sifresini girer
    And Physicians menusune giris yapar
    Then secilen doktorun silinebildigini test eder
    And tarayiciyi kapatir

   Scenario: Admin doktorlari API ile dogrular
     Given Path parametreleri belirlenir
     And Beklenen veriler girilir
     Then API ile kayitlar dogrulanir


  Scenario: Admin doktorlari DB ile dogrular
    Given DB ile baglanti kurulur
    And sorguyu db'ye gönderilir ve "<ssn>" ssn numarasıyla kullanıcı verileri alinir
    Then Veriler DB ile dogrulanir "<ssn>"
    And kullanici DB baglantisini keser
      |ssn|
      |397-51-2256|






