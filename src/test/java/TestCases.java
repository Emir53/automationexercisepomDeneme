import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.security.PublicKey;
import java.util.concurrent.TimeUnit;

public class TestCases extends BaseTest{
    CartPage cartPage;
    HomePage homePage;
    LoginPage loginPage;
    TestCasesPage testCasesPage;
    ProductsPage productsPage;

    @BeforeEach
    public void background(){
        homePage = new HomePage(driver);
    }


    @Test
    public void testCase01(){
        Assertions.assertTrue(homePage.isOnHomepage());
        loginPage = homePage.clickLoginPage();
        Assertions.assertTrue(loginPage.isOnLoginPage());
        loginPage.sendEmamailPassword("deneme@maili.com","535353");
        Assertions.assertTrue(loginPage.isLoggedIn());
    }

    @Test
    public void testCase02(){
        testCase01();
        loginPage = homePage.logOut();
        Assertions.assertTrue(loginPage.isOnLoginPage());
    }

    @Test
    public void testCase03() {
        Assertions.assertTrue(homePage.isOnHomepage());
        loginPage = homePage.clickLoginPage();
        Assertions.assertTrue(loginPage.isOnLoginPage());
        loginPage.sendEmamailPassword("incorrect@email", "incorrect password");
        Assertions.assertTrue(loginPage.isIncorrectInputMesssageVısıble());
    }

    @Test
    public void testCase04(){
        this.testCase01();
        loginPage = new LoginPage(driver);
        loginPage.isLoggedAsUsernameDısp();
        }

    @Test
    public void testCase05(){
        Assertions.assertTrue(homePage.isOnHomepage());
        loginPage = homePage.clickLoginPage();
        Assertions.assertTrue(loginPage.isOnLoginPage());
        loginPage.registerNewUserOnLoginPage("name","deneme@maili.com");
        loginPage.isAlreadyExistEmailDisp();
    }

    @Test
    public void testCase06(){
        Assertions.assertTrue(homePage.isOnHomepage());
        testCasesPage = homePage.clickTestCasesPage();
        Assertions.assertTrue(testCasesPage.checkIfTextDısp());
    }

    @Test
    public void testCase07(){
        Assertions.assertTrue(homePage.isOnHomepage());
        productsPage = homePage.clickProductsPage();
        Assertions.assertTrue(productsPage.isOnProductsPage());
    }

    @Test
    public void testCase08(){
        testCase07();
        productsPage.clickFirstProduct();
        productsPage.isAddTocartAvaliable();
    }

    @Test
    public void testCase9(){
        testCase07();
        productsPage.searchProduct("Tshirt");
        productsPage.isOnSearchedProducts();
    }


    @Test
    public void TestCase10(){
        testCase07();
        productsPage.addTocartFirstİtem();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        productsPage.countiuneShopping();
        productsPage.addToCartsecondİtem();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        productsPage.viewCart();
        Assertions.assertTrue(cartPage.isFırstAndSeconProductOnCart());
    }
}




