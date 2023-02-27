package Pages.US18Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoreManagerPage {
    public StoreManagerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@href='https://hubcomfy.com/store-manager/products/']")
    public WebElement products;
    @FindBy(xpath = "//a[@data-tip='Add New Product']")
    public WebElement productAddNew;
    @FindBy(xpath="//select[@id='product_type']")
    public  WebElement productType;
    @FindBy(id = "product_url")
    public WebElement productUrl;
    @FindBy(id = "button_text")
    public WebElement buttonText;
    @FindBy(id ="regular_price")
    public WebElement Price;
    @FindBy(id = "sale_price")
    public WebElement salePrice;
    @FindBy(id = "featured_img_display")
    public WebElement addImage;
    @FindBy(xpath = "//img[@id='gallery_img_gimage_0_display']")
    public WebElement featuredImg;
    @FindBy(xpath = "//BUTTON[@id='__wp-uploader-id-1']")
    public WebElement buttonUploader;
    @FindBy(xpath = " storeManagerPage.selectButton.click();")
    public WebElement kapat1;
    @FindBy(xpath = "//input[@style='font-size: 999px; opacity: 0; position: absolute; top: 0px; left: 0px; width: 100%; height: 100%;']")
    public WebElement featuredselect;
    @FindBy(xpath = "//button[@class='media-modal-close']")
    public WebElement kapat;
    @FindBy(xpath = "//input[@style='font-size: 999px; opacity: 0; position: absolute; top: 0px; left: 0px; width: 100%; height: 100%;']")
    public WebElement uploader;
    @FindBy(xpath = "//button[@class='button media-button button-primary button-large media-button-select']")
    public WebElement selectButton;
    @FindBy(xpath = "//input[@id ='pro_title']")
    public WebElement productTitle;
    @FindBy(xpath = "(//body[@id='tinymce'])[1]")
    public  WebElement shortdesc;
    @FindBy(xpath = "//*[@data-id='description']")
    public WebElement desc;
    @FindBy(xpath = "//input[@type='checkbox' and @value='402' ]")
    public WebElement categories;
    @FindBy(xpath = "(//p[@class='description wcfm_full_ele wcfm_side_add_new_category wcfm_add_new_category wcfm_add_new_taxonomy'])[1]")
    public WebElement addnewcategory;
    @FindBy(xpath = "//*[@id='wcfm_new_cat']")
    public WebElement categoryname;
    @FindBy(xpath = "(//*[@class='button wcfm_add_category_bt wcfm_add_taxonomy_bt'])[1]")
    public WebElement categoryAddbutton;
    @FindBy(xpath = "(//*[@data-super_parent='298'])[1]")
    public WebElement brandname;
    @FindBy(xpath = "(//*[@class='description wcfm_full_ele wcfm_side_add_new_category wcfm_add_new_category wcfm_add_new_taxonomy'])[2]")
    public WebElement addNewBrand;
    @FindBy(xpath = "//*[@id='wcfm_new_product_brand']")
    public WebElement brandnamebox;
    @FindBy(xpath = "//*[@data-taxonomy='product_brand']")
    public WebElement brandAddButton;
    @FindBy(xpath = "//*[@id='product_tags']")
    public WebElement  tagbox;
    @FindBy(xpath = "//*[@id='catalog_visibility']")
    public WebElement catalogVisibility;
    @FindBy(xpath = "//*[@class='page_collapsible products_manage_inventory simple variable grouped external non-job_package non-resume_package non-auction non-groupbuy non-accommodation-booking collapse-close collapse-open']")
    public WebElement Attributes;
    @FindBy(xpath = "//input[@id='manage_stock']")
    public WebElement manageStockbox;
    @FindBy(xpath ="//input[@id='sku']")
    public WebElement sku;
    @FindBy(xpath = "//select[@id='stock_status']")
    public WebElement stockStatusDrop;
    @FindBy(xpath = "//input[@id='sold_individually']")
    public WebElement soldInd;
    @FindBy(xpath = "//input[@id='stock_qty']")
    public WebElement stockQty;
    @FindBy(xpath = "//select[@id='backorders']")
    public WebElement backorders;
    @FindBy(xpath = "//div[@id='wcfm_products_manage_form_shipping_head']")
    public WebElement shipping;
    @FindBy(xpath = "//input[@id='weight']")
    public WebElement weight;
    @FindBy(xpath = "//select[@id='_wcfmmp_processing_time']")
    public WebElement processingTime;
    @FindBy(xpath = "//div[@id='wcfm_products_manage_form_attribute_head']")
    public WebElement attribute;
    @FindBy(xpath = "//input[@id='attributes_is_active_1']")
    public WebElement color;
    @FindBy(xpath = "(//input[@class='select2-search__field'])[2]")
    public WebElement searchcolor;
    @FindBy(xpath = "//input[@id='attributes_is_active_2']")
    public WebElement sizebox;
    @FindBy(xpath = "(//input[@class='select2-search__field'])[3]")
    public WebElement sizedrop;
    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[7]")
    public WebElement linked;
    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[8]")
    public WebElement seo;
    @FindBy(xpath = "//*[@id='yoast_wpseo_focuskw_text_input']")
    public WebElement focuskey;
    @FindBy(xpath = "//*[@id='yoast_wpseo_metadesc']")
    public WebElement metadesc;
    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[9]")
    public WebElement toptanurun;
    @FindBy(xpath = "//select[@id='piecetype']")
    public WebElement pieceType;
    @FindBy(xpath = "//*[@id='unitpercart']")
    public WebElement units;
    @FindBy(xpath = "//*[@id='minorderqtytr']")
    public WebElement orderQuantity;
    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[10]")
    public WebElement advanced;
    @FindBy(xpath = "//input[@id='menu_order']")
    public WebElement menuorder;
    @FindBy(xpath = "//input[@id='purchase_note']")
    public  WebElement purchasenote;
    @FindBy(xpath = "//input[@id='wcfm_products_simple_submit_button']")
    public WebElement submitson;
    @FindBy(xpath = "//script[@id='js-cookie-js']")
    public WebElement cookie;


}

