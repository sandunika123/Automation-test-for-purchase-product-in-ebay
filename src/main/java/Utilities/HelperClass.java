package Utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HelperClass {


    private static HelperClass helperClass;
    private static WebDriver driver;
    public final static int TIMEOUT = 10;

    String driverPath = "D:\\chrome_driver\\chromedriver.exe";
    //public WebDriver driver;

    private HelperClass() throws InterruptedException {

        System.out.println("launching Chrome browser");
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        //driver.get(Url);
        //driver.manage().window().maximize();
        //Thread.sleep(3000);


        //WebDriverManager.edgedriver().setup();
        //WebDriverManager.edgedriver().setup();
        //	WebDriverManager.firefoxdriver().setup();
        //WebDriverManager.chromedriver().setup();

        //driver = new ChromeDriver();
        //	driver=new EdgeDriver();
        //driver=new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();

    }

    public static void openPage(String url) {
        driver.get(url);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setUpDriver() throws InterruptedException {

        if (helperClass == null) {

            helperClass = new HelperClass();
        }
    }

    public static void tearDown() {

        if (driver != null) {

            //driver.close();
            //driver.quit();
        }
        driver.navigate().refresh();
        //helperClass = null;
    }

    public static void BrowserClose() {
        //driver.close();
        //driver.quit();

    }

    public static Object switchTo() {
        // TODO Auto-generated method stub
        return null;
    }


}