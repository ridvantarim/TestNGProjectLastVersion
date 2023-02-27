package Pages.US03_US04;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ShippingAddressPage {
    public ShippingAddressPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//*[text()='Sign In']") public WebElement ilkSignınButonu;
    @FindBy(xpath = "//input[@id='username']") public WebElement girisSayfasıUsername;
    @FindBy(xpath = "//input[@id='password']") public WebElement girisSayfasıPassword;
    @FindBy(xpath = "//input[@id='rememberme']") public WebElement girisRememberMeButonu;
    @FindBy(xpath = "//button[@name='login']") public WebElement parolaKaydıSigninButonu;
    @FindBy(xpath = "(//*[@class='logo'])[1]") public WebElement humcomfyYazisi;
    @FindBy(xpath = "//span[.='Sign Out']") public WebElement signOutButonu;
    @FindBy(xpath = "//h2[.='My Account']") public WebElement myAccountYazisi;
    @FindBy(xpath = "//a[.='Addresses']") public WebElement adressesButonu;
    @FindBy(xpath = "(//*[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]") public WebElement addButonu;
    @FindBy(xpath = "//input[@id='shipping_first_name']") public WebElement shippingFirstName;
    @FindBy(xpath = "//input[@id='shipping_last_name']") public WebElement shippingLastName;
    @FindBy(xpath = "//input[@id='shipping_company']") public WebElement shippingCompanyName;
    @FindBy(xpath = "(//span[@class='select2-selection__placeholder'])[1]") public WebElement shippingCountry1;
    @FindBy(xpath = "//input[@class='select2-search__field']") public WebElement shippingCountry2;

    @FindBy(xpath = "//*[@id='select2-shipping_country-container']") public WebElement shippingCountry3;

    @FindBy(xpath = "//*[@class='select2-search__field']") public WebElement shippingCountry4;
    @FindBy(xpath = "//input[@id='shipping_address_1']") public WebElement shippingStreetAdres;
    @FindBy(xpath = "//input[@id='shipping_address_2']") public WebElement shippingApartman;
    @FindBy(xpath = "//input[@id='shipping_postcode']") public WebElement shippingZIPCode;
    @FindBy(xpath = "//input[@id='shipping_city']") public WebElement shippingTownCity;
    @FindBy(xpath = "//span[@class='select2-selection__placeholder']") public WebElement shippingProvince1;
    @FindBy(xpath = "//input[@class='select2-search__field']") public WebElement shippingProvince2;

    @FindBy(xpath = "//*[@id='select2-shipping_state-container']") public WebElement shippingProvince3;

    @FindBy(xpath = "//input[@class='select2-search__field']") public WebElement shippingProvince4;

    @FindBy(xpath = "//button[@name='save_address']") public WebElement shippingSaveButonu;

    @FindBy(xpath = "(//*[@class='required'])[1]") public WebElement shippingZorunluYıldız1;
    @FindBy(xpath = "//*[@class='close-icon']") public WebElement shippingZorunluYıldız2;
    @FindBy(xpath = "(//span[@class='optional'])[1]") public WebElement shippingOptionalAlanlar;
    @FindBy(id = "billing_country") public WebElement ulke;















}
