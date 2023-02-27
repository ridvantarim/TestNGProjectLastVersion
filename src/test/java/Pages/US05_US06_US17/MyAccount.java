package Pages.US05_US06_US17;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {
    public MyAccount(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@href=\"https://hubcomfy.com/my-account-2/edit-account/\"])[1]")
    public WebElement accountDetails;

    @FindBy (xpath = "//h4[text()=\"Account Details\"]")
    public WebElement accountDetailsISDisplayed;

    @FindBy (id = "account_first_name")
    public WebElement accountFirstName;

    @FindBy (id = "account_last_name")
    public WebElement accountLastName;

    @FindBy (id = "account_display_name")
    public WebElement accountDisplayName;

    @FindBy (id = "account_email")
    public WebElement accountEmail;

    @FindBy(xpath = "//button[@value=\"Save changes\"]")
    public WebElement saveChangesButton;

    @FindBy(xpath = "//i[@class=\"fas fa-check\"]")
    public WebElement successfully;

    @FindBy(id = "tinymce")
    public WebElement biography;

    @FindBy(id = "password_current")
    public WebElement currentPassword;

    @FindBy(id = "password_1")
    public WebElement newPassword;

    @FindBy(id = "password_2")
    public WebElement confirmPassword;

    //@FindBy (xpath = "//*[@href=\"https://hubcomfy.com/store-manager/\"]")
    //public WebElement storeManager;

    @FindBy(linkText = "//h2[.='My Account']")
    public WebElement myaccounttext;

    @FindBy(xpath = "//a[text()='My Account']")
    public WebElement myaccount;

    @FindBy(xpath = "//*[text()='Store Manager']")
    public WebElement storemanager;
}
