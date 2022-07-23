@us007
Feature: US007
  Scenario: Hastalar randevu tarihi olusturabilmelidir
    Given medunna ana sayfasina gider
    And  make an appointmenta tiklar
    Then Appointment Datetimeda verilen tarih bugune esitligini test eder
    And Gun yerine bir gun oncesinin tarihini yazar
    Then Uyari verdigini test eder
    And Gun yerine bugunun tarihinin bir sonrasini yazar
    Then Uyarinin kalktigini test eder
    And Ay yerine bir ay oncesinin tarihini yazar
    Then Uyari verdigini test eder
    And Ay yerine bu ayin tarihini yazar
    Then Uyarinin kalktigini test eder
    And Yil yerine eski bir yil yazar
    Then Uyari verdigini test eder
    And Yil yerine bir sonraki yilin tarihini yazar
    Then Uyarinin kalktigini test eder
    Then Tarihin gun ay yil olarak yazildigini test eder
    And tarayiciyi kapatir



    Scenario: API kullanarak randevular olusturulabilmelidir
      Given Kullanici randevu icin data olusturur
      And Kullanici olusturdugu randevuyu post request ile gonderir
      Then Kullanici kayitlari dogrular


