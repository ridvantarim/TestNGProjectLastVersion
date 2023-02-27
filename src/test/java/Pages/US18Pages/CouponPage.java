package Pages.US18Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CouponPage {
    public CouponPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//a[@class='wcfm_menu_item ' and @href='https://hubcomfy.com/store-manager/coupons/']")
    public WebElement coupons;
    @FindBy(xpath = "//a[@class='wcfm_menu_item active' and @href='https://hubcomfy.com/store-manager/coupons/']")
    public WebElement couponsactive;
    @FindBy(xpath = "//a[@id='add_new_coupon_dashboard']")
    public WebElement addnewcoupon;
    @FindBy(xpath = "//input[@id='title']")
    public WebElement code;
    @FindBy(xpath = "//textarea[@id='description']")
    public WebElement descokuma;
    @FindBy(xpath = "//textarea[@id='description']")
    public WebElement descCoupon;
    @FindBy(xpath = "//select[@id='discount_type']")
    public WebElement discTypedrop;
    @FindBy(xpath = "//input[@id='coupon_amount']")
    public WebElement couponamount;
    @FindBy(xpath = "//input[@id='expiry_date']")
    public WebElement expirydate;
    @FindBy(xpath = "//input[@id='free_shipping']")
    public WebElement freeshiping;
    @FindBy(xpath = "//input[@id='show_on_store']")
    public WebElement showonstore;
    @FindBy(xpath = "//input[@id='wcfm_coupon_manager_submit_button']")
    public WebElement submitcoupon;
    @FindBy(xpath = "(//td[@class='sorting_1'])[1]")
    public WebElement couponlistingcode;
}

