package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaRoomPage {
    public MedunnaRoomPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@id='room-heading']/span") public WebElement roomView;
    @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div/div[1]/div/table/tbody/tr[16]/td[8]/div/a[2]/span/span") public WebElement edit112;
    @FindBy(xpath = "//*[@id='root']/div/div/div[1]/div/div") public WebElement root_update_succesfull;
    @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div/div[1]/div/table/tbody/tr[6]/td[8]/div/a[3]/span/span") public WebElement delete113;
    @FindBy(xpath = "//*[@id='jhi-confirm-delete-room']/span") public WebElement comfirm_delete;
    @FindBy(xpath = "//*[@id='root']/div/div/div[1]/div ") public WebElement root_delete_succesfull;


}
