package Pages.US09_US10;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorPage {

    public VendorPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user_email")
    public WebElement vendorEmail;

    @FindBy(xpath = "//*[@placeholder='Verification Code']")
    public WebElement verificationCode;

    @FindBy(className ="wcicon-status-completed" )
    public WebElement verificationmesaj;

    @FindBy(id = "passoword")
    public WebElement password;

    @FindBy(id = "confirm_pwd")
    public WebElement confirm_Pwd;

    @FindBy(id = "wcfm_membership_register_button")
    public WebElement registerButton;

    @FindBy(xpath = "//*[@class='wcfm-message wcfm-success']")
    public WebElement yeniKayit;

    @FindBy(xpath = "//*[@class='wcfm-message wcfm-error']")
    public WebElement kayitli;

    @FindBy(xpath = "//*[@class='short']")
    public WebElement tooShort;

    @FindBy(xpath = "//*[@class='weak']")
    public WebElement weak;

    @FindBy(xpath = "//*[@class='good']")
    public WebElement good;

    @FindBy(xpath = "//*[@class='strong']")
    public WebElement strong;
}
