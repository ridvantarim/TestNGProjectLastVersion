package Tests.US11_US12;

import Pages.US11_US12.MyAccount11;
import Pages.US11_US12.VendorLogin11;
import Utilities.ConfigReader;
import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyAccountTest11 {
    MyAccount11 myAccount=new MyAccount11();

    VendorLogin11 vendorLogin=new VendorLogin11();
    @Test
    public void MyAccountTest() throws InterruptedException {

        Reporter.log("https://hubcomfy.com/ adresine gidildi");
        Driver.getDriver().get(ConfigReader.getProperty("appUrl"));
        Thread.sleep(3000);
        vendorLogin.signInButton.click();
        vendorLogin.usernameButton.sendKeys(ConfigReader.getProperty("vendormail"));
        Reporter.log("vendor mail girildi");
        vendorLogin.passwordButton.sendKeys(ConfigReader.getProperty("vendorpassword"));
        Reporter.log("vendor password girildi");
        Thread.sleep(1000);
        vendorLogin.loginButton.click();
        Thread.sleep(3000);

        myAccount.signOutButton.click();
        Assert.assertTrue(myAccount.myAccountTittle.getText().contains("My Account"));
        Reporter.log("My Account yazısı dogrulandı");

        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();


        for (WebElement w : myAccount.fonksiyonlar) {
            System.out.println(w.getText());
        }



        String order= myAccount.fonksiyonlar.get(0).getText();
        String  DOWNLOADS= myAccount.fonksiyonlar.get(1).getText();
        String ADDRESSES= myAccount.fonksiyonlar.get(2).getText();
        String ACCOUNTDETAILS= myAccount.fonksiyonlar.get(3).getText();
        String WISHLIST= myAccount.fonksiyonlar.get(4).getText();
        String LOGOUT= myAccount.fonksiyonlar.get(5).getText();

        Reporter.log("Dashboard altındaki ordes, downlods, addresses, account, wishlist, logout yazılarının oldugu dogrulandı");
        Assert.assertEquals("ORDERS",order);
        Assert.assertEquals("DOWNLOADS",DOWNLOADS);
        Assert.assertEquals("ADDRESSES",ADDRESSES);
        Assert.assertTrue(ACCOUNTDETAILS.contains("ACCOUNT"));
        Assert.assertEquals("WISHLIST",WISHLIST);
        Assert.assertEquals("LOGOUT",LOGOUT);

        for (WebElement m: myAccount.fonksiyonlar1){
            System.out.println(m.getText());
        }

        String Dashboard = myAccount.fonksiyonlar1.get(0).getText();
        String Store = myAccount.fonksiyonlar1.get(1).getText();
        String Orders = myAccount.fonksiyonlar1.get(2).getText();
        String Downloads = myAccount.fonksiyonlar1.get(3).getText();
        String Addresses = myAccount.fonksiyonlar1.get(4).getText();
        String Account = myAccount.fonksiyonlar1.get(5).getText();
        String Wishlist = myAccount.fonksiyonlar1.get(6).getText();
        String Support = myAccount.fonksiyonlar1.get(7).getText();
        String Followings = myAccount.fonksiyonlar1.get(8).getText();
        String Logout = myAccount.fonksiyonlar1.get(9).getText();

        Assert.assertEquals("Dashboard",Dashboard);
        Assert.assertTrue(Store.contains("Store"));
        Assert.assertEquals("Orders",Orders);
        Assert.assertEquals("Downloads",Downloads);
        Assert.assertEquals("Addresses",Addresses);
        Assert.assertTrue(Account.contains("Account"));
        Assert.assertEquals("Wishlist",Wishlist);
        Assert.assertTrue(Support.contains("Support"));
        Assert.assertTrue(Followings.contains("Followings"));
        Assert.assertEquals("Logout",Logout);

    }
}



