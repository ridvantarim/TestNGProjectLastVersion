package pages.US13_14Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MyAccountPage {
    public MyAccountPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[text()='Addresses'])[1]") public WebElement addressBtn;
    @FindBy(xpath = "//*[text()='Store Manager']") public WebElement storeManagerBtn;
}
