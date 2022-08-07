@us014

Feature: "Physician (Doctor) Edit Inpatient (Yatılı Tedavi) işlemleri yapabilmeli
  (My Appointments / View / Edit Impatients)"
  Scenario:Doktor"ID, start and end dates, description, created date
  appointment id, status, room and patient" bilgilerini görüntülüyebilmeli ve güncelenebilmeli
    Given medunna ana sayfasina gider
    Then  anasayfada giris ikonuna tiklar
    And   Sign in secenegini secer
    And   doktor kullanici adini ve sifresini girer
    And   Sign in butonuna tiklar
    And   Mypages butonuna tiklar
    And   MyAppointmenti secer
    And   Edit butonuna tiklar





  Scenario: Doktor ID, start and end dates, description, created date
  appointment id, status, room and patient bilgilerini goruntuluyebilmeli ve guncelenebilmeli
    Given Medunna ana sayfasina gider
    And Sign in secenegini secer
    And kullanici adini ve sifresini girer
    And Sign in butonuna tiklar
    And Items&titles butonuna tiklar
    And MyAppointmenti secer
    And View butonuna tiklar
    Then istenilen bilgilerin goruntulendigini kontrol eder
    And Edit butonuna tiklar
    Then istenilen bilgilerin guncellenebildigini kontrol eder
    And tarayiciyi kapatir

  Scenario: Status" doktor tarafindan UNAPPROVED, DISCHARGED, STILL STAYING veya CANCELLED olarak guncellenebilmeli
    Given Medunna ana sayfasina gider
    And Sign in secenegini secer
    And kullanici adini ve sifresini girer
    And Sign in butonuna tiklar
    And Items&titles butonuna tiklar
    And MyAppointmenti secer
    And Edit butonuna tiklar
    Then Status un guncellenebildigini kontrol eder
    And tarayiciyi kapatir.



  Scenario: Doktor rezerve edilmiş odayı güncelleyebilmeli