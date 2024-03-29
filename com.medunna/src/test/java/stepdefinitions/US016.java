package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.Color;
import pages.MedunnaRoomNewPage;
import pages.MedunnaRoomPage;
import pojo.RoomRequest16;
import pojo.RoomResponse16;
import utilities.Authentication2;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.Authentication2.tokenGenerate;


public class US016 {

    MedunnaRoomNewPage roomNewPage = new MedunnaRoomNewPage();
    MedunnaRoomPage roomPage = new MedunnaRoomPage();

    @And("Room menusune giris yapar")
            public void room_menusune_giris_yapar() {
            roomNewPage.room_menu.click();
        Driver.wait(2);
    }
    @And("Create a new Room butonuna tiklar")
            public void create_a_new_Room_butonuna_tiklar(){
            roomNewPage.creat_a_new_room.click();
        Driver.wait(2);
    }
    @Then("Oda olusturulurken Room Number olmasi gerektigini test eder")
            public void room_Number_olmasi_gerektigini_test_eder(){
        roomNewPage.room_Number.click();
        roomNewPage.room_Number.sendKeys("" +Keys.TAB);
        Assert.assertTrue("oda numarasi yazilmali..", roomNewPage.number_required.isDisplayed());
        Driver.wait(2);
    }
    @And("Room Number kutusunu tiklar")
        public void room_Number_kutusunu_tiklar(){
        roomNewPage.room_Number.click();
    }
    @And("Herhangi bir Room Number girer")
        public void herhangi_bir_Room_Number_girer(){
        roomNewPage.room_Number.sendKeys(ConfigReader.getProperty("room_Number1"+Keys.TAB));
    }
    @Then("TWIN, DELUXE, PREMIUM_DELUXE, SUIT ve  DAYCARE Room Type olmasi gerektigini test eder")
        public void room_Types_olmasi_gerektigini_test_eder(){
        roomNewPage.room_Types.click();
        Assert.assertTrue(roomNewPage.twin.isDisplayed());
        Assert.assertTrue(roomNewPage.deluxe.isDisplayed());
        Assert.assertTrue(roomNewPage.premium_Deluxe.isDisplayed());
        Assert.assertTrue(roomNewPage.suite.isDisplayed());
        Assert.assertTrue(roomNewPage.daycare.isDisplayed());
        Driver.wait(2);
    }
    @And("Room Type kutusunu tiklar")
        public void room_Type_kutusunu_tiklar(){
        roomNewPage.room_Types.click();
    }
    @And("Suit Type girer")
    public void suit_Type_girer(){
        roomNewPage.suite.click();
    }
    @Then("Current status can be set for the room test eder")
        public void current_status_can_be_set_for_the_room_test_eder(){
        Assert.assertTrue(roomNewPage.room_status.isEnabled());
        Driver.wait(2);
    }
    @And("Price kutusuna tiklar")
    public void price_kutusuna_tiklar() {
        roomNewPage.room_Price.click();
    }
    @Then("Price can be added and cannot be blank test eder")
        public void price_can_be_added_and_cannot_be_blank(){
        Assert.assertTrue(roomNewPage.price_required.isDisplayed());
    }
    @And("Price Kutusuna bir deger girer")
        public void price_Kutusuna_bir_deger_girer(){
        roomNewPage.room_Price.sendKeys("100"+Keys.TAB);
    }
    @Then("Description can be provided optionally test eder")
        public void description_can_be_provided_optionally(){
        roomNewPage.creat_Date.click();
        if (roomNewPage.description_room == null) {
            String expectedDescriptionColor = "#FFFFFF";
            String descriptionColor = roomNewPage.description_room.getCssValue("background-color");
            String hexColor = Color.fromString(descriptionColor).asHex();

            Assert.assertEquals(expectedDescriptionColor,hexColor);
        }else{
            System.out.println("not optionally..");

        }
    }
    @And("Creat Date kutusuna eski bir tarih girer")
        public void eski_bir_tarih_girer(){
        roomNewPage.creat_Date.click();
        roomNewPage.creat_Date.clear();
        roomNewPage.creat_Date.sendKeys(Keys.ARROW_LEFT);
        roomNewPage.creat_Date.sendKeys(Keys.ARROW_DOWN);
        Driver.wait(2);
    }
    @And("save butunona tiklar")
        public void save_butonuna_tiklar(){
        roomNewPage.save_Button.clear();
        Driver.wait(4);
    }
    @Then("Uyari verip vermedigini ve kayit uyarisini test eder")
    public void uyari_verip_vermedigini_test_eder() {
        Assert.assertTrue(roomNewPage.root_Alert.isDisplayed());
        Driver.wait(2);

    }

