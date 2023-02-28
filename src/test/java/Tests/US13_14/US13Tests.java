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
    Pages.US13_14Pages.HomePage homePage = new Pages.US13_14Pages.HomePage();
    Pages.US13_14Pages.LoginPage loginPage = new Pages.US13_14Pages.LoginPage();
    Pages.US13_14Pages.MyAccountPage myAccountPage = new Pages.US13_14Pages.MyAccountPage();
    Pages.US13_14Pages.AddressesPage addressesPage =new Pages.US13_14Pages.AddressesPage();


    @Test
    public void US13_TC01() { //First name girilmeli
        Reporter.log("============== TC01 First name girilmeli ==============");
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
        Reporter.log("GIRILEN DEGER DOGRULANDI");

    }
    @Test
    public void US13_TC02() { //Last name, girilmeli
        Reporter.log("============== TC02 Last name girilmeli ==============");
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        Reporter.log("MY ACCOUNT SAYFASINA GIDILDI");
        ReusableMethods.clickWithTimeOut(myAccountPage.addressBtn, 5);
        Reporter.log("ADDRESS BUTONUNA TIKLANDI");
        ReusableMethods.clickWithTimeOut(addressesPage.shipAddressAddBtn, 5);
        Reporter.log("ADD BUTONUNA TIKLANDI");
        addressesPage.shipAddLastName.sendKeys(ConfigReader.getProperty("ihsan_LastName"));
        Reporter.log("LAST NAME ALANINA VERI GIRILDI");
        Assert.assertEquals(addressesPage.shipAddLastName.getAttribute("value"),ConfigReader.getProperty("ihsan_LastName"));
        Reporter.log("GIRILEN DEGER DOGRULANDI");
    }
    @Test
    public void US13_TC03() { //"Country / Region", girilmeli
        Reporter.log("============== TC03 Country / Region girilmeli ==============");
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        Reporter.log("MY ACCOUNT SAYFASINA GIDILDI");
        ReusableMethods.clickWithTimeOut(myAccountPage.addressBtn, 5);
        Reporter.log("ADDRESS BUTONUNA TIKLANDI");
        ReusableMethods.clickWithTimeOut(addressesPage.shipAddressAddBtn, 5);
        Reporter.log("ADD BUTONUNA TIKLANDI");
        ReusableMethods.selecDropdownWithText(addressesPage.shipAddCountry, ConfigReader.getProperty("ihsan_Country"));
        Reporter.log("COUNTRY ALANINA VERI GIRILDI");
        Assert.assertEquals(ReusableMethods.selectDropdown(addressesPage.shipAddCountry).getFirstSelectedOption().getText(),ConfigReader.getProperty("ihsan_Country"));
        Reporter.log("GIRILEN DEGER DOGRULANDI");
    }

    @Test
    public void US13_TC04() { //"Street address", girilmeli
        Reporter.log("============== TC04 Street address girilmeli ==============");
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        Reporter.log("MY ACCOUNT SAYFASINA GIDILDI");
        ReusableMethods.clickWithTimeOut(myAccountPage.addressBtn, 5);
        Reporter.log("ADDRESS BUTONUNA TIKLANDI");
        ReusableMethods.clickWithTimeOut(addressesPage.shipAddressAddBtn, 5);
        Reporter.log("ADD BUTONUNA TIKLANDI");
        addressesPage.shipStreetAddressBox.sendKeys(ConfigReader.getProperty("ihsan_Street"));
        Reporter.log("STREET ALANINA VERI GIRILDI");
        Assert.assertEquals(addressesPage.shipStreetAddressBox.getAttribute("value"),ConfigReader.getProperty("ihsan_Street"));
        Reporter.log("GIRILEN DEGER DOGRULANDI");
    }

    @Test
    public void US13_TC05() { //"Town / City" , girilmeli +

        Reporter.log("============== TC05 Town / City girilmeli ==============");
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        Reporter.log("MY ACCOUNT SAYFASINA GIDILDI");
        ReusableMethods.clickWithTimeOut(myAccountPage.addressBtn, 5);
        Reporter.log("ADDRESS BUTONUNA TIKLANDI");
        ReusableMethods.clickWithTimeOut(addressesPage.shipAddressAddBtn, 5);
        Reporter.log("ADD BUTONUNA TIKLANDI");
        addressesPage.shipTownCityBox.sendKeys(ConfigReader.getProperty("ihsan_TownCity"));
        Reporter.log("TOWN CITY ALANINA VERI GIRILDI");
        Assert.assertEquals(addressesPage.shipTownCityBox.getAttribute("value"),ConfigReader.getProperty("ihsan_TownCity"));
        Reporter.log("GIRILEN DEGER DOGRULANDI");
    }

    @Test
    public void US13_TC06() {

        Reporter.log("============== TC06 State / County girilmeli ==============");
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        Reporter.log("MY ACCOUNT SAYFASINA GIDILDI");
        ReusableMethods.clickWithTimeOut(myAccountPage.addressBtn, 5);
        Reporter.log("ADDRESS BUTONUNA TIKLANDI");
        ReusableMethods.clickWithTimeOut(addressesPage.shipAddressAddBtn, 5);
        Reporter.log("ADD BUTONUNA TIKLANDI");
        ReusableMethods.selecDropdownWithText(addressesPage.shipStateBox, ConfigReader.getProperty("ihsan_State"));
        Reporter.log("STATE ALANINA VERI GIRILDI");
        Assert.assertEquals(ReusableMethods.selectDropdown(addressesPage.shipStateBox).getFirstSelectedOption().getText(),ConfigReader.getProperty("ihsan_State"));
        Reporter.log("GIRILEN DEGER DOGRULANDI");
    }

    @Test
    public void US13_TC07() { //Postcode / ZIP, girilmeli

        Reporter.log("============== TC07 Country / Region girilmeli ==============");
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        Reporter.log("MY ACCOUNT SAYFASINA GIDILDI");
        ReusableMethods.clickWithTimeOut(myAccountPage.addressBtn, 5);
        Reporter.log("ADDRESS BUTONUNA TIKLANDI");
        ReusableMethods.clickWithTimeOut(addressesPage.shipAddressAddBtn, 5);
        Reporter.log("ADD BUTONUNA TIKLANDI");
        addressesPage.shipZipBox.sendKeys(ConfigReader.getProperty("ihsan_ZipCode"));
        Reporter.log("ZIP ALANINA VERI GIRILDI");
        Assert.assertEquals(addressesPage.shipZipBox.getAttribute("value"),ConfigReader.getProperty("ihsan_ZipCode"));
        Reporter.log("GIRILEN DEGER DOGRULANDI");
    }

    @Test
    public void US13_TC08() {
        Reporter.log("============== TC08 First name, Last name, Country/Region, Street address, Town / City, State ve ZIP Code  girilmeli. Save Address butonuna tıklayarak Shipping Addrese (Teslimat Adresi) eklenmeli ==============");
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        Reporter.log("MY ACCOUNT SAYFASINA GIDILDI");
        ReusableMethods.clickWithTimeOut(myAccountPage.addressBtn, 5);
        Reporter.log("ADDRESS BUTONUNA TIKLANDI");
        ReusableMethods.clickWithTimeOut(addressesPage.shipAddressAddBtn, 5);
        Reporter.log("ADD BUTONUNA TIKLANDI");
        addressesPage.shipAddFirstName.sendKeys(ConfigReader.getProperty("ihsan_FirstName"));
        Reporter.log("FIRST NAME ALANINA VERI GIRILDI");
        addressesPage.shipAddLastName.sendKeys(ConfigReader.getProperty("ihsan_LastName"));
        Reporter.log("LAST NAME ALANINA VERI GIRILDI");
        ReusableMethods.selecDropdownWithText(addressesPage.shipAddCountry, ConfigReader.getProperty("ihsan_Country"));
        Reporter.log("COUNTRY ALANINA VERI GIRILDI");
        addressesPage.shipStreetAddressBox.sendKeys(ConfigReader.getProperty("ihsan_Street"));
        Reporter.log("STREET ALANINA VERI GIRILDI");
        addressesPage.shipTownCityBox.sendKeys(ConfigReader.getProperty("ihsan_TownCity"));
        Reporter.log("TOWN CITY ALANINA VERI GIRILDI");
        addressesPage.shipStateBox.sendKeys(ConfigReader.getProperty("ihsan_State"));
        Reporter.log("STATE ALANINA VERI GIRILDI");
        addressesPage.shipZipBox.sendKeys(ConfigReader.getProperty("ihsan_ZipCode"));
        Reporter.log("ZIP ALANINA VERI GIRILDI");
        ReusableMethods.clickWithTimeOut(addressesPage.shipSaveAddBtn, 5);
        Reporter.log("SAVE BUTONUNA TIKLANDI");
        Assert.assertEquals("Address changed successfully.", addressesPage.saveMessage.getText());
        Reporter.log("ADRES BASARI ILE EKLENDI MESAJI DOGRULANDI");
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
