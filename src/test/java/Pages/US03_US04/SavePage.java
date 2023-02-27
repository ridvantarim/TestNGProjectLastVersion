package Pages.US03_US04;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SavePage {
    public SavePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]")
    public WebElement bilingaddButonu;
    @FindBy(xpath = "//h3[.='Billing address']") public WebElement bilingAdresYazisi;

    @FindBy(xpath = "//h3[.='Shipping address']") public WebElement shippingAdresYazisi;
    @FindBy(xpath = "(//a[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]") public WebElement shippingAddButonu;
}
