@us010

Feature: Doktor (Physician) randevulari
  Scenario: Kullanici, randevu listesini ve zaman dilimlerini "My Appointments" sekmesinden görebilmelidir.
    Given medunna ana sayfasina gider
    And anasayfada giris ikonuna tiklar
    And Sign in secenegini secer
    And kullanici olusturdugu adini ve sifresini girer
    And Sign in butonuna tiklar
    And Mypages butonuna tiklar
    And MyAppointmenti secer
    Then randevu listesi ve zaman dilimleri oldugunu kontrol eder
    And tarayiciyi kapatir

  Scenario: Kullanici "patient id, start date, end date, status" bilgilerini gorebilmeli
    Given medunna ana sayfasina gider
    And anasayfada giris ikonuna tiklar
    And Sign in secenegini secer
    And kullanici olusturdugu adini ve sifresini girer
    And Sign in butonuna tiklar
    And Mypages butonuna tiklar
    And MyAppointmenti secer
    Then patient id, start date, end date ve status bilgileri oldugunu kontrol eder
    And tarayiciyi kapatir



  Scenario: API ile randevular dogrulanir
    Given Doktor Medunna randevu API endpointini "<id>" ile olusturur
    Then Doktor randevu icin Get request olusturur ve gonderir
    Then Doktor randevu icin Get response alir
    Given Doktor Status Kodun 200 oldugunu dogrular
    And Doktor gelen json randevu datalarini javaya donusturur
    And Doktor gelen randevu datalarini kayit eder
    And Doctor API ile gelen datalar "<patientId>" "<startDate>" "<endDate>" "<status>" dogrular
    Examples:
      | id     | patientId | startDate            | endDate              | status     |
      | 151593 |155383    | 2022-08-31T00:00:00Z | 2022-08-31T01:00:00Z | COMPLETED |

  Scenario: DB ile randevulari dogrular
    Given kullanici DB ile baglanti kurar
    Then kullanıcı sorguyu DB'ye gönderir ve  kullanıcı verilerini "status" alır
    And kullanici DB baglantisini keser

