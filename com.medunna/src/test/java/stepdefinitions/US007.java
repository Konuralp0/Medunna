package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.it.Date;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.MedunnaMainPage;
import pojo.RequestAppointment;
import pojo.RequestAppointmentResponse;
import utilities.Authentication;
import utilities.Driver;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static utilities.Authentication.tokenGenerate;

public class US007 {

    MedunnaMainPage page = new MedunnaMainPage();
    @And("make an appointmenta tiklar")
    public void makeAnAppointmentaTiklar() {
        page.makeAnAppointment.click();
        Driver.wait(2);
    }

    @Then("Appointment Datetimeda verilen tarih bugune esitligini test eder")
    public void appointmentDatetimedaVerilenTarihBuguneEsitliginiTestEder() {
   // DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
     // String currentDateStr = dtf.format(java.time.LocalDate.now());


        Assert.assertEquals(LocalDate.now().toString(), page.appoDate.getDomProperty("value"));
        Driver.wait(2);


    }

    @And("Gun yerine bir gun oncesinin tarihini yazar")
    public void gunYerineBirGunOncesininTarihiniYazar() { //icine Keys Objesi alan ve ona gore nereye gidecgini bilen method yap

        //page.appoDate.sendKeys(Keys.LocalDate.now().minusDays(1).toString().substring(0,2));
        page.appoDate.sendKeys(Keys.ARROW_LEFT);
        page.appoDate.sendKeys(Keys.ARROW_DOWN);
        Driver.wait(2);


    }

    @Then("Uyari verdigini test eder")
    public void uyariVerdiginiTestEder() {
        Assert.assertTrue(page.appointmentDateCanNotBePa.isDisplayed());
        Driver.wait(2);

    }

    @And("Gun yerine bugunun tarihinin bir sonrasini yazar")
    public void gunYerineBugununTarihininBirSonrasiniYazar() {
        //page.appoDate.sendKeys(LocalDate.now().plusDays(1).toString().substring(0,2));

        for(int i = 0; i<2; i++){
            page.appoDate.sendKeys(Keys.ARROW_UP);
        }
        Driver.wait(2);

    }

    @Then("Uyarinin kalktigini test eder")
    public void uyarininKalktiginiTestEder() {

        Assert.assertFalse(isPresent(page.appointmentDateCanNotBePa));
    }

    @And("Ay yerine bir ay oncesinin tarihini yazar")
    public void ayYerineBirAyOncesininTarihiniYazar() {
        page.appoDate.sendKeys(Keys.ARROW_RIGHT);
        page.appoDate.sendKeys(Keys.ARROW_DOWN);

    }

    @And("Ay yerine bu ayin tarihini yazar")
    public void ayYerineBuAyinTarihiniYazar() {
        page.appoDate.sendKeys(Keys.ARROW_UP);
    }

    @And("Yil yerine eski bir yil yazar")
    public void yilYerineEskiBirYilYazar() {
        page.appoDate.sendKeys(Keys.ARROW_RIGHT);
        page.appoDate.sendKeys(Keys.ARROW_DOWN);

    }

    @And("Yil yerine bir sonraki yilin tarihini yazar")
    public void yilYerineBirSonrakiYilinTarihiniYazar() {
        for (int i = 0; i<2; i++){
            page.appoDate.sendKeys(Keys.ARROW_UP);
        }
    }

    @Then("Tarihin gun ay yil olarak yazildigini test eder")
    public void tarihinGunAyYilOlarakYazildiginiTestEder() {
        Driver.refresh();
        Assert.assertTrue(checkDateFormat(page.appoDate.getDomProperty("value")));

    }

    RequestAppointment requestAppointment = new RequestAppointment();
    Faker faker = new Faker();
    Response response;
    @Given("Kullanici randevu icin data olusturur")
    public void kullaniciRandevuIcinDataOlusturur() {
        requestAppointment.setBirthDate(faker.date().birthday(18,99).toString());
        requestAppointment.setEmail(faker.internet().emailAddress());
        requestAppointment.setFirstName(faker.name().firstName());
        requestAppointment.setLastName(faker.name().lastName());
        requestAppointment.setGender("Female");
        requestAppointment.setPhone(faker.phoneNumber().cellPhone());
        requestAppointment.setSsn(faker.idNumber().ssnValid());


    }

    @And("Kullanici olusturdugu randevuyu post request ile gonderir")
    public void kullaniciOlusturduguRandevuyuPostRequestIleGonderir() {
        response = RestAssured.given()
                .contentType(ContentType.JSON)
                .header("Authorization","Bearer "+ Authentication.tokenGenerate())
                .body(requestAppointment).when()
                .post("https://medunna.com/api/appointments/request");
    }

    @Then("Kullanici kayitlari dogrular")
    public void kullaniciKayitlariDogrular() {

        RequestAppointmentResponse requestAppointmentResponse = response.as(RequestAppointmentResponse.class);

        Assert.assertEquals(requestAppointment.getFirstName(),requestAppointmentResponse.getPatient().getFirstName());
        Assert.assertEquals(requestAppointment.getLastName(),requestAppointmentResponse.getPatient().getLastName());
    }




    public boolean isPresent(WebElement element){ // Ekranda bulunmayan bir elementi Assertun icine boolean deger atamak icin yapilmis method
        try {
            element.isDisplayed();
            return true;
        }catch (NoSuchElementException e){
            return false;
        }


    }

    public boolean checkDateFormat(String s) {
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date1 = LocalDate.parse(s);
        s = formatter.format(date1);
        LocalDate date = LocalDate.now();

        String strDate = formatter.format(date);
        System.out.println(strDate);
        System.out.println(s);

        if (s.equals(strDate)) {
            return true;
        } else {
            return false;
        }
    }


}
