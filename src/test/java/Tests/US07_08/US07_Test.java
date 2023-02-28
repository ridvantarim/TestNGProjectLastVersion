package Tests.US07_08;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import Pages.US07_08Pages.ComparePage;
import Pages.US07_08Pages.HomePage;
import Pages.US07_08Pages.LoginPage;
import Pages.US07_08Pages.SearchResultPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;

public class US07_Test extends ReusableMethods {

    HomePage homePage;
    LoginPage loginPage;

    SearchResultPage searchResultPage;

    ComparePage comparePage;


    @Test
    public void testCase01() {

        homePage = new HomePage();
        loginPage = new LoginPage();
        searchResultPage = new SearchResultPage();
        comparePage = new ComparePage();

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
        ReusableMethods.waitFor(2);
        homePage.searchBox.sendKeys("iphone");
        Reporter.log("KULLANICI SEARCHBOX A IPHONE GIRER ");
        ReusableMethods.waitFor(5);
        homePage.buyutec.submit();
        Reporter.log("KULLANICI BUYUTEC IKONUNA TIKLAR");
        ReusableMethods.clickWithJS(searchResultPage.iphone4);
        Reporter.log("KULLANICI 1.IPHONE RESMINDEKI COMPARE SEKMESINE TIKLAR");
        ReusableMethods.waitFor(3);
        ReusableMethods.clickWithJS(homePage.searchBox);
        Reporter.log("KULLANICI SEARCHBOX A TIKLAR");
        ReusableMethods.clickWithJS(searchResultPage.iphone3);
        Reporter.log("KULLANICI 2.IPHONE RESMINDEKI COMPARE SEKMESINE TIKLAR");
        ReusableMethods.waitFor(5);
        ReusableMethods.clickWithJS(homePage.searchBox);
        Reporter.log("KULLANICI SEARCHBOX A TIKLAR");
        ReusableMethods.waitFor(5);
        ReusableMethods.clickWithJS(searchResultPage.iphone2);
        Reporter.log("KULLANICI 3.IPHONE RESMINDEKI COMPARE SEKMESINE TIKLAR");
        ReusableMethods.waitFor(5);
        ReusableMethods.clickWithJS(homePage.searchBox);
        Reporter.log("KULLANICI SEARCHBOX A TIKLAR");
        ReusableMethods.clickWithJS(searchResultPage.iphone1);
        Reporter.log("KULLANICI 4.IPHONE RESMINDEKI COMPARE SEKMESINE TIKLAR");
        ReusableMethods.waitFor(5);
        ReusableMethods.clickWithJS(searchResultPage.startCompare);
        Reporter.log("KULLANICI START COMPARE SEKMESINE TIKLAR");
        Assert.assertEquals(comparePage.secili4Urun.size(), 4);
        Reporter.log("KULLANICI COMPARE SAYFASINDA 4 URUN SECILDIGINI DOGRULAR");
        Driver.getDriver().navigate().back();
        Reporter.log("KULLANICI ANA SAYFAYA GERI DONER");
        ReusableMethods.waitFor(5);
        ReusableMethods.clickWithJS(searchResultPage.iphone5);
        Reporter.log("KULLANICI 5.IPHONE RESMINDEKI COMPARE SEKMESINE TIKLAR");
        ReusableMethods.clickWithJS(searchResultPage.startCompare);
        Reporter.log("KULLANICI START COMPARE SEKMESINE TIKLAR");
        ReusableMethods.waitFor(3);
        Assert.assertNotEquals(comparePage.secili4Urun.size(), 5);
        Reporter.log("KULLANICI COMPARE SAYFASINDA 5 URUN SECILEMEDIGINI DOGRULAR");
        Driver.getDriver().navigate().back();
        Reporter.log("KULLANICI ANA SAYFAYA GERI DONER");
        ReusableMethods.waitFor(5);
        ReusableMethods.clickWithJS(searchResultPage.iphone6);
        Reporter.log("KULLANICI 5.IPHONE RESMINDEKI COMPARE SEKMESINE TIKLAR");
        ReusableMethods.clickWithJS(searchResultPage.cleanAll);
        Reporter.log("KULLANICI CLEANALL SEKMESINE TIKLAR");
        ReusableMethods.waitFor(5);
        ReusableMethods.clickWithJS(searchResultPage.startCompare);
        Reporter.log("KULLANICI START COMPARE SEKMESINE TIKLAR");
        ReusableMethods.waitFor(5);
        Assert.assertTrue(comparePage.urunYok.getText().contains("No products added to the compare"));
        Reporter.log("KULLANICI -No products added to the compare- YAZISININ GORUNUR OLDUGUNU DOGRULAR");
        Driver.closeDriver();


    }


