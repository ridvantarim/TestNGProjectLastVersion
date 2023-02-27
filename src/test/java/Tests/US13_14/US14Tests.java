package Tests.US13_14;

        import org.openqa.selenium.WebElement;
        import org.testng.Assert;
        import org.testng.Reporter;
        import org.testng.annotations.AfterTest;
        import org.testng.annotations.BeforeMethod;
        import org.testng.annotations.Test;
        import Utilities.ConfigReader;
        import Utilities.Driver;
        import Utilities.ReusableMethods;

        import java.util.List;

public class US14Tests {

    Pages.US13_14Pages.HomePage homePage = new Pages.US13_14Pages.HomePage();
    Pages.US13_14Pages.LoginPage loginPage = new Pages.US13_14Pages.LoginPage();
    Pages.US13_14Pages.MyAccountPage myAccountPage = new Pages.US13_14Pages.MyAccountPage();
    Pages.US13_14Pages.StoreManagerPage storeManagerPage = new Pages.US13_14Pages.StoreManagerPage();
    Pages.US13_14Pages.ProductManagerPage productManagerPage = new Pages.US13_14Pages.ProductManagerPage();
    Pages.US13_14Pages.ChooseImagePage chooseImagePage = new Pages.US13_14Pages.ChooseImagePage();



    @Test
    public void US14_TC01() {
        Reporter.log("============== TC01 Simple Product, Variable Product, Grouped Product, External - Affiliate Product seçenekleri olmalı  ==============");
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        Reporter.log("MY ACCOUNT SAYFASINA GIDILDI");
        ReusableMethods.clickWithTimeOut(myAccountPage.storeManagerBtn, 5);
        Reporter.log("STORE MANAGER SAYFASINA GIDILDI");
        ReusableMethods.hoverWithTimeOut(storeManagerPage.productsBtn,5);
        ReusableMethods.clickWithTimeOut(storeManagerPage.productsAddNewBtn, 5);
        ReusableMethods.clickWithTimeOut(productManagerPage.simpleProductDropDwn, 5);
        List<WebElement> dropdown = ReusableMethods.selectDropdown(productManagerPage.simpleProductDropDwn).getOptions();
        int dropdownSize = ReusableMethods.selectDropdown(productManagerPage.simpleProductDropDwn).getOptions().size();
        String[] dropdownActualText = {"Simple Product", "Variable Product", "Grouped Product", "External/Affiliate Product"};
        for (int i = 0; i < dropdownSize; i++) {
            Assert.assertEquals(dropdownActualText[i], dropdown.get(i).getText());
        }
        Reporter.log("ISTENILEN SECENEKLER DOGRULANDI ");

    }

    @Test
    public void US14_TC02() {

        Reporter.log("============== TC02 Ürün fotoğrafı eklenebilmeli (Local)  ==============");
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        Reporter.log("MY ACCOUNT SAYFASINA GIDILDI");
        ReusableMethods.clickWithTimeOut(myAccountPage.storeManagerBtn, 5);
        Reporter.log("STORE MANAGER SAYFASINA GIDILDI");
        ReusableMethods.hoverWithTimeOut(storeManagerPage.productsBtn,5);
        ReusableMethods.clickWithTimeOut(storeManagerPage.productsAddNewBtn, 5);
        ReusableMethods.clickWithTimeOut(productManagerPage.imageAddBtn, 5);
        ReusableMethods.clickWithTimeOut(chooseImagePage.selectFilesBtn, 5);
        ReusableMethods.waitFor(3);
        ReusableMethods.uploadFilePath(ConfigReader.getProperty("ihsan_UploadFilePath"));
        ReusableMethods.clickByJS(chooseImagePage.selectBtn);
        Reporter.log("URUN FOTOGRAFI EKLENDI");
        Assert.assertTrue(productManagerPage.imageAddBtn.getAttribute("src").contains(ConfigReader.getProperty("ihsan_UploadFileContain")));
        Reporter.log("EKLENEN FOTOGRAF DOGRULANDI ");
    }

