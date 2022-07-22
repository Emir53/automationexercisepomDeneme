import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.security.PublicKey;
import java.util.concurrent.TimeUnit;

public class TestCases extends BaseTest{


    BasePage basePage;
    CartPage cartPage;
    HomePage homePage;
    LoginPage loginPage;

    TestCasesPage testCasesPage;
    ProductsPage productsPage;


    @Test
    public void testCase01(){
        homePage=new HomePage(driver);
        Assertions.assertTrue(homePage.isOnHomepage());
        homePage.clickLoginPage();
        loginPage=new LoginPage(driver);
        Assertions.assertTrue(loginPage.isOnLoginPage());
        loginPage.sendEmamailPassword("deneme@maili.com","535353");
        Assertions.assertTrue(loginPage.isLoggedIn());







    }

    @Test
    public void testCase02(){
        this.testCase01();
        this.homePage.logOut();
        Assertions.assertTrue(this.loginPage.isOnLoginPage());

    }
    @Test
    public void testCase03() {
        homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.isOnHomepage());
        homePage.clickLoginPage();
        loginPage = new LoginPage(driver);
        Assertions.assertTrue(loginPage.isOnLoginPage());
        loginPage.sendEmamailPassword("incorrect@email", "incorrect password");
        Assertions.assertTrue(loginPage.isIncorrectInputMesssageVısıble());
    }


    @Test
    public void testCase04(){
        this.testCase01();
        loginPage=new LoginPage(driver);
        loginPage.isLoggedAsUsernameDısp();


        }

    @Test
    public void testCase05(){
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        Assertions.assertTrue(homePage.isOnHomepage());
        homePage.clickLoginPage();
        Assertions.assertTrue(loginPage.isOnLoginPage());
        loginPage.registerNewUserOnLoginPage("name","deneme@maili.com");

        loginPage.isAlreadyExistEmailDisp();




    }



    @Test
    public void testCase06(){
        homePage = new HomePage(driver);
        testCasesPage=new TestCasesPage(driver);
        Assertions.assertTrue(homePage.isOnHomepage());
        homePage.clickTestCasesPage();
        Assertions.assertTrue(testCasesPage.checkIfTextDısp());

    }

    @Test
    public void testCase07(){
        homePage = new HomePage(driver);
        productsPage=new ProductsPage(driver);
        Assertions.assertTrue(homePage.isOnHomepage());
        homePage.clickProductsPage();
        Assertions.assertTrue(productsPage.isOnProductsPage());

    }

    @Test
    public void testCase08(){
        productsPage=new ProductsPage(driver);
        this.testCase07();
        productsPage.clickFirstProduct();
        productsPage.isAddTocartAvaliable();


    }

    @Test
    public void testCase9(){
        productsPage=new ProductsPage(driver);
        this.testCase07();
        productsPage.searchProduct("Tshirt");
        productsPage.isOnSearchedProducts();
    }


    @Test
    public void TestCase10(){
        productsPage=new ProductsPage(driver);
        cartPage=new CartPage(driver);
        this.testCase07();
        productsPage.addTocartFirstİtem();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        productsPage.countiuneShopping();
        productsPage.addToCartsecondİtem();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        productsPage.viewCart();
        Assertions.assertTrue(cartPage.isFırstAndSeconProductOnCart());

    }


    }




