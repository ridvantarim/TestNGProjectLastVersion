package Pages.US11_US12;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyAccount11 {
    public MyAccount11(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(partialLinkText = "Sign Out")
    public WebElement signOutButton;

    @FindBy(xpath = "(//*[text()='My Account'])[2]")
    public WebElement myAccountTittle;

    @FindBy (xpath= "(//*[@class='col-md-4 col-sm-6 col-12 m-b-md mb-4'])//div//a//p")
    public List<WebElement> fonksiyonlar;

    @FindBy (xpath = "(//*[@class='woocommerce-MyAccount-navigation col-md-3 mb-8'])//ul//li//a")
    public List<WebElement> fonksiyonlar1;

    @FindBy(partialLinkText = "Store Manager")
    public WebElement storeManagerButton;

    @FindBy(xpath = "(//*[.='Store Manager'])[1]")
    public WebElement storeManagerTitle;

    @FindBy(xpath = "(//*[@class='text'])[4]")
    public WebElement productMoveToElement;

    @FindBy(xpath = "//*[@class='wcfm_sub_menu_items wcfm_sub_menu_items_product_manage moz_class']")
    public WebElement addNewButton;
}


