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

    @FindBy(xpath="//input[@id='firstName']")
    public WebElement firstName;
    @FindBy (xpath ="//input[@class= 'is-touched is-dirty av-valid form-control' and @id='firstName']")
    public WebElement nameVerification;

    @FindBy(xpath="//input[@id='ssn']")
    public WebElement SSN;
    @FindBy (xpath ="//input[@class= 'is-touched is-dirty av-valid form-control' and @id='ssn']")
    public WebElement ssnVerification;


    @FindBy(xpath="//input[@id='lastName']")
    public WebElement lastName;
    @FindBy (xpath ="//input[@class= 'is-touched is-dirty av-valid form-control' and @id='lastName']")
    public WebElement lastNameVerification;

    @FindBy(xpath="//input[@id='email']")
    public WebElement email;
    @FindBy (xpath ="//input[@class= 'is-touched is-dirty av-valid form-control' and @id='email']")
    public WebElement emailVerification;

    @FindBy(xpath="//input[@id='phone']")
    public WebElement phone;
    @FindBy (xpath ="//input[@class= 'is-touched is-dirty av-valid form-control' and @id='phone']")
    public WebElement phoneVerification;








}
