package Tests.US13_14;

        import org.openqa.selenium.WebElement;
        import org.testng.Assert;
        import org.testng.annotations.AfterTest;
        import org.testng.annotations.BeforeMethod;
        import org.testng.annotations.Test;
        import Utilities.ConfigReader;
        import Utilities.Driver;
        import Utilities.ReusableMethods;

        import java.util.List;

public class US14Tests {

    pages.US13_14Pages.HomePage homePage = new pages.US13_14Pages.HomePage();
    pages.US13_14Pages.LoginPage loginPage = new pages.US13_14Pages.LoginPage();
    pages.US13_14Pages.MyAccountPage myAccountPage = new pages.US13_14Pages.MyAccountPage();
    pages.US13_14Pages.StoreManagerPage storeManagerPage = new pages.US13_14Pages.StoreManagerPage();
    pages.US13_14Pages.ProductManagerPage productManagerPage = new pages.US13_14Pages.ProductManagerPage();
    pages.US13_14Pages.ChooseImagePage chooseImagePage = new pages.US13_14Pages.ChooseImagePage();



    @Test
    public void US14_TC01() { //Simple Product, Variable Product, Grouped Product, External - Affiliate Product seçenekleri olmalı +

        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        ReusableMethods.clickWithTimeOut(myAccountPage.storeManagerBtn, 5);
        ReusableMethods.hoverWithTimeOut(storeManagerPage.productsBtn,5);
//        ReusableMethods.clickWithTimeOut(storeManagerPage.productsBtn, 5);
        ReusableMethods.clickWithTimeOut(storeManagerPage.productsAddNewBtn, 5);
        ReusableMethods.clickWithTimeOut(productManagerPage.simpleProductDropDwn, 5);
        List<WebElement> dropdown = ReusableMethods.selectDropdown(productManagerPage.simpleProductDropDwn).getOptions();
        int dropdownSize = ReusableMethods.selectDropdown(productManagerPage.simpleProductDropDwn).getOptions().size();
        String[] dropdownActualText = {"Simple Product", "Variable Product", "Grouped Product", "External/Affiliate Product"};
        for (int i = 0; i < dropdownSize; i++) {
            Assert.assertEquals(dropdownActualText[i], dropdown.get(i).getText());
        }

    }

    @Test
    public void US14_TC02() { //Ürün fotoğrafı eklenebilmeli (Local) +

        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        ReusableMethods.clickWithTimeOut(myAccountPage.storeManagerBtn, 5);
//        ReusableMethods.clickWithTimeOut(storeManagerPage.productsBtn, 5);
        ReusableMethods.hoverWithTimeOut(storeManagerPage.productsBtn,5);
        ReusableMethods.clickWithTimeOut(storeManagerPage.productsAddNewBtn, 5);
        ReusableMethods.clickWithTimeOut(productManagerPage.imageAddBtn, 5);
        ReusableMethods.clickWithTimeOut(chooseImagePage.selectFilesBtn, 5);
        ReusableMethods.waitFor(3);
        ReusableMethods.uploadFilePath(ConfigReader.getProperty("ihsan_UploadFilePath"));
        ReusableMethods.clickByJS(chooseImagePage.selectBtn);
        Assert.assertTrue(productManagerPage.imageAddBtn.getAttribute("src").contains(ConfigReader.getProperty("ihsan_UploadFileContain")));

    }

    @Test
    public void US14_TC03() { //Ürün fotoğrafı eklenebilmeli (Media Library) +

        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        ReusableMethods.clickWithTimeOut(myAccountPage.storeManagerBtn, 5);
//        ReusableMethods.clickWithTimeOut(storeManagerPage.productsBtn, 5);
        ReusableMethods.hoverWithTimeOut(storeManagerPage.productsBtn,5);
        ReusableMethods.clickWithTimeOut(storeManagerPage.productsAddNewBtn, 5);
        ReusableMethods.clickWithTimeOut(productManagerPage.imageAddBtn, 5);
        ReusableMethods.clickByJS(chooseImagePage.mediaLibraryBtn);
        ReusableMethods.clickByJS(chooseImagePage.image1);
        ReusableMethods.clickByJS(chooseImagePage.selectBtn);
        Assert.assertTrue(productManagerPage.imageAddBtn.getAttribute("src").contains(ConfigReader.getProperty("ihsan_UploadFileContain")));

    }

    @Test
    public void US14_TC04() { //Product Title, yazılabilmeli +

        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        ReusableMethods.clickWithTimeOut(myAccountPage.storeManagerBtn, 5);
//        ReusableMethods.clickWithTimeOut(storeManagerPage.productsBtn, 5);
        ReusableMethods.hoverWithTimeOut(storeManagerPage.productsBtn,5);
        ReusableMethods.clickWithTimeOut(storeManagerPage.productsAddNewBtn, 5);
        productManagerPage.productTitleBox.sendKeys(ConfigReader.getProperty("ihsan_ProductTitleText"));
        Assert.assertEquals(productManagerPage.productTitleBox.getAttribute("value"), ConfigReader.getProperty("ihsan_ProductTitleText"));

    }

