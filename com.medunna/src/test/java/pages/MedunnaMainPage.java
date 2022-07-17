package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class MedunnaMainPage {

    public MedunnaMainPage(){PageFactory.initElements(Driver.getDriver(), this);}


    @FindBy(xpath="//a[@class='appointment-btn scrollto']")
    public WebElement makeAnAppointment;


}