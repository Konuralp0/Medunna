package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.ConfigReader;
import utilities.Driver;

public class US001 {
    @Given("medunna ana sayfasina gider")
    public void medunnaAnaSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        System.out.println("Merhaba");




    }

}