    @Test
    public void US14_TC05() { //Short Description, yazılabilmeli +

        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        ReusableMethods.clickWithTimeOut(myAccountPage.storeManagerBtn, 5);
//        ReusableMethods.clickWithTimeOut(storeManagerPage.productsBtn, 5);
        ReusableMethods.hoverWithTimeOut(storeManagerPage.productsBtn,5);
        ReusableMethods.clickWithTimeOut(storeManagerPage.productsAddNewBtn, 5);
        Driver.getDriver().switchTo().frame(productManagerPage.shortDescriptionIframe);
        productManagerPage.shortDescriptionText.sendKeys(ConfigReader.getProperty("ihsan_ShortDescriptionText"));
        Assert.assertEquals(productManagerPage.shortDescriptionText.getText(), ConfigReader.getProperty("ihsan_ShortDescriptionText"));

    }

    @Test
    public void US14_TC06() { //Description, yazılabilmeli +

        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        ReusableMethods.clickWithTimeOut(myAccountPage.storeManagerBtn, 5);
//        ReusableMethods.clickWithTimeOut(storeManagerPage.productsBtn, 5);
        ReusableMethods.hoverWithTimeOut(storeManagerPage.productsBtn,5);
        ReusableMethods.clickWithTimeOut(storeManagerPage.productsAddNewBtn, 5);
        Driver.getDriver().switchTo().frame(productManagerPage.descriptionIframe);
        productManagerPage.descriptionText.sendKeys(ConfigReader.getProperty("ihsan_DescriptionText"));
        Assert.assertEquals(productManagerPage.descriptionText.getText(), ConfigReader.getProperty("ihsan_DescriptionText"));

    }

    @Test
    public void US14_TC07() { //Categories seçilebilmeli +

        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        ReusableMethods.clickWithTimeOut(myAccountPage.storeManagerBtn, 5);
//        ReusableMethods.clickWithTimeOut(storeManagerPage.productsBtn, 5);
        ReusableMethods.hoverWithTimeOut(storeManagerPage.productsBtn,5);
        ReusableMethods.clickWithTimeOut(storeManagerPage.productsAddNewBtn, 5);
        ReusableMethods.clickWithJS(productManagerPage.categoriesCheckBox);
        Assert.assertTrue(productManagerPage.categoriesCheckBox.isSelected());

    }

    @Test
    public void US14_TC08() { //Yeni Categories eklenebilmeli +

        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        ReusableMethods.clickWithTimeOut(myAccountPage.storeManagerBtn, 5);
//        ReusableMethods.clickWithTimeOut(storeManagerPage.productsBtn, 5);
        ReusableMethods.hoverWithTimeOut(storeManagerPage.productsBtn,5);
        ReusableMethods.clickWithTimeOut(storeManagerPage.productsAddNewBtn, 5);
        ReusableMethods.clickWithJS(productManagerPage.addNewCategory);
        productManagerPage.categoryName.sendKeys(ConfigReader.getProperty("ihsan_CategoryName"));
        ReusableMethods.clickByJS(productManagerPage.categoryAdd);
        Assert.assertTrue(productManagerPage.addedCategory.isDisplayed());

    }

    @Test
    public void US14_TC09() { //Product brands seçilebilmeli +

        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        ReusableMethods.clickWithTimeOut(myAccountPage.storeManagerBtn, 5);
//        ReusableMethods.clickWithTimeOut(storeManagerPage.productsBtn, 5);
        ReusableMethods.hoverWithTimeOut(storeManagerPage.productsBtn,5);
        ReusableMethods.clickWithTimeOut(storeManagerPage.productsAddNewBtn, 5);
        ReusableMethods.clickWithJS(productManagerPage.productBrandsCheckBox);
        Assert.assertTrue(productManagerPage.productBrandsCheckBox.isSelected());

    }

