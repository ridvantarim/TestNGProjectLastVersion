package Utilities;

import Pages.US18Pages.FakeMailHomePage;
import Pages.US18Pages.HomePage18_19_20;
import Pages.US18Pages.LoginPage18_19_20;
import Pages.US18Pages.StoreManagerPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;

public class US18_19_20Methods {
    static FakeMailHomePage fakeMailHomePage;
    static HomePage18_19_20 homePage18_19_20;
    static LoginPage18_19_20 loginPage18_19_20;
    static StoreManagerPage storeManagerPage;
    static Faker faker;
    static Actions actions;


    public static void vendorGiris() {
        homePage18_19_20 = new HomePage18_19_20();
        fakeMailHomePage = new FakeMailHomePage();
        Driver.getDriver().get(ConfigReader.getProperty("appUrl"));
        String windowhandleHubcomfy = Driver.getDriver().getWindowHandle();
        homePage18_19_20.register.click();
        homePage18_19_20.signAsVendor.click();
        Driver.getDriver().switchTo().newWindow(WindowType.WINDOW);
        Driver.getDriver().get(ConfigReader.getProperty("fakeUrl"));
        String windowhandleFakemail = Driver.getDriver().getWindowHandle();
        fakeMailHomePage.copy.click();
        Driver.getDriver().switchTo().window(windowhandleHubcomfy);
        homePage18_19_20.userEmail.sendKeys(Keys.CONTROL + "V");
        homePage18_19_20.resendcode.click();
        Driver.getDriver().switchTo().window(windowhandleFakemail);
        ReusableMethods.waitFor(10);
        fakeMailHomePage.mailCheck.click();
        Driver.getDriver().switchTo().frame(1);
        System.out.println(Driver.getDriver().getTitle());
        String num = fakeMailHomePage.checkNum.getText();
        Driver.getDriver().switchTo().window(windowhandleHubcomfy);
        homePage18_19_20.verificationcode.sendKeys(num, Keys.TAB, Keys.TAB);
        faker = new Faker();
        String pass = faker.internet().password();
        homePage18_19_20.password.sendKeys(pass, Keys.TAB, pass, Keys.TAB);
        homePage18_19_20.registerBut.click();
        ReusableMethods.waitFor(10);
        homePage18_19_20.letsgo.click();
        ReusableMethods.waitFor(10);
        homePage18_19_20.continues.click();
        ReusableMethods.waitFor(10);
        homePage18_19_20.continues.click();
        ReusableMethods.waitFor(10);
        homePage18_19_20.continues.click();
        ReusableMethods.waitFor(10);
        homePage18_19_20.continues.click();
        ReusableMethods.waitFor(10);
        homePage18_19_20.continues.click();
        ReusableMethods.waitFor(10);
        homePage18_19_20.letsgotodashboard.click();
        ReusableMethods.waitFor(10);


    }

    public static void vendorKayitliGiris() {
        Driver.getDriver().get(ConfigReader.getProperty("appUrl"));
        homePage18_19_20 = new HomePage18_19_20();
        loginPage18_19_20 = new LoginPage18_19_20();
        homePage18_19_20.signin.click();
        loginPage18_19_20.username.sendKeys(ConfigReader.getProperty("vendormail"), Keys.TAB);
        loginPage18_19_20.pass.sendKeys(ConfigReader.getProperty("vendorpassword"), Keys.TAB);
        loginPage18_19_20.loginbutton.click();
        ReusableMethods.waitFor(10);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.scrollTo(0,document.body.scrollHeight)");
        ReusableMethods.waitFor(5);
        homePage18_19_20.myaccount.click();
        homePage18_19_20.storemanager.click();

    }

    public static void addNewProduct() {
        storeManagerPage = new StoreManagerPage();

        ReusableMethods.clickWithJS(storeManagerPage.products);
        ReusableMethods.waitFor(10);
        ReusableMethods.clickJS(storeManagerPage.productAddNew);

    }
    public static void vendorKayitliGirisAnasayfa(){
        Driver.getDriver().get(ConfigReader.getProperty("appUrl"));
        homePage18_19_20 = new HomePage18_19_20();
        loginPage18_19_20 = new LoginPage18_19_20();
        homePage18_19_20.signin.click();
        loginPage18_19_20.username.sendKeys(ConfigReader.getProperty("vendormail"), Keys.TAB);
        loginPage18_19_20.pass.sendKeys(ConfigReader.getProperty("vendorpassword"), Keys.TAB);
        loginPage18_19_20.loginbutton.click();
        ReusableMethods.waitFor(10);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.scrollTo(0,document.body.scrollHeight)");
        ReusableMethods.waitFor(5);
        homePage18_19_20.myaccount.click();
    }
}
