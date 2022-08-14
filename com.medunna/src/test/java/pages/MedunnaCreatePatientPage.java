package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaCreatePatientPage {
   public MedunnaCreatePatientPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//input[@id='patient-lastName']") public WebElement lastName;
    @FindBy(xpath="//input[@id='patient-firstName']") public WebElement firstName;
    @FindBy(xpath="//input[@id='email']") public WebElement yourEmail;
    @FindBy(xpath="//input[@id='patient-phone']") public WebElement phone;
    @FindBy(xpath="//input[@id='patient-adress']") public WebElement address;
    @FindBy(xpath="//select[@id='patient-country']") public WebElement countryName;
    @FindBy(xpath="//*[@id=\"patient-cstate\"]") public WebElement stateCityName;

}