    @Then("Admin can view all rooms with same items test eder")
    public void viewAllRooms() {
        Assert.assertTrue(roomPage.roomView.isDisplayed());
    }
    @And("Edit menusune tiklar")
    public void edit_menusune_tiklar(){
        roomPage.edit112.click();
        Driver.wait(2);
    }
    @And("Price Kutusundaki degeri degistirir")
    public void price_Kutusundaki_degeri_degistirir(){
        roomNewPage.room_Price.clear();
        roomNewPage.room_Price.sendKeys("250");
        Driver.wait(2);
    }
    @Then("guncellemeyi test eder")
    public void guncellemeyi_test_eder(){
        Assert.assertTrue(roomPage.root_update_succesfull.isDisplayed());
    }
    @And("delete menusune tiklar")
    public void delete_menusune_tiklar(){
        roomPage.delete113.click();
        Driver.wait(3);
    }
    @And("acilan sekemede delete comfirme edilir")
    public void delete_comfirme_edilir() {
        roomPage.comfirm_delete.click();
        Driver.wait(2);

    }
    @Then("delete islemininin gerceklestigini test eder")
    public void delete_islemininin_gerceklestigini_test_eder(){
        Assert.assertTrue(roomPage.root_delete_succesfull.isDisplayed());
    }

    @And("Admin olarak giris yapar")
    public void adminOlarakGirisYapar() {
    }



    RoomRequest16 exeptedRooms = new RoomRequest16();
    RoomResponse16 actuelRooms =new RoomResponse16();
    Faker faker = new Faker();
    Response response;


    @Given("Admin kayit icin data olusturur")
    public void adminKayitIcinDataOlusturur() {
        String createdBy = "Set Taroglu";
        String createdDate = "";
        String description = "odayi düzenlemek lazim";
        boolean status = true;
        //int id= 245047;
        int price = 400;
        int roomNumber= 371206;
        String roomType= "DELUXE";
        exeptedRooms.setCreatedBy(createdBy);
        exeptedRooms.setRoomNumber(roomNumber);
        exeptedRooms.setPrice(price);
        exeptedRooms.setRoomType(roomType);
        exeptedRooms.setCreatedDate(createdDate);
        exeptedRooms.setDescription(description);
        exeptedRooms.setStatus(status);
        //exeptedRooms.setId(id);

        System.out.println(exeptedRooms);


    }

    @And("Admin post request gonderir.")
    public void adminPostRequestGonderir() {

        response = RestAssured.given().contentType(ContentType.JSON).header("Authoritazion", "bearer" + Authentication2.tokenGenerate())
                .body(exeptedRooms).when().post("https://medunna.com/api/rooms");

    }

    @Then("Admin Api kayitlarini dogrular")
    public void adminApiKayitlariniDogrular() {

        RoomResponse16 actuelData = response.as(RoomResponse16.class);



        Assert.assertEquals(exeptedRooms.getCreatedBy(), actuelData.getCreatedBy());
        Assert.assertEquals(exeptedRooms.getRoomType(), actuelData.getRoomType());
        Assert.assertEquals(exeptedRooms.getRoomNumber(), actuelData.getRoomNumber());
        Assert.assertEquals(exeptedRooms.getDescription(),actuelData.getDescription());
        Assert.assertEquals(exeptedRooms.getPrice(),actuelData.getPrice());
        Assert.assertEquals(exeptedRooms.getStatus(),actuelData.getStatus());


        //Assert.assertEquals(exeptedRooms.getId(),actuelData.getId());
    }
}
