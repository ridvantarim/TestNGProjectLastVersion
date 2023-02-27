package pages.US13_14Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ChooseImagePage {
    public ChooseImagePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='__wp-uploader-id-1']") public WebElement selectFilesBtn;
    @FindBy(xpath= "//*[text()='Media Library']") public WebElement mediaLibraryBtn;
    @FindBy(xpath = "(//*[@draggable='false'])[1]") public WebElement image1;
    @FindBy(xpath="//*[text()='Select']") public WebElement selectBtn;
}
