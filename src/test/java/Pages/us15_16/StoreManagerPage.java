package Pages.us15_16;

import Utilities.Driver;
import Utilities.ReusableMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class StoreManagerPage extends ReusableMethods {

    public StoreManagerPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='text'])[4]")
    public WebElement productsButton;

    @FindBy(xpath = "//a[.='Add New']")
    public WebElement addNewButton;

    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[1]")
    public WebElement inventory;

    @FindBy(xpath = "//*[@id='sku']")
    public WebElement sku;

    @FindBy(xpath = "//*[@id='manage_stock']")
    public WebElement manageStock;

    @FindBy(xpath = "(//*[@type='number'])[3]")
    public WebElement stockQty;

    @FindBy(xpath = "//*[@id='backorders']")
    public WebElement allowBackorders;

    @FindBy(xpath = "//*[@id='stock_status']")
    public WebElement stockStatus;

    @FindBy(xpath = "//*[@id='sold_individually']")
    public WebElement soldIndividually;



    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[4]")
    public WebElement shipping;

    @FindBy(xpath = "//*[@id='weight']")
    public WebElement weight;

    @FindBy(xpath = "//*[@id='length']")
    public WebElement lenght;

    @FindBy(xpath = "//*[@id='width']")
    public WebElement width;

    @FindBy(xpath = "//*[@id='height']")
    public WebElement height;

    @FindBy(xpath = "//*[@id='shipping_class']")
    public WebElement shippingClass;

    @FindBy(xpath = "//*[@id='_wcfmmp_processing_time']")
    public WebElement processingtime;




    @FindBy(xpath = "//*[@id='wcfm_products_manage_form_attribute_head']")
    public WebElement attributes;

    @FindBy(xpath = "//*[@id='attributes_is_active_1']")
    public WebElement color;

    @FindBy(xpath = "(//*[@type='button'])[45]")
    public WebElement addNew;

    @FindBy(xpath = "(//*[@type='button'])[46]")
    public WebElement selectNone;

    @FindBy(xpath = "(//*[@type='button'])[47]")
    public WebElement selectAll;

    @FindBy(xpath = "(//*[@class='select2-search__field'])[2]")
    public WebElement searchForAnAttribute;

    @FindBy(xpath = "//*[@id='attributes_is_active_2']")
    public WebElement size;

    @FindBy(xpath = "(//*[@type='button'])[48]")
    public WebElement addNew2;

    @FindBy(xpath = "(//*[@type='button'])[49]")
    public WebElement selectNone2;

    @FindBy(xpath = "(//*[@type='button'])[50]")
    public WebElement selectAll2;

    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[3]")
    public WebElement searchForAnAttributeButton;



    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[7]")
    public WebElement linked;

    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[4]")
    public WebElement upSells;

    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[5]")
    public WebElement crossSells;



    @FindBy(xpath = "//*[@class='wcfma fa-globe']")
    public WebElement seo;

    @FindBy(xpath = "//*[@id='yoast_wpseo_focuskw_text_input']")
    public WebElement enterAFocusKeyword;

    @FindBy(xpath = "//*[@id='yoast_wpseo_metadesc']")
    public WebElement metaDescription;




    @FindBy(xpath = "//*[@class='wcfmfa fa-certificate']")
    public WebElement wholesaleProductDisplaySettings;

    @FindBy(xpath = "//*[@id='piecetype']")
    public WebElement priceType;

    @FindBy(xpath = "//*[@id='unitpercart']")
    public WebElement unitsPerPrice;

    @FindBy(xpath = "//*[@id='minorderqtytr']")
    public WebElement minOrderQuantity;



    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[10]")
    public WebElement advanced;

    @FindBy(xpath = "//*[@id='enable_reviews']")
    public WebElement enableReviews;

    @FindBy(xpath = "//*[@id='menu_order']")
    public WebElement menuOrder;

    @FindBy(xpath = "//*[@id='purchase_note']")
    public WebElement purchaseNote;


    //16
    @FindBy(xpath = "//*[@id='product_type']")
    public WebElement simpleProduct;

    @FindBy(xpath = "//*[@id='is_virtual']")
    public WebElement virtual;

    @FindBy(xpath ="//*[@id='is_downloadable']" )
    public WebElement downloadable;

    @FindBy(xpath ="//*[@id='pro_title']" )
    public WebElement productTite;

    @FindBy(xpath ="//*[@id='regular_price']" )
    public WebElement price;

    @FindBy(xpath = "//*[@id='sale_price']")
    public WebElement salePrice;

    @FindBy(xpath = "//span[@class='wcfm_sub_menu_items wcfm_sub_menu_items_product_manage moz_class']")
    public WebElement addNewPopUp;

    HomePage homePage;
    public void addProduct() {
        waitFor(3);
        homePage = new HomePage();
        homePage.signOutButton.click();
        homePage.storeManagerButton.click();
        productsButton.click();
        addNewButton.click();


    }



}
