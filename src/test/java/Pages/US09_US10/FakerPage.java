package Pages.US09_US10;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class FakerPage {
    public Label fakermail;

    public FakerPage(){
        PageFactory.initElements(Driver.getDriver(),this);


    }
    @FindBy(xpath = "//*[@id='email']")
    public WebElement fakerEmail;

    @FindBy(id = "schranka")
    public WebElement fakerMesaj;

    @FindBy(id ="iframeMail" )
    public WebElement iframe ;

    @FindBy(xpath = "//b")
    public WebElement fakerMesajKodu;

}
