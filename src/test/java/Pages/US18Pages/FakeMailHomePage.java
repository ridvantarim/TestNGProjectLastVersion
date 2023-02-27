package Pages.US18Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FakeMailHomePage {

    public FakeMailHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath ="//*[@class='color cetc']")
    public WebElement copy;
    @FindBy(xpath = "//tbody[@id='schranka']//tr[1]")
    public WebElement mailCheck;
    @FindBy(xpath = "//table[@id='template_container']//tr//td//p//b")
    public WebElement checkNum;


}


