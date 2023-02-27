package Pages.US05_US06_US17;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductManagerPage {
    public ProductManagerPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "product_type")
    public WebElement productdropdown;

    @FindBy(id = "menu-item-browse")
    public WebElement mediaLibrary;

    @FindBy(xpath = "(//*[@class='thumbnail'])[2]")
    public WebElement firstPic;

    @FindBy(xpath = "//*[@class='button media-button button-primary button-large media-button-select']")
    public WebElement selectForPic;

    @FindBy(xpath= "//*[@id='gallery_img_gimage_0_display']")
    public WebElement ikinciResimAlani;

    @FindBy(xpath = "(//*[@class='thumbnail'])[2]")
    public WebElement selectIkinciResim;

    @FindBy(xpath = "(//*[@class='button media-button button-primary button-large media-button-select'])[2]")
    public WebElement addToGaleryForİkinciResim;

    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[1]")
    public WebElement inventory;

    @FindBy(id = "sku")
    public WebElement sku;

    //@FindBy(linkText = "//*[.='Attributes']")
    @FindBy(xpath = "(//*[.='Attributes'])[2]")
    public WebElement attributes;

    @FindBy(xpath = "//*[@id='attributes_is_active_1']")
    public WebElement colorCheckBox;

    @FindBy(xpath = "(//*[@class='select2-search select2-search--inline'])[2]")
    public WebElement colorDropdown;

    @FindBy(xpath = "(//*[@class='select2-search__field'])[2]")
    public WebElement colorDropdown2;

    @FindBy(xpath = "//*[@id='excerpt_ifr']")
    public WebElement shortDescription;

    @FindBy(xpath = "(//*[text()='Black'])[2]")
    public WebElement yeniii;

    @FindBy(xpath = "//*[@id='excerpt_ifr']")
    public WebElement iframe1;

    @FindBy(xpath = "(//*[@id='tinymce'])[1]")
    public WebElement shortXpath;

    @FindBy(xpath = "(//*[@class='wcfm-checkbox checklist_type_product_cat '])[26]")
    public WebElement checkBoxForiphone;

    @FindBy(xpath = "(//*[@class='wcfm-checkbox checklist_type_product_brand '])[7]")
    public WebElement checkBoxForApple;

    @FindBy(xpath = "//*[@id='product_tags']")
    public WebElement tagName;

    @FindBy(xpath = "//*[@id='catalog_visibility']")
    public WebElement catalogVisibilityDropdown;

    @FindBy(xpath = "//*[@id='wcfm_products_simple_submit_button']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[text()='Published']")
    public WebElement productPublishText;

    @FindBy(xpath = "(//*[@class='page_collapsible_content_holder'])[8]")
    public WebElement seoClick;

    @FindBy(xpath = "//*[@id='yoast_wpseo_focuskw_text_input']")
    public WebElement focusKeyword;

    @FindBy(xpath = "//*[@class='wcfmfa fa-certificate']")
    public WebElement toptanUrunGost;

    @FindBy(xpath = "//*[@id='piecetype']")
    public WebElement pieceTypeDropdown;

    @FindBy(xpath = "//*[@class='wcfmfa fa-th-large']")
    public WebElement advancedButton;

    @FindBy(xpath = "//*[@name='enable_reviews']")
    public WebElement enableReviews;

    @FindBy(xpath = "(//*[text()='Black'])[2]")
    public WebElement colorDropdownMavi;

    @FindBy(xpath = "//*[@id='attributes_is_active_2']")
    public WebElement sizeCheckBox;
    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[3]")
    public WebElement sizeDropBox;

    @FindBy(xpath = "(//*[text()='10XL'])[2]")
    public WebElement yeni1;
    @FindBy(xpath = "(//*[@class='fields_collapser attributes_collapser wcfmfa fa-arrow-circle-down'])[2]")
    public WebElement colorToggleBlock;
    @FindBy(xpath = "(//*[@class='fields_collapser attributes_collapser wcfmfa fa-arrow-circle-down'])[2]")
    public WebElement sizeToggleBlock;
    @FindBy(xpath = "//*[@id='regular_price']")
    public WebElement regularPrice;
    @FindBy(xpath = "//*[@id='sale_price']")
    public WebElement salePrice;

}
