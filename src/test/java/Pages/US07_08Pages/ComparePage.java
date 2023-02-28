package Pages.US07_08Pages;


import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.Driver;

import java.util.List;

public class ComparePage {

    public ComparePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='product-media']")
    public List<WebElement> secili4Urun;

    @FindBy(xpath = "//*[@class='w-icon-times-solid']")
    public List<WebElement> hepsiniSil;

    @FindBy(xpath = "(//h2)[2] ")
    public WebElement urunYok;

    @FindBy(xpath = "//*[@class='w-icon-times-solid']")
    public WebElement xButton1;

    @FindBy(xpath = "(//*[@class='w-icon-times-solid'])[1]")
    public WebElement xButton2;

    @FindBy(xpath = "(//*[@class='w-icon-times-solid'])[2]")
    public WebElement xButton3;

    @FindBy(xpath = "(//*[@class='w-icon-times-solid'])[3]")
    public WebElement xButton4;
}

