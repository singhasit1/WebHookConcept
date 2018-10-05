package Stepdefintion;

import cucumber.api.java.en.Then;
import org.testng.Assert;


public class Logout {

    public Logout(){}
    @Then("^Logout Option should Available$")
    public void logout_Option_should_Available() throws Throwable {
        System.out.println("Logout Option should Available");
        Assert.assertEquals("S1","S1");
    }
    @Then("^Click on Logout Application Lof off$")
    public void click_on_Logout_Application_Lof_off() throws Throwable {
        System.out.println("Click on Logout Application Lof off");
        Assert.assertEquals("S1","S2");
    }
}
