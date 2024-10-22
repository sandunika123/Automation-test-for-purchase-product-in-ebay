package actions;
import Utilities.HelperClass;
import locators.LoginPage_Locators;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Actions {

    LoginPage_Locators loginPageLocators = null;

    public 	LoginPage_Actions() {

        this.loginPageLocators =new LoginPage_Locators();
        PageFactory.initElements(HelperClass.getDriver(),loginPageLocators);
    }

    public void open_application(String url) throws InterruptedException {
        HelperClass.openPage(url);
        Thread.sleep(10000);
    }

    //Enter search product
    public void search_product(String product) throws InterruptedException {
        loginPageLocators.searchbar.click();
        loginPageLocators.searchbar.sendKeys(product);
        loginPageLocators.searchbutton.click();
        Thread.sleep(5000);
    }

    //Enter select product
    public void select_product() throws InterruptedException {

        loginPageLocators.select_product.click();

        Thread.sleep(5000);
    }

//    //Click login button
//    public void clickLoginButton() throws InterruptedException {
//        loginPageLocators.loginButton.click();
//        Thread.sleep(5000);
//    }

}
