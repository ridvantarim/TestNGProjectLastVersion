package Tests.US07_08;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Pages.US07_08Pages.*;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;

public class US08_Test extends ReusableMethods{

    HomePage homePage;
    LoginPage loginPage;

    SearchResultPage searchResultPage;

    ComparePage comparePage;

    WhishListPage whishListPage;

    ShoppingCartPage shoppingCartPage;

    CheckOutPage checkOutPage;

    OrderCompletePage orderCompletePage;


    @Test
    public void testCase01() {

        homePage = new HomePage();
        loginPage = new LoginPage();
        searchResultPage = new SearchResultPage();
        comparePage = new ComparePage();
        whishListPage = new WhishListPage();

        Driver.getDriver().get(ConfigReader.getProperty("appUrl"));
        Reporter.log("KULLANICI URL YE GİDER");
        homePage.signInButton.click();
        Reporter.log("KULLANICI SIGN IN BUTONUNA TIKLAR");
        loginPage.userName.sendKeys(ConfigReader.getProperty("username"));
        Reporter.log("KULLANICI USERNAME GIRER");
        loginPage.password.sendKeys(ConfigReader.getProperty("userpassword"));
        Reporter.log("KULLANICI PASSWORD GIRER");
        loginPage.loginButton.click();
        Reporter.log("KULLANICI LOGIN BUTONUNA TIKLAR");
        ReusableMethods.waitFor(3);
        homePage.searchBox.sendKeys("iphone");
        Reporter.log("KULLANICI SEARCHBOX A IPHONE GIRER ");
        ReusableMethods.waitFor(2);
        homePage.buyutec.submit();
        Reporter.log("KULLANICI BUYUTEC IKONUNA TIKLAR");
        ReusableMethods.waitFor(2);
        Assert.assertTrue(searchResultPage.sonucYazisi.isDisplayed());
        Reporter.log("KULLANICI Search results for İPHONE YAZISININ GORUNDUGUNU DOGRULAR");
        ReusableMethods.waitFor(5);
        ReusableMethods.clickWithJS(searchResultPage.likeIkonu1);
        Reporter.log("KULLANICI LIKE BUTONUNA TIKLAR");
        ReusableMethods.waitFor(2);


    }

    @Test
    public void testCase02() {

        homePage = new HomePage();
        loginPage = new LoginPage();
        searchResultPage = new SearchResultPage();
        comparePage = new ComparePage();
        whishListPage = new WhishListPage();


        ReusableMethods.clickWithJS(searchResultPage.likeIkonu2);
        Reporter.log("KULLANICI LIKE BUTONUNA TIKLAR");
        ReusableMethods.clickWithJS(homePage.wishList);
        Reporter.log("KULLANICI WHISHLIST SAYFASINI ACAR");
        Reporter.log("");
        Assert.assertTrue(whishListPage.whishListYazisi.isDisplayed());
        Reporter.log("KULLANICI WHISHLIST SAYFASININ ACILDIGINI DOGRULAR");
        ReusableMethods.waitFor(2);


    }

    @Test
    public void testCase03() {

        homePage = new HomePage();
        loginPage = new LoginPage();
        searchResultPage = new SearchResultPage();
        comparePage = new ComparePage();
        whishListPage = new WhishListPage();


        ReusableMethods.clickByJS(searchResultPage.likeIkonu3);
        Reporter.log("KULLANICI LIKE BUTONUNA TIKLAR");
        ReusableMethods.clickWithJS(homePage.wishList);
        Reporter.log("KULLANICI WHISHLIST SAYFASINI ACAR");
        Assert.assertTrue(whishListPage.whishListYazisi.isDisplayed());
        Reporter.log("KULLANICI PRODUCT YAZISININ GORUNDUGUNU DOGRULAR");
        ReusableMethods.clickWithJS(whishListPage.quickView);
        Reporter.log("KULLANICI QUICKVIEW BUTONUNA TIKLAR");
        ReusableMethods.waitFor(5);
        Assert.assertTrue(whishListPage.bluetooth.isDisplayed());
        Reporter.log("KULLANICI CATEGORY YAZISININ GORUNDUGUNU DOGRULAR");
        ReusableMethods.waitFor(3);


    }

