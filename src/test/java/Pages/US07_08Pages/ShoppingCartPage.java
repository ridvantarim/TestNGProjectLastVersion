package Pages.US07_08Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.Driver;

public class ShoppingCartPage {


    public ShoppingCartPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@class='cart-title'])[2]")
    public WebElement cartTotalsYazisi;

    @FindBy(xpath = "//*[@id='calc_shipping_country']")
    public WebElement countryButton;

    @FindBy(xpath = "//*[@id='calc_shipping_state']")
    public WebElement sehirButton;

    @FindBy(xpath = "//*[@id='calc_shipping_city']")
    public WebElement ilceButton;

    @FindBy(xpath = "//*[@id='calc_shipping_postcode']")
    public WebElement postaKoduButton;

    @FindBy(xpath = "//*[@class='checkout-button button alt wc-forward']")
    public WebElement proceeedToCheckOut;

}

