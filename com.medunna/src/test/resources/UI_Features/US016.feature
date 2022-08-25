Feature: Oda Olusturma / Goruntuleme / Guncelleme /Silme

  Scenario: Admin, yatan hastalar icin yeni oda olusturabilir.
    Given Medunna ana sayfasina gider
    And Admin olarak giris yapar
    And Items&titles butonuna tiklar
    And Room menusune giris yapar
    And Create a new Room butonuna tiklar
    Then Oda olusturulurken Room Number olmasi gerektigini test eder
    And Room Number kutusunu tiklar
    And Herhangi bir Room Number girer
    Then TWIN, DELUXE, PREMIUM_DELUXE, SUIT ve  DAYCARE Room Type olmasi gerektigini test eder
    And Room Type kutusunu tiklar
    And Suit Type girer
    Then Current status can be set for the room test eder
    And Price kutusuna tiklar
    Then Price can be added and cannot be blank test eder
    And Price Kutusuna bir deger girer
    Then Description can be provided optionally test eder
    And Creat Date kutusuna eski bir tarih girer
    And save butunona tiklar
    Then Uyari verip vermedigini ve kayit uyarisini test eder
    And tarayiciyi kapatir

  Scenario: Admin can view all rooms with same items

    Given Medunna ana sayfasina gider
    And Admin olarak giris yapar
    And Items&titles butonuna tiklar
    And Room menusune giris yapar
    Then Admin can view all rooms with same items test eder
    And tarayiciyi kapatir

  Scenario: Admin can edit(update) esisting rooms

    Given Medunna ana sayfasina gider
    And Admin olarak giris yapar
    And Items&titles butonuna tiklar
    And Room menusune giris yapar
    And Edit menusune tiklar
    And Price kutusuna tiklar
    And Price Kutusundaki degeri degistirir
    And save butunona tiklar
    Then guncellemeyi test eder
    And tarayiciyi kapatir


  ////Scenario: Validate all rooms with API creating, reading, updating and deleting

  ////  Given Medunna ana sayfasina gider
  ////  And Admin olarak giris yapar
  ////  And Items&titles butonuna tiklar
  ////  And Physicians menusune giris yapar
  ////  And Create a new Physician butonuna tiklar
  ////  And image file butonuna tiklar  ve doktor fotografi yukler
  ////  Then fotografin yuklendigini test eder
  ////  And tarayiciyi kapatir


  Scenario: Rooms can be Deleted by admin

    Given Medunna ana sayfasina gider
    And Admin olarak giris yapar
    And Items&titles butonuna tiklar
    And Room menusune giris yapar
    And delete menusune tiklar
    And acilan sekemede delete comfirme edilir
    Then delete islemininin gerceklestigini test eder
    And tarayiciyi kapatir


  //Scenario:  DB ile hasta bilgilerini doğrulayın
//
   // Given .......
   // And .......
  //  Then ...
   // And tarayiciyi kapatir

