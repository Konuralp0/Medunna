Feature:
  Scenario: Kullanıcının herhangi bir karakter içeren "First Name" yazması gerekir ve boş bırakılamaz.
    Given Medunna ana sayfasina gider
    And   Make appointment butonuna tiklar
    And   First name kutusuna uygun isim girer
    Then  hata mesajinin cikmadigini test eder
   And   tarayiciyi kapatir



  Scenario: Kullanıcı SSN numarası girmeli (kayıtlı SSN) boş bırakılamaz.
    Given Medunna ana sayfasina gider
    And   Make appointment butonuna tiklar
    And   SSN kutusuna uygun ssn girer
    Then  SSN icin hata mesajinin cikmadigini test eder
#    And   tarayiciyi kapatir

  Scenario:Kullanıcı, herhangi bir karakter içeren "Last Name" yazması gerekir, boş bırakılamaz.
    Given Medunna ana sayfasina gider
    And   Make appointment butonuna tiklar
    And   Last name kutusuna uygun lastname girer
    Then  Lastname icin hata mesajinin cikmadigini test eder
#    And   tarayiciyi kapatir.

  Scenario:Kullanıcı "." ve "@" içeren e-mail adresi girmeli, boş bırakılamaz.
    Given Medunna ana sayfasina gider
    And   Make appointment butonuna tiklar
    And   e-mail kutusuna uygun e-mail girer
    Then  e-mail icin hata mesajinin cikmadigini test eder
#    And   tarayiciyi kapatir.

  Scenario:Kullanıcı, 3. ve 6. rakamdan sonra "-" olan 10 rakamlı telefon numarasını girmeli, boş bırakılamaz.
    Given Medunna ana sayfasina gider
    And   Make appointment butonuna tiklar
    And   Telefon kutusuna uygun telefon numarasi girer
    Then  Telefon numarasi icin hata mesajinin cikmadigini test eder
#    And   tarayiciyi kapatir.


  Scenario:Kullanıcı randevu alıp kaydolduğunda, profillerini görebilir ve uygulamada oturum açabilir.
    Given Medunna ana sayfasina gider
    And   ana sayfa giris ikonuna tiklar
    And   Sign in secenegini secer
    And   kullanici adini ve sifresini girer
    And   Sign in butonuna tiklar
    Then  uygulamada oturum actigini test eder
#    And   tarayiciyi kapatir.