package Tests.US05_US06_US17;

import Pages.US05_US06_US17.CartPage;
import Pages.US05_US06_US17.CheckoutPage;
import Pages.US05_US06_US17.ProductPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import pages.US05_US06_US17.HomePage;


import javax.swing.*;

public class US06_KullaniciAlisveris {

    HomePage homePage = new HomePage();
    ProductPage productPage = new ProductPage();

    CartPage cartPage = new CartPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Test(priority = 1)
    public void searchProduct(){

        //  Kullanici https://hubcomfy.com/ adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("appUrl"));


//  Kullanici "Sign In" butonuna tıklar
        homePage.signInButton.click();

//  Kullanıcı, giriş için gerekli bilgileri doldurur ve "SIGN IN" butonuna tıklar
        homePage.usernameText.sendKeys(ConfigReader.getProperty("username"));
        homePage.passwordText.sendKeys(ConfigReader.getProperty("userpassword"));
        homePage.signInClick.click();

        ReusableMethods.waitFor(3);

//      Kullanici "Search Box" alanına "Multi Functional Apple iPhone" yazar ve aratır
        ReusableMethods.typeWithJS(homePage.searchBox,"Multi Functional Apple iPhone");
        ReusableMethods.clickByJS(homePage.searchButton);

        ReusableMethods.waitFor(2);

//      Kullanıcı aradığı ürünün görünür olduğunu doğrular

        Assert.assertEquals(productPage.product1.getText(),"Multi Functional Apple iPhone");


    }

    @Test(priority = 2)
    public void addToCart(){

        //Kullanıcı "Add to Cart" butonuna tıklayabilmelidir.
        ReusableMethods.clickByJS(productPage.addToCart);
    }

    @Test(priority = 3)
    public void viewProductInCart(){

//      Kullanıcı "Cart" butonuna tıklayabilmelidir.
        ReusableMethods.clickByJS(productPage.cart);

//      Kullanıcı "VIEW CART" butonuna tıklayabilmelidir.
        ReusableMethods.clickByJS(productPage.viewCart);

//      Kullanıcı eklemiş olduğu ürünü sepetinde görüntüleyebilmelidir.
        Assert.assertTrue(cartPage.productIsVisible.isDisplayed());
    }

    @Test(priority = 4)
    public void quantityChange(){

//      Kullanıcı eklemiş olduğu ürünün miktarını artırabilmelidir.
        ReusableMethods.waitFor(2);
        cartPage.plusButton.click();

//      Kullanıcı eklemiş olduğu ürünün miktarını azaltabilmelidir.
        ReusableMethods.waitFor(2);
        cartPage.minusButton.click();

    }

    @Test(priority = 5)
    public void billingDetails(){

//  Kullanıcı "PROCEED TO CHECKOUT" butonuna tıklayabilmelidir
        ReusableMethods.clickWithJS(cartPage.proceedToCheckout);

//  Kullanıcı "BILLING DETAILS" alanının altında fatura adresini görüntüleyebilmelidir.
        ReusableMethods.scrollIntoViewJS(checkoutPage.billingAdress);
        Assert.assertTrue(checkoutPage.billingAdress.isDisplayed());
    }

    @Test(priority = 6)
    public void paymentMethods(){

//      Kullanıcı "Payment Methods" alanını görüntüleyebilmelidir.
        ReusableMethods.scrollIntoViewJS(checkoutPage.paymentMethods);
        Assert.assertTrue(checkoutPage.paymentMethods.isDisplayed());

//      Kullanici "Pay at the door" seçeneğini seçebilmelidir
        ReusableMethods.clickWithJS(checkoutPage.payAtTheDoor);

//      Kullanici "Wire transfer/EFT" seçeneğini seçebilmelidir
        ReusableMethods.waitFor(1);
        ReusableMethods.clickWithJS(checkoutPage.wireTransfer);
        ReusableMethods.waitFor(1);

    }

    @Test(priority = 7)
    public void placeOrder(){

//  Kullanici "PLACE ORDER" butonuna tıklayabilmelidir.
        ReusableMethods.clickWithJS(checkoutPage.placeOrder);

//  Kullanici "Thank you. Your order has been received." onay mesajını görüntüleyebilmelidir.
        ReusableMethods.waitFor(3);
        Assert.assertTrue(checkoutPage.thankYou.isDisplayed());
    }

    @AfterClass
    public void tearDown(){
        Driver.closeDriver();
    }

}
