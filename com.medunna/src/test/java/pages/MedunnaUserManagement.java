package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaUserManagement {

    public MedunnaUserManagement(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath="//*[@id='app-view-container']/div/div/div/div/div[1]/table/thead/tr/th[1]/span") public WebElement users_id;
    @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div/div[1]/table/thead/tr/th[2]/span") public WebElement users_Login;
    @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div/div[1]/table/thead/tr/th[3]/span") public  WebElement users_SSN;

    @FindBy(xpath="//*[@id='app-view-container']/div/div/div/div/div[1]/table/thead/tr/th[4]/span") public WebElement users_email;
    @FindBy(xpath="//*[@id='app-view-container']/div/div/div/div/div[1]/table/thead/tr/th[6]/span") public WebElement users_Language;
    @FindBy(xpath="//*[@id='app-view-container']/div/div/div/div/div[1]/table/thead/tr/th[7]/span") public WebElement users_Profiles;
    @FindBy(xpath="//*[@id='app-view-container']/div/div/div/div/div[1]/table/thead/tr/th[8]/span") public WebElement users_CreatedDate;
    @FindBy(xpath="//*[@id='app-view-container']/div/div/div/div/div[1]/table/thead/tr/th[9]/span") public WebElement users_ModifiedBy;
    @FindBy(xpath="//*[@id='modified-date-sort']/span") public WebElement users_ModifiedDate;

    @FindBy(xpath="//*[@id='kahraman']/td[5]/button/span") public WebElement users_activating_555017777;//*[@id="kahraman"]/td[5]/button/span
    @FindBy(xpath="//*[@id='root']/div/div/div[1]/div/div/div[1]") public WebElement users_root_Check;
    @FindBy(xpath="//*[@id='kahraman']/td[11]/div/a[2]/span/span") public WebElement users_edit_555017777;//*[@id="kahraman"]/td[11]/div/a[2]/span/span
    @FindBy(xpath="//*[@id='authorities']/option[1]") public WebElement users_Role_Admin;
    @FindBy(xpath="//*[@id='authorities']/option[2]") public WebElement users_Role_User;
    @FindBy(xpath="//*[@id='authorities']/option[3]") public WebElement users_Role_Patient;
    @FindBy(xpath="//*[@id='authorities']/option[4]") public WebElement users_Role_Staff;
    @FindBy(xpath="//*[@id='authorities']/option[5]") public WebElement users_Role_Physcician;
    @FindBy(xpath="//*[@id='app-view-container']/div/div/div/div/div[2]/div/form/button/span") public WebElement users_Save_Button;
    @FindBy(xpath="//*[@id='langKey']") public WebElement users_Language_Key;
    @FindBy(xpath="//*[@id='langKey']/option[1]") public WebElement users_Language_Key_English;
    @FindBy(xpath="//*[@id='langKey']/option[2]") public WebElement users_Language_Key_Turkce;






}
