package Tests.US09_US10;

import Pages.US09_US10.HomePage;
import Pages.US09_US10.VendorPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class US10 {
    @Test
    public void login() throws InterruptedException {
        Reporter.log("Password seviyeleri görülebilmeli (Vendor Kaydı için)");
        VendorPage loginPage = new VendorPage();
        HomePage homePage = new HomePage();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        homePage.registerButton.click();
        homePage.regUsername.click();
        homePage.become_a_vendor.click();
        Thread.sleep(1000);
        loginPage.vendorEmail.sendKeys(ConfigReader.getProperty("vendoremail"));
        loginPage.verificationCode.sendKeys(ConfigReader.getProperty("vendorverification"));
        loginPage.password.sendKeys(ConfigReader.getProperty("short.pwd"));
        Assert.assertTrue(loginPage.tooShort.isDisplayed());
        Thread.sleep(3000);
        loginPage.password.sendKeys(ConfigReader.getProperty("weak.pwd"));
        Assert.assertTrue(loginPage.weak.isDisplayed());
        Thread.sleep(3000);
        loginPage.password.sendKeys(ConfigReader.getProperty("good.pwd"));
        Assert.assertTrue(loginPage.good.isDisplayed());
        Thread.sleep(3000);
        loginPage.password.sendKeys(ConfigReader.getProperty("strong.pwd"));
        Assert.assertTrue(loginPage.strong.isDisplayed());
        Driver.closeDriver();
        Reporter.log("Password seviyesi gözüküyor.");
    }
}
