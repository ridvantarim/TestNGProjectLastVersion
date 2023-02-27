package Tests.US18_US19_US20;

import Pages.US18Pages.CouponPage;
import Pages.US18Pages.HomePage18_19_20;
import Pages.US18Pages.LoginPage18_19_20;
import Pages.US18Pages.StoreManagerPage;
import Utilities.Driver;
import Utilities.ExcelUtils;
import Utilities.ReusableMethods;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import static Utilities.US18_19_20Methods.vendorKayitliGiris;

public class US20Tests {
    HomePage18_19_20 homePage18_19_20;
    LoginPage18_19_20 loginPage18_19_20;
    StoreManagerPage storeManagerPage;
    CouponPage couponPage;
    ExcelUtils excelUtils;

    @Test
    public void TC01() {
        Reporter.log("==================================US20==============================");
        Reporter.log("===========TC01 Code yazabilmeliyim===========");
        vendorKayitliGiris();
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.waitFor(5);
        storeManagerPage = new StoreManagerPage();
        loginPage18_19_20 = new LoginPage18_19_20();
        homePage18_19_20 = new HomePage18_19_20();
        String path = "./src/test/resources/TestExcelData.xlsx";
        String sheetname = "Sayfa1";
        excelUtils = new ExcelUtils(path, sheetname);
        couponPage = new CouponPage();
        ReusableMethods.clickJS(couponPage.coupons);
        ReusableMethods.clickJS(couponPage.addnewcoupon);
        Reporter.log("ADD NEW COUPON SAYFASINA GELINDI");
        couponPage.code.sendKeys(excelUtils.getCellData(1, 2));
        ReusableMethods.waitFor(5);
        Reporter.log("CODE YAZILDIGI DOGRULANDI");
    }

    @Test
    public void TC02() {
        Reporter.log("===========TC02 Description yazılabilmeli===========");
        couponPage.descCoupon.sendKeys(excelUtils.getCellData(2, 2));
        Reporter.log("DESCRIPTION YAZILDIGI DOGRULANDI");
    }

    @Test
    public void TC03() {
        Reporter.log("===========TC03 Discount Type; Percentage discount veya Fixed Product Discount olarak seçilebilmeli===========");
        ReusableMethods.dropdownMethod(couponPage.discTypedrop, excelUtils.getCellData(3, 2));
        Reporter.log("COUPON TYPE SECILDIGI DOGRULANDI");
    }

    @Test
    public void TC04() {
        Reporter.log("===========TC04 Coupon Amount yazılabilmeli===========");
        couponPage.couponamount.sendKeys(excelUtils.getCellData(4, 2));
        Reporter.log("COUPON AMOUNT GIRILDIGI DOGRULANDI");
    }

    @Test
    public void TC05() {
        Reporter.log("===========TC05 Coupon expiry date girilebilmeli===========");
        couponPage.expirydate.sendKeys(excelUtils.getCellData(5, 2));
        Reporter.log("EXPIRY DATE GIRILDIGI DOGRULANDI");
    }

    @Test
    public void TC06() {
        Reporter.log("===========TC06 Allow free shipping, Show on store seçilebilmeli===========");
        ReusableMethods.clickJS(couponPage.freeshiping);
        Assert.assertTrue(couponPage.freeshiping.isSelected());
        Reporter.log("ALLOW FREE SHIPPING SECILDIGI DOGRULANDI");
        ReusableMethods.clickJS(couponPage.showonstore);
        Assert.assertTrue(couponPage.showonstore.isSelected());
        Reporter.log("SHOW ON STORE SECILDIGI DOGRULANDI");
    }

    @Test
    public void TC07() {
        Reporter.log("===========TC07 Coupons oluşturulduğu görülmeli===========");
        ReusableMethods.clickWithJS(couponPage.submitcoupon);
        ReusableMethods.clickWithJS(couponPage.couponsactive);
        Assert.assertEquals(couponPage.couponlistingcode.getText(), excelUtils.getCellData(1, 2));
        Driver.closeDriver();
    }


}
