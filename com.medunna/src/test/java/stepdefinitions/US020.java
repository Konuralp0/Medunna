package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MedunnaUserManagement;
import utilities.Driver;

public class US020 {
        MedunnaUserManagement UserManagement = new MedunnaUserManagement();


        @Then("Admin can view registered people info as firstname, lastname, email etc. from User Management test eder")
        public void admin_can_view_registered_people_info(){
            Assert.assertTrue(UserManagement.users_id.isDisplayed());
            Assert.assertTrue(UserManagement.users_Login.isDisplayed());
            Assert.assertTrue(UserManagement.users_SSN.isDisplayed());
            Assert.assertTrue(UserManagement.users_email.isDisplayed());
            Assert.assertTrue(UserManagement.users_Language.isDisplayed());
            Assert.assertTrue(UserManagement.users_Profiles.isDisplayed());
            Assert.assertTrue(UserManagement.users_CreatedDate.isDisplayed());
            Assert.assertTrue(UserManagement.users_ModifiedBy.isDisplayed());
            Assert.assertTrue(UserManagement.users_ModifiedDate.isDisplayed());
        }

    @And("User activating")
    public void userActivating() {
            UserManagement.users_activating_555017777.click();
        Driver.wait(2);

    }

    @Then("User activation test edilir")
    public void userActivationTestEdilir() {
            Assert.assertTrue(UserManagement.users_root_Check.isEnabled());
            Driver.wait(2);

    }

    @And("giving them roles as ADMIN, USER, PATIENT, STAFF and PHYSICIAN")
    public void givingThemRolesAsADMINUSERPATIENTSTAFFAndPHYSICIAN() {
        UserManagement.users_edit_555017777.click();
        Driver.wait(2);
        UserManagement.users_Role_Admin.click();
        Driver.wait(2);
        UserManagement.users_Language_Key.click();
        Driver.wait(1);
        UserManagement.users_Language_Key_English.click();
        UserManagement.users_Save_Button.click();
        Driver.wait(2);


    }

    @Then("All new Roles test edilir")
    public void allNewRolesTestEdilir() {
        Assert.assertEquals("Admin", UserManagement.users_Role_Admin);
        Assert.assertEquals("English", UserManagement.users_Language_Key_English);
    }
}