    @Test
    public void US14_TC03() {
        Reporter.log("============== TC03 Ürün fotoğrafı eklenebilmeli (Media Library)  ==============");
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        Reporter.log("MY ACCOUNT SAYFASINA GIDILDI");
        ReusableMethods.clickWithTimeOut(myAccountPage.storeManagerBtn, 5);
        Reporter.log("STORE MANAGER SAYFASINA GIDILDI");
        ReusableMethods.hoverWithTimeOut(storeManagerPage.productsBtn,5);
        ReusableMethods.clickWithTimeOut(storeManagerPage.productsAddNewBtn, 5);
        ReusableMethods.clickWithTimeOut(productManagerPage.imageAddBtn, 5);
        ReusableMethods.clickByJS(chooseImagePage.mediaLibraryBtn);
        ReusableMethods.clickByJS(chooseImagePage.image1);
        ReusableMethods.clickByJS(chooseImagePage.selectBtn);
        Reporter.log("URUN FOTOGRAFI EKLENDI");
        Assert.assertTrue(productManagerPage.imageAddBtn.getAttribute("src").contains(ConfigReader.getProperty("ihsan_UploadFileContain")));
        Reporter.log("EKLENEN FOTOGRAF DOGRULANDI ");
    }

    @Test
    public void US14_TC04() {
        Reporter.log("============== TC04 Product Title, yazılabilmeli  ==============");
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        Reporter.log("MY ACCOUNT SAYFASINA GIDILDI");
        ReusableMethods.clickWithTimeOut(myAccountPage.storeManagerBtn, 5);
        Reporter.log("STORE MANAGER SAYFASINA GIDILDI");
        ReusableMethods.hoverWithTimeOut(storeManagerPage.productsBtn,5);
        ReusableMethods.clickWithTimeOut(storeManagerPage.productsAddNewBtn, 5);
        productManagerPage.productTitleBox.sendKeys(ConfigReader.getProperty("ihsan_ProductTitleText"));
        Reporter.log("PRODUCT TITLE ALANINA VERI GIRILDI ");
        Assert.assertEquals(productManagerPage.productTitleBox.getAttribute("value"), ConfigReader.getProperty("ihsan_ProductTitleText"));
        Reporter.log("GIRILEN VERI DOGRULANDI");
    }

    @Test
    public void US14_TC05() {
        Reporter.log("============== TC05 Short Description, yazılabilmeli  ==============");
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        Reporter.log("MY ACCOUNT SAYFASINA GIDILDI");
        ReusableMethods.clickWithTimeOut(myAccountPage.storeManagerBtn, 5);
        Reporter.log("STORE MANAGER SAYFASINA GIDILDI");
        ReusableMethods.hoverWithTimeOut(storeManagerPage.productsBtn,5);
        ReusableMethods.clickWithTimeOut(storeManagerPage.productsAddNewBtn, 5);
        Driver.getDriver().switchTo().frame(productManagerPage.shortDescriptionIframe);
        productManagerPage.shortDescriptionText.sendKeys(ConfigReader.getProperty("ihsan_ShortDescriptionText"));
        Reporter.log("SHORT DESCRIPTION ALANINA VERI GIRILDI ");
        Assert.assertEquals(productManagerPage.shortDescriptionText.getText(), ConfigReader.getProperty("ihsan_ShortDescriptionText"));
        Reporter.log("GIRILEN VERI DOGRULANDI");
    }

