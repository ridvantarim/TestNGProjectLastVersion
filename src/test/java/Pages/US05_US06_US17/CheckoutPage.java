package Pages.US05_US06_US17;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    public CheckoutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//label[@for=\"billing_address_1\"]")
    public WebElement billingAdress;

    @FindBy (xpath = "//h4[.=\"Payment Methods\"]")
    public WebElement paymentMethods;

    @FindBy (id = "payment_method_cod")
    public WebElement payAtTheDoor;

    @FindBy (id = "payment_method_bacs")
    public WebElement wireTransfer;

    @FindBy (id = "place_order")
    public WebElement placeOrder;

    @FindBy (xpath = "//i[@class=\"fas fa-check\"]")
    public WebElement thankYou;
}
