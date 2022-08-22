@us009
Feature:US009
  Scenario: "My Pages" sekmesinden hasta bilgilerini gorebilmelidir.
    Given Medunna ana sayfasina gider
    And   Staff olarak giris yapar
    And   My Pages sekmesine tiklar
    And   Search patient sekmesine tiklar
    Then  Hasta bilgilerini gorebildigini test eder
    And   tarayiciyi kapatir

  Scenario: Kullanıcı butun hasta bilgilerini "firstname, lastname, birthdate, email, phone, gender, blood group, address, description,
  user, country and state/city" duzenleyebilmelidir.
    Given Medunna ana sayfasina gider
    And   Staff olarak giris yapar
    And   My Pages sekmesine tiklar
    And   Search patient sekmesine tiklar
    And   Hasta bilgilerini duzenlemek icin Edit butonuna tiklar
    Then  Hasta bilgilerini duzenleyebilecegi sayfada oldugunu test eder
    And   tarayiciyi kapatir

  Scenario: Kullanıcı, SSN'lerine göre yeni bir başvuru sahibi arayabilmeli
  ve tüm kayıt bilgilerinin doldurulduğunu görebilmelidir.

    Given Medunna ana sayfasina gider
    And   Staff olarak giris yapar
    And   My Pages sekmesine tiklar
    And   Search patient sekmesine tiklar
    And   SSN numarasi girilen hastanin kaydina ulasildigini test eder
    Then  Hastanin tum bilgilerinin dolduruldugunu gorebilir
    And   tarayiciyi kapatir

  Scenario:Kullanıcı, API kullanarak tüm hasta bilgilerini doğrulamalıdır.
  Given :



  Scenario:Kullanıcının DB'den gelen tüm hasta bilgilerini doğrulamalıdır.
  Given


  Scenario: Kullanıcı herhangi bir hasta bilgisini silebilir.
  Given





  Scenario:Staff hastaları silememeli
    Given Medunna ana sayfasina gider
    And   Staff olarak giris yapar
    And   My Pages sekmesine tiklar
    And   Search patient sekmesine tiklar
    Then  Delete butonunun olmadigini boylece hastalari silemedigini test eder
    And   tarayiciyi kapatir


