@us009
  Feature:US009
    Scenario: "My Pages" sekmesinden hasta bilgilerini görebilmelidir.
      Given Medunna ana sayfasina gider
      And   Staff olarak giris yapar
      And   My Pages sekmesine tiklar
      And   Search patient sekmesine tiklar
      Then  Hasta bilgilerini gorebildigini test eder
      And   tarayiciyi kapatir

      Scenario: Kullanıcı bütün hasta bilgilerini "id, firstname,
      lastname, birthdate, email, phone, gender, blood group, address, description,
      user, country and state/city" düzenleyebilmelidir.
