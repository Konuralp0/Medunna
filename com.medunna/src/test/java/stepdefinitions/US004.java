package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.MedunnaLoginPage;
import pages.MedunnaMainPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US004 {
    MedunnaMainPage mainPage = new MedunnaMainPage();
    MedunnaLoginPage logPage = new MedunnaLoginPage();


    @And("kullanici adini ve sifresini girer")
    public void kullaniciAdiniVeSifresiniGirer() {
        mainPage.username.sendKeys(ConfigReader.getProperty("adminUsername") + Keys.TAB);
        Driver.wait(3);
        mainPage.password.sendKeys(ConfigReader.getProperty("adminPassword"));
        Driver.wait(3);
    }
    @And("Sign in butonuna tiklar")
    public void signInButonunaTiklar() {
        mainPage.sigInButton.click();
        Driver.wait(3);
    }

    @Then("uygulamada oturum actigini test eder")
    public void uygulamadaOturumActiginiTestEder() {
        Assert.assertTrue("Hesaba giris y...",mainPage.administration.isDisplayed());
    }
    @Then("beni hatirla seceneginin oldugunu test eder")
    public void beni_hatirla_seceneginin_oldugunu_test_eder() {

        Assert.assertTrue("remember me ..", logPage.rememberMe.isDisplayed());
    }
    @Then("Did you forget your password? secenegi oldugunu test eder")
    public void did_you_forget_yours_password() {
        Assert.assertTrue("did you forget your password ..", logPage.did_you_forget_your_password.isDisplayed());

    }
    @Then("You don't have an account yet? Register a new account secenegi oldugunu test eder")
    public void register_a_new_account_seceneginin_oldugunu_test_eder() {

        Assert.assertTrue("register a new account ..", logPage.register_a_new_account.isDisplayed());

    }
    @Then("Cancel secenegi oldugunu test eder")
    public void cancel_seceneginin_oldugunu_test_eder() {
        Assert.assertTrue("cancel button display ..", logPage.cancelButton.isDisplayed());

    }



}




