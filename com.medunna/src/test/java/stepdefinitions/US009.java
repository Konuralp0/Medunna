package stepdefinitions;

import groovyjarjarasm.asm.tree.TryCatchBlockNode;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.MedunnaMainPage;
import pages.MedunnaStaffPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US009 {
    MedunnaMainPage mainPage=new MedunnaMainPage();
    MedunnaStaffPage staffPage=new MedunnaStaffPage();

    @And("Staff olarak giris yapar")
    public void staffOlarakGirisYapar() {
        mainPage.signInRegister.click();
        mainPage.signIn.click();
        mainPage.username.sendKeys(ConfigReader.getProperty("staffUsername") + Keys.TAB);
        mainPage.password.sendKeys(ConfigReader.getProperty("staffPassword")+Keys.TAB);
        mainPage.sigInButton.click();
        Driver.wait(2);

    }

    @And("My Pages sekmesine tiklar")
    public void myPagesSekmesineTiklar() {
        staffPage.myPages.click();
        Driver.wait(1);
    }

    @And("Search patient sekmesine tiklar")
    public void searchPatientSekmesineTiklar() {
        staffPage.searchPatient.click();
        Driver.wait(1);
    }

    @Then("Hasta bilgilerini gorebildigini test eder")
    public void hastaBilgileriniGorebildiginiTestEder() {
        Assert.assertTrue("hata mesaji gorundu", staffPage.patientsVerification.isDisplayed());
    }

    @And("Hasta bilgilerini duzenlemek icin Edit butonuna tiklar")
    public void hastaBilgileriniDuzenlemekIcinEditButonunaTiklar() {
        staffPage.editPatient.click();
    }

    @Then("Hasta bilgilerini duzenleyebilecegi sayfada oldugunu test eder")
    public void hastaBilgileriniDuzenleyebilecegiSayfadaOldugunuTestEder() {
        Assert.assertTrue(staffPage.patientEditPage.isDisplayed());


    }

    @And("SSN numarasi girilen hastanin kaydina ulasildigini test eder")
    public void ssnNumarasiGirilenHastaninKaydinaUlasildiginiTestEder() {
        staffPage.ssnInput.sendKeys("587-45-8880");  //Butun bilgileri dolu olan hasta
        Assert.assertTrue( staffPage.patientFindVerification.isDisplayed());
//        staffPage.ssnInput.sendKeys("409-67-5445");    // Bazi bilgileri eksik olan hasta
//        Assert.assertTrue( staffPage.patientFindVerification.isDisplayed());


    }

    @Then("Hastanin tum bilgilerinin dolduruldugunu gorebilir")
    public void hastaninTumBilgilerininDolduruldugunuGorebilir() {
        String deger1=staffPage.tablePhone.getText();
        Driver.wait(1);
        Assert.assertFalse("alan bos",deger1.isBlank());

        String deger2=staffPage.tableEmail.getText();
        Driver.wait(1);
        Assert.assertFalse("alan bos",deger2.isBlank());

        String deger3=staffPage.tableGender.getText();
        Driver.wait(1);
        Assert.assertFalse("alan bos",deger3.isBlank());

        String deger4=staffPage.tableBlood.getText();
        Driver.wait(1);
        Assert.assertFalse("alan bos",deger4.isBlank());

        String deger5=staffPage.tableAddress.getText();
        Driver.wait(1);
        Assert.assertFalse("alan bos",deger5.isBlank());

        String deger6=staffPage.tableDescription.getText();
        Driver.wait(1);
        Assert.assertFalse("alan bos",deger6.isBlank());

        String deger7=staffPage.tableDate.getText();
        Driver.wait(1);
        Assert.assertFalse("alan bos",deger7.isBlank());

        String deger8=staffPage.tableuser.getText();
        Driver.wait(1);
        Assert.assertFalse("alan bos",deger8.isBlank());

        String deger9=staffPage.tableCountry.getText();
        Driver.wait(1);
        Assert.assertFalse("alan bos",deger9.isBlank());

        String deger10=staffPage.tableState.getText();
        Driver.wait(1);
        Assert.assertFalse("alan bos",deger10.isBlank());

    }

    @Then("Delete butonunun olmadigini boylece hastalari silemedigini test eder")
    public void deleteButonununOlmadiginiBoyleceHastalariSilemediginiTestEder() {

        Boolean sonuc = null;
        try{
            Assert.assertFalse(staffPage.deleteButton.isDisplayed());
        }catch (Exception e){
            sonuc= false;
        }
        Assert.assertEquals(false, sonuc);
    }

}








