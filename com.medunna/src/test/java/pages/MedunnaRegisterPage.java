package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaRegisterPage {

   public MedunnaRegisterPage(){ PageFactory.initElements(Driver.getDriver(), this);

   }


    @FindBy(xpath="//div[@id='app-header']//a[2]")
    public WebElement register;
    @FindBy(xpath="//input[@id='firstPassword']")
    public WebElement newPassword;

    @FindBy(xpath="//div[@class='jh-card card']//li[2]")
    public WebElement strengthSecondBar;

    @FindBy(xpath="//div[@class='jh-card card']//li[4]")
    public WebElement strengthFourthBar;

    @FindBy(xpath="//div[@class='jh-card card']//li[5]")
    public WebElement strengthFifthBar;


   @FindBy(xpath="//input[@id='username']")
   public WebElement registerusername;

   @FindBy(className = "is-touched is-dirty av-valid form-control") public WebElement usernameVerification;
   @FindBy(xpath = "//input[@placeholder='Your email']") public WebElement email;
   @FindBy(className = "is-touched is-dirty av-valid form-control") public WebElement emailVerification;

}