    @Test
    public void testCase04() {

        homePage = new HomePage();
        loginPage = new LoginPage();
        searchResultPage = new SearchResultPage();
        comparePage = new ComparePage();
        whishListPage = new WhishListPage();



        ReusableMethods.clickWithJS(searchResultPage.likeIkonu1);
        Reporter.log("KULLANICI LIKE IKONUNA TIKLAR");
        ReusableMethods.clickWithJS(homePage.wishList);
        Reporter.log("KULLANICI WHISHLIST SAYFASINI ACAR");
        Assert.assertTrue(whishListPage.whishListYazisi.isDisplayed());
        Reporter.log("KULLANICI WHISHLIST SAYFASININ ACILDIGINI DOGRULAR");
        ReusableMethods.clickWithJS(whishListPage.addToCartButton);
        Reporter.log("KULLANICI ADD TO CART BUTONUNA TIKLAR");
        ReusableMethods.waitFor(5);
        Assert.assertTrue(whishListPage.cartEkleYazisi.isDisplayed());
        Reporter.log("KULLANICI VIEW CART SAYFASININ ACILDIGINI DOGRULAR");
        ReusableMethods.waitFor(2);



    }

    @Test
    public void testCase05() {


        homePage = new HomePage();
        loginPage = new LoginPage();
        searchResultPage = new SearchResultPage();
        comparePage = new ComparePage();
        whishListPage = new WhishListPage();
        shoppingCartPage= new ShoppingCartPage();
        checkOutPage = new CheckOutPage();
        orderCompletePage =new OrderCompletePage();


        ReusableMethods.clickWithJS(searchResultPage.likeIkonu2);
        Reporter.log("KULLANICI LIKE IKONUNA TIKLAR");
        ReusableMethods.clickWithJS(homePage.wishList);
        Reporter.log("KULLANICI WHISHLIST SAYFASINI ACAR");
        Assert.assertTrue(whishListPage.whishListYazisi.isDisplayed());
        Reporter.log("KULLANICI WHISHLIST SAYFASININ ACILDIGINI DOGRULAR");
        ReusableMethods.clickWithJS(whishListPage.addToCartButton);
        Reporter.log("KULLANICI ADD TO CART BUTONUNA TIKLAR");
        ReusableMethods.clickWithJS(whishListPage.cartButton);
        Reporter.log("KULLANICI CART BUTONUNA TIKLAR");
        Assert.assertTrue(whishListPage.shoppingCart.isDisplayed());
        Reporter.log("KULLANICI SHOPPINGCART SAYFASININ ACILDIGINI DOGRULAR");
        ReusableMethods.clickWithJS(whishListPage.viewCartEkleme);
        Reporter.log("KULLANICI VIEW CART SEKMESINE TIKLAR");
        ReusableMethods.waitFor(5);
        Assert.assertTrue(shoppingCartPage.cartTotalsYazisi.isDisplayed());
        Reporter.log("KULLANICI CART TOTALS YAZISININ GORUNDUGUNU DOGRULAR");
        ReusableMethods.scrollIntoViewJS(shoppingCartPage.proceeedToCheckOut);
        Reporter.log("KULLANICI SAYFAYI ASAGI KAYDIRIR");
        ReusableMethods.clickWithJS(shoppingCartPage.proceeedToCheckOut);
        Reporter.log("KULLANICI PROCEED TO CHECK OUT SEKMESINE TIKLAR");
        ReusableMethods.waitFor(5);
        ReusableMethods.scrollIntoViewJS(checkOutPage.placeOrder);
        Reporter.log("KULLANICI SAYFAYI ASAGI KAYDIRIR");
        ReusableMethods.clickWithJS(checkOutPage.placeOrder);
        Reporter.log("KULLANICI PLACE ORDER SEKMESINE TIKLAR");
        ReusableMethods.waitFor(5);
        Assert.assertTrue(orderCompletePage.thankYouYazisi.isDisplayed());
        Reporter.log("KULLANICI Thank you. Your order has been received YAZISININ GORUNUR OLDUGUNU DOGRULAR");


    }
    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get(ConfigReader.getProperty("appUrl"));
        try {
            ReusableMethods.clickWithJS(homePage.signInButton);
            loginPage.userName.sendKeys(ConfigReader.getProperty("username"));
            loginPage.password.sendKeys(ConfigReader.getProperty("userpassword"));
            loginPage.loginButton.click();
        } catch (Exception e) {

        }
    }

//    @AfterTest
//    public void terDown() {
//        Driver.closeDriver();
//    }
}

