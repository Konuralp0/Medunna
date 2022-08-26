@us025
  Feature: US025
    Scenario: Patient can make a new appointment using their protal
      Given Medunna ana sayfasina gider
      And   Make appointment butonuna tiklar
      And   First name kutusuna uygun isim girer
      Then  hata mesajinin cikmadigini test eder
      And   SSN kutusuna uygun ssn girer
      Then  SSN icin hata mesajinin cikmadigini test eder
      And   Last name kutusuna uygun lastname girer
      Then  Lastname icin hata mesajinin cikmadigini test eder
      And   e-mail kutusuna uygun e-mail girer
      Then  e-mail icin hata mesajinin cikmadigini test eder
      And   Telefon kutusuna uygun telefon numarasi girer
      Then  Telefon numarasi icin hata mesajinin cikmadigini test eder
      And   Tarihin gun ay yil olarak yazildigini test eder
      And   Send an appointment request butonuna tiklar
      Then  Appointment kaydinin basarili oldugunu dogrular



