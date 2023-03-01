package Pages.US09_US10;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//*[.='Register'])[2]")
    public WebElement registerButton;

    @FindBy(xpath = "//*[@class='wcfmmp_become_vendor_link']")
    public WebElement vendorButton;

    @FindBy(id="reg_username")
    public WebElement regUsername;

    @FindBy(linkText = "Become a Vendor")
    public WebElement become_a_vendor;
}
