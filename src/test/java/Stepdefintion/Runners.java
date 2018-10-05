package Stepdefintion;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="G:\\Selenium Code\\ImplimentCucumberPipeline\\src\\test\\Resource",
        format = { "pretty",
                "html:target/site/cucumber-pretty",
                "rerun:target/rerun.txt",
                "json:target/cucumber.json"}
                ,tags = {"@Smoke"},
                 monochrome = true,
                glue={"Stepdefintion"})
public class Runners {
}
