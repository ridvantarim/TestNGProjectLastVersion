package Pages.US18Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage18_19_20 {
    public HomePage18_19_20(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//a[@class='register inline-type']")
    public WebElement register;
    @FindBy(xpath = "//a[@class='register_as_vendor']")
    public WebElement signAsVendor;
    @FindBy(id = "user_email")
    public WebElement userEmail;
    @FindBy(id = "passoword")
    public WebElement password;
    @FindBy(id ="confirm_pwd")
    public WebElement passwordConfirm;
    @FindBy(id = "wcfm_membership_register_button")
    public WebElement registerBut;
    @FindBy(xpath = "//input[@class='wcfm-text wcfm_submit_button wcfm_email_verified_button']")
    public WebElement resendcode;
    @FindBy(xpath = "//input[@class='wcfm-text wcfm_email_verified_input']")
    public WebElement verificationcode;
    @FindBy(xpath ="//*[@class='button-primary button button-large button-next wcfm_submit_button']")
    public WebElement letsgo;
    @FindBy(xpath ="//input[@value='Continue']")
    public WebElement continues;
    @FindBy(xpath = "//*[@class='button button-primary button-large wcfm_submit_button']")
    public WebElement letsgotodashboard;
    //----------------------------------------------------------
    @FindBy(xpath = "//*[@class='login inline-type']")
    public WebElement signin;
    @FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--wcfm-store-manager']")
    public WebElement storemanager;
    @FindBy(id = "menu-item-1079")
    public WebElement myaccount;
    @FindBy(xpath = "(//a[@title='Hubcomfy - '])[1]")
    public WebElement logo;
    @FindBy(xpath = "(//a[@data-product_sku='MS46891391'])[2]")
    public WebElement addtocart;
    @FindBy(xpath = "//a[@class='cart-toggle']")
    public WebElement cartbutton;
    @FindBy(xpath = "//a[@href='https://hubcomfy.com/urun/bluetooth-headphone/']")
    public WebElement shoppingcarttext;
    @FindBy(xpath = "//div[@class='minipopup-area']")
    public WebElement popup;
    @FindBy(xpath = "//TD[@class='product-name']")
    public WebElement addedproductname;
    @FindBy(xpath = "//a[@class='button wc-forward']")
    public WebElement viewcartbutton;
    @FindBy(xpath = "//td[@class='product-name']")
    public WebElement cartedname;
    @FindBy(xpath = "(//a[@href='https://hubcomfy.com/checkout-2/'])[2]")
    public WebElement checkout;
    @FindBy(xpath = "//td[@class='product-name']//span")
    public WebElement orderedproductname;
}
