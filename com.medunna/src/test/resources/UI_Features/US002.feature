@us002

Feature: Kayit olmak icin email and username bilgileri girilebilmelidir
  Scenario: Herhangi bir karakter iceren ve bos birakilamayan gecerli bir "Username" olmalidir.
    Given   Medunna ana sayfasina gider
    And     ana sayfa giris ikonuna tiklar
    And     Register butonuna tiklar
    And     Username kutusuna tiklar.
    And     Username kutusuna herhangi bir karakter girer ve tab tusuna basar
    Then    Username gerekli yazdigini test eder.
    And     tarayiciyi kapatir.

  Scenario:  "Username" olmalidir.
    Given   Medunna ana sayfasina gider
    And     ana sayfa giris ikonuna tiklar
    And     Register butonuna tiklar
    And     Username kutusuna tiklar.
    And     Username kutusuna herhangi bir karakter girer ve tab tusuna basar
    Then    Username kutusunun altinda hata mesaji cikmadigini kontrol eder.
    And     tarayiciyi kapatir.

  Scenario: Email adresi "@" ve "." karakterleri olmadan doldurulmamalidir.
    Given   Medunna ana sayfasina gider
    And     ana sayfa giris ikonuna tiklar
    And     Register butonuna tiklar
    And     Email kutusuna tiklar.
    And     Email kutusuna "@" ve "." karakterleri olmadan karakterler girer.
    Then    Email kutusunun altinda uygun bir Email istendiginin yazdigini test eder.
    And     tarayiciyi kapatir.

  Scenario: E-mail boş bırakılamaz.
    Given   Medunna ana sayfasina gider
    And     ana sayfa giris ikonuna tiklar
    And     Register butonuna tiklar
    And     Email kutusuna tiklar.
    And     New password kutusuna tiklar
    Then    Email kutusunun altinda email gerekli yazdigini test eder.
    And     tarayiciyi kapatir

  Scenario: Kullanici adi ve Email api kullanilarak dogrulanmalidir.
    Given   Kullanici bilgileri icin parametre olusturulur.
    And   Kullanici bilgileri icin post request gonderilir.
    Then   Kullanici adi ve Email dogrulanir.

  Scenario: Email DB ile dogrulanmalidir
    Given kullanici DB ile baglanti kurar
    And kullanıcı sorguyu DB'ye gönderir ve "<login>" oturum açma ile kullanıcı verilerini alır
    Then DB ile "<email>" dogrulamasi yapilir
    And kullanici DB baglantisini keser
    Examples: test data
      |email| login|
      |infotech@medunna.com| infotech|

