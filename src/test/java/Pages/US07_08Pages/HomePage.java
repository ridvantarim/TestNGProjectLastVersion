package Pages.US07_08Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.Driver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Sign In']")
    public WebElement signInButton;

    @FindBy(xpath = "(//*[@name='s'])[1]")
    public WebElement searchBox;

    @FindBy(xpath = "(//*[@class='w-icon-search'])[1]")
    public WebElement buyutec;

    @FindBy(xpath = "(//*[@class='elementor-widget-container'])[5]")
    public WebElement wishList;

    @FindBy(xpath = "(//*[text()='Trending'])[1]")
    public WebElement trending;
}
