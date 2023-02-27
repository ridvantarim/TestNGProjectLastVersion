package Pages.US03_US04;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignPage {

    public SignPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[text()='Sign In']") public WebElement ilkSignınButonu;
    @FindBy(xpath = "//input[@id='username']") public WebElement girisSayfasıUsername;
    @FindBy(xpath = "//input[@id='password']") public WebElement girisSayfasıPassword;
    @FindBy(xpath = "//input[@id='rememberme']") public WebElement girisRememberMeButonu;
    @FindBy(xpath = "//button[@name='login']") public WebElement parolaKaydıSigninButonu;
    @FindBy(xpath = "(//*[@class='logo'])[1]") public WebElement humcomfyYazisi;
    }


