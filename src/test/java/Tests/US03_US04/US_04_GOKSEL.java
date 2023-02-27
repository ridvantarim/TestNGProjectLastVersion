package Tests.US03_US04;

import Pages.US03_US04.*;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


import java.io.IOException;

public class US_04_GOKSEL {

    SignPage signPage;
    MyAccountPage myAccountPage;
    SavePage savePage;
    BillingAddressPage billingAddressPage;
    ShippingAddressPage shippingAddressPage;
    Actions actions;EditPage editPage;

    public void TestCaselogin() {
        signPage = new SignPage();myAccountPage = new MyAccountPage();savePage = new SavePage();billingAddressPage = new BillingAddressPage();
        shippingAddressPage = new ShippingAddressPage();actions = new Actions(Driver.getDriver());editPage = new EditPage();
        try {
            Driver.getDriver().get(ConfigReader.getProperty("humcomfy_url"));
            ReusableMethods.waitFor(2);
            signPage.ilkSignınButonu.click();
            ReusableMethods.waitFor(2);
            signPage.girisSayfasıUsername.sendKeys(ConfigReader.getProperty("username_hubcomfy"));
            ReusableMethods.waitFor(2);
            signPage.girisSayfasıPassword.sendKeys(ConfigReader.getProperty("password_hubcomfy"));
            ReusableMethods.waitFor(2);
            signPage.girisRememberMeButonu.click();
            ReusableMethods.waitFor(2);
            signPage.parolaKaydıSigninButonu.click();
            ReusableMethods.waitFor(2);
            myAccountPage.signOutButonu.click();
        } catch (Exception e) {

        }
        try {
            myAccountPage.signOutButonu.click();
        } catch (Exception e) {
        }
    }
    public void shippingCountry(){
        signPage = new SignPage();myAccountPage = new MyAccountPage();savePage = new SavePage();billingAddressPage = new BillingAddressPage();
        actions = new Actions(Driver.getDriver());editPage=new EditPage();
        try {

            shippingAddressPage.shippingCountry1.click();
            ReusableMethods.waitFor(2);
            shippingAddressPage.shippingCountry2.sendKeys("Turkey",Keys.ENTER);
        } catch (Exception e) {

        }
        try {
            shippingAddressPage.shippingCountry3.click();
            ReusableMethods.waitFor(2);
            shippingAddressPage.shippingCountry4.sendKeys("Turkey",Keys.ENTER);
        } catch (Exception e) {
        }
    }


    public void shippingProvince(){
        signPage = new SignPage();myAccountPage = new MyAccountPage();savePage = new SavePage();billingAddressPage = new BillingAddressPage();
        actions = new Actions(Driver.getDriver());editPage=new EditPage();
        try {
            shippingAddressPage.shippingProvince1.click();
            ReusableMethods.waitFor(2);
            shippingAddressPage.shippingProvince2.sendKeys("Samsun",Keys.ENTER);
        } catch (Exception e) {

        }
        try {
            shippingAddressPage.shippingProvince3.click();
            ReusableMethods.waitFor(2);
            shippingAddressPage.shippingProvince4.sendKeys("Samsun",Keys.ENTER);

        } catch (Exception e) {
        }
    }

    public void clearMethod(){
        shippingAddressPage.shippingFirstName.clear();
        shippingAddressPage.shippingLastName.clear();
        shippingAddressPage.shippingCompanyName.clear();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        shippingAddressPage.shippingStreetAdres.clear();
        shippingAddressPage.shippingApartman.clear();
        shippingAddressPage.shippingZIPCode.clear();
        shippingAddressPage.shippingTownCity.clear();

    }

