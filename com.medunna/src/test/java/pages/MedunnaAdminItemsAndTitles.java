package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaAdminItemsAndTitles {
    public MedunnaAdminItemsAndTitles(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath="//th[1]") public WebElement sSN;
    @FindBy(xpath="//th[1]") public WebElement iD;
    @FindBy(xpath="//th[1]") public WebElement firstName;
    @FindBy(xpath="//th[1]") public WebElement lastName;
    @FindBy(xpath="//th[1]") public WebElement birthDate;
    @FindBy(xpath="//th[1]") public WebElement phone;
    @FindBy(xpath="//th[1]") public WebElement email;
    @FindBy(xpath="//th[1]") public WebElement gender;
    @FindBy(xpath="//span[normalize-space()='Blood Group']") public WebElement bloodGroup;
    @FindBy(xpath="//th[1]") public WebElement address;
    @FindBy(xpath="//span[normalize-space()='Description']") public WebElement description;
    @FindBy(xpath="//span[normalize-space()='Created Date']") public WebElement createdDate;
    @FindBy(xpath="//th[1]") public WebElement user;
    @FindBy(xpath="//th[1]") public WebElement country;
    @FindBy(xpath="//th[1]") public WebElement state;


    @FindBy(xpath="//a[@id='jh-create-entity']") public WebElement createANewPatient;




    @FindBy(xpath="//span[normalize-space()='Items&Titles']") public WebElement itemsTitlesButton;
    @FindBy(xpath="//span[normalize-space()='Test Item']") public WebElement testItemButton;
    @FindBy(xpath="//span[normalize-space()='Create a new Test Item']") public WebElement createTestItemButton;

    @FindBy(xpath="(//span[normalize-space()='Name'])") public WebElement nameLabel;
    @FindBy(xpath="//span[normalize-space()='Description']") public WebElement descriptionLabel;
    @FindBy(xpath="//span[normalize-space()='Price']") public WebElement priceLabel;
    @FindBy(xpath="//span[normalize-space()='Default Min. Value']") public WebElement defaultValMinLabel;
    @FindBy(xpath="//span[normalize-space()='Default Max. Value']") public WebElement defaultValMaxLabel;
    @FindBy(xpath="//span[normalize-space()='Created Date']") public WebElement createdLabel;
    @FindBy(xpath="//span[normalize-space()='Test Items']") public WebElement testItems;
    @FindBy(xpath="//a[@class='btn btn-danger btn-sm']") public WebElement deleteButton;



//Create New Staff Icin Locs
    @FindBy(xpath="//span[normalize-space()='Create a new Staff']") public WebElement createANewStaff;
    @FindBy(xpath="//body/div[@id='root']/div/div[@class='app-container']/div[@id='app-view-container']/div[@class='jh-card card']/div[@class='view-routes']/div[1]") public WebElement createOrEditAStaffUseSea;
    @FindBy(xpath="//input[@id='useSSNSearch']") public WebElement tickboxSSN;
    @FindBy(xpath="//input[@id='searchSSN']") public WebElement sSNStaffCreation;
    @FindBy(xpath="//button[normalize-space()='Search User']") public WebElement searchUser;
    @FindBy(xpath="//input[@id='staff-lastName']") public WebElement lastNameCheck;
    @FindBy(xpath="//input[@id='staff-phone']") public WebElement phoneNumber;
    @FindBy(xpath="//input[@id='staff-adress']") public WebElement addressOnStaff;
    @FindBy(xpath="//div[@class='invalid-feedback']") public WebElement phoneNumberIsRequired;
    @FindBy(xpath="//select[@id='staff-user']") public WebElement userName;
    @FindBy(xpath="//tbody/tr[1]/td[15]/div[1]/a[2]//*[name()='svg']") public WebElement editStaff;
    @FindBy(xpath="//tbody/tr[1]/td[15]/div[1]/a[3]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]") public WebElement deleteStaff;
    @FindBy(xpath = "//span[normalize-space()='Physician']") public WebElement physicianButton;
    @FindBy(xpath = "//a[normalize-space()='2001']") public WebElement userSelectDoctor;
    @FindBy(xpath = "//span[normalize-space()='ROLE_PHYSICIAN']") public WebElement testRolePhysician;





}
