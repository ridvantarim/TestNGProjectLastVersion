package Pages.US11_US12;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US12Pages {

    public US12Pages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='login inline-type']") public WebElement singInBtn1;
    @FindBy(xpath = "//*[@id='username']") public WebElement emailBox;
    @FindBy(xpath = "//*[@id='password']") public WebElement passwordBox;
    @FindBy(xpath = "//*[@name='login']") public WebElement singInBtn2;
    @FindBy(xpath = "(//*[@href='https://hubcomfy.com/my-account-2/'])[1]") public WebElement myAccountBtn;
    @FindBy(xpath = "(//*[text()='Addresses'])[1]") public WebElement addressBtn;
    @FindBy(xpath = "//*[@href='https://hubcomfy.com/my-account-2/edit-address/billing/']") public WebElement addBillingAddress;
    @FindBy(xpath = "//*[@id='billing_first_name']") public WebElement firstName;
    @FindBy(xpath = "//*[@id='billing_last_name']") public WebElement lastName;
    @FindBy(xpath = "//*[@name='billing_country']") public WebElement countryDropbox;
    @FindBy(xpath = "//*[@id='billing_address_1']") public WebElement streetAddress;
    @FindBy(xpath = "//*[@id='billing_city']") public WebElement townCity;
    @FindBy(xpath = "//*[@name='billing_state']") public WebElement stateNameDropbox;
    @FindBy(xpath = "//*[@id='billing_postcode']") public WebElement zipCode;
    @FindBy(xpath = "//*[@id='billing_phone']") public WebElement phoneNumber;
    @FindBy(xpath = "//*[@id='billing_email']") public WebElement emailAddressBox;
    @FindBy(xpath = "//*[@id='billing_email']") public WebElement saveBtn;


    @FindBy(xpath = "//*[@name='billing_email']")
    public WebElement billing_email;

    @FindBy(xpath = "//*[@class='btn btn-dark btn-rounded btn-sm']")
    public WebElement save_address;


    @FindBy(xpath = "//*[@class='woocommerce-message alert alert-simple alert-icon alert-close-top alert-success']")
    public WebElement faturaAdresiEklendi;

    @FindBy(xpath = "//*[@name='billing_state']")
    public WebElement statebox;



}
