package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaPhysicianPage {
public MedunnaPhysicianPage(){
        PageFactory.initElements(Driver.getDriver(), this);
        }

@FindBy(xpath = "//span[normalize-space()='Physician']") public WebElement createNewPhysicianButton;
@FindBy(xpath = "//input[@id='useSSNSearch']") public WebElement useSearchCheckBox;
@FindBy(xpath = "//input[@id='searchSSN']") public WebElement searchSSN;
@FindBy(xpath = "//button[normalize-space()='Search User']") public WebElement searchUserButton;
@FindBy(xpath = "//input[@id='physician-firstName']") public WebElement physicianUserName;
@FindBy(xpath = "//input[@id='physician-lastName']") public WebElement physicianLastName;
@FindBy(xpath = "//select[@id='physician-gender']") public WebElement physicianGender;
@FindBy(xpath = "//select[@id='physician-speciality']") public WebElement physicianSpeciality;
@FindBy(xpath = "//select[@id='physician-bloodGroup']") public WebElement physicianBloodGroup;
@FindBy(xpath = "//div[@role='alert']") public WebElement userFoundAlert;
@FindBy(xpath = "//option[@value='DERMATOLOGY']") public WebElement selectedSpeciality;
@FindBy(xpath = "//input[@id='physician-examFee']") public WebElement physicianExamFee;
@FindBy(xpath = "//input[@id='file_image']") public WebElement physicianImageFileUpload;
@FindBy(xpath = "//input[@id='file_image']") public WebElement physicianUploadedPhoto;

@FindBy(xpath = "//dd[normalize-space()='321-48-7891']") public WebElement physicianViewSSNID;
@FindBy(xpath = "//dd[normalize-space()='Frank']") public WebElement physicianViewName;
@FindBy(xpath = "//dd[normalize-space()='Einstein']") public WebElement physicianViewLastName;
@FindBy(xpath = "//span[normalize-space()='27/12/80 06:11']") public WebElement physicianViewBirthDate;
@FindBy(xpath = "//dd[normalize-space()='110-907-8510']") public WebElement physicianViewPhone;
@FindBy(xpath = "//dd[normalize-space()='MALE']") public WebElement physicianViewGender;

@FindBy(xpath = "//dd[normalize-space()='Onegative']") public WebElement physicianViewBloodGroup;
@FindBy(xpath = "//dd[normalize-space()='1051 47th street']") public WebElement physicianViewAddress;
@FindBy(xpath = "//dd[normalize-space()='SURGERY']") public WebElement physicianViewSpeciality;
@FindBy(xpath = "//dd[normalize-space()='Prof Dr']") public WebElement physicianViewDescription;
@FindBy(xpath = "//span[normalize-space()='14/12/21 11:40']") public WebElement physicianViewCreatedDate;
@FindBy(xpath = "(//img)[2]") public WebElement physicianViewImage;
@FindBy(xpath = "//dd[normalize-space()='team88_user1']") public WebElement physicianViewUserName;
@FindBy(xpath = "//dd[normalize-space()='USA']") public WebElement physicianViewCountry;
@FindBy(xpath = "//dd[normalize-space()='USA']") public WebElement physicianViewStateCity;

@FindBy(xpath = "(//a[@class='btn btn-info btn-sm'])[1]") public WebElement physiciansViewButton;
@FindBy(xpath = "(//span[contains(text(),'Edit')])[2]") public WebElement physiciansEditButton;
@FindBy(xpath = "//input[@id='physician-examFee']")public WebElement physicianEditExamFee;
@FindBy(xpath = "//span[normalize-space()='Save']") public WebElement physicianEditSaveButton;
@FindBy(xpath = "//span[normalize-space()='Save']") public WebElement physicianEditChangedExamFee;
@FindBy(xpath = "(//a[@class='btn btn-danger btn-sm'])[5]") public WebElement physicianDeleteButton;
@FindBy(xpath = "//span[normalize-space()='ID']") public WebElement inPatientID;
@FindBy(xpath = "//span[normalize-space()='Start Date']")public WebElement inPatientStartDate;
@FindBy(xpath = "//span[normalize-space()='End Date']") public WebElement inPatientEndDate;
@FindBy(xpath = "//span[normalize-space()='Status']") public WebElement inPatientStatus;
@FindBy(xpath = "//span[normalize-space()='Description']") public WebElement inPatientDescription;
@FindBy(xpath = "//span[normalize-space()='Created Date']") public WebElement inPatientCreatedDate;
@FindBy(xpath = "(//span[contains(text(),'Room')])[2]") public WebElement inPatientRoom;
@FindBy(xpath = "//table[@class='table']//thead//tr//th//span[contains(text(),'Appointment')]") public WebElement inPatientAppointment;
@FindBy(xpath = "//table[@class='table']//thead//tr//th//span[contains(text(),'Patient')]") public WebElement inPatientPatientInformation;
@FindBy(xpath = "//span[normalize-space()='In Patient']") public WebElement inPatientButton;
@FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")public WebElement inPatientEdit;
@FindBy(xpath = "//select[@id='in-patient-status']") public WebElement inPatientEditStatus;
@FindBy(xpath ="//*[contains (text(),'The In Patient is updated with identifier')]") public WebElement updatedMessage;
@FindBy(xpath = "//button[@id='save-entity']") public WebElement inPatientSaveButton;
@FindBy(xpath = "//select[@id='in-patient-room']") public WebElement editInPatientRoom;






        }