package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaContactPage {
    public MedunnaContactPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameInput;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@name='subject']")
    public WebElement subjectInput;

    @FindBy(xpath = "//input[@name='message']")
    public WebElement messageInput;

    @FindBy(id = "register-submit")
    public WebElement sendButton;

    @FindBy(xpath = "//span/strong")
    public WebElement messageReceived;

}
