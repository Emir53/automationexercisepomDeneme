import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    By emailBox=By.xpath("//input[@data-qa='login-email']");
    By passWordbox=By.xpath("//input[@placeholder='Password']");

    By loginIcon=By.xpath("//button[normalize-space()='Login']");
    By checkIfLoginPage=By.xpath("//h2[normalize-space()='Login to your account']");
    By deleteAccountIcon=By.xpath("//a[normalize-space()='Delete Account']");
    By incorrectEmailPasswordmessage=By.xpath("//p[normalize-space()='Your email or password is incorrect!']");
    By loggedAsUserName=By.xpath("//li[10]//a[1]");
    By emailAdressAlreadyExistMessage=By.xpath("//p[normalize-space()='Email Address already exist!']");

    By loginPageName=By.xpath("//input[@placeholder='Name']");

    By LoginPageRegisterEmail=By.xpath("//input[@data-qa='signup-email']");

    By loginPageSignUpButton=By.xpath("//button[normalize-space()='Signup']");
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void sendEmamailPassword(String your_email,String your_password){

        type(emailBox,your_email);
        type(passWordbox,your_password);
        click(loginIcon);
    }

    public void registerNewUserOnLoginPage(String your_name,String your_email){
        type(loginPageName,your_name);
        type(LoginPageRegisterEmail,your_email);
        click(loginPageSignUpButton);
    }

    public boolean isOnLoginPage(){
        return isDisplayed(checkIfLoginPage);
    }
    public boolean isLoggedIn(){
        return isDisplayed(deleteAccountIcon);
    }

    public boolean isIncorrectInputMesssageVısıble(){
        return isDisplayed(incorrectEmailPasswordmessage);
    }

    public boolean isLoggedAsUsernameDısp(){
        return isDisplayed(loggedAsUserName);

    }

    public boolean isAlreadyExistEmailDisp(){
        return isDisplayed(emailAdressAlreadyExistMessage);
    }

}
