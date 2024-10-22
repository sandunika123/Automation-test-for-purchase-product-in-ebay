package Definitions;

import Utilities.HelperClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook {

    @Before
    public static void setUp() throws InterruptedException {

        HelperClass.setUpDriver();
    }

    @After
    public static void tearDown(Scenario scenario) {

        //validate if scenario has failed
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Utilities.HelperClass.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        Utilities.HelperClass.tearDown();
    }


}
