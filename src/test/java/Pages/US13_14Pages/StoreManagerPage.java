package pages.US13_14Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StoreManagerPage {
    public StoreManagerPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='wcfm_menu_items wcfm_menu_wcfm-products']") public WebElement productsBtn;  //(//*[@class='text'])[4]
    @FindBy(xpath = "//*[@class='wcfm_sub_menu_items wcfm_sub_menu_items_product_manage moz_class']") public WebElement productsAddNewBtn; //(//*[text()='Add New'])[1]
}
