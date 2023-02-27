package Pages.US05_US06_US17;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StoreManagerPage {
    @FindBy(xpath = "(//*[@class='text'])[4]")
    public WebElement product;

    @FindBy(linkText = "Add New")
    public WebElement addnew;

    @FindBy(name = "pro_title")
    public WebElement producttitle;

    @FindBy(id = "featured_img_display")
    public WebElement resimyukle;

    @FindBy(xpath= "//*[@id='__wp-uploader-id-1']")
    public WebElement selectFilesButton;

    @FindBy(id = "__wp-uploader-id-1")
    public WebElement resimyukle2;

    @FindBy(xpath = "(//*[.='Select'])[4]")
    public WebElement selectresimsec;

    @FindBy(xpath = "(//*[@class='attachment-thumbnail size-thumbnail'])[3]")
    public WebElement ekledigimUrun;
}
