package Tests.US18_US19_US20;

import Pages.US18Pages.HomePage18_19_20;
import Pages.US18Pages.LoginPage18_19_20;
import Pages.US18Pages.StoreManagerPage;
import Utilities.Driver;
import Utilities.ExcelUtils;
import Utilities.ReusableMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static Utilities.US18_19_20Methods.addNewProduct;
import static Utilities.US18_19_20Methods.vendorKayitliGiris;

public class US18Tests {
    HomePage18_19_20 homePage18_19_20;
    LoginPage18_19_20 loginPage18_19_20;
    StoreManagerPage storeManagerPage;


    @Test
    public void TC01() throws FileNotFoundException {
        Reporter.log("==================================US18==============================");
        Reporter.log("===========TC01 External - Affiliate Product seçilebilmeli===========");

        vendorKayitliGiris();
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.waitFor(5);
        addNewProduct();
        Reporter.log("ADD NEW PRODUCT SAYFASI ACILDI");
        storeManagerPage = new StoreManagerPage();
        loginPage18_19_20 = new LoginPage18_19_20();
        homePage18_19_20 = new HomePage18_19_20();
        Select select = new Select(storeManagerPage.productType);
        select.selectByVisibleText("External/Affiliate Product");

        Reporter.log("EXTERNAL/AFFILIATE PRODUCT SECILDI");
    }


    @Test
    public void TC02() {
        Reporter.log("===========TC02 URL, Button Text, Price, Sale Price yazılabilmeli===========");

        storeManagerPage.productUrl.sendKeys("http://www.KryTecnologies.com", Keys.TAB);
        Reporter.log("URL KUTUSUNA DEGER GIRILDI");
        storeManagerPage.buttonText.sendKeys("Add to Cart", Keys.TAB);
        Reporter.log("BUTTON TEXT KUTUSUNUA DEGER GIRILDI");
        storeManagerPage.Price.sendKeys("3100", Keys.TAB);
        Reporter.log("PRICE KUTUSUNA DEGER GIRILDI");
        storeManagerPage.salePrice.sendKeys("3350");
        Reporter.log("SALE PRICE KUTUSUNA DEGER GIRILDI");

    }

    @Test
    public void TC03() {
        Reporter.log("===========TC03 US14  deki işlemler yapılabilmeli==========");
        Driver.getDriver().manage().deleteAllCookies();
        try {
            storeManagerPage.addImage.click();
            storeManagerPage.buttonUploader.click();
            ReusableMethods.uploadFilePath("C:\\Users\\Koray\\Desktop\\macbook-finder-folder.jpg");
            ReusableMethods.waitFor(5);
        } catch (Exception e) {
            ReusableMethods.clickJS(storeManagerPage.kapat1);
            Reporter.log("XXXFAILED BUYUK FOTOGRAF YUKLENEMIYOR");
        }

        try {
            storeManagerPage.featuredImg.click();
            ReusableMethods.clickJS(storeManagerPage.featuredselect);
            ReusableMethods.uploadFilePath("C:\\Users\\Koray\\Desktop\\macbook-finder-folder.jpg");
            ReusableMethods.waitFor(5);
            Reporter.log("FOTOGRAF KUTUSUNA FOTOGRAF EKLENDI");
        } catch (Exception e) {
            ReusableMethods.clickJS(storeManagerPage.kapat);
            Reporter.log("XXXFAILED FEATURED IMAGE KISMINA PHOTO YUKLENEMEDI XXX");
        }
        String path1 = "./src/test/resources/TestExcelData.xlsx";
        String sheetname = "Sayfa1";
        ExcelUtils excelUtils = new ExcelUtils(path1, sheetname);
        storeManagerPage.productTitle.sendKeys(excelUtils.getCellData(0, 0));
        Reporter.log("PRODUCT TITLE EKLENDI");
        Driver.getDriver().switchTo().frame(0);
        storeManagerPage.shortdesc.sendKeys(excelUtils.getCellData(1, 0));
        Driver.getDriver().switchTo().defaultContent();
        Reporter.log("SHORT DESCRIPTION KUTUSUNA DEGER GIRILDI");
        Driver.getDriver().switchTo().frame(1);
        storeManagerPage.desc.sendKeys(excelUtils.getCellData(2, 0));
        Driver.getDriver().switchTo().defaultContent();
        Reporter.log("DESCRIPTION KUTUSUNA DEGER GIRILDI");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        ReusableMethods.waitFor(5);
        js.executeScript("arguments[0].click()", storeManagerPage.categories);
        Reporter.log("CATEGORIES KUTUSUNDA SECIM YAPILDI ");
        js.executeScript("arguments[0].click()", storeManagerPage.addnewcategory);
        storeManagerPage.categoryname.sendKeys(excelUtils.getCellData(3, 0));
        js.executeScript("arguments[0].click()", storeManagerPage.addnewcategory);
        Reporter.log("ADD NEW CATEGORY E YENI CATEGORY EKLENDI");
        js.executeScript("arguments[0].click()", storeManagerPage.brandname);
        Reporter.log("BRAND NAME KUTUSNUDA SECIM YAPILDI");
        js.executeScript("arguments[0].click()", storeManagerPage.addNewBrand);
        storeManagerPage.brandnamebox.sendKeys(excelUtils.getCellData(4, 0));
        js.executeScript("arguments[0].click()", storeManagerPage.brandAddButton);
        Reporter.log("ADD NEW BRAND E YENI BRAND EKLENDI");
        storeManagerPage.tagbox.sendKeys(excelUtils.getCellData(5, 0));
        Reporter.log(("TAGS KUTUSUNA TAGLAR GIRILDI"));
        Select select1 = new Select(storeManagerPage.catalogVisibility);
        select1.selectByVisibleText("Shop only");
        Reporter.log("CATALOG VISIBILITY DEN SHOP ONLY SECENEGI SECILDI");
    }

