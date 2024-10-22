package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;




import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features = { "src/test/resources/Feature/Login.feature" },
        monochrome=true,
        glue = { "Definitions" },
        tags ="",
        dryRun=false,
        plugin = { "pretty","json:target/cucumber-json.json", "html:target/cucumber-reports/cucumberreport.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

        })
public class testRunner extends AbstractTestNGCucumberTests{
}
