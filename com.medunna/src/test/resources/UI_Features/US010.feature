@us010

Feature: Doktor (Physician) randevulari
  Scenario: Kullanici, randevu listesini ve zaman dilimlerini "My Appointments" sekmesinden görebilmelidir.
    Given medunna ana sayfasina gider
    And anasayfada giris ikonuna tiklar
    And Sign in secenegini secer
    And patient kullanici adini ve sifresini girer
    And Sign in butonuna tiklar
    And Mypages butonuna tiklar
    And MyAppointmenti secer
    Then randevu listesi ve zaman dilimleri oldugunu kontrol eder
    And tarayiciyi kapatir

  Scenario: Kullanici "patient id, start date, end date, status" bilgilerini gorebilmeli
    Given medunna ana sayfasina gider
    And anasayfada giris ikonuna tiklar
    And Sign in secenegini secer
    And patient kullanici adini ve sifresini girer
    And Sign in butonuna tiklar
    And Mypages butonuna tiklar
    And MyAppointmenti secer
    Then patient id, start date, end date ve status bilgileri oldugunu kontrol eder
    And tarayiciyi kapatir