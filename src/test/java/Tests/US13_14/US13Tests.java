package Tests.US13_14;

        import org.testng.Assert;
        import org.testng.Reporter;
        import org.testng.annotations.AfterTest;
        import org.testng.annotations.BeforeMethod;
        import org.testng.annotations.Test;
        import Utilities.ConfigReader;
        import Utilities.Driver;
        import Utilities.ReusableMethods;

public class US13Tests {
    pages.US13_14Pages.HomePage homePage = new pages.US13_14Pages.HomePage();
    pages.US13_14Pages.LoginPage loginPage = new pages.US13_14Pages.LoginPage();
    pages.US13_14Pages.MyAccountPage myAccountPage = new pages.US13_14Pages.MyAccountPage();
    pages.US13_14Pages.AddressesPage addressesPage =new pages.US13_14Pages.AddressesPage();


    @Test
    public void US13_TC01() { //First name girilmeli +
        Reporter.log("https://hubcomfy.com/ ADRESINE GIDILDI");
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        Reporter.log("MY ACCOUNT SAYFASINA GIDILDI");
        ReusableMethods.clickWithTimeOut(myAccountPage.addressBtn, 5);
        Reporter.log("ADDRESS BUTONUNA TIKLANDI");
        ReusableMethods.clickWithTimeOut(addressesPage.shipAddressAddBtn, 5);
        Reporter.log("ADD BUTONUNA TIKLANDI");
        addressesPage.shipAddFirstName.sendKeys(ConfigReader.getProperty("ihsan_FirstName"));
        Reporter.log("FIRST NAME ALANINA VERI GIRILDI");
        Assert.assertEquals(addressesPage.shipAddFirstName.getAttribute("value"),ConfigReader.getProperty("ihsan_FirstName"));
        Reporter.log("GIRILR DEGER DOGRULANDI");

    }
    @Test
    public void US13_TC02() { //Last name, girilmeli +try {
        Reporter.log("https://hubcomfy.com/ ADRESINE GIDILDI");
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        Reporter.log("MY ACCOUNT SAYFASINA GIDILDI");
        ReusableMethods.clickWithTimeOut(myAccountPage.addressBtn, 5);
        Reporter.log("ADDRESS BUTONUNA TIKLANDI");
        ReusableMethods.clickWithTimeOut(addressesPage.shipAddressAddBtn, 5);
        addressesPage.shipAddLastName.sendKeys(ConfigReader.getProperty("ihsan_LastName"));
        Reporter.log("LAST NAME ALANINA VERI GIRILDI");
        Assert.assertEquals(addressesPage.shipAddLastName.getAttribute("value"),ConfigReader.getProperty("ihsan_LastName"));
        Reporter.log("GIRILR DEGER DOGRULANDI");    }
    @Test
    public void US13_TC03() { //"Country / Region", girilmeli +

        Reporter.log("https://hubcomfy.com/ ADRESINE GIDILDI");
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        Reporter.log("MY ACCOUNT SAYFASINA GIDILDI");
        ReusableMethods.clickWithTimeOut(myAccountPage.addressBtn, 5);
        Reporter.log("ADDRESS BUTONUNA TIKLANDI");
        ReusableMethods.clickWithTimeOut(addressesPage.shipAddressAddBtn, 5);
        ReusableMethods.selecDropdownWithText(addressesPage.shipAddCountry, ConfigReader.getProperty("ihsan_Country"));
        Assert.assertEquals(ReusableMethods.selectDropdown(addressesPage.shipAddCountry).getFirstSelectedOption().getText(),ConfigReader.getProperty("ihsan_Country"));

    }

    @Test
    public void US13_TC04() { //"Street address", girilmeli +

        Reporter.log("https://hubcomfy.com/ ADRESINE GIDILDI");
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        Reporter.log("MY ACCOUNT SAYFASINA GIDILDI");
        ReusableMethods.clickWithTimeOut(myAccountPage.addressBtn, 5);
        Reporter.log("ADDRESS BUTONUNA TIKLANDI");
        ReusableMethods.clickWithTimeOut(addressesPage.shipAddressAddBtn, 5);
        addressesPage.shipStreetAddressBox.sendKeys(ConfigReader.getProperty("ihsan_Street"));
        Assert.assertEquals(addressesPage.shipStreetAddressBox.getAttribute("value"),ConfigReader.getProperty("ihsan_Street"));

    }

