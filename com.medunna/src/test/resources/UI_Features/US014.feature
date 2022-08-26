@us014

Feature: "Physician (Doctor) Edit Inpatient (Yatılı Tedavi) işlemleri yapabilmeli
  (My Appointments / View / Edit Impatients)"
  Background:
    Given medunna ana sayfasina gider
    Then  anasayfada giris ikonuna tiklar
    And   Sign in secenegini secer
    And   doktor kullanici adini ve sifresini girer
    And   Sign in butonuna tiklar
    And   Mypages butonuna tiklar
    And   In Patient butonuna tiklar

  Scenario: Doktor ID, start and end dates, description, created date
  appointment id, status, room and patient bilgilerini goruntuluyebilmeli ve guncelenebilmeli
    When istenilen bilgilerin goruntulendigini kontrol eder
    And tarayiciyi kapatir

  Scenario: Status" doktor tarafindan UNAPPROVED, DISCHARGED, STILL STAYING veya CANCELLED olarak guncellenebilmeli
    Given Physicians Edit butonuna tiklar
    Then Status un guncellenebildigini kontrol eder
    And tarayiciyi kapatir.

  Scenario: Doktor rezerve edilmiş odayı güncelleyebilmeli
    Given Doktor yatan hasta icin uygun bir oda secer
    And Doktor save butonuna basar
    Then odanin guncellendigini test eder
    And tarayiciyi kapatir.