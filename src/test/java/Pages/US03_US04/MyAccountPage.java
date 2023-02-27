package Pages.US03_US04;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MyAccountPage {

    public MyAccountPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//span[.='Sign Out']") public WebElement signOutButonu;
    @FindBy(xpath = "//h2[.='My Account']") public WebElement myAccountYazisi;
    @FindBy(xpath = "//a[.='Addresses']") public WebElement adressesButonu;


}
