package Pages.US03_US04;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EditPage {
    public EditPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//i[@class='close-icon']") public WebElement shippingHataSembolü;
    @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]") public WebElement bilingEditButon;

    @FindBy(linkText ="(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]") public WebElement shippingEditYazisi;

    @FindBy(xpath = "//td[.='55500']") public WebElement sayfaAlti;
    @FindBy(xpath = "//*[.='Logout']") public WebElement logout;

    @FindBy(xpath = "(//p)[2]") public WebElement kayıtGerceklesti;
}
