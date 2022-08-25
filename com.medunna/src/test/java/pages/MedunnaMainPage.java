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
    @FindBy (xpath ="//div[normalize-space()='Your FirstName is required.']")
    public WebElement nameVerification;

    @FindBy(xpath="//input[@id='ssn']")
    public WebElement SSN;
    @FindBy (xpath ="//div[normalize-space()='Your SSN is required.']")
    public WebElement ssnVerification;


    @FindBy(xpath="//input[@id='lastName']")
    public WebElement lastName;
    @FindBy (xpath ="//div[normalize-space()='Your LastName is required.']")
    public WebElement lastNameVerification;

    @FindBy(xpath="//input[@id='email']")
    public WebElement email;
    @FindBy (xpath ="//div[normalize-space()='Your email is required.']")
    public WebElement emailVerification;

    @FindBy(xpath="//input[@id='phone']")
    public WebElement phone;
    @FindBy (xpath ="//div[normalize-space()='Phone number is required.']")
    public WebElement phoneVerification;


    @FindBy(xpath="//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement openSignIn;

//a[@aria-haspopup='true']

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
    @FindBy(xpath="/html/body/div/div/div/div[2]/nav/div/ul/li[7]/div/a[1]")
    public WebElement patient;

    @FindBy(xpath="//*[@id=\"entity-menu\"]/div/a[9]") public WebElement messages;


    @FindBy(xpath="//li[@id='entity-menu']//a[2]") public WebElement staff;


    @FindBy(xpath="//span[normalize-space()='MY PAGES']")
    public WebElement mYPAGES;


    @FindBy(xpath="//span[normalize-space()='My Appointments']")
    public WebElement myAppointments;
    @FindBy(xpath=" //span[normalize-space()='Send an Appointment Request']") public WebElement sendAppointmentRequestButton;
    @FindBy(xpath=" //div[@class='Toastify']//span[1]") public WebElement isAppointmentSuccessful;
    @FindBy(xpath = "//span[normalize-space()='User management']") public  WebElement userManagement;

    @FindBy(xpath = "//li[@id='account-menu']//div[@role='menu']//a[1]") public WebElement userSettings;
    @FindBy(xpath = "//button[@type='submit']") public WebElement userSettingsSave;
    @FindBy(xpath = "//div[@role='alert']") public WebElement userDatesUpdatedVerification;
    @FindBy(id = "account-menu") public WebElement accountMenu;

    @FindBy(xpath = "//span[text()='CONTACT']")
    public WebElement contactButton;











}
