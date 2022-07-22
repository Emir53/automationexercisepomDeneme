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

    public void clickLoginPage(){
        click(goToLoginPage);
    }
    public void clickTestCasesPage(){
        click(goToTestCasesPage);
    }

    public void clickProductsPage(){
        click(goToProductsPage);
    }

    public boolean isOnHomepage(){
        return isDisplayed(checkIfHomepage);
    }

    public void logOut(){
        click(LogOutButton);
    }




}
