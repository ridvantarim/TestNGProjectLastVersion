package pages.US13_14Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddressesPage {
    public AddressesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[text()='Add'])[2]") public WebElement shipAddressAddBtn;
    @FindBy(id = "shipping_first_name") public WebElement shipAddFirstName;
    @FindBy(id = "shipping_last_name") public WebElement shipAddLastName;
    @FindBy(xpath = "//*[@id='shipping_country']") public WebElement shipAddCountry;
    @FindBy(id = "shipping_address_1") public WebElement shipStreetAddressBox;
    @FindBy(id = "shipping_city") public WebElement shipTownCityBox;
    @FindBy(xpath = "//*[@id='shipping_state']") public WebElement shipStateBox;
    @FindBy(id = "shipping_postcode") public WebElement shipZipBox;
    @FindBy(xpath = "//*[@name='save_address']") public WebElement shipSaveAddBtn;
    @FindBy(xpath = "//*[@role='alert']") public WebElement saveMessage;

}
