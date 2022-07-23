import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    By goToLoginPage=By.xpath("//a[normalize-space()='Signup / Login']");
    By checkIfHomepage=By.xpath("//img[@alt='Website for automation practice']");

    By goToTestCasesPage=By.xpath("//a[normalize-space()='Test Cases']");

    By goToProductsPage=By.xpath("//a[@href='/products']");

    By LogOutButton=By.xpath("//a[normalize-space()='Logout']");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public LoginPage clickLoginPage(){
        click(goToLoginPage);
        return new LoginPage(driver);
    }
    public TestCasesPage clickTestCasesPage(){
        click(goToTestCasesPage);
        return new TestCasesPage(driver);
    }

    public ProductsPage clickProductsPage(){
        click(goToProductsPage);
        return new ProductsPage(driver);
    }

    public boolean isOnHomepage(){
        return isDisplayed(checkIfHomepage);
    }

    public LoginPage logOut(){
        click(LogOutButton);
        return new LoginPage(driver);
    }




}
