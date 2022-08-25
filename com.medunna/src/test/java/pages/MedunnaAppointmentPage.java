package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class MedunnaAppointmentPage {
    public MedunnaAppointmentPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//a[@class='btn btn-primary btn-sm']") public WebElement edit;


    @FindBy(xpath="//textarea[@id='appointment-anamnesis']") public WebElement anamnesis;
    @FindBy(xpath="//textarea[@id='appointment-treatment']") public WebElement treatment;
    @FindBy(xpath="//textarea[@id='appointment-diagnosis']") public WebElement diagnosis;
    @FindBy(xpath="/html/body/div/div/div/div[4]/div/div/div/div[3]/div/form/button") public WebElement save;
    @FindBy( xpath= "//select[@class = 'form-control is-touched is-dirty av-valid form-control']") public WebElement statusCompleted;



    @FindBy(xpath="//span[normalize-space()='23/07/22 00:00']") public WebElement startDate;
    @FindBy(xpath="//span[normalize-space()='28/07/22 00:00']") public WebElement endDate;
    @FindBy(xpath="//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr/td[4]") public WebElement status;
    @FindBy(xpath="//a[normalize-space()='Kay']") public WebElement physician;



    @FindBy(xpath="//body//div//div//div//div//div//div//div//div//div//div[1]//div[1]//div[1]") public WebElement thisFieldIsRequired;
    @FindBy(xpath="//select[@id='appointment-status']") public WebElement statusChange;

    @FindBy(xpath="//a[@class='btn btn-danger btn-sm']") public WebElement showTestResults;
    @FindBy(xpath="//span[@class='d-none d-md-inline']") public WebElement viewResults;
    @FindBy(xpath="//tbody/tr/td[2]")  public WebElement tableSonuc1;
    @FindBy(xpath="//tbody/tr[2]/td[2]")  public WebElement tableSonuc2;
    @FindBy(xpath="//tbody/tr[3]/td[2]")  public WebElement tableSonuc3;
    @FindBy(xpath="//button[@class='btn btn-warning btn-sm']") public WebElement requestInpatient;
    @FindBy(xpath=" //span[normalize-space()='Show Appointments']") public WebElement showAppointments;
    @FindBy(xpath="//*[@id=\"app-view-container\"]/div/div/div/div[2]/div/table/tbody/tr[1]/td[16]/div/a[3]") public WebElement showAppointmentsFor3555;
    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/a") public WebElement createInvoiceButton;
    @FindBy(xpath="//input[@name='ssn']") public WebElement ssnSearchForInvoice;
    @FindBy(xpath=" //*[@id='app-view-container']/div/div/div/div/table/thead/tr[5]/th[2]") public WebElement examFee;
    @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div/table/tbody/tr/td[2]") public WebElement totalCost;
    @FindBy(xpath="//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr[4]/td[13]/div/a[3]") public WebElement payment;
    @FindBy(css=".btn.btn-success.btn-sm") public WebElement showInvoice;
    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/table/thead/tr[5]/th[2]") public WebElement invoiceShownName;
    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/table/thead/tr[7]/th[2]") public WebElement invoiceShownCost;
    @FindBy(xpath=" //span[normalize-space()='Edit']") public WebElement editAppointments;
    @FindBy(xpath=" //span[normalize-space()='Create or Edit an Appointment']") public WebElement editAppointmentPage;
    @FindBy(xpath=" //select[@id='appointment-status']") public WebElement statusPopup;
    @FindBy(xpath=" //option[@value='UNAPPROVED']") public WebElement statusPopupUnapproved;
    @FindBy(xpath=" //option[@value='PENDING']") public WebElement statusPopupPending;
    @FindBy(xpath=" //option[@value='COMPLETED']") public WebElement statusPopupCompleted;
    @FindBy(xpath=" //option[@value='CANCELLED']") public WebElement statusPopupCancelled;
    @FindBy(xpath=" //div[@class='invalid-feedback']") public WebElement invalidFeedback;
    @FindBy(xpath=" //textarea[@id='appointment-anamnesis']") public WebElement anamnesisArea;
    @FindBy(xpath=" //textarea[@id='appointment-treatment']") public WebElement treatmentArea;
    @FindBy(xpath=" //textarea[@id='appointment-diagnosis']") public WebElement diagnosisArea;
    @FindBy(xpath=" //select[@id='appointment-physician']") public WebElement physicianArea;
    @FindBy(xpath=" //a[@class='btn btn-primary btn-sm']") public WebElement showTestsButton;
    @FindBy(xpath=" //span[normalize-space()='Tests']") public WebElement isTestsPage;
    @FindBy(xpath = "//td[normalize-space()='151629']") public WebElement selectedAppointmentPatientID;
    @FindBy(xpath = "//span[normalize-space()='31/07/22 02:00']") public WebElement selectedAppointmentStartDate;
    @FindBy(xpath = "//span[normalize-space()='Start DateTime']") public WebElement appointmentStartDate;
    @FindBy(xpath = "//span[normalize-space()='31/07/22 03:00']") public WebElement selectedAppointmentEndDate;
    @FindBy(xpath = "//span[normalize-space()='End DateTime']") public WebElement appointmentEndDate;
    @FindBy(xpath = "//td[normalize-space()='UNAPPROVED']") public WebElement selectedAppointmentStatus;
    @FindBy(xpath = "//h2[@id='appointment-heading']") public WebElement appointmentsHeading;

    @FindBy(xpath = "//a[normalize-space()='2301']")
    public WebElement appointmentPatientID;


    @FindBy(xpath = "(//span[contains(text(),'COMPLETED')])[1]")
    public WebElement appointmentStatus;

    @FindBy(xpath = "(//a[@class='btn btn-info btn-sm'])[1]")
    public WebElement appointmentViewButton;

    @FindBy(css = "div[class='col-md-8'] h2 b")
    public WebElement appointmentIDView;

    @FindBy(css = "dd:nth-child(21)")
    public WebElement appointmentStartDateView;

    @FindBy(css = "dd:nth-child(4)")
    public WebElement appointmentEndDateView;

    @FindBy(css = "dd:nth-child(16)")
    public WebElement appointmentDescriptionView;

    @FindBy(css = "dd:nth-child(6)")
    public WebElement appointmentStatusView;

    @FindBy(css = "dd:nth-child(22)")
    public WebElement appointmentPatientView;

    @FindBy(css = "css dd:nth-child(18)")
    public WebElement appointmentCreateDateView;

    @FindBy(xpath = "(//span[contains(text(),'Edit')])[1]")
    public WebElement appointmentEditButton;

    @FindBy(xpath = "//input[@id='appointment-id']")
    public WebElement appointmentIDEdit;

    @FindBy(xpath = "(//input[@id='appointment-startDate']")
    public WebElement appointmentStartDateEdit;

    @FindBy(xpath = "(//input[@id='appointment-endDate']")
    public WebElement appointmentEndDateEdit;

    @FindBy(xpath = "(//textarea[@id='appointment-description']")
    public WebElement appointmentDescriptionEdit;


    @FindBy(xpath = "//select[@id='appointment-patient']")
    public WebElement appointmentEPatientEdit;

    @FindBy(css = "a.btn-success.btn-sm")
    public WebElement requestATestButton;

    @FindBy(id = "1404")
    public WebElement sodiumCheckbox;

    @FindBy(id = "1402")
    public WebElement ureaCheckbox;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    public WebElement ilkTestIcerik;

    @FindBy(xpath = "//tbody/tr[2]/td[2]")
    public WebElement ikinciTestIcerik;













}
