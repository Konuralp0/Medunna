package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.MedunnaAdminItemsAndTitles;
import pages.MedunnaMainPage;
import pages.MedunnaPhysicianPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US018 {
    MedunnaMainPage mainPage = new MedunnaMainPage();
    MedunnaPhysicianPage physicianPage = new MedunnaPhysicianPage();
    MedunnaAdminItemsAndTitles medunnaAdminItemsAndTitles=new MedunnaAdminItemsAndTitles();
    @And("Physicians menusune giris yapar")
    public void physiciansMenusuneGirisYapar() {
        medunnaAdminItemsAndTitles.physicianButton.click();
        Driver.wait(2);
    }

    @Then("Create a new Physician butonuna tiklar")
    public void createANewPhysicianButonunaTiklar() {
        physicianPage.createNewPhysicianButton.click();
        Driver.wait(2);
    }

    @Given("Use Search kutusunu isaretle")
    public void useSearchKutusunuIsaretle() {
        physicianPage.useSearchCheckBox.click();
        Driver.wait(2);
    }

    @And("Istenilen kisinin SSN kimligini girer")
    public void istenilenKisininSSNKimliginiGirer() {
        physicianPage.searchSSN.sendKeys("321-48-7891");
        Driver.wait(2);
    }

    @And("Search User butonuna tiklar")
    public void searchUserButonunaTiklar() {
        physicianPage.searchUserButton.click();
        Driver.wait(2);
    }

    @Then("Verilerin goruntulendigini kontrol eder")
    public void verilerinGoruntulendiginiKontrolEder() {
        Assert.assertTrue(physicianPage.userFoundAlert.isDisplayed());


    }

    @Given("Speciality butonua tiklar")
    public void specialityButonuaTiklar() {
    }

    @Then("Speciality secebildigini kontrol eder")
    public void specialitySecebildiginiKontrolEder() {
    }

    @Given("Exam fee butonuna tiklar")
    public void examFeeButonunaTiklar() {
    }

    @Then("Exam fee girilebildigini kontrol eder")
    public void examFeeGirilebildiginiKontrolEder() {
    }

    @And("Fotograg yukleme butonuna tiklar")
    public void fotogragYuklemeButonunaTiklar() {
    }

    @Then("Fotograg yuklenebilirligini kontrol eder")
    public void fotogragYuklenebilirliginiKontrolEder() {
    }



    @Then("adi soyadi dogum tarihi vb bilgilerinin oldugunu test eder")
    public void adiSoyadiDogumTarihiVbBilgilerininOldugunuTestEder() {
        Assert.assertTrue(physicianPage.physicianUserName.isDisplayed());
        Assert.assertTrue(physicianPage.physicianLastName.isDisplayed());
        Assert.assertTrue(physicianPage.physicianGender.isDisplayed());
        Assert.assertTrue(physicianPage.physicianSpeciality.isDisplayed());
        Assert.assertTrue(physicianPage.physicianBloodGroup.isDisplayed());
    }

    @And("Speciality menusune tiklar ve bir uzmanlik dali secer")
    public void specialityMenusuneTiklarVeBirUzmanlikDaliSecer() {
        Select slc = new Select(physicianPage.physicianSpeciality);
        slc.selectByVisibleText("Dermatology");

    }

    @Then("secimi kontrol eder")
    public void secimiKontrolEder() {
        Assert.assertTrue(physicianPage.selectedSpeciality.isDisplayed());
    }


    @And("Exam fee ye tiklar Muayene ucreti verisi girer")
    public void examFeeYeTiklarMuayeneUcretiVerisiGirer() {
        physicianPage.physicianExamFee.sendKeys("20");

    }

    @Then("Girildiginin kontrolunu yapar")
    public void girildigininKontrolunuYapar() {
        Assert.assertEquals("20" , physicianPage.physicianExamFee.getText());
    }


    @And("image file butonuna tiklar  ve doktor fotografi yukler")
    public void imageFileButonunaTiklarVeDoktorFotografiYukler() {
        physicianPage.physicianImageFileUpload.sendKeys("physicianPhoto.jpg");

    }

    @Then("fotografin yuklendigini test eder")
    public void fotografinYuklendiginiTestEder() {
        Assert.assertTrue(physicianPage.physicianUploadedPhoto.isDisplayed());
    }

    @And("view butonuna tiklar")
    public void viewButonunaTiklar() {
        physicianPage.physiciansViewButton.click();
    }

    @Then("bilgilerin goruntulandigini test eder")
    public void bilgilerinGoruntulandiginiTestEder() {
        Assert.assertTrue(physicianPage.physicianViewName.isDisplayed());
        Assert.assertTrue(physicianPage.physicianViewLastName.isDisplayed());
        Assert.assertTrue(physicianPage.physicianViewBirthDate.isDisplayed());
        Assert.assertTrue(physicianPage.physicianViewPhone.isDisplayed());
        Assert.assertTrue(physicianPage.physicianViewGender.isDisplayed());
        Assert.assertTrue(physicianPage.physicianViewBloodGroup.isDisplayed());
        Assert.assertTrue(physicianPage.physicianViewAddress.isDisplayed());
        Assert.assertTrue(physicianPage.physicianViewSpeciality.isDisplayed());
        Assert.assertTrue(physicianPage.physicianViewDescription.isDisplayed());
        Assert.assertTrue(physicianPage.physicianViewCreatedDate.isDisplayed());
        Assert.assertTrue(physicianPage.physicianViewImage.isDisplayed());
        Assert.assertTrue(physicianPage.physicianViewUserName.isDisplayed());
        Assert.assertTrue(physicianPage.physicianViewCountry.isDisplayed());
        Assert.assertTrue(physicianPage.physicianViewStateCity.isDisplayed());

    }


    @And("degistirecegi doktor satirinda edit butonuna tiklar")
    public void degistirecegiDoktorSatirindaEditButonunaTiklar() {
        physicianPage.physiciansEditButton.click();
    }

    @And("secilen doktor bilgilerinde degisiklik yapilir")
    public void secilenDoktorBilgilerindeDegisiklikYapilir() {
        physicianPage.physicianEditExamFee.sendKeys("200");
    }

    @And("save butonuna basilir")
    public void saveButonunaBasilir() {
        physicianPage.physicianEditSaveButton.click();

    }

    @Then("guncellemerin yapildigi test edilir")
    public void guncellemerinYapildigiTestEdilir() {
        Assert.assertEquals("200", physicianPage.physicianEditChangedExamFee);
    }

    @Then("secilen doktorun silinebildigini test eder")
    public void secilenDoktorunSilinebildiginiTestEder() {
        Assert.assertTrue(physicianPage.physicianDeleteButton.isEnabled());
    }

    @Given("Admin menusune gider")
    public void adminMenusuneGider() {
        mainPage.administration.click();
    }

    @And("User Management butonuna tiklar")
    public void userManagementButonunaTiklar() {
        mainPage.userManagement.click();
    }

    @And("Kullanicilar arasindan doktor secer")
    public void kullanicilarArasindanDoktorSecer() {
        medunnaAdminItemsAndTitles.userSelectDoctor.click();
    }

    @Then("doktor rolu oldugunu test eder")
    public void doktorRoluOldugunuTestEder() {
        Assert.assertTrue("ROLE_PHYSICIAN", medunnaAdminItemsAndTitles.testRolePhysician.isDisplayed());

    }
    @And("admin kullanici adini ve sifresini girer")
    public void adminKullaniciAdiniVeSifresiniGirer() {
        mainPage.username.sendKeys("infoTech" +Keys.TAB);
        mainPage.password.sendKeys("Admin123.");
    }

    @And("Admin olarak giris yapar")
    public void adminOlarakGirisYapar() {
        mainPage.signInRegister.click();
        mainPage.signIn.click();
        mainPage.username.sendKeys(ConfigReader.getProperty("adminUsername") + Keys.TAB);
        mainPage.password.sendKeys(ConfigReader.getProperty("adminPassword")+Keys.TAB);
        mainPage.sigInButton.click();
        Driver.wait(2);

    }
}
