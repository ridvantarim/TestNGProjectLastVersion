package Pages.US18Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage18_19_20 {
    public LoginPage18_19_20(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "(//*[@id='username'])[1]")
    public WebElement username;
    @FindBy(xpath = "(//*[@id='password'])[1]")
    public WebElement pass;
    @FindBy(xpath = "(//*[@name='login'])[1]")
    public WebElement loginbutton;
}
