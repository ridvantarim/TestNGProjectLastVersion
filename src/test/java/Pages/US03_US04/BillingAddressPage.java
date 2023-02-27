package Pages.US03_US04;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingAddressPage {
    public BillingAddressPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//input[@id='billing_first_name']") public WebElement bilingFirstName;
    @FindBy(xpath = "//input[@id='billing_last_name']") public  WebElement bilingLastName;
    @FindBy(xpath = "//input[@id='billing_company']") public WebElement bilingCompanyName;
    @FindBy(xpath = "//span[text()='Select a country / region…']") public WebElement bilingCountry1;
    @FindBy(xpath = "//input[@class='select2-search__field']") public WebElement bilingCountry2;

    @FindBy(xpath = "//*[@id='select2-billing_country-container']") public WebElement bilingCountry3;

    @FindBy(xpath = "//*[@class='select2-search__field']") public WebElement bilingCountry4;

    @FindBy(xpath = "//input[@id='billing_address_1']") public WebElement bilingStreet;
    @FindBy(xpath = "//input[@id='billing_address_2']") public WebElement bilingApartman;
    @FindBy(xpath = "//input[@id='billing_city']") public WebElement bilingTownCity;
    @FindBy(xpath = "//span[@class='select2-selection__placeholder']") public WebElement bilingProvince1;
    @FindBy(xpath = "//input[@class='select2-search__field']") public WebElement bilingProvince2;

    @FindBy(xpath = "//*[@id='select2-billing_state-container']") public  WebElement bilingProvince3;

    @FindBy(xpath = "//*[@class='select2-search__field']") public WebElement bilingProvince4;

    @FindBy(xpath = "//input[@id='billing_postcode']") public WebElement bilingZipCode;
    @FindBy(xpath = "//input[@id='billing_phone']") public WebElement bilingPhone;
    @FindBy(xpath = "//*[@id='billing_email']") public WebElement bilingEmail;
    //@FindBy(xpath = "//button[@class='btn btn-dark btn-rounded btn-sm']") public  WebElement bilingSaveAdresButonu;
    @FindBy(xpath = "//button[@class='btn btn-dark btn-rounded btn-sm']") public  WebElement bilingSaveAdresButonu;

    @FindBy(xpath = "//div[@data-id='20a9e96']") public WebElement bilingAdresSayfaAltı;
    @FindBy(xpath = "(//abbr[.='*'])[1]") public WebElement bilingZorunluYıldız;
    @FindBy(xpath = "(//span[.='(optional)'])[1]") public WebElement bilingAdresOptionalCompany;
    @FindBy(xpath = "//i[@class='close-icon']") public WebElement bilingAdresHataSembolü;

    @FindBy(xpath = "(//h4)[2]") public WebElement bilingAdresEditMesajı;





}