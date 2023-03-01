package Tests.US09_US10;

import Pages.US09_US10.FakerPage;
import Pages.US09_US10.HomePage;
import Pages.US09_US10.VendorPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class US09 {
    @Test
    public void TC01_login() throws InterruptedException {
        Reporter.log("===================Vendor (Satıcı) olarak siteye kayıt yapabilmeli.=======================");
        VendorPage vendorPage = new VendorPage();
        HomePage homePage = new HomePage();
        FakerPage fakerPage =new FakerPage();

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        homePage.registerButton.click();
        homePage.regUsername.click();
        homePage.become_a_vendor.click();
        Thread.sleep(1000);
        String registerPncr=Driver.getDriver().getWindowHandle();
        Thread.sleep(2000);
        Driver.getDriver().switchTo().newWindow(WindowType.TAB).get(ConfigReader.getProperty("fakerMailUrl"));
        String fakerUrlpncr=Driver.getDriver().getWindowHandle();
        System.out.println(fakerPage.fakerEmail.getText());
        String fakerEmailstr =fakerPage.fakerEmail.getText();
        Driver.getDriver().switchTo().window(registerPncr);
        Thread.sleep(1000);
        vendorPage.vendorEmail.sendKeys(fakerEmailstr, Keys.TAB);
        Thread.sleep(1000);
        //vendorPage.verificationCode.click();

        Driver.getDriver().switchTo().window(fakerUrlpncr);
        Thread.sleep(1000);
        Driver.getDriver().navigate().refresh();
        fakerPage.fakerMesaj.click();
        Thread.sleep(2000);

        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.id("iframeMail")));
        Thread.sleep(2000);
        String mesajKodu = fakerPage.fakerMesajKodu.getText();
        System.out.println("mesajKodu : " + mesajKodu );

        Driver.getDriver().switchTo().window(registerPncr);
        Thread.sleep(2000);
        Assert.assertTrue(vendorPage.verificationmesaj.isDisplayed());
        vendorPage.verificationCode.sendKeys(mesajKodu);
        vendorPage.password.sendKeys(ConfigReader.getProperty("vendorpassword"));
        vendorPage.confirm_Pwd.sendKeys(ConfigReader.getProperty("vendorpassword"));
        vendorPage.registerButton.click();
        Assert.assertTrue(vendorPage.yeniKayit.isDisplayed());
        Driver.closeDriver();
        Thread.sleep(2000);
        Reporter.log("===============Vendor olarak kayıt yapıldı===================");

    }
    @Test
    public void TC03_loginKayitli() throws InterruptedException {
        Reporter.log("=================Kullanıcı kayıtlı  Vendor olarak giriş yapar ====================");
        VendorPage vendorPage = new VendorPage();
        HomePage homePage = new HomePage();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        homePage.registerButton.click();
        homePage.regUsername.click();
        homePage.become_a_vendor.click();
        Thread.sleep(1000);
        vendorPage.vendorEmail.sendKeys(ConfigReader.getProperty("vendoremail"));
        vendorPage.verificationCode.sendKeys(ConfigReader.getProperty("vendorverification"));
        vendorPage.password.sendKeys(ConfigReader.getProperty("vendorpassword"));
        vendorPage.confirm_Pwd.sendKeys(ConfigReader.getProperty("vendorpassword"));
        Thread.sleep(1000);
        vendorPage.confirm_Pwd.sendKeys(Keys.TAB,Keys.ENTER);
        Thread.sleep(2000);
        Assert.assertTrue(vendorPage.kayitli.isDisplayed());
        Thread.sleep(1000);
        Driver.closeDriver();
        Reporter.log("==================kayıtlı  Vendor olarak giriş yapıldı. =====================");
    }
}
