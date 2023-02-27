package Pages.us15_16;

import Utilities.Driver;
import Utilities.ReusableMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends ReusableMethods {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Sign In']")
    public WebElement signInButton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement signInUsername;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement signInPassword;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement loginSubmitButton;

    @FindBy(xpath = "//span[.='Sign Out']")
    public WebElement signOutButton;

    @FindBy(xpath = "//span[.='Register']")
    public WebElement registerButton;

    @FindBy(xpath = "//a[.='Become a Vendor']")
    public WebElement becomeAVendorButton;

    @FindBy(xpath = "//a[.='Store Manager']")
    public WebElement storeManagerButton;




    public void login(String username, String password) {
        signInButton.click();
        signInUsername.sendKeys(username);
        signInPassword.sendKeys(password);
        loginSubmitButton.click();
        waitFor(3);
    }








}
