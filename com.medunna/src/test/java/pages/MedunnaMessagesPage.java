package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaMessagesPage {
   public MedunnaMessagesPage (){
       PageFactory.initElements(Driver.getDriver(), this);
   }


   @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/div/div[1]/table/tbody/tr[1]/td[2]")
    public WebElement name;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/div/div[1]/table/tbody/tr[1]/td[5]")
    public WebElement message;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/div/div[1]/table/tbody/tr[1]/td[3]")
    public WebElement email;


    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/a[3]") public WebElement delete;
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/a[2]/span[1]/span[1]") public WebElement edit;
    @FindBy(xpath="//span[normalize-space()='Create a new Message']") public WebElement createANewMessage;







}