    @Test
    public void US14_TC06() {
        Reporter.log("============== TC06 Short Description, yazılabilmeli  ==============");
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        Reporter.log("MY ACCOUNT SAYFASINA GIDILDI");
        ReusableMethods.clickWithTimeOut(myAccountPage.storeManagerBtn, 5);
        Reporter.log("STORE MANAGER SAYFASINA GIDILDI");
        ReusableMethods.hoverWithTimeOut(storeManagerPage.productsBtn,5);
        ReusableMethods.clickWithTimeOut(storeManagerPage.productsAddNewBtn, 5);
        Driver.getDriver().switchTo().frame(productManagerPage.descriptionIframe);
        productManagerPage.descriptionText.sendKeys(ConfigReader.getProperty("ihsan_DescriptionText"));
        Reporter.log("DESCRIPTION ALANINA VERI GIRILDI ");
        Assert.assertEquals(productManagerPage.descriptionText.getText(), ConfigReader.getProperty("ihsan_DescriptionText"));
        Reporter.log("GIRILEN VERI DOGRULANDI");

    }

    @Test
    public void US14_TC07() {
        Reporter.log("============== TC07 Categories seçilebilmeli   ==============");
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        Reporter.log("MY ACCOUNT SAYFASINA GIDILDI");
        ReusableMethods.clickWithTimeOut(myAccountPage.storeManagerBtn, 5);
        Reporter.log("STORE MANAGER SAYFASINA GIDILDI");
        ReusableMethods.hoverWithTimeOut(storeManagerPage.productsBtn,5);
        ReusableMethods.clickWithTimeOut(storeManagerPage.productsAddNewBtn, 5);
        ReusableMethods.clickWithJS(productManagerPage.categoriesCheckBox);
        Reporter.log("BIR CATEGORY SECILDI ");
        Assert.assertTrue(productManagerPage.categoriesCheckBox.isSelected());
        Reporter.log("SECILEN CATEGORY DOGRULANDI");
    }

    @Test
    public void US14_TC08() {
        Reporter.log("============== TC08 Yeni Categories eklenebilmeli   ==============");
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        Reporter.log("MY ACCOUNT SAYFASINA GIDILDI");
        ReusableMethods.clickWithTimeOut(myAccountPage.storeManagerBtn, 5);
        Reporter.log("STORE MANAGER SAYFASINA GIDILDI");
        ReusableMethods.hoverWithTimeOut(storeManagerPage.productsBtn,5);
        ReusableMethods.clickWithTimeOut(storeManagerPage.productsAddNewBtn, 5);
        ReusableMethods.clickWithJS(productManagerPage.addNewCategory);
        productManagerPage.categoryName.sendKeys(ConfigReader.getProperty("ihsan_CategoryName"));
        Reporter.log("CATEGORY NAME ALANINA VERI GIRILDI ");
        ReusableMethods.clickByJS(productManagerPage.categoryAdd);
        Reporter.log("BIR CATEGORY EKLENDI ");
        Assert.assertTrue(productManagerPage.addedCategory.isDisplayed());
        Reporter.log("EKLENEN CATEGORY DOGRULANDI ");
    }

    @Test
    public void US14_TC09() {
        Reporter.log("============== TC09 Product brands seçilebilmeli   ==============");
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        Reporter.log("MY ACCOUNT SAYFASINA GIDILDI");
        ReusableMethods.clickWithTimeOut(myAccountPage.storeManagerBtn, 5);
        Reporter.log("STORE MANAGER SAYFASINA GIDILDI");
        ReusableMethods.hoverWithTimeOut(storeManagerPage.productsBtn,5);
        ReusableMethods.clickWithTimeOut(storeManagerPage.productsAddNewBtn, 5);
        ReusableMethods.clickWithJS(productManagerPage.productBrandsCheckBox);
        Reporter.log("BIR PRODUCT BRANDS SECILDI ");
        Assert.assertTrue(productManagerPage.productBrandsCheckBox.isSelected());
        Reporter.log("SECILEN PRODUCT BRANDS DOGRULANDI");
    }

