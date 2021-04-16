package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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

    @FindBy(how=How.XPATH,using = "//*[@id=\"error_message\"]/div/h5")
    public WebElement errorMessage;

    @FindBy(how=How.XPATH,using = "//*[@class=\"new-account\"]")
    public WebElement createNewAccount;


    public void inputEmailOrId(String studentEmailOrId){
        EmailOrId.sendKeys(studentEmailOrId);
    }
    public void inputPassword(String studentPassword){
        Password.sendKeys(studentPassword);

    }
    public void clickOnLoginButton(){
        logInButton.click();
    }
    public void setErrorMessage(){
        String exp="You have entered an incorrect email or student Id.";
        String actual =errorMessage.getText().substring(1);
        System.out.println(actual);
        Assert.assertEquals(actual,exp);


    }
    public void clickNewAccountButton(){
        createNewAccount.click();
    }
}
