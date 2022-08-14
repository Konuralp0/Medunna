package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaUserPage {
    public MedunnaUserPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath="//span[account-menu()='Elvis Presley']") public WebElement user;
    @FindBy(xpath = "//*[@id=\"currentPassword\"]") public WebElement current_pass;
    @FindBy(xpath = "//*[@id=\"newPassword\"]") public  WebElement new_password;
    @FindBy(xpath = "//*[@id=\"strengthBar\"]/li[2]") public WebElement strengthikinciBar;
    @FindBy(xpath = "//*[@id=\"strengthBar\"]/li[3]") public WebElement strengthucuncuBar;
    @FindBy(xpath = "//*[@id=\"password-form\"]/button/span") public WebElement save_Button;
}
