package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
    public Login_page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(how= How.NAME,using = "email")
    public WebElement EmailOrId;

    @FindBy(how=How.NAME,using = "password")
    public WebElement Password;

    @FindBy(how=How.XPATH,using = "//input[@value='Log In']")
    public WebElement logInButton;


    public void inputEmailOrId(String studentEmailOrId){
        EmailOrId.sendKeys(studentEmailOrId);
    }
    public void inputPassword(String studentPassword){
        Password.sendKeys(studentPassword);

    }
    public void clickOnLoginButton(){
        logInButton.click();
    }
}
