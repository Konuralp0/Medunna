package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaStaffPage {
    public MedunnaStaffPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath="//span[normalize-space()='MY PAGES']")
    public WebElement myPages;

    @FindBy(xpath="//span[normalize-space()='Search Patient']")
    public WebElement searchPatient;

    @FindBy(xpath="//span[normalize-space()='Patients']")
    public WebElement patientsVerification;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement editPatient;

    @FindBy(xpath="//span[normalize-space()='Create or edit a Patient']")
    public WebElement patientEditPage;

    @FindBy(xpath="//input[@name='ssn']")
    public WebElement ssnInput;

    @FindBy(xpath="(//td[contains(text(),'587-45-8880')])[1]") // Butun bilgileri dolu olan hasta
    public WebElement patientFindVerification;
//    @FindBy(xpath="(//td[contains(text(),'409-67-5445')])[1]") // Bazi bilgileri eksik olna hasta
//    public WebElement patientFindVerification;

    @FindBy(xpath="//tbody/tr/td[1]")
    public WebElement tablePhone;
    @FindBy(xpath="//tbody/tr/td[2]")
    public WebElement tableEmail;
    @FindBy(xpath="//tbody/tr/td[3]")
    public WebElement tableGender;
    @FindBy(xpath="//tbody/tr/td[4]")
    public WebElement tableBlood;
    @FindBy(xpath="//tbody/tr/td[5]")
    public WebElement tableAddress;
    @FindBy(xpath="//tbody/tr/td[6]")
    public WebElement tableDescription;
    @FindBy(xpath="//tbody/tr/td[7]")
    public WebElement tableDate;
    @FindBy(xpath="//tbody/tr/td[8]")
    public WebElement tableuser;
    @FindBy(xpath="//tbody/tr/td[9]")
    public WebElement tableCountry;
    @FindBy(xpath="//tbody/tr/td[10]")
    public WebElement tableState;

    @FindBy(xpath="//a[@class='btn btn-danger btn-sm']")
    public WebElement deleteButton;
    @FindBy(xpath = "(//span[contains(text(),'Show Appointments')])[1]") public WebElement showAppointments;
    @FindBy(xpath = "(//span[contains(text(),'Show Tests')])[1]") public WebElement showTests;






}
