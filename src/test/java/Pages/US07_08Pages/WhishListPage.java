package Pages.US07_08Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.Driver;

public class WhishListPage {


    public WhishListPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[text()='Wishlist'])[2]")
    public WebElement whishListYazisi;

    @FindBy(xpath = "//*[@class='product-thumbnail'][1]")
    public WebElement productYazisi;

    @FindBy(xpath = "//*[text()='Quick View']")
    public WebElement quickView;

    @FindBy(xpath = "(//*[text()='Bluetooth Headphone'])[1]")
    public WebElement bluetooth;

    @FindBy(xpath = "//*[text()='Add to cart']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//*[@class='btn btn-sm btn-rounded']")
    public WebElement cartEkleYazisi;

    @FindBy(xpath = "//*[@class='btn btn-success btn-md']")
    public WebElement viewCart;

    @FindBy(xpath = "(//*[@class='w-icon-cart'])[1]")
    public WebElement cartButton;

    @FindBy(xpath = "//*[text()='Shopping Cart']")
    public WebElement shoppingCart;

    @FindBy(xpath = "//*[@class='button wc-forward']")
    public WebElement viewCartEkleme;

}

