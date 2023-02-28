package Pages.US07_08Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.Driver;

public class SearchResultPage {

    public SearchResultPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@class='compare btn-product-icon'])[2]")
    public WebElement iphone1;

    @FindBy(xpath = "(//*[@class='compare btn-product-icon'])[3]")
    public WebElement iphone2;

    @FindBy(xpath = "(//*[@class='compare btn-product-icon'])[4]")
    public WebElement iphone3;

    @FindBy(xpath = "(//*[@class='compare btn-product-icon'])[5]")
    public WebElement iphone4;

    @FindBy(xpath = "(//*[@class='compare btn-product-icon'])[6]")
    public WebElement iphone5;

    @FindBy(xpath = "(//*[@class='compare btn-product-icon'])[7]")
    public WebElement iphone6;

    @FindBy(xpath = "(//*[text()='Clean All'])[2]")
    public WebElement cleanAll;

    @FindBy(xpath = "//*[text()='Start Compare !']")
    public WebElement startCompare;

    @FindBy(xpath = "//*[@class='breadcrumb']")
    public WebElement boslukTiklama;

    @FindBy(xpath = "(//*[@class='add_to_wishlist single_add_to_wishlist'])[1]")
    public WebElement likeIkonu1;

    @FindBy(xpath = "(//*[@class='add_to_wishlist single_add_to_wishlist'])[2]")
    public WebElement likeIkonu2;

    @FindBy(xpath = "(//*[@class='add_to_wishlist single_add_to_wishlist'])[3]")
    public WebElement likeIkonu3;

    @FindBy(xpath = "(//*[@class='woocommerce-loop-product__title'])[2]")
    public WebElement iphoneGorselIsmi;

    @FindBy(xpath = "//*[@class='breadcrumb']")
    public WebElement sonucYazisi;

}