    @Test
    public void testCase02() {

        homePage = new HomePage();
        loginPage = new LoginPage();
        searchResultPage = new SearchResultPage();
        comparePage = new ComparePage();

        Driver.getDriver().get(ConfigReader.getProperty("appUrl"));
        Reporter.log("KULLANICI URL YE GİDER");
        homePage.searchBox.sendKeys("watch");
        Reporter.log("KULLANICI SEARCHBOX A IPHONE GIRER");
        ReusableMethods.waitFor(5);
        homePage.buyutec.submit();
        Reporter.log("KULLANICI BUYUTEC IKONUNA TIKLAR");
        ReusableMethods.clickWithJS(searchResultPage.iphone5);
        Reporter.log("KULLANICI 1.IPHONE RESMINDEKI COMPARE SEKMESINE TIKLAR");
        ReusableMethods.waitFor(3);
        ReusableMethods.clickWithJS(homePage.searchBox);
        Reporter.log("KULLANICI SEARCHBOX A TIKLAR");
        ReusableMethods.clickWithJS(searchResultPage.iphone4);
        Reporter.log("KULLANICI 2.IPHONE RESMINDEKI COMPARE SEKMESINE TIKLAR");
        ReusableMethods.waitFor(3);
        ReusableMethods.clickWithJS(homePage.searchBox);
        Reporter.log("KULLANICI SEARCHBOX A TIKLAR");
        ReusableMethods.clickWithJS(searchResultPage.iphone3);
        Reporter.log("KULLANICI 3.IPHONE RESMINDEKI COMPARE SEKMESINE TIKLAR");
        ReusableMethods.waitFor(5);
        ReusableMethods.clickWithJS(homePage.searchBox);
        Reporter.log("KULLANICI SEARCHBOX A TIKLAR");
        ReusableMethods.waitFor(5);
        ReusableMethods.clickWithJS(searchResultPage.iphone2);
        Reporter.log("KULLANICI 4.IPHONE RESMINDEKI COMPARE SEKMESINE TIKLAR");
        ReusableMethods.waitFor(5);
        ReusableMethods.clickWithJS(homePage.searchBox);
        Reporter.log("KULLANICI SEARCHBOX A TIKLAR");
        ReusableMethods.clickWithJS(searchResultPage.iphone1);
        Reporter.log("KULLANICI 5.IPHONE RESMINDEKI COMPARE SEKMESINE TIKLAR");
        ReusableMethods.waitFor(5);
        ReusableMethods.clickWithJS(searchResultPage.startCompare);
        Reporter.log("KULLANICI START COMPARE SEKMESINE TIKLAR");
        Driver.closeDriver();


    }


    @Test
    public void testCase03() {

        homePage = new HomePage();
        loginPage = new LoginPage();
        searchResultPage = new SearchResultPage();
        comparePage = new ComparePage();

        Driver.getDriver().get(ConfigReader.getProperty("appUrl"));
        Reporter.log("KULLANICI URL YE GİDER");
        homePage.searchBox.sendKeys("iphone");
        Reporter.log("KULLANICI SEARCHBOX A IPHONE GIRER");
        ReusableMethods.waitFor(5);
        homePage.buyutec.submit();
        Reporter.log("KULLANICI BUYUTEC IKONUNA TIKLAR");
        ReusableMethods.clickWithJS(searchResultPage.iphone2);
        Reporter.log("KULLANICI 1.IPHONE RESMINDEKI COMPARE SEKMESINE TIKLAR");
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(homePage.searchBox);
        Reporter.log("KULLANICI SEARCHBOX A TIKLAR");
        ReusableMethods.waitFor(5);
        ReusableMethods.clickByJS(searchResultPage.iphone1);
        Reporter.log("KULLANICI 1.IPHONE RESMINDEKI COMPARE SEKMESINE TIKLAR");
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(searchResultPage.startCompare);
        Reporter.log("KULLANICI START COMPARE SEKMESINE TIKLAR");
        ReusableMethods.clickWithJS(comparePage.xButton1);
        Reporter.log("KULLANICI URUN SILMEK ICIN X BUTONUNA TIKLAR");
        ReusableMethods.waitFor(5);
        ReusableMethods.clickWithJS(comparePage.xButton1);
        Reporter.log("KULLANICI URUN SILMEK ICIN X BUTONUNA TIKLAR");
        ReusableMethods.waitFor(5);
        Assert.assertTrue(comparePage.urunYok.getText().contains("No products added to the compare"));
        Reporter.log("KULLANICI -No products added to the compare- YAZISININ GORUNUR OLDUGUNU DOGRULAR");
        Driver.closeDriver();

    }
}






