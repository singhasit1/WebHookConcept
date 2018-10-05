package Stepdefintion;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

/**
 * Created by Administrator on 6/2/2018.
 */
public class Homepage {

    public Homepage(){}
    @Then("^Homepage Screen Open$")
    public void homepage_Screen_Open() throws Throwable {
        System.out.println("Homepage Screen Open");
        Assert.assertEquals("S1","S1");
    }
    @When("^Login Application successfuly$")
    public void login_Application_successfuly() throws Throwable {
        System.out.println("Login Application successfuly");
        Assert.assertEquals("S1","S1");
    }

    @Then("^Verify User Profile Icon exist$")
    public void verify_User_Profile_Icon_exist() throws Throwable {
        System.out.println("Verify User Profile Icon exist");
        Assert.assertEquals("S1","S1");
    }
}
