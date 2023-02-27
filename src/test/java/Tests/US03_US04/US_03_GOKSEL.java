package Tests.US03_US04;

import Pages.US03_US04.*;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


import java.io.IOException;

public class US_03_GOKSEL {

        SignPage signPage;
    MyAccountPage myAccountPage;
    SavePage savePage;
    BillingAddressPage billingAddressPage;
        Actions actions; EditPage editPage;JavascriptExecutor js;
        public void TestCaselogin() {
            signPage = new SignPage();myAccountPage = new MyAccountPage();savePage = new SavePage();billingAddressPage = new BillingAddressPage();
            actions = new Actions(Driver.getDriver());editPage=new EditPage();
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
            }catch(Exception e){

            }
            try {
                myAccountPage.signOutButonu.click();
            }catch (Exception e){
            }
        }


        public void bilingCountry(){
            signPage = new SignPage();myAccountPage = new MyAccountPage();savePage = new SavePage();billingAddressPage = new BillingAddressPage();
            actions = new Actions(Driver.getDriver());editPage=new EditPage();
            try {
                billingAddressPage.bilingCountry1.click();
                billingAddressPage.bilingCountry2.sendKeys("Turkey",Keys.ENTER);
            } catch (Exception e) {

            }
            try {
                billingAddressPage.bilingCountry3.click();
                billingAddressPage.bilingCountry4.sendKeys("Turkey",Keys.ENTER);
            } catch (Exception e) {
            }
        }

        public void bilingProvince(){
            signPage = new SignPage();myAccountPage = new MyAccountPage();savePage = new SavePage();billingAddressPage = new BillingAddressPage();
            actions = new Actions(Driver.getDriver());editPage=new EditPage();
                    try {

                        billingAddressPage.bilingProvince1.click();
                        billingAddressPage.bilingProvince2.sendKeys("Samsun",Keys.ENTER);
                    } catch (Exception e) {

                    }
                    try {
                        billingAddressPage.bilingProvince3.click();
                        billingAddressPage.bilingProvince4.sendKeys("Samsun",Keys.ENTER);

            } catch (Exception e) {
            }
        }

    public void clearMethod(){
        billingAddressPage.bilingFirstName.clear();
        billingAddressPage.bilingLastName.clear();
        billingAddressPage.bilingCompanyName.clear();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        billingAddressPage.bilingStreet.clear();
        billingAddressPage.bilingApartman.clear();
        billingAddressPage.bilingZipCode.clear();
        billingAddressPage.bilingTownCity.clear();
        billingAddressPage.bilingPhone.clear();
    }



    @Test(priority = 1)
        public void testUS3_TC1_01() throws IOException {
            signPage = new SignPage();myAccountPage = new MyAccountPage();savePage = new SavePage();
            billingAddressPage = new BillingAddressPage();actions = new Actions(Driver.getDriver());editPage=new EditPage();

            Driver.getDriver().get(ConfigReader.getProperty("humcomfy_url"));
            Reporter.log("KULLANICI URL'YE GİDER.");
            Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://hubcomfy.com/"));
            Reporter.log("KULLANICI ANASAYFANIN AÇILDIGINI GÖRÜR.");
            Assert.assertTrue(signPage.humcomfyYazisi.isDisplayed());
            Reporter.log("KULLANICI HUMCOMFY BASLIGINI GÖRÜNTÜLER.");
            Assert.assertTrue(signPage.ilkSignınButonu.isDisplayed());
            Reporter.log("KULLANICI SİGNIN BUTONUNU GÖRÜNTÜLER.");
            signPage.ilkSignınButonu.click();
            Reporter.log("KULLANICI SİGNIN BUTONUNA TIKLAR");
            Assert.assertTrue(signPage.ilkSignınButonu.isDisplayed());
            Reporter.log("KULLANICI SİGNIN BUTONU TIKLADIGINDA ALT PENCERELERİ GÖRÜR.");
            Assert.assertTrue(signPage.girisSayfasıUsername.isEnabled());
            Reporter.log("KULLANICI ALT PENCERELERE ERİŞEBİLİR.");


        }

        @Test(priority = 2)
        public void testUS3_TC1_02() throws IOException {
            signPage = new SignPage();myAccountPage = new MyAccountPage();savePage = new SavePage();billingAddressPage = new BillingAddressPage();
            actions = new Actions(Driver.getDriver());editPage=new EditPage();

            Driver.getDriver().get(ConfigReader.getProperty("humcomfy_url"));
            Reporter.log("KULLANICI URL'YE GİDER.");
            Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://hubcomfy.com/"));
            Reporter.log("KULLANICI ANASAYFANIN AÇILDIGINI GÖRÜR.");
            Assert.assertTrue(signPage.humcomfyYazisi.isDisplayed());
            Reporter.log("KULLANICI HUMCOMFY BASLIGINI GÖRÜNTÜLER.");
            Assert.assertTrue(signPage.ilkSignınButonu.isDisplayed());
            Reporter.log("KULLANICI SİGNIN BUTONUNU GÖRÜNTÜLER.");
            signPage.ilkSignınButonu.click();
            Reporter.log("KULLANICI SİGNIN BUTONUNA TIKLAR");
            Assert.assertTrue(signPage.ilkSignınButonu.isDisplayed());
            Reporter.log("KULLANICI SİGNIN BUTONU TIKLADIGINDA ALT PENCERELERİ GÖRÜR.");
            signPage.girisSayfasıUsername.click();
            Reporter.log("KULLANICI USERNAME BUTONUNA TIKLAR");
            ReusableMethods.waitFor(2);
            signPage.girisSayfasıUsername.sendKeys(ConfigReader.getProperty("username_hubcomfy"));
            Reporter.log("KULLANICI USERNAME BİLGİSİNİ GİRER");


        }
        @Test(priority = 3)
        public void testUS3_TC1_03() throws IOException {
            signPage = new SignPage();myAccountPage = new MyAccountPage();savePage = new SavePage();
            billingAddressPage = new BillingAddressPage();actions = new Actions(Driver.getDriver());editPage=new EditPage();

            Driver.getDriver().get(ConfigReader.getProperty("humcomfy_url"));
            Reporter.log("KULLANICI URL'YE GİDER.");
            Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://hubcomfy.com/"));
            Reporter.log("KULLANICI ANASAYFANIN AÇILDIGINI GÖRÜR.");
            Assert.assertTrue(signPage.humcomfyYazisi.isDisplayed());
            Reporter.log("KULLANICI HUMCOMFY BASLIGINI GÖRÜNTÜLER.");
            Assert.assertTrue(signPage.ilkSignınButonu.isDisplayed());
            Reporter.log("KULLANICI SİGNIN BUTONUNU GÖRÜNTÜLER.");
            signPage.ilkSignınButonu.click();
            Reporter.log("KULLANICI SİGNIN BUTONUNA TIKLAR");
            Assert.assertTrue(signPage.ilkSignınButonu.isDisplayed());
            Reporter.log("KULLANICI SİGNIN BUTONU TIKLADIGINDA ALT PENCERELERİ GÖRÜR.");
            signPage.girisSayfasıUsername.click();
            Reporter.log("KULLANICI USERNAME BUTONUNA TIKLAR");
            ReusableMethods.waitFor(2);
            signPage.girisSayfasıUsername.sendKeys(ConfigReader.getProperty("username_hubcomfy"));
            Reporter.log("KULLANICI USERNAME BİLGİSİNİ GİRER");
            signPage.girisSayfasıPassword.click();
            Reporter.log("KULLANICI PASSWORD BUTONUNA TIKLAR");
        }

        @Test(priority = 4)
        public void testUS03_TC1_04() throws IOException {
            signPage = new SignPage();myAccountPage = new MyAccountPage();savePage = new SavePage();
            billingAddressPage = new BillingAddressPage();actions = new Actions(Driver.getDriver());editPage=new EditPage();

            Driver.getDriver().get(ConfigReader.getProperty("humcomfy_url"));
            Reporter.log("KULLANICI URL'YE GİDER.");
            Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://hubcomfy.com/"));
            Reporter.log("KULLANICI ANASAYFANIN AÇILDIGINI GÖRÜR.");
            Assert.assertTrue(signPage.humcomfyYazisi.isDisplayed());
            Reporter.log("KULLANICI HUMCOMFY BASLIGINI GÖRÜNTÜLER.");
            Assert.assertTrue(signPage.ilkSignınButonu.isDisplayed());
            Reporter.log("KULLANICI SİGNIN BUTONUNU GÖRÜNTÜLER.");
            signPage.ilkSignınButonu.click();
            Reporter.log("KULLANICI SİGNIN BUTONUNA TIKLAR");
            Assert.assertTrue(signPage.ilkSignınButonu.isDisplayed());
            Reporter.log("KULLANICI SİGNIN BUTONU TIKLADIGINDA ALT PENCERELERİ GÖRÜR.");
            signPage.girisSayfasıUsername.click();
            Reporter.log("KULLANICI USERNAME BUTONUNA TIKLAR");
            ReusableMethods.waitFor(2);
            signPage.girisSayfasıUsername.sendKeys(ConfigReader.getProperty("username_hubcomfy"));
            Reporter.log("KULLANICI USERNAME BİLGİSİNİ GİRER");
            signPage.girisSayfasıPassword.click();
            Reporter.log("KULLANICI PASSWORD BUTONUNA TIKLAR");
            ReusableMethods.waitFor(2);
            signPage.girisSayfasıPassword.sendKeys(ConfigReader.getProperty("password_hubcomfy"));
            Reporter.log("KULLANICI PASSWORD BİLGİSİNİ GİRER");
            ReusableMethods.waitFor(2);
            Assert.assertTrue(signPage.girisRememberMeButonu.isDisplayed());
            Reporter.log("KULLANICI REMEMBER ME KUTUCUGUNU GÖRÜR");
            ReusableMethods.waitFor(2);
            signPage.girisRememberMeButonu.click();
            Reporter.log("KULLANICI REMEMBER ME KUTUCUGUNU TIKLAR");
            ReusableMethods.waitFor(2);
            Assert.assertTrue(signPage.girisRememberMeButonu.isSelected());
            Reporter.log("KULLANICI REMEMBER ME KUTUCUGUNUNUN SEÇİLEBİLİR DURUMDA OLDUGUNU GÖRÜR.");


        }

        @Test(priority = 5)
        public void testUS03_TC1_05() throws IOException {
            signPage = new SignPage();myAccountPage = new MyAccountPage();savePage = new SavePage();
            billingAddressPage = new BillingAddressPage();actions = new Actions(Driver.getDriver());editPage=new EditPage();

            Driver.getDriver().get(ConfigReader.getProperty("humcomfy_url"));
            Reporter.log("KULLANICI URL'YE GİDER.");
            Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://hubcomfy.com/"));
            Reporter.log("KULLANICI ANASAYFANIN AÇILDIGINI GÖRÜR.");
            Assert.assertTrue(signPage.humcomfyYazisi.isDisplayed());
            Reporter.log("KULLANICI HUMCOMFY BASLIGINI GÖRÜNTÜLER.");
            Assert.assertTrue(signPage.ilkSignınButonu.isDisplayed());
            Reporter.log("KULLANICI SİGNIN BUTONUNU GÖRÜNTÜLER.");
            signPage.ilkSignınButonu.click();
            Reporter.log("KULLANICI SİGNIN BUTONUNA TIKLAR");
            Assert.assertTrue(signPage.ilkSignınButonu.isDisplayed());
            Reporter.log("KULLANICI SİGNIN BUTONU TIKLADIGINDA ALT PENCERELERİ GÖRÜR.");
            signPage.girisSayfasıUsername.click();
            Reporter.log("KULLANICI USERNAME BUTONUNA TIKLAR");
            ReusableMethods.waitFor(2);
            signPage.girisSayfasıUsername.sendKeys(ConfigReader.getProperty("username_hubcomfy"));
            Reporter.log("KULLANICI USERNAME BİLGİSİNİ GİRER");
            signPage.girisSayfasıPassword.click();
            Reporter.log("KULLANICI PASSWORD BUTONUNA TIKLAR");
            ReusableMethods.waitFor(2);
            signPage.girisSayfasıPassword.sendKeys(ConfigReader.getProperty("password_hubcomfy"));
            Reporter.log("KULLANICI PASSWORD BİLGİSİNİ GİRER");
            ReusableMethods.waitFor(2);
            Assert.assertTrue(signPage.girisRememberMeButonu.isDisplayed());
            Reporter.log("KULLANICI REMEMBER ME KUTUCUGUNU GÖRÜR");
            ReusableMethods.waitFor(2);
            signPage.girisRememberMeButonu.click();
            Reporter.log("KULLANICI REMEMBER ME KUTUCUGUNU TIKLAR");
            ReusableMethods.waitFor(2);
            Assert.assertTrue(signPage.girisRememberMeButonu.isSelected());
            Reporter.log("KULLANICI REMEMBER ME KUTUCUGUNUNUN SEÇİLEBİLİR DURUMDA OLDUGUNU GÖRÜR.");
            ReusableMethods.waitFor(2);
            signPage.parolaKaydıSigninButonu.click();
            Reporter.log("KULLANICI SİGNIN BUTONUNA TIKLAR");
            ReusableMethods.waitFor(5);
            Assert.assertTrue(myAccountPage.signOutButonu.isDisplayed());
            Reporter.log("KULLANICI SİGNOUT BUTONUNU GÖRÜR");
        }

        @Test(priority = 6)
        public void testUS03_TC1_06() throws IOException {

            TestCaselogin();
            Reporter.log("KULLANICI LOGİN OLUR.");
            ReusableMethods.waitFor(2);
            Assert.assertTrue(signPage.humcomfyYazisi.isDisplayed());
            Reporter.log("KULLANICI SAYFAYA BASARILI SEKİLDE GİRİS YAPAR..");
            Assert.assertTrue(myAccountPage.myAccountYazisi.isDisplayed());
            Reporter.log("KULLANICI MY ACCOUNT BASLIGINI GÖRÜNTÜLER.");
            ReusableMethods.waitFor(2);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(2);
            Assert.assertTrue(myAccountPage.adressesButonu.isDisplayed());
            Reporter.log("KULLANICI ADRESS BUTONUNU GÖRÜNTÜLER.");
            ReusableMethods.waitFor(2);
            myAccountPage.adressesButonu.click();
            Reporter.log("KULLANICI ADRESS BUTONUNU TIKLAR.");
            ReusableMethods.waitFor(2);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(2);
            Assert.assertTrue(savePage.bilingaddButonu.isDisplayed());
            Reporter.log("KULLANICI BİLLİNG ADRES BASLIGINI GÖRÜNTÜLER.");
            ReusableMethods.waitFor(2);
            Assert.assertTrue(savePage.bilingaddButonu.isDisplayed());
            Reporter.log("KULLANICI BİLİNG ADRES BASLIGININ ALTINDA ADD BUTONU GÖRÜNTÜLER.");
            savePage.bilingaddButonu.click();
            Reporter.log("KULLANICI ADD BUTONU TIKLAR.");

        }

        @Test(priority = 7)
        public void testUS03_TC1_07() throws IOException {

            TestCaselogin();
            Reporter.log("KULLANICI LOGİN OLUR.");
            ReusableMethods.waitFor(2);
            Assert.assertTrue(signPage.humcomfyYazisi.isDisplayed());
            Reporter.log("KULLANICI SAYFAYA BASARILI SEKİLDE GİRİS YAPAR.");
            Assert.assertTrue(myAccountPage.myAccountYazisi.isDisplayed());
            Reporter.log("KULLANICI MY ACCOUNT BASLIGINI GÖRÜNTÜLER.");
            ReusableMethods.waitFor(2);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(2);
            Assert.assertTrue(myAccountPage.adressesButonu.isDisplayed());
            Reporter.log("KULLANICI ADRESS BUTONUNU GÖRÜNTÜLER.");
            ReusableMethods.waitFor(2);
            myAccountPage.adressesButonu.click();
            Reporter.log("KULLANICI ADRESS BUTONUNU TIKLAR.");
            ReusableMethods.waitFor(2);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(2);
            Assert.assertTrue(savePage.bilingaddButonu.isDisplayed());
            Reporter.log("KULLANICI BİLLİNG ADRES BASLIGINI GÖRÜNTÜLER.");
            ReusableMethods.waitFor(2);
            Assert.assertTrue(savePage.bilingaddButonu.isDisplayed());
            Reporter.log("KULLANICI BİLİNG ADRES BASLIGININ ALTINDA ADD BUTONU GÖRÜNTÜLER.");
            savePage.bilingaddButonu.click();
            Reporter.log("KULLANICI ADD BUTONU TIKLAR.");
            ReusableMethods.waitFor(2);
            Assert.assertTrue(billingAddressPage.bilingZorunluYıldız.isDisplayed());
            Reporter.log("KULLANICI ZORUNLU ALANLARIN ÜZERİNDE * SEMBOLÜ GÖRÜR.");
            ReusableMethods.waitFor(2);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(2);
            Assert.assertTrue(billingAddressPage.bilingAdresOptionalCompany.isDisplayed());
            Reporter.log("KULLANICI OPTİONAL ALANLARIN * İÇERMEDİĞİNİ GÖRÜNTÜLER.");

        }

        @Test(priority = 8)
        public void testUS03_TC1_08() throws IOException {

            TestCaselogin();
            Reporter.log("KULLANICI LOGİN OLUR.");
            ReusableMethods.waitFor(2);
            Assert.assertTrue(myAccountPage.myAccountYazisi.isDisplayed());
            Reporter.log("KULLANICI SAYFAYA BASARILI SEKİLDE GİRİS YAPAR.");
            ReusableMethods.waitFor(2);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(2);
            myAccountPage.adressesButonu.click();
            Reporter.log("KULLANICI ADRESS BUTONUNU TIKLAR.");
            ReusableMethods.waitFor(2);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(2);
            savePage.bilingaddButonu.click();
            Reporter.log("KULLANICI BİLLİNG ADRES ALTINDAKİ ADD BUTONU TIKLAR.");
            ReusableMethods.waitFor(2);
            actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(2);
            clearMethod();
            Reporter.log("KULLANICI MENUDEKİ ALANLARIN BOS OLDUGUNDAN EMİN OLUR.");
            ReusableMethods.waitFor(2);
            Assert.assertTrue(billingAddressPage.bilingEmail.isDisplayed());
            Reporter.log("KULLANICI HİÇBİR DEGER GİRMEDİGİ HALDE SAYFA ALTINDA E-MAİL ADRESİNİ GÖRÜNTÜLER.");
            ReusableMethods.waitFor(2);
            billingAddressPage.bilingSaveAdresButonu.click();
            Reporter.log("KULLANICI SAYFAYA HİÇBİR DEGER GİRMEDEN SAVE ADRESS BUTONUNU TIKLAR.");
            ReusableMethods.waitFor(2);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(2);
            Assert.assertTrue(billingAddressPage.bilingZorunluYıldız.isDisplayed());
            Reporter.log("KULLANICI HATA MESAJIYLA ZORUNLU ALANLARI GÖRÜNTÜLER.");

        }

        @Test(priority = 9)
        public void testUS03_TC2_01() throws IOException {

            TestCaselogin();
            Reporter.log("KULLANICI LOGİN OLUR.");
            ReusableMethods.waitFor(2);
            Assert.assertTrue(myAccountPage.myAccountYazisi.isDisplayed());
            Reporter.log("KULLANICI SAYFAYA BASARILI SEKİLDE GİRİS YAPAR.");
            ReusableMethods.waitFor(2);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(2);
            myAccountPage.adressesButonu.click();
            Reporter.log("KULLANICI ADRESS BUTONUNU TIKLAR.");
            ReusableMethods.waitFor(2);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(2);
            savePage.bilingaddButonu.click();
            Reporter.log("KULLANICI BİLLİNG ADRES ALTINDAKİ ADD BUTONU TIKLAR.");
            ReusableMethods.waitFor(2);
            actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(2);
            clearMethod();
            Reporter.log("KULLANICI MENUDEKİ ALANLARIN BOS OLDUGUNDAN EMİN OLUR.");
            billingAddressPage.bilingFirstName.sendKeys("11");
            Reporter.log("KULLANICI FİRST NAME ALANINA 11 GİRER VE HATA UYARISI ALMAZ.");
            ReusableMethods.waitFor(2);
            billingAddressPage.bilingLastName.sendKeys("1");
            Reporter.log("KULLANICI LAST NAME ALANINA 1 GİRER VE HATA UYARISI ALMAZ.");
            bilingCountry();
            Reporter.log("KULLANICI COUNTRY ALANINDA TURKEY'İ SECER.");
            ReusableMethods.waitFor(2);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(2);
            billingAddressPage.bilingStreet.sendKeys("1");
            Reporter.log("KULLANICI STREET ALANINA 1 GİRER VE HATA UYARISI ALMAZ.");
            ReusableMethods.waitFor(2);
            billingAddressPage.bilingZipCode.sendKeys("AAAA");
            Reporter.log("KULLANICI POSTCODE/ZİP ALANINA AAAA GİRER VE HATA UYARISI ALMAZ.");
            ReusableMethods.waitFor(2);
            billingAddressPage.bilingTownCity.sendKeys("1");
            Reporter.log("KULLANICI TOWNCİTY ALANINA 1 GİRER VE HATA UYARISI ALMAZ.");
            bilingProvince();
            Reporter.log("KULLANICI PROVİNCE ALANINDA SAMSUN'U SECER.");
            ReusableMethods.waitFor(2);
            billingAddressPage.bilingPhone.sendKeys("A");
            Reporter.log("KULLANICI STREET ALANINA A GİRER VE HATA UYARISI ALMAZ.");
            ReusableMethods.waitFor(2);
            billingAddressPage.bilingSaveAdresButonu.click();
            Reporter.log("KULLANICI SAVE ADRESS BUTONUNU TIKLAR.");
            ReusableMethods.waitFor(2);
            actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(2);
            Assert.assertTrue(billingAddressPage.bilingSaveAdresButonu.isDisplayed());
            Reporter.log("KULLANICI KAYDI GERCEKLESTİREMEZ,AYNI SAYFADA KALIR.");
            Assert.assertTrue(billingAddressPage.bilingAdresHataSembolü.isDisplayed());
            Reporter.log("KULLANICI PHONE ALANINA GECERLİ DEGER GİRMESİ GEREKTİGİ MESAJINI GÖRÜR..");


        }

        @Test(priority = 10)
        public void testUS03_TC2_02() throws IOException {

            TestCaselogin();
            Reporter.log("KULLANICI LOGİN OLUR.");
            ReusableMethods.waitFor(2);
            Assert.assertTrue(myAccountPage.myAccountYazisi.isDisplayed());
            Reporter.log("KULLANICI SAYFAYA BASARILI SEKİLDE GİRİS YAPAR.");
            ReusableMethods.waitFor(2);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(2);
            myAccountPage.adressesButonu.click();
            Reporter.log("KULLANICI ADRESS BUTONUNU TIKLAR.");
            ReusableMethods.waitFor(2);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(2);
            savePage.bilingaddButonu.click();
            Reporter.log("KULLANICI BİLLİNG ADRES ALTINDAKİ ADD BUTONU TIKLAR.");
            ReusableMethods.waitFor(2);
            actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(2);
            clearMethod();
            Reporter.log("KULLANICI MENUDEKİ ALANLARIN BOS OLDUGUNDAN EMİN OLUR.");
            billingAddressPage.bilingFirstName.sendKeys("*-/%$");
            Reporter.log("KULLANICI FİRST NAME ALANINA *-/%$ GİRER VE HATA UYARISI ALMAZ.");
            ReusableMethods.waitFor(2);
            billingAddressPage.bilingLastName.sendKeys("*-/%$");
            Reporter.log("KULLANICI LAST NAME ALANINA *-/%$ GİRER VE HATA UYARISI ALMAZ.");
            bilingCountry();
            Reporter.log("KULLANICI COUNTRY ALANINDA TURKEY'İ SECER.");
            ReusableMethods.waitFor(2);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(2);
            billingAddressPage.bilingStreet.sendKeys("*-/%$");
            Reporter.log("KULLANICI STREET ALANINA *-/%$ GİRER VE HATA UYARISI ALMAZ.");
            ReusableMethods.waitFor(2);
            billingAddressPage.bilingZipCode.sendKeys("*-/%$");
            Reporter.log("KULLANICI POSTCODE/ZİP ALANINA *-/%$ GİRER VE HATA UYARISI ALMAZ.");
            ReusableMethods.waitFor(2);
            billingAddressPage.bilingTownCity.sendKeys("1");
            Reporter.log("KULLANICI TOWNCİTY ALANINA 1 GİRER VE HATA UYARISI ALMAZ.");
            bilingProvince();
            Reporter.log("KULLANICI PROVİNCE ALANINDA SAMSUN'U SECER.");
            ReusableMethods.waitFor(2);
            billingAddressPage.bilingPhone.sendKeys("*-/%$");
            Reporter.log("KULLANICI STREET ALANINA *-/%$ GİRER VE HATA UYARISI ALMAZ.");
            ReusableMethods.waitFor(2);
            billingAddressPage.bilingSaveAdresButonu.click();
            Reporter.log("KULLANICI SAVE ADRESS BUTONUNU TIKLAR.");
            ReusableMethods.waitFor(2);
            actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(2);
            Assert.assertTrue(billingAddressPage.bilingSaveAdresButonu.isDisplayed());
            Reporter.log("KULLANICI KAYDI GERCEKLESTİREMEZ,AYNI SAYFADA KALIR.");
            Assert.assertTrue(billingAddressPage.bilingAdresHataSembolü.isDisplayed());
            Reporter.log("KULLANICI PHONE ALANINA GECERLİ DEGER GİRMESİ GEREKTİGİ MESAJINI GÖRÜR..");

        }

        @Test(priority = 11)
        public void testUS03_TC2_03() throws InterruptedException, IOException {

            TestCaselogin();
            Reporter.log("KULLANICI LOGİN OLUR.");
            ReusableMethods.waitFor(2);
            Assert.assertTrue(myAccountPage.myAccountYazisi.isDisplayed());
            Reporter.log("KULLANICI SAYFAYA BASARILI SEKİLDE GİRİS YAPAR.");
            ReusableMethods.waitFor(2);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(2);
            myAccountPage.adressesButonu.click();
            Reporter.log("KULLANICI ADRESS BUTONUNU TIKLAR.");
            ReusableMethods.waitFor(2);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(2);
            savePage.bilingaddButonu.click();
            Reporter.log("KULLANICI BİLLİNG ADRES ALTINDAKİ ADD BUTONU TIKLAR.");
            ReusableMethods.waitFor(2);
            actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(2);
            clearMethod();
            Reporter.log("KULLANICI MENUDEKİ ALANLARIN BOS OLDUGUNDAN EMİN OLUR.");
            billingAddressPage.bilingFirstName.sendKeys("ALİ");
            Reporter.log("KULLANICI FİRST NAME ALANINA GECERLİ BİR AD GİRER.");
            ReusableMethods.waitFor(2);
            billingAddressPage.bilingLastName.sendKeys("ÇELİK");
            Reporter.log("KULLANICI LAST NAME ALANINA GECERLİ BİR SOYAD GİRER.");
            billingAddressPage.bilingCompanyName.sendKeys("sabancı");
            Reporter.log("KULLANICI COMPANY NAME ALANINA GECERLİ FİRMA ADI GİRER.");
            ReusableMethods.waitFor(2);
            bilingCountry();
            Reporter.log("KULLANICI COUNTRY ALANINDA TURKEY'İ SECER.");
            ReusableMethods.waitFor(2);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(2);
            billingAddressPage.bilingStreet.sendKeys("Sarıcalı");
            Reporter.log("KULLANICI STREET ALANINA GECERLİ CADDE ADI GİRER.");
            ReusableMethods.waitFor(2);
            billingAddressPage.bilingApartman.sendKeys("ÇELİK");
            Reporter.log("KULLANICI APARTMEN/SUİT ALANINA GECERLİ APARTMAN ADI GİRER.");
            ReusableMethods.waitFor(2);
            billingAddressPage.bilingZipCode.clear();
            ReusableMethods.waitFor(2);
            billingAddressPage.bilingZipCode.sendKeys("55500");
            Reporter.log("KULLANICI POSTCODE/ZİP ALANINA GECERLİ CADDE ADI GİRER.");
            ReusableMethods.waitFor(2);
            billingAddressPage.bilingTownCity.sendKeys("Samsun");
            Reporter.log("KULLANICI TOWN/CİTY ALANINA GECERLİ SEHİR ADI GİRER.");
            bilingProvince();
            Reporter.log("KULLANICI PROVİNCE ALANINDA SAMSUN'U SECER.");
            ReusableMethods.waitFor(2);
            //Kullanıcı Phone alanına gecerli sayılan bir telefon numarası girer.
            billingAddressPage.bilingPhone.sendKeys("555-555-55-55");
            Reporter.log("KULLANICI PHONE ALANINA GECERLİ TELEFON NUMARASI GİRER.");
            ReusableMethods.waitFor(2);
            Assert.assertTrue(billingAddressPage.bilingEmail.isDisplayed());
            Reporter.log("KULLANICI SAYFA ALTINDA E-MAİL ADRESİNİ GÖRÜNTÜLER.");
            billingAddressPage.bilingSaveAdresButonu.click();
            Reporter.log("KULLANICI SAVE ADRESS BUTONUNU TIKLAR.");
            ReusableMethods.waitFor(2);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(2);
            Assert.assertTrue(editPage.kayıtGerceklesti.isDisplayed());
            Reporter.log("KULLANICI İŞLEM BAŞARILI MESAJINI GÖRÜR.");
            Assert.assertTrue(savePage.shippingAddButonu.isDisplayed());
            Reporter.log("KULLANICI 'EDIT YOUR SHIPPING ADDRESS' BUTONUNU GÖRÜNTÜLER.");



        }
          @AfterMethod
          public void tearDown() throws IOException {
              ReusableMethods.getScreenshot("Son sayfa");
              Reporter.log("KULLANICI SAYFAYI KAPATIR.");
              Driver.closeDriver();
          }

    }


