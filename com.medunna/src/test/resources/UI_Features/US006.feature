@us006

Feature: Kullanıcı bilgisi sekmesi anasayfada düzenlenebilir olmalıdır
  Scenario: Kullanici bilgileri, doldurulan bilgilerden olusmali ve güncelleme secenegi olmalidir
    Given Medunna ana sayfasina gider
    And sign in butonu ile giris yapar
    And kullanici adini "<username>" ve sifresini "<password>" girer
    And Sign in butonuna tiklar
    And Kullanici menusu butonuna tiklar
    And Settings butonuna tiklar
    Then Kullanici bilgilerinin dogrulugunu test eder
    And User Settings Save butonuna tiklar
    Then Firstname, lastname ve Email guncelleme seceneginin oldugunu kontrol eder
    And tarayiciyi kapatir.
    Examples:
      | username     | password  |
      | hhasta       | 123456    |

