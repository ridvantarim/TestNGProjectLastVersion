package pages.US13_14Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductManagerPage {
    public ProductManagerPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "product_type") public WebElement simpleProductDropDwn;
    @FindBy(id="featured_img_display") public WebElement imageAddBtn;
    @FindBy(id="pro_title") public WebElement productTitleBox;
    @FindBy(id="excerpt_ifr") public WebElement shortDescriptionIframe;
    @FindBy(xpath = "//*[@data-id='excerpt']") public WebElement shortDescriptionText;
    @FindBy(id="description_ifr") public WebElement descriptionIframe;
    @FindBy(xpath = "//*[@data-id='description']") public WebElement descriptionText;
    @FindBy(xpath = "(//*[@data-super_parent='230'])[1]") public WebElement categoriesCheckBox;
    @FindBy(xpath = "//*[text()='+Add new category']") public WebElement addNewCategory;
    @FindBy(id = "wcfm_new_cat") public WebElement categoryName;
    @FindBy(xpath = "//*[@data-taxonomy='product_cat']") public WebElement categoryAdd;
    @FindBy(xpath = "//*[text()='Earphones']") public WebElement addedCategory;
    @FindBy(xpath = "(//*[@value='487'])[1]") public WebElement productBrandsCheckBox;
    @FindBy(xpath = "//*[text()='+Add new Product brands']") public WebElement addNewProductBrands;
    @FindBy(id = "wcfm_new_product_brand") public WebElement productBrandsName;
    @FindBy(xpath = "//*[@data-taxonomy='product_brand']") public WebElement productBrandsAdd;
    @FindBy(xpath = "//*[text()='Earphones Avm']") public WebElement addedBrands;
    @FindBy(xpath = "//*[@id='product_tags']") public WebElement tagTextBox;
    @FindBy(xpath = "//*[@id='catalog_visibility']") public WebElement catalogVisibilityDropDown;
}
