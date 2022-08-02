Feature: Admin tarafindan hasta olusturma ve duzenleme

  Scenario: Yeni hastalar yalnizca admin tarafinda olusturulabilir ve Hastaya Doktoru sadece admin atayabilir
    Given medunna ana sayfasina gider
    And anasayfada giris ikonuna tiklar
    And Sign in secenegini secer
    And kullanici olusturdugu adini ve sifresini girer
    Then Kullanici admin toollarinin olmadigini test eder
    Then tarayiciyi kapatir


    Scenario: Yonetici "SSN, First Name, Last Name, Birth Date, Phone, Gender, Blood Group, Address, Description, Created Date, User, Country and state / City" gibi hasta bilgilerini gorebilir
      Given medunna ana sayfasina gider
      And Login as admin
      And admin items ve titles a tiklar
      Then Patient i secer
      And Bilgilerini gorebildigini dogrular
      Then tarayiciyi kapatir


      Scenario: Yeni hasta olusturma ve ulke ayarlarinda State us state olmali
        Given medunna ana sayfasina gider
        And Login as admin
        And admin items ve titles a tiklar
        Then Patient i secer
        And yeni bir hasta olustura tiklar
        Then yeni hastanin bilgilerini girer
        And Country USA secer ve eyaletinde acilan dropdowndan secer
        Then tarayiciyi kapatir



      Scenario: Admin herhangi bir hastayi silebilir
        Given medunna ana sayfasina gider
        And Login as admin
        And admin items ve titles a tiklar
        Then Patient i secer
        And Delete seceginin basilabilir oldugunu test eder
        Then tarayiciyi kapatir


        Scenario: API ile hasta bilgilerini dogrulama
          Given Kullanici bir hasta icin data olusturur
          And Olusturdugu hastayi post request ile gonderir
          Then Kullanici hastayi dogrular


