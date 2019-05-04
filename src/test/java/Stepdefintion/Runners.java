package Stepdefintion;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions( plugin={"html:target/cucumber-html-report",
        // "json:target/cucumber.json",
        "json:target/cucumber-html-report/cucumber.json",
     //   "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html",
        "pretty:target" +"/cucumber-pretty.txt",
        "junit:target/cucumber-results"+"xml"},
        tags = {"@Smoke"},
        monochrome = true,
        // dryRun = true,
        features="F:\\WebHookConcept\\src\\test\\Resource\\Homepage.feature")

public class Runners {
}

