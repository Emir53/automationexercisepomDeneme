import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCasesPage extends BasePage{

    By testCasesText=By.xpath("//b[normalize-space()='Test Cases']");
    public TestCasesPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkIfTextDısp(){
        return isDisplayed(testCasesText);
    }

}
