package Tests.us16;

import Pages.us15_16.HomePage;
import Pages.us15_16.StoreManagerPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class US16_TC01 extends ReusableMethods {
    HomePage homePage;
    StoreManagerPage storeManagerPage;

    @Test
    public void test1() {
        Reporter.log("HomPage Sayfasına Gitti");
        homePage = new HomePage();
        Reporter.log("StoreManagerPage Sayfasına Gitti");
        storeManagerPage = new StoreManagerPage();
        Reporter.log("Giris Sayfasına Geldi");
        Driver.getDriver().get(ConfigReader.getProperty("appUrl"));
        Reporter.log("Giriş Bigierini Gir");
        homePage.login(ConfigReader.getProperty("seymaUsername"), ConfigReader.getProperty("seymaPassword"));
        storeManagerPage.addProduct();


    }

    @Test
    public void test2() {
        Reporter.log("AddNewButtonun Gorunur Odugunu Dogrula");
        assert storeManagerPage.addNewButton.isDisplayed();
        Reporter.log("SimplePrduct'un Gorunur Oldugunu Dogrula");
        assert storeManagerPage.simpleProduct.isDisplayed();

    }

    @Test
    public void test3() {
        Reporter.log("Virtuala Tıkla");
        ReusableMethods.clickByJS(storeManagerPage.virtual);
        ReusableMethods.waitFor(2);

    }

    @Test
    public void test4() {
        Reporter.log("Dpwnloadablea Tıkla");
        ReusableMethods.clickByJS(storeManagerPage.downloadable);
        ReusableMethods.waitFor(2);
    }

    @Test
    public void test5() {
        Reporter.log("Product Title Bıigileri Gir");
        storeManagerPage.productTite.sendKeys("Product Title");
        ReusableMethods.waitFor(2);
    }

    @Test
    public void test6() {
        Reporter.log("Price'ye Bıgılerı Gır");
        storeManagerPage.price.sendKeys("77");
        ReusableMethods.waitFor(2);
    }

    @Test
    public void test7() {
        Reporter.log("SalePrice'ye Bilgileri Gir");
        storeManagerPage.salePrice.sendKeys("77");
    }

    @AfterTest
    public void terDown() {
        Reporter.log("Driveri Kapat");
        Driver.closeDriver();
    }
}
