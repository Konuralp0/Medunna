Feature: My Appointments Doktor Tarafindan duzenlebilmeli

  Scenario: Yeni bir randevu olusturulabilmeli veya mevcut bir randevu duzenlebilmeli
    Given medunna ana sayfasina gider
    Then anasayfada giris ikonuna tiklar
    And Sign in secenegini secer
    And kullanici olusturdugu adini ve sifresini girer
    And Sign in butonuna tiklar
    And Mypages butonuna tiklar
    Then MyAppointmenti secer
    And Edit butonuna tiklar
    Then Edit sayfasinda oldugunu test eder
    And tarayiciyi kapatir



    Scenario: Bir randevu guncelleginde doktor yeni guncel bilgileri my appointmensta gorebilmelidir "id, start and end date, Status, physician and patient" &
    Doktor gerekli alanlara "Anamnesis, Treatment ve Diagnosis" yazabilmelidir & Prescription ve Description istege bagli olmalidir

      Given medunna ana sayfasina gider
      Then anasayfada giris ikonuna tiklar
      And Sign in secenegini secer
      And kullanici olusturdugu adini ve sifresini girer
      And Sign in butonuna tiklar
      And Mypages butonuna tiklar
      Then MyAppointmenti secer
      And Edit butonuna tiklar
      Then Anamsesi, Treatmente, Diagnosisi degistirir ama Prescription ve Description bos kalir
      And Save butonuna tiklar
      Then Yeni guncel  bilgileri gorebildigini test eder
      And tarayiciyi kapatir



      Scenario: Status doktor tarafinda Pending Completed veya Cancelled olarak secilebilmeli
        Given medunna ana sayfasina gider
        Then anasayfada giris ikonuna tiklar
        And Sign in secenegini secer
        And kullanici olusturdugu adini ve sifresini girer
        And Sign in butonuna tiklar
        And Mypages butonuna tiklar
        Then MyAppointmenti secer
        And Edit butonuna tiklar
        And Statusu degisitirebildigini test eder
        Then tarayiciyi kapatir















