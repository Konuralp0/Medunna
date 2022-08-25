package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class MedunnaLoginPage {
    public MedunnaLoginPage(){ PageFactory.initElements(Driver.getDriver(), this);}
    @FindBy(xpath ="//span[normalize-space()='Remember me']")
    public static WebElement rememberMe;
    @FindBy(xpath = "//span[normalize-space()='Did you forget your password?']")
    public static WebElement did_you_forget_your_password;
    @FindBy(xpath ="//span[normalize-space()='Register a new account']")
    public static WebElement register_a_new_account;
    @FindBy(xpath ="//*[@id='login-page']/div/form/div[3]/button[1]")
    public static WebElement cancelButton;


}
