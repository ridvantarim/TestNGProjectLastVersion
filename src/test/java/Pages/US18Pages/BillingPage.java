package Pages.US18Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingPage {
    public BillingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@name='billing_first_name']")
    public WebElement firstname;
    @FindBy(xpath = "//input[@name='billing_last_name']")
    public WebElement lastname;
    @FindBy(xpath = "//input[@name='billing_company']")
    public WebElement companyname;
    @FindBy(xpath = "//select[@id='billing_country']")
    public WebElement countrydrop;
    @FindBy(xpath = "//input[@name='billing_address_1']")
    public WebElement adressstr;
    @FindBy(xpath = "//input[@name='billing_address_2']")
    public WebElement adressapt;
    @FindBy(xpath = "//input[@id='billing_city']")
    public WebElement city;
    @FindBy(xpath = "//select[@id='billing_state']")
    public  WebElement statedrop;
    @FindBy(xpath = "//input[@id='billing_postcode']")
    public WebElement postcode;
    @FindBy(xpath = "//input[@id='billing_phone']")
    public  WebElement phone;
    @FindBy(xpath = "//textarea[@id='order_comments']")
    public WebElement textarea;
    @FindBy(xpath = "(//span[@class='woocommerce-Price-amount amount'])[5]")
    public WebElement price;
    @FindBy(xpath = "//INPUT[@id='payment_method_bacs']")
    public WebElement wiretransfer;
    @FindBy(xpath = "//input[@id='payment_method_cod']")
    public WebElement payatdoor;
    @FindBy(xpath = "//button[@id='place_order']")
    public WebElement placeorder;
    @FindBy(xpath = "//p[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received order-success']")
    public WebElement orderreceivedtext;
    @FindBy(xpath = "(//a[@href='https://hubcomfy.com/my-account-2/'])[2]")
    public WebElement myaccount;
    @FindBy(xpath = "(//a[@href='https://hubcomfy.com/my-account-2/orders/'])[1]")
    public WebElement orders;
    @FindBy(xpath = "(//a[@href='https://hubcomfy.com/my-account-2/view-order/22458/'])[2]")
    public WebElement vieworderdetails;
    @FindBy(xpath = "//h2[@class='woocommerce-order-details__title']")
    public WebElement orderdetailstext;
}

