package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaRoomNewPage {

    public MedunnaRoomNewPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath="//*[@id='entity-menu']/div/a[6]") public WebElement room_menu;
    @FindBy(xpath = "//*[@id='jh-create-entity']/span") public WebElement creat_a_new_room;
    @FindBy(xpath = "//*[@id='room-roomNumber']") public  WebElement room_Number;

    @FindBy(xpath = "//*[@id='room-roomType']") public WebElement room_Types;
    @FindBy(xpath = "//*[@id='room-roomType']/option[1]") public WebElement twin;
    @FindBy(xpath = "//*[@id='room-roomType']/option[2]") public WebElement deluxe;
    @FindBy(xpath = "//*[@id='room-roomType']/option[3]") public WebElement premium_Deluxe;
    @FindBy(xpath = "//*[@id='room-roomType']/option[4]") public WebElement suite;
    @FindBy(xpath = "//*[@id='room-roomType']/option[5]") public WebElement daycare;
    @FindBy(xpath = "//*[@id='room-status']") public WebElement room_status;
    @FindBy(xpath = "//*[@id='room-price']") public WebElement room_Price;


    @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div/div[2]/div/form/div[1]/div/div") public WebElement number_required;
    @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div/div[2]/div/form/div[4]/div/div") public WebElement price_required;
    @FindBy(xpath = "//*[@id='room-description']") public WebElement description_room;
    @FindBy(xpath = "//*[@id='room-createdDate']") public WebElement creat_Date;
    @FindBy(xpath = "//*[@id='save-entity']/span") public WebElement save_Button;
    @FindBy(xpath = "//*[@id='root']/div/div/div[1]/div/div/div[1]") public WebElement root_Alert;


}
