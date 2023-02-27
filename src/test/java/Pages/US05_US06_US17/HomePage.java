package pages.US05_US06_US17;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.Driver;

public class HomePage {

    public HomePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Sign In']")
    public WebElement signInButton;

    @FindBy(xpath = "//span[.='Register']")
    public WebElement registerButton;

    @FindBy(xpath = "(//input[@name=\"s\"])[1]")
    public WebElement searchBox;

    @FindBy(xpath = "(//button[@class=\"btn btn-search\"])[1]")
    public WebElement searchButton;

    @FindBy(id = "username")
    public WebElement usernameText;

    @FindBy(id = "password")
    public WebElement passwordText;

    @FindBy(xpath = "//button[@value=\"Sign In\"]")
    public WebElement signInClick;

    @FindBy(xpath = "(//a[@href=\"https://hubcomfy.com/my-account-2/\"])[1]")
    public WebElement myAccount;




}