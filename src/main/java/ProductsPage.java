import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage{
    By checkIfProductsPage=By.xpath("//h2[@class='title text-center']");
    By viewFirstProducts=By.xpath("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]");

    By addToCartButton=By.xpath("//button[@type='button']");

    By searchBox=By.xpath("//input[@id='search_product']");

    By searchBoxIcon=By.xpath("//i[@class='fa fa-search']");

    By checkIfsearchedProducts=By.xpath("//h2[@class='title text-center']");

    By addToCartFirstİtemButton=By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/a");
    By getAddToCartSecondİtemButton=By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]/a");
    By contiuneShoppingButton=By.xpath("//button[@class='btn btn-success close-modal btn-block']");
    By viewCartbutton=By.xpath("//u[normalize-space()='View Cart']");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }
    public boolean isOnProductsPage(){
        return isDisplayed(checkIfProductsPage);
    }

    public void clickFirstProduct(){
        click(viewFirstProducts);
    }
    public boolean isAddTocartAvaliable(){
        return isDisplayed(addToCartButton);
    }

    public void searchProduct(String text){
        type(searchBox,text);
        click(searchBoxIcon);
    }
    public boolean isOnSearchedProducts(){
        return isDisplayed(checkIfsearchedProducts);
    }

    public void addTocartFirstİtem(){
        click(addToCartFirstİtemButton);
    }
    public void addToCartsecondİtem(){
        click(getAddToCartSecondİtemButton);
    }

    public void countiuneShopping(){
        click(contiuneShoppingButton);

    }
    public void viewCart(){
        click(viewCartbutton);
    }
}