    @Test
    public void US14_TC10() { //Yeni Product brands eklenebilmeli +

        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        ReusableMethods.clickWithTimeOut(myAccountPage.storeManagerBtn, 5);
//        ReusableMethods.clickWithTimeOut(storeManagerPage.productsBtn, 5);
        ReusableMethods.hoverWithTimeOut(storeManagerPage.productsBtn,5);
        ReusableMethods.clickWithTimeOut(storeManagerPage.productsAddNewBtn, 5);
        ReusableMethods.clickWithJS(productManagerPage.addNewProductBrands);
        productManagerPage.productBrandsName.sendKeys(ConfigReader.getProperty("ihsan_ProductBrandsName"));
        ReusableMethods.clickByJS(productManagerPage.productBrandsAdd);
        Assert.assertTrue(productManagerPage.addedBrands.isDisplayed());

    }
    @Test
    public void US14_TC11() { //Tags eklenebilmeli +

        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        ReusableMethods.clickWithTimeOut(myAccountPage.storeManagerBtn, 5);
//        ReusableMethods.clickWithTimeOut(storeManagerPage.productsBtn, 5);
        ReusableMethods.hoverWithTimeOut(storeManagerPage.productsBtn,5);
        ReusableMethods.clickWithTimeOut(storeManagerPage.productsAddNewBtn, 5);
        productManagerPage.tagTextBox.sendKeys(ConfigReader.getProperty("ihsan_TagTextBox"));
        Assert.assertEquals(productManagerPage.tagTextBox.getAttribute("value"),ConfigReader.getProperty("ihsan_TagTextBox"));

    }
    @Test
    public void US14_TC12() { //Catalog visibility; Shop and search results, olarak seçilebilmeli +

        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        ReusableMethods.clickWithTimeOut(myAccountPage.storeManagerBtn, 5);
//        ReusableMethods.clickWithTimeOut(storeManagerPage.productsBtn, 5);
        ReusableMethods.hoverWithTimeOut(storeManagerPage.productsBtn,5);
        ReusableMethods.clickWithTimeOut(storeManagerPage.productsAddNewBtn, 5);
        ReusableMethods.scrollIntoViewJS(productManagerPage.catalogVisibilityDropDown);
        ReusableMethods.selecDropdownWithText(productManagerPage.catalogVisibilityDropDown,ConfigReader.getProperty("ihsan_CatalogVisibility_1"));
        Assert.assertEquals(ReusableMethods.selectDropdown(productManagerPage.catalogVisibilityDropDown).getFirstSelectedOption().getText(),ConfigReader.getProperty("ihsan_CatalogVisibility_1"));

    }
    @Test
    public void US14_TC13() { //Catalog visibility; Shop only, olarak seçilebilmeli +

        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        ReusableMethods.clickWithTimeOut(myAccountPage.storeManagerBtn, 5);
//        ReusableMethods.clickWithTimeOut(storeManagerPage.productsBtn, 5);
        ReusableMethods.hoverWithTimeOut(storeManagerPage.productsBtn,5);
        ReusableMethods.clickWithTimeOut(storeManagerPage.productsAddNewBtn, 5);
        ReusableMethods.scrollIntoViewJS(productManagerPage.catalogVisibilityDropDown);
        ReusableMethods.selecDropdownWithText(productManagerPage.catalogVisibilityDropDown,ConfigReader.getProperty("ihsan_CatalogVisibility_2"));
        Assert.assertEquals(ReusableMethods.selectDropdown(productManagerPage.catalogVisibilityDropDown).getFirstSelectedOption().getText(),ConfigReader.getProperty("ihsan_CatalogVisibility_2"));

    }

    @Test
    public void US14_TC14() { //Catalog visibility; Search results only, olarak seçilebilmeli +

        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        ReusableMethods.clickWithTimeOut(myAccountPage.storeManagerBtn, 5);
//        ReusableMethods.clickWithTimeOut(storeManagerPage.productsBtn, 5);
        ReusableMethods.hoverWithTimeOut(storeManagerPage.productsBtn,5);
        ReusableMethods.clickWithTimeOut(storeManagerPage.productsAddNewBtn, 5);
        ReusableMethods.scrollIntoViewJS(productManagerPage.catalogVisibilityDropDown);
        ReusableMethods.selecDropdownWithText(productManagerPage.catalogVisibilityDropDown,ConfigReader.getProperty("ihsan_CatalogVisibility_3"));
        Assert.assertEquals(ReusableMethods.selectDropdown(productManagerPage.catalogVisibilityDropDown).getFirstSelectedOption().getText(),ConfigReader.getProperty("ihsan_CatalogVisibility_3"));

    }

    @Test
    public void US14_TC15() { //Catalog visibility; Hidden, olarak seçilebilmeli +

        ReusableMethods.clickWithTimeOut(homePage.myAccountBtn, 5);
        ReusableMethods.clickWithTimeOut(myAccountPage.storeManagerBtn, 5);
//        ReusableMethods.clickWithTimeOut(storeManagerPage.productsBtn, 5);
        ReusableMethods.hoverWithTimeOut(storeManagerPage.productsBtn,5);
        ReusableMethods.clickWithTimeOut(storeManagerPage.productsAddNewBtn, 5);
        ReusableMethods.scrollIntoViewJS(productManagerPage.catalogVisibilityDropDown);
        ReusableMethods.selecDropdownWithText(productManagerPage.catalogVisibilityDropDown,ConfigReader.getProperty("ihsan_CatalogVisibility_4"));
        Assert.assertEquals(ReusableMethods.selectDropdown(productManagerPage.catalogVisibilityDropDown).getFirstSelectedOption().getText(),ConfigReader.getProperty("ihsan_CatalogVisibility_4"));

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
