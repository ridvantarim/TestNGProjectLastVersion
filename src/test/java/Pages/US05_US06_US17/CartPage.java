package Pages.US05_US06_US17;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public CartPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()=\"Multi Functional Apple iPhone\"]")
    public WebElement productIsVisible;

    @FindBy (xpath = "//button[@title=\"Plus\"]")
    public WebElement plusButton;

    @FindBy (xpath = "//button[@title=\"Minus\"]")
    public WebElement minusButton;

    @FindBy(xpath = "//a[@class=\"button checkout wc-forward\"]")
    public WebElement proceedToCheckout;
}