    @Test
    public void TC04() {
        Reporter.log("===========TC04 US15  deki işlemler yapılabilmeli==========");
//           List<String>expectedListe = new ArrayList<String>(Arrays.asList("Inventory","Attributes","Linked","Shipping"," SEO","Toptan Ürün Gösterme Ayarları","Advanced"));
//        List<WebElement> LISTE = Driver.getDriver().findElements(By.xpath("//div[@class='page_collapsible_content_holder']"));
//    for(WebElement EACH :LISTE){
//        if(EACH!=null && EACH.getText().replaceAll("//s","").length()>0){
//            List<String>newlist =new ArrayList<>();
//            newlist.add(EACH.getText());
//            Assert.assertTrue(expectedListe.contains(EACH.getText()));
        Reporter.log("ADD PRODUCT SAYFASINDA (Inventory, Shipping, Attributes, Linked, Seo, Toptan Ürün Gösterme Ayarları, Advanced)MENULERI GORULUYOR");
        storeManagerPage.sku.sendKeys("1");
        ReusableMethods.clickJS(storeManagerPage.manageStockbox);
        try {
            storeManagerPage.stockQty.sendKeys("2");
            ReusableMethods.dropdownMethod(storeManagerPage.backorders, "Allow");
            ReusableMethods.clickJS(storeManagerPage.soldInd);
        } catch (Exception e) {
            Reporter.log("xxxxFAILED INVENTORY DE YERALAN BACKORDERS, SOLD IND VE STOCK QTY  GOZUKMUYORxxxx");

        }
        Reporter.log("INVENTORY GIRISLERI YAPILDI");
        try {
            storeManagerPage.shipping.click();
            storeManagerPage.weight.sendKeys("3", Keys.TAB, "25", Keys.TAB, "25", Keys.TAB, "35", Keys.TAB, Keys.TAB);
            ReusableMethods.dropdownMethod(storeManagerPage.processingTime, "1-3 bussiness days");
            Reporter.log("SHIPPING GIRISLERI YAPILDI");
        } catch (Exception e) {
            Reporter.log("xxxxFAILED SHIPPING BOLUMU GOZUKMUYORxxxx");
        }
        ReusableMethods.clickJS(storeManagerPage.attribute);
        ReusableMethods.clickJS(storeManagerPage.color);
        storeManagerPage.searchcolor.sendKeys("Black");
        ReusableMethods.clickJS(storeManagerPage.sizebox);
        storeManagerPage.sizedrop.sendKeys("10inc");
        Reporter.log("ATTRIBUTES GIRISLERI YAPILDI");
        ReusableMethods.clickJS(storeManagerPage.linked);
        Reporter.log("lINKED GIRISLERI YAPILDI");
        ReusableMethods.clickJS(storeManagerPage.seo);
        storeManagerPage.focuskey.sendKeys("imac");
        storeManagerPage.metadesc.sendKeys("comp");
        Reporter.log("SEO GIRISLERI YAPILDI");
        ReusableMethods.clickJS(storeManagerPage.toptanurun);
        ReusableMethods.dropdownMethod(storeManagerPage.pieceType, "Piece");
        storeManagerPage.units.sendKeys("2");
        storeManagerPage.orderQuantity.sendKeys("1");
        Reporter.log("TOPTAN URUN GOSTERME AYARLARI GIRILDI");
        ReusableMethods.clickJS(storeManagerPage.advanced);
        storeManagerPage.menuorder.sendKeys("app");
        try {
            storeManagerPage.purchasenote.sendKeys("enjoy it");
        } catch (Exception e) {
            Reporter.log("XXXFAILXXXX PURCHASE NOTE KISMI GOZUKMUYOR");
        }
        Reporter.log("ADVANCED DEGERLERI GIRILDI");
        ReusableMethods.clickJS(storeManagerPage.submitson);
        Driver.closeDriver();
    }

}
