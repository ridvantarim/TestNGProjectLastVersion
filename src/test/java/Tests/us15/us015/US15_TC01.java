package Tests.us15.us015;

import Pages.us15_16.HomePage;
import Pages.us15_16.StoreManagerPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;



public class US15_TC01 extends ReusableMethods {


    HomePage homePage;
    StoreManagerPage storeManagerPage;

    @Test
    public void test01() {
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
        Reporter.log("Attributes Butnuna Tkla");
        ReusableMethods.clickByJS(storeManagerPage.attributes);
        Reporter.log("color Butonuna Tıkla");
        ReusableMethods.clickByJS(storeManagerPage.color);
        ReusableMethods.waitFor(2);
        Reporter.log("SelectAll Butonuna Tıkla");
        ReusableMethods.clickByJS(storeManagerPage.selectAll);
        ReusableMethods.waitFor(2);
        Reporter.log("SelectNone Butonuna tıkla");
        ReusableMethods.clickByJS(storeManagerPage.selectNone);
        ReusableMethods.waitFor(2);
        Reporter.log("AddNew Butonuna Tıkla");
        ReusableMethods.clickByJS(storeManagerPage.addNew);
        ReusableMethods.waitFor(5);
        Reporter.log("AddNew Butonuna Deger Gir");
        Driver.getDriver().switchTo().alert().sendKeys("FwedcsnbJ");
        ReusableMethods.waitFor(2);
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethods.waitFor(5);
    }

    @Test
    public void test3() {
        Reporter.log("Attributes Butnuna Tkla");
        ReusableMethods.clickWithTimeOut(storeManagerPage.attributes,2);
        Reporter.log("Size Butonuna Tıkla");
        ReusableMethods.clickByJS(storeManagerPage.size);
        ReusableMethods.waitFor(2);
        Reporter.log("SelectAll Butonuna Tıkla");
        ReusableMethods.clickByJS(storeManagerPage.selectAll2);
        ReusableMethods.waitFor(2);
        Reporter.log("SelectNone Butonuna Tıkla");
        ReusableMethods.clickByJS(storeManagerPage.selectNone2);
        ReusableMethods.waitFor(2);
        Reporter.log("AddNew Butonuna Tıkla");
        ReusableMethods.clickByJS(storeManagerPage.addNew2);
        ReusableMethods.waitFor(5);
        Reporter.log("AddNew Butonuna Deger Gir");
        Driver.getDriver().switchTo().alert().sendKeys("77");
        ReusableMethods.waitFor(3);
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethods.waitFor(3);

    }

    @Test
    public void test4() {
        Reporter.log("Linked Butonua Tıkla");
        ReusableMethods.clickWithTimeOut(storeManagerPage.linked,2);
        ReusableMethods.clickByJS(storeManagerPage.upSells);
    }

    @Test
    public void test5() {
        Reporter.log("Seo Butnuna Tıkla");
        ReusableMethods.clickByJS(storeManagerPage.seo);
        Reporter.log("EnterAFocusKeyword Butonuna Tıkla");
        ReusableMethods.clickByJS(storeManagerPage.enterAFocusKeyword);
        ReusableMethods.waitFor(2);
        Reporter.log("EnterAFocusKeyword Butonuna Deger Gir");
        storeManagerPage.enterAFocusKeyword.sendKeys("353gsd");
        Reporter.log("MetaDescription Butonuna Deger Gir");
        storeManagerPage.metaDescription.sendKeys("74563");
    }

    @Test
    public void test6() {
        Reporter.log("WholesaleProductDisplaySettings Butonuna Tikla");
        ReusableMethods.clickByJS(storeManagerPage.wholesaleProductDisplaySettings);
        Reporter.log("PriceType Alanından Deger Sec");
        Select select = new Select(storeManagerPage.priceType);
        select.selectByVisibleText("Kg");
        Reporter.log("UnitsPerPrice Alanına Deger Gır");
        storeManagerPage.unitsPerPrice.sendKeys("34");
        Reporter.log("MinOrderQuantity Alanına Deger Gır");
        storeManagerPage.minOrderQuantity.sendKeys("76");

    }

    @Test
    public void test7() {
        Reporter.log("İnventory Butonuna Tıkla");
        ReusableMethods.clickByJS(storeManagerPage.inventory);
        Reporter.log("sku Alanına Deger Gir");
        storeManagerPage.sku.sendKeys("skvms345");
        Reporter.log("ManageStock Butonuna Tıkla");
        ReusableMethods.clickByJS(storeManagerPage.manageStock);
        Reporter.log("StockQty Alanına Deger Gir");
        storeManagerPage.stockQty.sendKeys("43");
        Reporter.log("AllowBackorders Alanından Bölüm Sec");
        Select select = new Select(storeManagerPage.allowBackorders);
        select.selectByVisibleText("Allow");
        ReusableMethods.clickByJS(storeManagerPage.soldIndividually);

    }

    @Test
    public void test8() {
        Reporter.log("Advenced Butonuna Tıkla");
        ReusableMethods.clickByJS(storeManagerPage.advanced);
        Reporter.log("EnableReviews Butonuna Tıkla");
        ReusableMethods.clickByJS(storeManagerPage.enableReviews);
        Reporter.log("MenuOrder Deger Gır");
        storeManagerPage.menuOrder.sendKeys("876");
        Reporter.log("PurchaseNote Deger Gır");
        storeManagerPage.purchaseNote.sendKeys("235235grsbgresd");
    }

    @Test
    public void test9() {
        Reporter.log("Shipping Butonuna Tıklar ");
        ReusableMethods.clickByJS(storeManagerPage.shipping);
        Reporter.log("Weight Deger Gir");
        storeManagerPage.weight.sendKeys("3255");
        Reporter.log("Lenght Deger Gir");
        storeManagerPage.lenght.sendKeys("35325");
        Reporter.log("Width Deger Gir");
        storeManagerPage.width.sendKeys("457");
        Reporter.log("Height Deger Gir");
        storeManagerPage.height.sendKeys("32253");
        Reporter.log("ShippingClass Gorunurlugunu Dogrula");
        storeManagerPage.shippingClass.isDisplayed();
        Reporter.log("Processingtime Aanından Bölüm Sec");
        Select select = new Select(storeManagerPage.processingtime);
        select.selectByVisibleText("1-2 weeks");

    }




    @AfterTest
    public void terDown() {
        Reporter.log("Driveri Kapat");
        Driver.closeDriver();

    }
}