    @Test(priority=1)
    public void TestUS4_TC1_01() throws IOException {
        TestCaselogin();
        Reporter.log("KULLANICI LOGİN OLUR.");
        ReusableMethods.waitFor(2);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://hubcomfy.com/"));
        Reporter.log("KULLANICI BAŞARILI SEKİLDE ANASAYFAYA GİRİS YAPAR.");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(shippingAddressPage.myAccountYazisi.isDisplayed());
        Reporter.log("KULLANICI MYACCOUNT SAYFASININ ACILDIGINI GÖRÜR.");
        ReusableMethods.waitFor(2);
        Assert.assertTrue(myAccountPage.adressesButonu.isDisplayed());
        Reporter.log("KULLANICI ADDRESS LİNKİNİ GÖRÜR.");
        ReusableMethods.waitFor(2);
        myAccountPage.adressesButonu.click();
        Reporter.log("KULLANICI ADRESS LİNKİNE TIKLAR.");
        ReusableMethods.waitFor(2);
        Assert.assertTrue(savePage.shippingAdresYazisi.isDisplayed());
        Reporter.log("KULLANICI SHİPPİNG ADRESS BASLIGINI GÖRÜR.");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(savePage.shippingAddButonu.isDisplayed());
        Reporter.log("KULLANICI ADD BUTONUNU GÖRÜNTÜLER.");
        ReusableMethods.waitFor(2);
        savePage.shippingAddButonu.click();
        Reporter.log("KULLANICI SHİPPİNG ADD BUTONUNU TIKLAR.");
        ReusableMethods.waitFor(2);
        Assert.assertTrue(shippingAddressPage.shippingFirstName.isDisplayed());
        Reporter.log("KULLANICI SHİPPİNG ADDRESS ALT MENULERİNİ GÖRÜNTÜLER.");
    }



    @Test(priority=2)
    public void TestUS4_TC1_02() throws IOException {


        TestCaselogin();
        Reporter.log("KULLANICI LOGİN OLUR.");
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://hubcomfy.com/"));
        Reporter.log("KULLANICI BAŞARILI SEKİLDE ANASAYFAYA GİRİS YAPAR.");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        Reporter.log("KULLANICI MY ACCOUNT SAYFASINDA ADRESS BUTONUNA TIKLAR.");
        myAccountPage.adressesButonu.click();
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(savePage.shippingAdresYazisi.isDisplayed());
        Reporter.log("KULLANICI SHİPPİNG ADRES BASLIGINI GÖRÜR." );
        ReusableMethods.waitFor(2);
        savePage.shippingAddButonu.click();
        Reporter.log("KULLANICI SHİPPİNG ADD BUTONUNU TIKLAR.");
        ReusableMethods.waitFor(2);
        clearMethod();
        ReusableMethods.waitFor(2);
        Reporter.log("KULLANICI MENUDEKİ ALANLARIN BOS OLDUGUNDAN EMİN OLUR.");
        Assert.assertTrue(shippingAddressPage.shippingZorunluYıldız1.isDisplayed());
        Reporter.log("KULLANICI MENUDE ZORUNLU ALANLARIN ÜZERİNDE YILDIZ İŞARETİ OLDUGUNU GÖRÜR.");
        ReusableMethods.waitFor(2);
        Assert.assertTrue(shippingAddressPage.shippingOptionalAlanlar.isDisplayed());
        Reporter.log("KULLANICI MENUDE OPTİONAL ALANLARIN GÖRÜR.");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        shippingAddressPage.shippingSaveButonu.click();
        Reporter.log("KULLANICI TÜM ALANLARIN BOŞ OLDUGUNU GÖRÜP SAVE BUTONUNA TIKLAR.");
        ReusableMethods.waitFor(1);
        Assert.assertTrue(shippingAddressPage.shippingZorunluYıldız2.isDisplayed());
        Reporter.log("KULLANICI HATA MESAJINDA * İŞARETİ İÇEREN ZORUNLU ALANLARI GÖRÜR.");

    }

