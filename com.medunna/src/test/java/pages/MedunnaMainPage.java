package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaMainPage {



    public MedunnaMainPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath="//a[@class='appointment-btn scrollto']")
    public WebElement makeAnAppointment;
    @FindBy(xpath="//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement signInRegister;


    @FindBy(xpath="//input[@id='appoDate']")
    public WebElement appoDate;

    @FindBy(xpath="//span[normalize-space()='Appointment date can not be past date!']")
    public WebElement appointmentDateCanNotBePa;






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


    @FindBy(xpath="//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement openSignIn;



    @FindBy(xpath="//a[@id='login-item']")
    public WebElement signIn;
    @FindBy(xpath="//input[@id='username']")
    public WebElement username;
    @FindBy(xpath="//input[@id='password']")
    public WebElement password;
    @FindBy(xpath="//button[@type='submit']//span[contains(text(),'Sign in')]")
    public WebElement sigInButton;

    @FindBy(xpath="//span[normalize-space()='Administration']")
    public WebElement administration;


    @FindBy(xpath="//span[normalize-space()='Items&Titles']")
    public WebElement itemsAndTitles;
    @FindBy(xpath="//a[@class='dropdown-item active']")
    public WebElement patient;


    @FindBy(xpath="//span[normalize-space()='MY PAGES']")
    public WebElement mYPAGES;

    @FindBy(xpath="//span[normalize-space()='My Appointments']")
    public WebElement myAppointments;











}