    @Test
    public void US14_TC10() {
        Reporter.log("============== TC10 Yeni Product brands eklenebilmeli   ==============");
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        Reporter.log("MY ACCOUNT SAYFASINA GIDILDI");
        ReusableMethods.clickWithTimeOut(myAccountPage.storeManagerBtn, 5);
        Reporter.log("STORE MANAGER SAYFASINA GIDILDI");
        ReusableMethods.hoverWithTimeOut(storeManagerPage.productsBtn,5);
        ReusableMethods.clickWithTimeOut(storeManagerPage.productsAddNewBtn, 5);
        ReusableMethods.clickWithJS(productManagerPage.addNewProductBrands);
        productManagerPage.productBrandsName.sendKeys(ConfigReader.getProperty("ihsan_ProductBrandsName"));
        Reporter.log("PRODUCT BRANDS NAME ALANINA VERI GIRILDI ");
        ReusableMethods.clickByJS(productManagerPage.productBrandsAdd);
        Reporter.log("BIR PRODUCT BRANDS EKLENDI ");
        Assert.assertTrue(productManagerPage.addedBrands.isDisplayed());
        Reporter.log("EKLENEN PRODUCT BRANDS DOGRULANDI ");
    }
    @Test
    public void US14_TC11() {
        Reporter.log("============== TC11 Tags eklenebilmeli  ==============");
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        Reporter.log("MY ACCOUNT SAYFASINA GIDILDI");
        ReusableMethods.clickWithTimeOut(myAccountPage.storeManagerBtn, 5);
        Reporter.log("STORE MANAGER SAYFASINA GIDILDI");
        ReusableMethods.hoverWithTimeOut(storeManagerPage.productsBtn,5);
        ReusableMethods.clickWithTimeOut(storeManagerPage.productsAddNewBtn, 5);
        productManagerPage.tagTextBox.sendKeys(ConfigReader.getProperty("ihsan_TagTextBox"));
        Reporter.log("TAG EKLENDI ");
        Assert.assertEquals(productManagerPage.tagTextBox.getAttribute("value"),ConfigReader.getProperty("ihsan_TagTextBox"));
        Reporter.log("EKLENEN TAG DOGRULANDI ");
    }
    @Test
    public void US14_TC12() {
        Reporter.log("============== TC12 Catalog visibility; Shop and search results, olarak seçilebilmeli ==============");
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        Reporter.log("MY ACCOUNT SAYFASINA GIDILDI");
        ReusableMethods.clickWithTimeOut(myAccountPage.storeManagerBtn, 5);
        Reporter.log("STORE MANAGER SAYFASINA GIDILDI");
        ReusableMethods.hoverWithTimeOut(storeManagerPage.productsBtn,5);
        ReusableMethods.clickWithTimeOut(storeManagerPage.productsAddNewBtn, 5);
        ReusableMethods.scrollIntoViewJS(productManagerPage.catalogVisibilityDropDown);
        ReusableMethods.selecDropdownWithText(productManagerPage.catalogVisibilityDropDown,ConfigReader.getProperty("ihsan_CatalogVisibility_1"));
        Reporter.log("CATALOG VISIBILITY SHOP AND SEARCH RESULTS OLARAK  SECILDI ");
        Assert.assertEquals(ReusableMethods.selectDropdown(productManagerPage.catalogVisibilityDropDown).getFirstSelectedOption().getText(),ConfigReader.getProperty("ihsan_CatalogVisibility_1"));
        Reporter.log("SECIM DOGRULANDI ");
    }
    @Test
    public void US14_TC13() {
        Reporter.log("============== TC14 Catalog visibility; Shop only, olarak seçilebilmeli ==============");
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        Reporter.log("MY ACCOUNT SAYFASINA GIDILDI");
        ReusableMethods.clickWithTimeOut(myAccountPage.storeManagerBtn, 5);
        Reporter.log("STORE MANAGER SAYFASINA GIDILDI");
        ReusableMethods.hoverWithTimeOut(storeManagerPage.productsBtn,5);
        ReusableMethods.clickWithTimeOut(storeManagerPage.productsAddNewBtn, 5);
        ReusableMethods.scrollIntoViewJS(productManagerPage.catalogVisibilityDropDown);
        ReusableMethods.selecDropdownWithText(productManagerPage.catalogVisibilityDropDown,ConfigReader.getProperty("ihsan_CatalogVisibility_2"));
        Reporter.log(" CATALOG VISIBILITY SHOP ONLY OLARAK SECILDI ");
        Assert.assertEquals(ReusableMethods.selectDropdown(productManagerPage.catalogVisibilityDropDown).getFirstSelectedOption().getText(),ConfigReader.getProperty("ihsan_CatalogVisibility_2"));
        Reporter.log("SECIM DOGRULANDI ");
    }