    @Test(priority=3)
    public void TestUS4_TC1_03() throws IOException {

        TestCaselogin();
        Reporter.log("KULLANICI LOGİN OLUR.");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        myAccountPage.adressesButonu.click();
        Reporter.log("KULLANICI MY ACCOUNT SAYFASINDA ADRESS BUTONUNA TIKLAR.");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(savePage.shippingAdresYazisi.isDisplayed());
        Reporter.log("KULLANICI SHİPPİNG ADRESS BASLIGINI GÖRÜR.");
        ReusableMethods.waitFor(2);
        savePage.shippingAddButonu.click();
        Reporter.log("KULLANICI SHİPPİNG ADD BUTONUNU TIKLAR.");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        clearMethod();
        ReusableMethods.waitFor(2);
        Reporter.log("KULLANICI MENUDEKİ ALANLARIN BOS OLDUGUNDAN EMİN OLUR.");
        shippingAddressPage.shippingFirstName.sendKeys("ali");
        Reporter.log("KULLANICI FİRST NAME ALANINA GECERLİ BİR AD GİRER.");
        ReusableMethods.waitFor(2);
        shippingAddressPage.shippingLastName.sendKeys("celik");
        Reporter.log("KULLANICI LAST NAME ALANINA GECERLİ BİR SOYAD GİRER.");
        ReusableMethods.waitFor(2);
        shippingCountry();
        Reporter.log("KULLANICI COUNTRY ALANINDAN TURKEY'İ SECER.");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        shippingAddressPage.shippingStreetAdres.sendKeys("sarıcalı");
        Reporter.log("KULLANICI STREET ADRES ALANINA GECERLİ BİR ADRES GİRER.");
        ReusableMethods.waitFor(2);
        shippingAddressPage.shippingZIPCode.sendKeys("55500");
        Reporter.log("KULLANICI ZIP CODE ALANINA GECERLİ BİR DEGER GİRER.");
        ReusableMethods.waitFor(2);
        shippingAddressPage.shippingTownCity.sendKeys("Samsun");
        Reporter.log("KULLANICI TOWN/CİTY ALANINA GECERLİ BİR SEHİR ADI GİRER.");
        ReusableMethods.waitFor(2);
        shippingProvince();
        Reporter.log("KULLANICI PROVİNCE ALANINDA SAMSUN'U SECER.");
        ReusableMethods.waitFor(2);
        shippingAddressPage.shippingSaveButonu.click();
        Reporter.log("KULLANICI ZORUNLU ALANLARA GECERLİ DEGERLER GİRDİKTEN SONRA SAVE BUTONUNA TIKLAR.");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(savePage.shippingAddButonu.isDisplayed());
        Reporter.log("KULLANICI 'EDIT YOUR SHIPPING ADDRESS' BUTONUNU GÖRÜNTÜLER.");
        Assert.assertTrue(savePage.shippingAddButonu.isEnabled());
        Reporter.log("KULLANICI 'EDIT YOUR SHIPPING ADDRESS' BUTONUNUN TIKLANABİLİR OLDUGUNU KONTROL EDER.");
        ReusableMethods.waitFor(2);
        Assert.assertTrue(editPage.kayıtGerceklesti.isDisplayed());
        Reporter.log("KULLANICI SHİPPİNG ADRESS SAYFASINDA SAVE İSLEMİNİN BASARILI OLDUGUNU GÖRÜNTÜLER.");
    }

