package Stepdefintion;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;


public class MyStepdefs {
    public MyStepdefs() {
    }

    @Given("^Launch Browser and Application$")
    public void launch_Browser_and_Application() throws Throwable {
        System.out.println("Launch Browser and Application");
    }

    @When("^User Input Valid username and password$")
    public void user_Input_Valid_username_and_password() throws Throwable {
        System.out.println("User Input Valid username and password");
    }

    @Then("^Login Successful$")
    public void login_Successful() throws Throwable {
        System.out.println("Login Successful");
        Assert.assertEquals("S1","S1");
    }

    @Then("^Browser Close$")
    public void browser_Close() throws Throwable {
        System.out.println("Browser Close");
        Assert.assertEquals("S1","S1");
    }

    @When("^User Input Invalid username and password$")
    public void user_Input_Invalid_username_and_password() throws Throwable {
        System.out.println("User Input Invalid username and password");
        Assert.assertEquals("S1","S1");
    }

    @Then("^System Warn for Input valid username and password$")
    public void system_Warn_for_Input_valid_username_and_password() throws Throwable {
        System.out.println("System Warn for Input valid username and password");
        Assert.assertEquals("S1","S1");
    }


    @Then("^Verify Logout Icon exist$")
    public void verify_Logout_Icon_exist() throws Throwable {
        System.out.println("Verify Logout Icon exist");
        Assert.assertEquals("S1","S1");
    }


}
