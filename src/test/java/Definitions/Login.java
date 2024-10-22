package Definitions;
import Utilities.HelperClass;
import actions.LoginPage_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login {

    LoginPage_Actions objLogin = new LoginPage_Actions();


    @Given("Open Application  {string}")
    public void open_application(String url)throws InterruptedException {
        HelperClass.openPage(url);
        Thread.sleep(1000);

    }
    @When("search product  {string}")
    public void search_product(String product) throws InterruptedException{
        objLogin.search_product(product);

    }

    @When("select product")
    public void select_product()throws InterruptedException {
        objLogin.select_product();
    }
//    @When("input password {string}")
//    public void input_password(String password) throws InterruptedException {
//        objLogin.enterPassword(password);
//    }
//    @When("Click on Login button in login page")
//    public void click_on_login_button_in_login_page() throws InterruptedException {
//        objLogin.clickLoginButton();
//    }

}