    @Test(priority=4)
    public void TestUS4_TC1_04() throws IOException {

        TestCaselogin();
        Reporter.log("KULLANICI LOGİN OLUR.");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        Reporter.log("KULLANICI MY ACCOUNT SAYFASINDA ADRESS BUTONUNA TIKLAR.");
        myAccountPage.adressesButonu.click();
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(savePage.shippingAdresYazisi.isDisplayed());
        Reporter.log("KULLANICI SHİPPİNG ADRESS BASLIGINI GÖRÜR.");
        ReusableMethods.waitFor(2);
        savePage.shippingAddButonu.click();
        Reporter.log("KULLANICI SHİPPİNG ADD BUTONUNU TIKLAR.");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        clearMethod();
        ReusableMethods.waitFor(2);
        Reporter.log("KULLANICI MENUDEKİ ALANLARIN BOS OLDUGUNDAN EMİN OLUR.");
        shippingAddressPage.shippingFirstName.sendKeys("ali");
        Reporter.log("KULLANICI FİRST NAME ALANINA GECERLİ BİR AD GİRER.");
        ReusableMethods.waitFor(2);
        shippingAddressPage.shippingLastName.sendKeys("celik");
        Reporter.log("KULLANICI LAST NAME ALANINA GECERLİ BİR SOYAD GİRER.");
        ReusableMethods.waitFor(2);
        shippingAddressPage.shippingCompanyName.sendKeys("Sabancı");
        Reporter.log("KULLANICI COMPANY NAME ALANINA GECERLİ GECERLİ BİR SİRKET GİRER.");
        ReusableMethods.waitFor(2);
        shippingCountry();
        Reporter.log("KULLANICI COUNTRY ALANINDAN TURKEY'İ SECER.");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        shippingAddressPage.shippingStreetAdres.sendKeys("sarıcalı");
        Reporter.log("KULLANICI STREET ADRES ALANINA GECERLİ BİR ADRES GİRER.");
        ReusableMethods.waitFor(2);
        shippingAddressPage.shippingApartman.sendKeys("Celik");
        Reporter.log("KULLANICI APARTMEN,SUİTE ALANINA GECERLİ BİR ADRES GİRER.");
        ReusableMethods.waitFor(2);
        shippingAddressPage.shippingZIPCode.sendKeys("55500");
        Reporter.log("KULLANICI ZIP CODE ALANINA GECERLİ BİR DEGER GİRER.");
        ReusableMethods.waitFor(2);
        shippingAddressPage.shippingTownCity.sendKeys("Samsun");
        Reporter.log("KULLANICI TOWN/CİTY ALANINA SAMSUN GİRER.");
        ReusableMethods.waitFor(2);
        shippingProvince();
        Reporter.log("KULLANICI PROVİNCE ALANINDA SAMSUN'U SECER.");
        ReusableMethods.waitFor(2);
        shippingAddressPage.shippingSaveButonu.click();
        Reporter.log("KULLANICI TÜM ALANLARA GECERLİ DEGERLER GİRDİKTEN SONRA SAVE BUTONUNA TIKLAR.");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(editPage.kayıtGerceklesti.isDisplayed());
        Reporter.log("KULLANICI İŞLEM BAŞARILI MESAJINI GÖRÜR.");
        Assert.assertTrue(savePage.shippingAddButonu.isDisplayed());
        Reporter.log("KULLANICI 'EDIT YOUR SHIPPING ADDRESS' BUTONUNU GÖRÜNTÜLER.");
        Assert.assertTrue(savePage.shippingAddButonu.isEnabled());
        Reporter.log("KULLANICI 'EDIT YOUR SHIPPING ADDRESS' BUTONUNUN TIKLANABİLİR OLDUGUNU KONTROL EDER.");
        ReusableMethods.waitFor(2);
        Assert.assertTrue(editPage.kayıtGerceklesti.isDisplayed());
        Reporter.log("KULLANICI İŞLEM BAŞARILI MESAJINI GÖRÜR.");

    }

