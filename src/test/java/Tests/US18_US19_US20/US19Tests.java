package Tests.US18_US19_US20;

import Pages.US18Pages.BillingPage;
import Pages.US18Pages.HomePage18_19_20;
import Pages.US18Pages.LoginPage18_19_20;
import Pages.US18Pages.StoreManagerPage;
import Utilities.Driver;
import Utilities.ReusableMethods;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import static Utilities.US18_19_20Methods.vendorKayitliGirisAnasayfa;

public class US19Tests {
    HomePage18_19_20 homePage18_19_20;
    LoginPage18_19_20 loginPage18_19_20;
    StoreManagerPage storeManagerPage;
    BillingPage billingPage;

    @Test
    public void TC01() {
        Reporter.log("==================================US19==============================");
        Reporter.log("===========TC01 Ürün ve ürünler seçilip sepete eklenebilmeli===========");
        vendorKayitliGirisAnasayfa();
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.waitFor(5);
        storeManagerPage = new StoreManagerPage();
        loginPage18_19_20 = new LoginPage18_19_20();
        homePage18_19_20 = new HomePage18_19_20();
        homePage18_19_20.logo.click();
        ReusableMethods.waitFor(5);
        ReusableMethods.clickJS(homePage18_19_20.addtocart);
        ReusableMethods.waitFor(5);
        homePage18_19_20.cartbutton.click();
        homePage18_19_20.viewcartbutton.click();
        String expectedResult = homePage18_19_20.addedproductname.getText();
        Assert.assertEquals(expectedResult, homePage18_19_20.addedproductname.getText());
        Reporter.log("SECILEN URUN SEPETE EKLENDI");
    }

    @Test
    public void TC02() {
        Reporter.log("===========TC02 Chart - Chekout yapılarak alınacak ürün ve ürünler görülebilmel===========");
        homePage18_19_20.checkout.click();
        String expectedResult = homePage18_19_20.addedproductname.getText();
        Assert.assertTrue(expectedResult.contains(homePage18_19_20.orderedproductname.getText()));
        Reporter.log("ALINACAK URUNLER GORUNTULENDI");
    }

    @Test
    public void TC03() {
        Reporter.log("===========TC03 Fatura ayrıntıları (BILLING DETAILS) doldurulabilmeli===========");
        billingPage = new BillingPage();
        Faker faker = new Faker();
        billingPage.firstname.sendKeys(faker.name().firstName());
        billingPage.lastname.sendKeys(faker.name().lastName());
        billingPage.companyname.sendKeys(faker.company().name());
        ReusableMethods.dropdownMethod(billingPage.countrydrop, "United States");
        billingPage.adressstr.sendKeys(faker.address().streetAddress());
        billingPage.adressapt.sendKeys(faker.address().buildingNumber());
        billingPage.city.sendKeys(faker.address().city());
        ReusableMethods.waitFor(5);
        billingPage.postcode.sendKeys("");
        ReusableMethods.dropdownMethod(billingPage.statedrop, "Alaska");
        billingPage.phone.sendKeys(faker.phoneNumber().cellPhone());
        billingPage.textarea.sendKeys(faker.gameOfThrones().dragon());
        Reporter.log("FATURA AYRINTILARI (BILLING DETAILS) DOLDURULDU");
    }

    @Test
    public void TC04() {
        Reporter.log("===========TC04 Toplam ödenecek rakam görüntülebilmeli===========");
        ReusableMethods.verifyElementDisplayed(billingPage.price);
        Reporter.log("TOPLAM ODENECEK RAKAM GORUNTULENDI");
    }

    @Test
    public void TC05() {
        Reporter.log("===TC05 Wire transfer/EFT veya Pay at the door seçenekleri seçilebilmeli===");
        ReusableMethods.clickJS(billingPage.wiretransfer);
        Assert.assertTrue(billingPage.wiretransfer.isSelected());
        ReusableMethods.clickJS(billingPage.payatdoor);
        Assert.assertTrue(billingPage.payatdoor.isSelected());
        Reporter.log("WIRE TRANSFER VE PAY AT DOOR SECENEKLERI SECILDI");
    }

    @Test
    public void TC06() {
        Reporter.log("===TC06 Place Order'a tıklanarak alışverişin tamamlandığı görülebilmeli===");
        ReusableMethods.clickJS(billingPage.placeorder);
        Assert.assertEquals(billingPage.orderreceivedtext.getText(), "Thank you. Your order has been received.");
        Reporter.log("PLACE ORDER A BASILDI VE SIPARISIN ALINDIGI ONAYLANDI");
    }

    @Test
    public void TC07() {
        Reporter.log("===TC07 My Account -Orders yapılan alışverişin ayrıntıları görülebilmeli===");
        ReusableMethods.clickWithJS(billingPage.myaccount);
        ReusableMethods.clickWithJS(billingPage.orders);
        ReusableMethods.clickWithJS(billingPage.vieworderdetails);
        ReusableMethods.verifyElementDisplayed(billingPage.orderdetailstext);
        Reporter.log("YAPILAN ALISVERISIN AYRINTILARI GORUNTULENDI");
        Driver.closeDriver();
    }



}
