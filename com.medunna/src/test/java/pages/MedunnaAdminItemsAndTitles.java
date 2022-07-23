package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaAdminItemsAndTitles {
    public MedunnaAdminItemsAndTitles(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath="//td[normalize-space()='122-56-9045']") public WebElement SSNvisible;
    @FindBy(xpath="//td[normalize-space()='testFirstName']") public WebElement testFirstName;
    @FindBy(xpath="//td[normalize-space()='testLastName']") public WebElement testLastName;
    @FindBy(xpath="//tbody/tr[1]/td[1]") public WebElement birthDaTE;
    @FindBy(xpath="//td[normalize-space()='713-832-5050']") public WebElement phoneNumber;
    @FindBy(xpath="//td[normalize-space()='testemail@testemail.com']") public WebElement emailOFPatient;
    @FindBy(xpath="//tbody/tr[1]/td[1]") public WebElement mALE;
    @FindBy(xpath="//tbody/tr[1]/td[1]") public WebElement bloodType;
    @FindBy(xpath="//td[normalize-space()='Unknown address']") public WebElement unknownAddress;
    @FindBy(xpath="//td[normalize-space()='Test description']") public WebElement testDescription;
    @FindBy(xpath="//tbody/tr[1]/td[1]") public WebElement createdDate;
    @FindBy(xpath="//td[normalize-space()='qww']") public WebElement userName;
    @FindBy(xpath="//tbody/tr[1]/td[1]") public WebElement country;


    @FindBy(xpath="//a[@id='jh-create-entity']") public WebElement createANewPatient;


    @FindBy(xpath="//input[@id='patient-lastName']") public WebElement lastName;
    @FindBy(xpath="//input[@id='patient-firstName']") public WebElement firstName;
    @FindBy(xpath="//input[@id='email']") public WebElement yourEmail;
    @FindBy(xpath="//input[@id='patient-phone']") public WebElement phone;
    @FindBy(xpath="//input[@id='patient-adress']") public WebElement address;
    @FindBy(xpath="//select[@id='patient-country']") public WebElement countryName;
    @FindBy(xpath="//select[@id='patient-cstate']") public WebElement stateCityName;
}
