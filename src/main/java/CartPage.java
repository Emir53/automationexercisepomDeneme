import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{
    By fisrtItemOnCart=By.xpath("//tr[@id='product-1']//img[@alt='Product Image']");
    By secondItemOnCart=By.xpath("//tr[@id='product-2']//img[@alt='Product Image']");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    boolean isFırstAndSeconProductOnCart(){
        return (isDisplayed(fisrtItemOnCart)&&isDisplayed(secondItemOnCart));
    }
}