    @Test
    public void US14_TC14() {
        Reporter.log("============== TC13 Catalog visibility; Search results only, olarak seçilebilmeli ==============");
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        Reporter.log("MY ACCOUNT SAYFASINA GIDILDI");
        ReusableMethods.clickWithTimeOut(myAccountPage.storeManagerBtn, 5);
        Reporter.log("STORE MANAGER SAYFASINA GIDILDI");
        ReusableMethods.hoverWithTimeOut(storeManagerPage.productsBtn,5);
        ReusableMethods.clickWithTimeOut(storeManagerPage.productsAddNewBtn, 5);
        ReusableMethods.scrollIntoViewJS(productManagerPage.catalogVisibilityDropDown);
        ReusableMethods.selecDropdownWithText(productManagerPage.catalogVisibilityDropDown,ConfigReader.getProperty("ihsan_CatalogVisibility_3"));
        Reporter.log("CATALOG VISIBILITY SEARCH RESULT ONLY OLARAK SECILDI ");
        Assert.assertEquals(ReusableMethods.selectDropdown(productManagerPage.catalogVisibilityDropDown).getFirstSelectedOption().getText(),ConfigReader.getProperty("ihsan_CatalogVisibility_3"));
        Reporter.log("SECIM DOGRULANDI ");
    }

    @Test
    public void US14_TC15() {
        Reporter.log("============== TC13 Catalog visibility; Hidden, olarak seçilebilmeli ==============");
        Reporter.log("VENDOR OLARAK GIRIS YAPILDI");
        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        Reporter.log("MY ACCOUNT SAYFASINA GIDILDI");
        ReusableMethods.clickWithTimeOut(myAccountPage.storeManagerBtn, 5);
        Reporter.log("STORE MANAGER SAYFASINA GIDILDI");
        ReusableMethods.hoverWithTimeOut(storeManagerPage.productsBtn,5);
        ReusableMethods.clickWithTimeOut(storeManagerPage.productsAddNewBtn, 5);
        ReusableMethods.scrollIntoViewJS(productManagerPage.catalogVisibilityDropDown);
        ReusableMethods.selecDropdownWithText(productManagerPage.catalogVisibilityDropDown,ConfigReader.getProperty("ihsan_CatalogVisibility_4"));
        Reporter.log("CATALOG VISIBILITY HIDDEN OLARAK SECILDI ");
        Assert.assertEquals(ReusableMethods.selectDropdown(productManagerPage.catalogVisibilityDropDown).getFirstSelectedOption().getText(),ConfigReader.getProperty("ihsan_CatalogVisibility_4"));
        Reporter.log("SECIM DOGRULANDI ");
    }

    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get(ConfigReader.getProperty("appUrl"));

        try {
            homePage.singInBtn1.click();
            loginPage.emailBox.sendKeys(ConfigReader.getProperty("ihsanMail"));
            loginPage.passwordBox.sendKeys(ConfigReader.getProperty("ihsanPassword"));
            loginPage.singInBtn2.click();
        } catch (Exception e) {

        }
    }

    @AfterTest
    public void terDown() {
        Driver.closeDriver();
    }
}
