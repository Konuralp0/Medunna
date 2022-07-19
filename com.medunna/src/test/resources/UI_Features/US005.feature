Feature:
  Scenario: Kullanıcının herhangi bir karakter içeren "First Name" yazması gerekir ve boş bırakılamaz.
    Given Medunna ana sayfasina gider
    And   First name kutusuna uygun isim girer
    Then  hata mesajinin cikmadigini test eder
    And   tarayiciyi kapatir
