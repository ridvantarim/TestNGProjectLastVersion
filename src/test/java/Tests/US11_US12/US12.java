package Tests.US11_US12;

import Pages.US11_US12.US12Pages;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class US12 {
    US12Pages us12Pages = new US12Pages();

    @Test
    public void US12_TC01() {
        Reporter.log("https://hubcomfy.com/ adresine gidildi");
        Reporter.log("vendor olarak giris yapildi");
        ReusableMethods.clickWithTimeOut(us12Pages.myAccountBtn, 5);
        Reporter.log("my account sayfasina gidildi");
        ReusableMethods.clickWithTimeOut(us12Pages.addressBtn, 5);
        Reporter.log("address butonuna tiklandi");
        ReusableMethods.clickWithTimeOut(us12Pages.addBillingAddress, 5);
        Reporter.log("address add butonuna tiklandi");
        us12Pages.firstName.sendKeys(ConfigReader.getProperty("seyma_FirstName"));
        Reporter.log("first name alanina veri girildi");
        Assert.assertEquals(us12Pages.firstName.getAttribute("value"), ConfigReader.getProperty("seyma_FirstName"));
        Reporter.log("girilen first name dogrulandi");

    }

    @Test
    public void US12_TC02() {
        Reporter.log("https://hubcomfy.com/ adresine gidildi");
        Reporter.log("vendor olarak giris yapildi");
        ReusableMethods.clickWithTimeOut(us12Pages.myAccountBtn, 5);
        Reporter.log("my account sayfasina gidildi");
        ReusableMethods.clickWithTimeOut(us12Pages.addressBtn, 5);
        Reporter.log("address butonuna tiklandi");
        ReusableMethods.clickWithTimeOut(us12Pages.addBillingAddress, 5);
        Reporter.log("address add butonuna tiklandi");
        us12Pages.lastName.sendKeys(ConfigReader.getProperty("seyma_LastName"));
        Reporter.log("last name alanina veri girildi");
        Assert.assertEquals(us12Pages.lastName.getAttribute("value"), ConfigReader.getProperty("seyma_LastName"));
        Reporter.log("girilen last name dogrulandi");
    }

    @Test
    public void US12_TC03() {
        Reporter.log("https://hubcomfy.com/ adresine gidildi");
        Reporter.log("vendor olarak giris yapildi");
        ReusableMethods.clickWithTimeOut(us12Pages.myAccountBtn, 5);
        Reporter.log("my account sayfasina gidildi");
        ReusableMethods.clickWithTimeOut(us12Pages.addressBtn, 5);
        Reporter.log("address butonuna tiklandi");
        ReusableMethods.clickWithTimeOut(us12Pages.addBillingAddress, 5);
        Reporter.log("address add butonuna tiklandi");
        ReusableMethods.selecDropdownWithText(us12Pages.countryDropbox, ConfigReader.getProperty("seyma_Country"));
        Reporter.log("country alanina veri girildi");
        Assert.assertEquals(ReusableMethods.selectDropdown(us12Pages.countryDropbox).getFirstSelectedOption().getText(), ConfigReader.getProperty("seyma_Country"));
        Reporter.log("girilen country dogrulandi");

    }

    @Test
    public void US12_TC04() {
        Reporter.log("https://hubcomfy.com/ adresine gidildi");
        Reporter.log("vendor olarak giris yapildi");
        ReusableMethods.clickWithTimeOut(us12Pages.myAccountBtn, 5);
        Reporter.log("my account sayfasina gidildi");
        ReusableMethods.clickWithTimeOut(us12Pages.addressBtn, 5);
        Reporter.log("address butonuna tiklandi");
        ReusableMethods.clickWithTimeOut(us12Pages.addBillingAddress, 5);
        Reporter.log("address add butonuna tiklandi");
        us12Pages.streetAddress.sendKeys(ConfigReader.getProperty("seyma_Street"));
        Reporter.log("Street alanina veri girildi");
        Assert.assertEquals(us12Pages.streetAddress.getAttribute("value"), ConfigReader.getProperty("seyma_Street"));
        Reporter.log("girilen Street dogrulandi");
    }

    @Test
    public void US12_TC05() {
        Reporter.log("https://hubcomfy.com/ adresine gidildi");
        Reporter.log("vendor olarak giris yapildi");
        ReusableMethods.clickWithTimeOut(us12Pages.myAccountBtn, 5);
        Reporter.log("my account sayfasina gidildi");
        ReusableMethods.clickWithTimeOut(us12Pages.addressBtn, 5);
        Reporter.log("address butonuna tiklandi");
        ReusableMethods.clickWithTimeOut(us12Pages.addBillingAddress, 5);
        Reporter.log("address add butonuna tiklandi");
        us12Pages.townCity.sendKeys(ConfigReader.getProperty("seyma_TownCity"));
        Reporter.log("TownCity alanina veri girildi");
        Assert.assertEquals(us12Pages.townCity.getAttribute("value"), ConfigReader.getProperty("seyma_TownCity"));
        Reporter.log("girilen TownCity dogrulandi");
    }

    @Test
    public void US12_TC06() {
        Reporter.log("https://hubcomfy.com/ adresine gidildi");
        Reporter.log("vendor olarak giris yapildi");
        ReusableMethods.clickWithTimeOut(us12Pages.myAccountBtn, 5);
        Reporter.log("my account sayfasina gidildi");
        ReusableMethods.clickWithTimeOut(us12Pages.addressBtn, 5);
        Reporter.log("address butonuna tiklandi");
        ReusableMethods.clickWithTimeOut(us12Pages.addBillingAddress, 5);
        Reporter.log("address add butonuna tiklandi");
        ReusableMethods.selecDropdownWithText(us12Pages.stateNameDropbox, ConfigReader.getProperty("seyma_State"));
        Reporter.log("State alanina veri girildi");
        Assert.assertEquals(ReusableMethods.selectDropdown(us12Pages.stateNameDropbox).getFirstSelectedOption().getText(), ConfigReader.getProperty("seyma_State"));
        Reporter.log("girilen State dogrulandi");
    }

    @Test
    public void US12_TC07() {
        Reporter.log("https://hubcomfy.com/ adresine gidildi");
        Reporter.log("vendor olarak giris yapildi");
        ReusableMethods.clickWithTimeOut(us12Pages.myAccountBtn, 5);
        Reporter.log("my account sayfasina gidildi");
        ReusableMethods.clickWithTimeOut(us12Pages.addressBtn, 5);
        Reporter.log("address butonuna tiklandi");
        ReusableMethods.clickWithTimeOut(us12Pages.addBillingAddress, 5);
        Reporter.log("address add butonuna tiklandi");
        us12Pages.zipCode.sendKeys(ConfigReader.getProperty("seyma_ZipCode"));
        Reporter.log("ZipCode alanina veri girildi");
        Assert.assertEquals(us12Pages.zipCode.getAttribute("value"), ConfigReader.getProperty("seyma_ZipCode"));
        Reporter.log("girilen ZipCode dogrulandi");
    }

    @Test
    public void US12_TC08() {
        Reporter.log("https://hubcomfy.com/ adresine gidildi");
        Reporter.log("vendor olarak giris yapildi");
        ReusableMethods.clickWithTimeOut(us12Pages.myAccountBtn, 5);
        Reporter.log("my account sayfasina gidildi");
        ReusableMethods.clickWithTimeOut(us12Pages.addressBtn, 5);
        Reporter.log("address butonuna tiklandi");
        ReusableMethods.clickWithTimeOut(us12Pages.addBillingAddress, 5);
        Reporter.log("address add butonuna tiklandi");
        us12Pages.phoneNumber.sendKeys(ConfigReader.getProperty("seyma_PhoneNumber"));
        Reporter.log("PhoneNumber alanina veri girildi");
        Assert.assertEquals(us12Pages.phoneNumber.getAttribute("value"), ConfigReader.getProperty("seyma_PhoneNumber"));
        Reporter.log("girilen PhoneNumber dogrulandi");
    }

    @Test
    public void US12_TC09() {
        Reporter.log("https://hubcomfy.com/ adresine gidildi");
        Reporter.log("vendor olarak giris yapildi");
        ReusableMethods.clickWithTimeOut(us12Pages.myAccountBtn, 5);
        Reporter.log("my account sayfasina gidildi");
        ReusableMethods.clickWithTimeOut(us12Pages.addressBtn, 5);
        Reporter.log("address butonuna tiklandi");
        ReusableMethods.clickWithTimeOut(us12Pages.addBillingAddress, 5);
        Reporter.log("address add butonuna tiklandi");
        Assert.assertEquals(ConfigReader.getProperty("seymaMail"), us12Pages.billing_email.getAttribute("value"));
        Reporter.log("girilen mail dogrulandi");

    }

    @Test
    public void US12_TC10() {
        Reporter.log("https://hubcomfy.com/ adresine gidildi");
        Reporter.log("vendor olarak giris yapildi");
        ReusableMethods.clickWithTimeOut(us12Pages.myAccountBtn, 5);
        Reporter.log("my account sayfasina gidildi");
        ReusableMethods.clickWithTimeOut(us12Pages.addressBtn, 5);
        Reporter.log("address butonuna tiklandi");
        ReusableMethods.clickWithTimeOut(us12Pages.addBillingAddress, 5);
        Reporter.log("address add butonuna tiklandi");
        us12Pages.firstName.sendKeys(ConfigReader.getProperty("seyma_FirstName"));
        Reporter.log("first name alanina veri girildi");
        us12Pages.lastName.sendKeys(ConfigReader.getProperty("seyma_LastName"));
        Reporter.log("last name alanina veri girildi");
        ReusableMethods.selecDropdownWithText(us12Pages.countryDropbox, ConfigReader.getProperty("seyma_Country"));
        Reporter.log("country alanina veri girildi");
        us12Pages.streetAddress.sendKeys(ConfigReader.getProperty("seyma_Street"));
        Reporter.log("Street alanina veri girildi");
        us12Pages.townCity.sendKeys(ConfigReader.getProperty("seyma_TownCity"));
        Reporter.log("TownCity alanina veri girildi");
        us12Pages.statebox.sendKeys(ConfigReader.getProperty("seyma_State"));
        Reporter.log("State alanina veri girildi");
        us12Pages.zipCode.sendKeys(ConfigReader.getProperty("seyma_ZipCode"));
        Reporter.log("ZipCode alanina veri girildi");
        us12Pages.phoneNumber.sendKeys(ConfigReader.getProperty("seyma_PhoneNumber"));
        Reporter.log("PhoneNumber alanina veri girildi");
        ReusableMethods.clickWithTimeOut(us12Pages.save_address, 5);
        Reporter.log("save_address butonuna tiklandi");
        Assert.assertEquals("Address changed successfully.", us12Pages.faturaAdresiEklendi.getText());
        Reporter.log("faturanin olusturuldugu dogrulandı");

    }


    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get(ConfigReader.getProperty("appUrl"));
        try {
            us12Pages.singInBtn1.click();
            us12Pages.emailBox.sendKeys(ConfigReader.getProperty("seymaMail"));
            us12Pages.passwordBox.sendKeys(ConfigReader.getProperty("seymaPassword"));
            us12Pages.singInBtn2.click();
        } catch (Exception e) {

        }
    }

    @AfterTest
    public void terDown() {
        Driver.closeDriver();
    }

//Address changed successfully.
}