    @Test
    public void US13_TC05() { //"Town / City" , girilmeli +

        Reporter.log("https://hubcomfy.com/ ADRESINE GIDILDI");
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        Reporter.log("MY ACCOUNT SAYFASINA GIDILDI");
        ReusableMethods.clickWithTimeOut(myAccountPage.addressBtn, 5);
        Reporter.log("ADDRESS BUTONUNA TIKLANDI");
        ReusableMethods.clickWithTimeOut(addressesPage.shipAddressAddBtn, 5);
        addressesPage.shipTownCityBox.sendKeys(ConfigReader.getProperty("ihsan_TownCity"));
        Assert.assertEquals(addressesPage.shipTownCityBox.getAttribute("value"),ConfigReader.getProperty("ihsan_TownCity"));

    }

    @Test
    public void US13_TC06() { //State / County, girilmeli +

        Reporter.log("https://hubcomfy.com/ ADRESINE GIDILDI");
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        Reporter.log("MY ACCOUNT SAYFASINA GIDILDI");
        ReusableMethods.clickWithTimeOut(myAccountPage.addressBtn, 5);
        Reporter.log("ADDRESS BUTONUNA TIKLANDI");
        ReusableMethods.clickWithTimeOut(addressesPage.shipAddressAddBtn, 5);
        ReusableMethods.selecDropdownWithText(addressesPage.shipStateBox, ConfigReader.getProperty("ihsan_State"));
        Assert.assertEquals(ReusableMethods.selectDropdown(addressesPage.shipStateBox).getFirstSelectedOption().getText(),ConfigReader.getProperty("ihsan_State"));

    }

    @Test
    public void US13_TC07() { //Postcode / ZIP, girilmeli

        Reporter.log("https://hubcomfy.com/ ADRESINE GIDILDI");
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        Reporter.log("MY ACCOUNT SAYFASINA GIDILDI");
        ReusableMethods.clickWithTimeOut(myAccountPage.addressBtn, 5);
        Reporter.log("ADDRESS BUTONUNA TIKLANDI");
        ReusableMethods.clickWithTimeOut(addressesPage.shipAddressAddBtn, 5);
        addressesPage.shipZipBox.sendKeys(ConfigReader.getProperty("ihsan_ZipCode"));
        Assert.assertEquals(addressesPage.shipZipBox.getAttribute("value"),ConfigReader.getProperty("ihsan_ZipCode"));

    }

    @Test
    public void US13_TC08() { //First name, Last name, Country/Region, Street address, Town / City, State ve ZIP Code  girilmeli. Save Address butonuna tıklayarak Shipping Addrese (Teslimat Adresi) eklenmeli +

        Reporter.log("https://hubcomfy.com/ ADRESINE GIDILDI");
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        Reporter.log("MY ACCOUNT SAYFASINA GIDILDI");
        ReusableMethods.clickWithTimeOut(myAccountPage.addressBtn, 5);
        Reporter.log("ADDRESS BUTONUNA TIKLANDI");
        ReusableMethods.clickWithTimeOut(addressesPage.shipAddressAddBtn, 5);
        addressesPage.shipAddFirstName.sendKeys(ConfigReader.getProperty("ihsan_FirstName"));
        addressesPage.shipAddLastName.sendKeys(ConfigReader.getProperty("ihsan_LastName"));
        ReusableMethods.selecDropdownWithText(addressesPage.shipAddCountry, ConfigReader.getProperty("ihsan_Country"));
        addressesPage.shipStreetAddressBox.sendKeys(ConfigReader.getProperty("ihsan_Street"));
        addressesPage.shipTownCityBox.sendKeys(ConfigReader.getProperty("ihsan_TownCity"));
        addressesPage.shipStateBox.sendKeys(ConfigReader.getProperty("ihsan_State"));
        addressesPage.shipZipBox.sendKeys(ConfigReader.getProperty("ihsan_ZipCode"));
        ReusableMethods.clickWithTimeOut(addressesPage.shipSaveAddBtn, 5);
        Assert.assertEquals("Address changed successfully.", addressesPage.saveMessage.getText());

    }

    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get(ConfigReader.getProperty("appUrl"));
        try {
            homePage.singInBtn1.click();
            loginPage.emailBox.sendKeys(ConfigReader.getProperty("ihsanMail"));
            loginPage.passwordBox.sendKeys(ConfigReader.getProperty("ihsanPassword"));
            loginPage.singInBtn2.click();
        } catch (Exception e) {

        }
    }

    @AfterTest
    public void terDown() {
        Driver.closeDriver();
    }
}
