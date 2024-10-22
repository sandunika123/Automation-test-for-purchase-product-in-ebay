package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_Locators {

    //searchbar input field
    @FindBy(xpath = "//*[@id=\"gh-ac\"]")
    public WebElement searchbar;

    //searchbar input field
    @FindBy(xpath = "//*[@id=\"gh-btn\"]")
    public WebElement searchbutton;

    //select product
    @FindBy(xpath = "//*[@id=\"item426a0dd6c8\"]/div/div[1]/div/a/div")
    public WebElement select_product;



}
