package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaPatientPage {
    public MedunnaPatientPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//*[@id='entity-menu']/a/span") public WebElement MyPages_Patient;
    @FindBy(xpath = "//*[@id='entity-menu']/div/a[1]/span") public WebElement my_Appointments;
    @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div/div/table/tbody/tr[1]/td[8]/div/a/span/span") public WebElement show_Tests;
    @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div/div/table/tbody/tr/td[7]/div/a/span") public WebElement view_Results;

    @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div/div/table/thead/tr/th[1]") public WebElement testResults_id;
    @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div/div/table/thead/tr/th[2]") public WebElement testResults_name;
    @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div/div/table/thead/tr/th[3]") public WebElement testResults_result;
    @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div/div/table/thead/tr/th[4]") public WebElement testResults_dafault_minValue;
    @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div/div/table/thead/tr/th[5]") public WebElement testResults_default_maxValue;
    @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div/div/table/thead/tr/th[6]") public WebElement testResults_test;
    @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div/div/table/thead/tr/th[7]") public WebElement testResults_description;
    @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div/div/table/thead/tr/th[8]") public WebElement testResults_default_date;

    @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div/div/table/tbody/tr/td[8]/div/a[2]/span/span") public WebElement show_Invoice;
    @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div/table/thead/tr[7]/th[2]") public WebElement odeme_total_cost;
    @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div/table/thead/tr[5]/th[2]") public WebElement odeme_Patient_Name;





}