    @Test(priority=5)
    public void TestUS4_TC1_05() throws IOException {

        TestCaselogin();
        Reporter.log("KULLANICI LOGİN OLUR.");
        ReusableMethods.waitFor(2);
        Assert.assertTrue(signPage.humcomfyYazisi.isDisplayed());
        Reporter.log("KULLANICI BAŞARILI SEKİLDE ANASAYFAYA GİRİS YAPAR.");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        myAccountPage.adressesButonu.click();
        Reporter.log("KULLANICI MY ACCOUNT SAYFASINDA ADRESS BUTONUNA TIKLAR.");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(savePage.shippingAdresYazisi.isDisplayed());
        Reporter.log("KULLANICI SHİPPİNG ADRESS BASLIGINI GÖRÜR.");
        ReusableMethods.waitFor(2);
        savePage.shippingAddButonu.click();
        Reporter.log("KULLANICI SHİPPİNG ADD BUTONUNU TIKLAR.");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        clearMethod();
        ReusableMethods.waitFor(2);
        Reporter.log("KULLANICI MENUDEKİ ALANLARIN BOS OLDUGUNDAN EMİN OLUR.");
        shippingAddressPage.shippingFirstName.sendKeys("1");
        Reporter.log("KULLANICI FİRST NAME ALANINA 1 GİRER.");
        ReusableMethods.waitFor(2);
        shippingAddressPage.shippingLastName.sendKeys("1");
        Reporter.log("KULLANICI LAST NAME ALANINA 1 GİRER.");
        ReusableMethods.waitFor(2);
        shippingCountry();
        Reporter.log("KULLANICI COUNTRY ALANINDAN TURKEY'İ SECER.");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        shippingAddressPage.shippingStreetAdres.sendKeys("1");
        Reporter.log("KULLANICI STREET ADRES ALANINA 1 GİRER.");
        ReusableMethods.waitFor(2);
        shippingAddressPage.shippingZIPCode.sendKeys("1");
        Reporter.log("KULLANICI POSTCODE/ZİP ALANINA 1 GİRER.");
        ReusableMethods.waitFor(2);
        shippingAddressPage.shippingTownCity.sendKeys("1");
        Reporter.log("KULLANICI TOWN/CİTY ALANINA 1 GİRER.");
        ReusableMethods.waitFor(2);
        shippingProvince();
        Reporter.log("KULLANICI PROVİNCE ALANINDA SAMSUN'U SECER.");
        ReusableMethods.waitFor(2);
        shippingAddressPage.shippingSaveButonu.click();
        Reporter.log("KULLANICI TÜM ALANLARA 1 DEGERİ GİRDİKTEN SONRA SAVE BUTONUNA TIKLAR.");
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("edit"));
        Reporter.log("KULLANICI İŞLEM BAŞARILI MESAJINI GÖRÜR.");
        ReusableMethods.waitFor(2);
        Assert.assertTrue(savePage.shippingAddButonu.isDisplayed());
        Reporter.log("KULLANICI 'EDIT YOUR SHIPPING ADDRESS' BUTONUNU GÖRÜNTÜLER.");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(savePage.shippingAddButonu.isEnabled());
        Reporter.log("KULLANICI 'EDIT YOUR SHIPPING ADDRESS' BUTONUNUN TIKLANABİLİR OLDUGUNU KONTROL EDER.");
        Assert.assertTrue(editPage.kayıtGerceklesti.isDisplayed());
        Reporter.log("KULLANICI İŞLEM BAŞARILI MESAJINI GÖRÜR.");

    }

    @Test(priority=6)
    public void TestUS4_TC1_06() throws IOException {

        TestCaselogin();
        Reporter.log("KULLANICI LOGİN OLUR.");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        myAccountPage.adressesButonu.click();
        Reporter.log("KULLANICI MY ACCOUNT SAYFASINDA ADRESS BUTONUNA TIKLAR.");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(savePage.shippingAdresYazisi.isDisplayed());
        Reporter.log("KULLANICI SHİPPİNG ADRESS BASLIGINI GÖRÜR.");
        ReusableMethods.waitFor(2);
        savePage.shippingAddButonu.click();
        Reporter.log("KULLANICI SHİPPİNG ADD BUTONUNU TIKLAR.");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        clearMethod();
        ReusableMethods.waitFor(2);
        Reporter.log("KULLANICI MENUDEKİ ALANLARIN BOS OLDUGUNDAN EMİN OLUR.");
        shippingAddressPage.shippingFirstName.sendKeys("a");
        Reporter.log("KULLANICI FİRST NAME ALANINA a GİRER.");
        ReusableMethods.waitFor(2);
        shippingAddressPage.shippingLastName.sendKeys("a");
        Reporter.log("KULLANICI FİRST NAME ALANINA a GİRER.");
        ReusableMethods.waitFor(2);
        shippingCountry();
        Reporter.log("KULLANICI COUNTRY ALANINDAN TURKEY'İ SECER.");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        shippingAddressPage.shippingStreetAdres.sendKeys("a");
        Reporter.log("KULLANICI STREET/ADRESS ALANINA a GİRER.");
        ReusableMethods.waitFor(2);
        shippingAddressPage.shippingZIPCode.sendKeys("a");
        Reporter.log("KULLANICI POSTCODE/ZİP ALANINA 1 GİRER.");
        ReusableMethods.waitFor(2);
        shippingAddressPage.shippingTownCity.sendKeys("a");
        Reporter.log("KULLANICI TOWN/CİTY ALANINA 1 GİRER.");
        ReusableMethods.waitFor(2);
        shippingProvince();
        Reporter.log("KULLANICI PROVİNCE ALANINDA SAMSUN'U SECER.");
        shippingAddressPage.shippingSaveButonu.click();
        Reporter.log("KULLANICI ZORUNLU ALANLARA a GİRDİKTEN SONRA SAVE BUTONUNA TIKLAR.");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("edit"));
        Reporter.log("KULLANICI İŞLEM BAŞARILI MESAJINI GÖRÜR.");
        Assert.assertTrue(savePage.shippingAddButonu.isDisplayed());
        Reporter.log("KULLANICI 'EDIT YOUR SHIPPING ADDRESS' BUTONUNU GÖRÜNTÜLER.");
        ReusableMethods.waitFor(2);
        Assert.assertTrue(savePage.shippingAddButonu.isEnabled());
        Reporter.log("KULLANICI 'EDIT YOUR SHIPPING ADDRESS' BUTONUNUN TIKLANABİLİR OLDUGUNU KONTROL EDER.");
        Assert.assertTrue(editPage.kayıtGerceklesti.isDisplayed());
        Reporter.log("KULLANICI İŞLEM BAŞARILI MESAJINI GÖRÜR.");

    }


    @Test(priority=7)
    public void TestUS4_TC1_07() throws IOException {
        TestCaselogin();
        Reporter.log("KULLANICI LOGİN OLUR.");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        myAccountPage.adressesButonu.click();
        Reporter.log("KULLANICI MY ACCOUNT SAYFASINDA ADRESS BUTONUNA TIKLAR.");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(savePage.shippingAdresYazisi.isDisplayed());
        Reporter.log("KULLANICI SHİPPİNG ADRESS BASLIGINI GÖRÜR.");
        ReusableMethods.waitFor(2);
        savePage.shippingAddButonu.click();
        Reporter.log("KULLANICI SHİPPİNG ADD BUTONUNU TIKLAR.");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        clearMethod();
        ReusableMethods.waitFor(2);
        Reporter.log("KULLANICI MENUDEKİ ALANLARIN BOS OLDUGUNDAN EMİN OLUR.");
        shippingAddressPage.shippingFirstName.sendKeys("*-/$");
        Reporter.log("KULLANICI FİRST NAME ALANINA *-/$ GİRER.");
        ReusableMethods.waitFor(2);
        shippingAddressPage.shippingLastName.sendKeys("*-/$");
        Reporter.log("KULLANICI FİRST NAME ALANINA *-/$ GİRER.");
        ReusableMethods.waitFor(2);
        shippingCountry();
        Reporter.log("KULLANICI COUNTRY ALANINDAN TURKEY'İ SECER.");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        shippingAddressPage.shippingStreetAdres.sendKeys("*-/$");
        Reporter.log("KULLANICI STREET/ADRESS ALANINA *-/$ GİRER.");
        ReusableMethods.waitFor(2);
        shippingAddressPage.shippingZIPCode.sendKeys("*-/$");
        Reporter.log("KULLANICI POSTCODE/ZİP ALANINA *-/$ GİRER.");
        ReusableMethods.waitFor(2);
        shippingAddressPage.shippingTownCity.sendKeys("*-/$");
        Reporter.log("KULLANICI TOWN/CİTY ALANINA *-/$ GİRER.");
        ReusableMethods.waitFor(2);
        shippingProvince();
        Reporter.log("KULLANICI PROVİNCE ALANINDA SAMSUN'U SECER.");
        shippingAddressPage.shippingSaveButonu.click();
        Reporter.log("KULLANICI ZORUNLU ALANLARA a GİRDİKTEN SONRA SAVE BUTONUNA TIKLAR.");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(editPage.shippingHataSembolü.isDisplayed());
        Reporter.log("KULLANICI GECERLİ BİR POSTCODE GİRMESİ GEREKTİĞİ İLE İLGİLİ HATA MESAJI GÖRÜR.");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(shippingAddressPage.shippingSaveButonu.isDisplayed());
        Reporter.log("KULLANICI 'EDIT YOUR SHIPPING ADDRESS' BUTONU YERİNE SAVE BUTONUNU GÖRÜR.");
        Assert.assertTrue(shippingAddressPage.shippingSaveButonu.isEnabled());
        Reporter.log("KULLANICI HATALI GİRİS İHTİMALİNE KARŞI EDİT BUTONUNA ERİŞEBİLİR.");
        ReusableMethods.waitFor(2);
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://hubcomfy.com/my-account-2/edit-address/shipping/");
        Reporter.log("KULLANICI SAYFANIN DEĞİŞMEDİĞİNİ,İŞLEMDE HATA OLDUGUNU GÖRÜR.");

    }

    @Test(priority=8)
    public void TestUS4_TC1_08() throws IOException {
        TestCaselogin();
        Reporter.log("KULLANICI LOGİN OLUR.");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        myAccountPage.adressesButonu.click();
        Reporter.log("KULLANICI MY ACCOUNT SAYFASINDA ADRESS BUTONUNA TIKLAR.");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(savePage.shippingAdresYazisi.isDisplayed());
        Reporter.log("KULLANICI SHİPPİNG ADRESS BASLIGINI GÖRÜR.");
        ReusableMethods.waitFor(2);
        savePage.shippingAddButonu.click();
        Reporter.log("KULLANICI SHİPPİNG ADD BUTONUNU TIKLAR.");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        clearMethod();
        ReusableMethods.waitFor(2);
        Reporter.log("KULLANICI MENUDEKİ ALANLARIN BOS OLDUGUNDAN EMİN OLUR.");
        shippingAddressPage.shippingFirstName.sendKeys("*-/$");
        Reporter.log("KULLANICI FİRST NAME ALANINA *-/$ GİRER.");
        ReusableMethods.waitFor(2);
        shippingAddressPage.shippingLastName.sendKeys("*-/$");
        Reporter.log("KULLANICI FİRST NAME ALANINA *-/$ GİRER.");
        ReusableMethods.waitFor(2);
        shippingCountry();
        Reporter.log("KULLANICI COUNTRY ALANINDAN TURKEY'İ SECER.");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        shippingAddressPage.shippingStreetAdres.sendKeys("*-/$");
        Reporter.log("KULLANICI STREET/ADRESS ALANINA *-/$ GİRER.");
        ReusableMethods.waitFor(2);
        shippingAddressPage.shippingZIPCode.sendKeys("1");
        Reporter.log("KULLANICI POSTCODE/ZİP ALANINA 1 GİRER.");
        ReusableMethods.waitFor(2);
        shippingAddressPage.shippingTownCity.sendKeys("*-/$");
        Reporter.log("KULLANICI TOWN/CİTY ALANINA *-/$ GİRER.");
        ReusableMethods.waitFor(2);
        shippingProvince();
        Reporter.log("KULLANICI PROVİNCE ALANINDA SAMSUN'U SECER.");
        shippingAddressPage.shippingSaveButonu.click();
        Reporter.log("KULLANICI ZORUNLU ALANLARA *-/$, SADECE POTCODE ALANINA 1 GİRDİKTEN SONRA SAVE BUTONUNA TIKLAR.");
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("edit"));
        Reporter.log("KULLANICI İŞLEM BAŞARILI MESAJINI GÖRÜR.");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(savePage.shippingAddButonu.isDisplayed());
        Reporter.log("KULLANICI 'EDIT YOUR SHIPPING ADDRESS' BUTONU YERİNE SAVE BUTONUNU GÖRÜR.");
        ReusableMethods.waitFor(2);
        Assert.assertTrue(savePage.shippingAddButonu.isEnabled());
        Reporter.log("KULLANICI 'EDIT YOUR SHIPPING ADDRESS' BUTONUNUN TIKLANABİLİR OLDUGUNU KONTROL EDER.");
        Assert.assertTrue(editPage.kayıtGerceklesti.isDisplayed());
        Reporter.log("KULLANICI İŞLEM BAŞARILI MESAJINI GÖRÜR.");

    }
    @AfterMethod
    public void tearDown() throws IOException {
        ReusableMethods.getScreenshot("Son sayfa");
        Reporter.log("KULLANICI SAYFAYI KAPATIR.");
        Driver.closeDriver();
    }


    }



