package Tests.US01_US02;

import Pages.US01_US02.HomePage;
import Pages.US01_US02.LoginPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class US_02 {
    @Test
    public void login() {
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();
        Driver.getDriver().get(ConfigReader.getProperty("appUrl"));
        homePage.signInButton.click();
        loginPage.signUpButton.click();
        loginPage.username.click();
        loginPage.username.sendKeys(ConfigReader.getProperty("us-02username"));
        loginPage.username.isDisplayed();
        Reporter.log("USERNAME GİRİLDİ");
        loginPage.email.click();
        loginPage.email.sendKeys(ConfigReader.getProperty("us-02email"));
        loginPage.email.isDisplayed();
        Reporter.log("EMAIL GİRİLDİ");
        loginPage.password.click();
        loginPage.password.sendKeys(ConfigReader.getProperty("password"));
        loginPage.password.isDisplayed();
        Reporter.log("PASSWORD GİRİLDİ");
        loginPage.registerPolicy.click();
        loginPage.registerPolicy.isDisplayed();
        Reporter.log("REGISTER POLİCY KUTUSU TIKLANDI");
        loginPage.submitButton.click();
        loginPage.submitButton.isEnabled();
        Reporter.log("SIGN BUTONUNA TIKLANDI");
        loginPage.kayıtlı.isDisplayed();
        Reporter.log("ZATEN KAYITLI YAZISI GÖRÜLDÜ");
        Driver.closeDriver();

    }
}
