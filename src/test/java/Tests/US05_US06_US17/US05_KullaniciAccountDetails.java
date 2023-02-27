package Tests.US05_US06_US17;
import Pages.US05_US06_US17.MyAccount;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import pages.US05_US06_US17.HomePage;


public class US05_KullaniciAccountDetails {

    HomePage homePage;
    MyAccount myAccount;

    @Test(priority = 1)
    public void AccountDetailsIsDisplayedTest() {

//  Kullanici https://hubcomfy.com/ adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("appUrl"));

        homePage = new HomePage();
        myAccount = new MyAccount();
//  Kullanici "Sign In" butonuna tıklar
        homePage.signInButton.click();

//  Kullanıcı, giriş için gerekli bilgileri doldurur ve "SIGN IN" butonuna tıklar
        homePage.usernameText.sendKeys(ConfigReader.getProperty("username"));
        homePage.passwordText.sendKeys(ConfigReader.getProperty("userpassword"));
        homePage.signInClick.click();

//  Kullanici "Account details" butonuna tıklar
        ReusableMethods.waitFor(3);
        ReusableMethods.scrollIntoViewJS(homePage.myAccount);
        ReusableMethods.clickByJS(homePage.myAccount);
        ReusableMethods.scrollIntoViewJS(myAccount.accountDetails);
        ReusableMethods.clickByJS(myAccount.accountDetails);

//  Kullanici Account details alanındaki bilgilerin görünür olduğunu doğrular
        ReusableMethods.scrollIntoViewJS(myAccount.accountDetailsISDisplayed);
        Assert.assertTrue(myAccount.accountDetailsISDisplayed.isDisplayed());


    }

    @Test(priority = 2)
    public void changeAccountInformation() {

//  Kullanıcı belirtilen hesap bilgilerini(First name, Last name, Display name ve Email address) değiştirebilmelidir
        myAccount.accountFirstName.clear();
        myAccount.accountFirstName.sendKeys("ridvan");

        myAccount.accountLastName.clear();
        myAccount.accountLastName.sendKeys("qa");

        myAccount.accountDisplayName.clear();
        myAccount.accountDisplayName.sendKeys("BecomeQA");

        myAccount.accountEmail.clear();
        myAccount.accountEmail.sendKeys("tramel.teagan@foundtoo.com");

        ReusableMethods.clickByJS(myAccount.saveChangesButton);

        ReusableMethods.waitFor(2);
        Assert.assertTrue(myAccount.successfully.isDisplayed());
    }

    @Test(priority = 3)
    public void changeBiography() {

        Driver.getDriver().switchTo().frame(0);
        myAccount.biography.clear();
        myAccount.biography.sendKeys("Biography Example");

        Driver.getDriver().switchTo().parentFrame();
        ReusableMethods.clickByJS(myAccount.saveChangesButton);

        ReusableMethods.waitFor(2);
        Assert.assertTrue(myAccount.successfully.isDisplayed());


    }

    @Test(priority = 4)
    public void changePassword() {

        myAccount.currentPassword.sendKeys("manueltest1234.");
        myAccount.newPassword.sendKeys("gucluSifre");
        myAccount.confirmPassword.sendKeys("gucluSifre");

        ReusableMethods.clickByJS(myAccount.saveChangesButton);

        ReusableMethods.waitFor(2);
        Assert.assertTrue(myAccount.successfully.isDisplayed());
    }

    @AfterClass
    public void tearDown() {

        Driver.closeDriver();
    }

}
