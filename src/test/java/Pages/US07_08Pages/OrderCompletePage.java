package Pages.US07_08Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.Driver;

public class OrderCompletePage {

    public OrderCompletePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@class='woocommerce-order']//p)[1]")
    public WebElement thankYouYazisi;


}

