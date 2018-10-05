package Stepdefintion;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;


public class MappingUser {
    public MappingUser(){}

    @Given("^User not Mapped$")
    public void user_not_Mapped() throws Throwable {
        System.out.println("User not Mapped");
        Assert.assertEquals("S1","S2");
    }


    @When("^Trying To Launch the Applcation$")
    public void trying_To_Launch_the_Applcation() throws Throwable {
        System.out.println("Trying To Launch the Applcation");
    }

    @Then("^System warn a Message that User Not Mapped$")
    public void system_warn_a_Message_that_User_Not_Mapped() throws Throwable {
        System.out.println("System warn a Message that User Not Mapped");
    }

    @Given("^User Mapped in Application$")
    public void user_Mapped_in_Application() throws Throwable {
        System.out.println("User Mapped in Application");
        Assert.assertEquals("S1","S2");
    }

    @When("^Trying To Launch the Application$")
    public void trying_To_Launch_the_Application() throws Throwable {
        System.out.println("Trying To Launch the Application");
    }

    @Then("^Application Loaded Properly$")
    public void application_Loaded_Properly() throws Throwable {
        System.out.println("Application Loaded Properly");
        Assert.assertEquals("S1","S2");
    }
}
