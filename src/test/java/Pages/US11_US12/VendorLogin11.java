package Pages.US11_US12;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VendorLogin11 {


    public VendorLogin11(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(partialLinkText = "Sign In")
    public WebElement signInButton;

    @FindBy(id = "username")
    public WebElement usernameButton;

    @FindBy(id = "password")
    public WebElement passwordButton;

    @FindBy(name = "login")
    public WebElement loginButton;
}


