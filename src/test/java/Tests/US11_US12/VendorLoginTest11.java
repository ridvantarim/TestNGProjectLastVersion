package Tests.US11_US12;

import Pages.US11_US12.VendorLogin11;
import Utilities.ConfigReader;
import Utilities.Driver;
import org.testng.annotations.Test;

public class VendorLoginTest11 {

    VendorLogin11 vendorLogin;
    @Test
    public void vendorLoginTest() throws InterruptedException {
        //sayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("appUrl"));

        //pages objesini olustur
        vendorLogin=new VendorLogin11();

        Thread.sleep(3000);
        vendorLogin.signInButton.click();
        vendorLogin.usernameButton.sendKeys(ConfigReader.getProperty("vendormail"));
        vendorLogin.passwordButton.sendKeys(ConfigReader.getProperty("vendorpassword"));
        Thread.sleep(1000);
        vendorLogin.loginButton.click();
        Thread.sleep(3000);




    }
}
