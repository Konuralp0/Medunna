Feature: Kullanici iletisim mesaji gonderebilmeli

  Scenario: Kullanici iletisim mesajini basariyla gonderebilmeli
    Given medunna ana sayfasina gider
    Then anasayfada giris ikonuna tiklar
    And Sign in secenegini secer
    And kullanici olusturdugu adini ve sifresini girer
    And Sign in butonuna tiklar
    When Contact butonuna tiklar
    And Mesaj icin gerekli yerleri doldurur
    And Mesaji gonderir
    Then Mesajin gonderildigi uyarisi cikar
    And tarayiciyi kapatir