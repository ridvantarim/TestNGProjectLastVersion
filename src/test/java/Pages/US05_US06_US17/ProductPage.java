package Pages.US05_US06_US17;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    public ProductPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h1[@class=\"product_title entry-title\"]")
    public WebElement product1;

    @FindBy (xpath = "//button[@name=\"add-to-cart\"]")
    public WebElement addToCart;

    @FindBy (xpath = "(//i[@class=\"w-icon-cart\"])[1]")
    public WebElement cart;

    @FindBy (xpath = "//a[@class=\"button wc-forward\"]")
    public WebElement viewCart;
}
