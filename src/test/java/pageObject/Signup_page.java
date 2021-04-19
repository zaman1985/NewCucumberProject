package pageObject;

import base.Config;
import base.TestData;
import base.Utill;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Signup_page extends Config {

    Faker faker=new Faker();
    Utill utill=new Utill();
    public Signup_page(WebDriver driver){

        PageFactory.initElements(driver,this);
    }

@FindBy(how= How.NAME,using = "firstName")
    public WebElement firstName;

    @FindBy(how=How.NAME,using = "lastName")
    public WebElement lastName;

    @FindBy(how=How.NAME,using = "email")
    public WebElement email;

    @FindBy(how=How.NAME,using = "password")
    public WebElement password;

    @FindBy(how=How.NAME,using = "confirmPassword")
    public WebElement confirmPassword;

    @FindBy(how=How.NAME,using = "month")
    public WebElement month;

    @FindBy(how=How.NAME,using = "day")
    public WebElement day;

    @FindBy(how=How.NAME,using = "year")
    public WebElement year;

    @FindBy(how=How.XPATH,using = "//input[@type='radio']")
    public WebElement radioButton;

    @FindBy(how=How.ID,using = "male")
    public WebElement radioMale;

    @FindBy(how=How.ID,using = "female")
    public WebElement radioFemale;

    @FindBy(how=How.ID,using = "defaultCheck1")
    public WebElement agreeCheckbox;

    @FindBy(how=How.XPATH,using = "//button[@type='submit']")
    public WebElement createMyAccount;

    @FindBy(how=How.XPATH,using = "//div[@class='alert alert-success']")
    public WebElement successMessage;

    @FindBy(how=How.XPATH,using = "//div[@class='alert alert-success']")
    public WebElement studentId;

    @FindBy(how=How.XPATH,using = "//a[@href=\"http://qa.taltektc.com/home/login\"]")
    public WebElement clickLogInformGnb;

    public void studentFirstName(){
        TestData.global_studentFirstName=faker.name().firstName();
        firstName.sendKeys(global_studentFirstName);
        System.out.println("Student FirstName==="+global_studentFirstName);
    }
    public void studentLastName(){
        TestData.global_studentLastName=faker.name().lastName();
        lastName.sendKeys(global_studentLastName);
        System.out.println("Student LastName==="+global_studentLastName);
    }
    public void studentEmail(){
        TestData.global_studentEmail=faker.internet().emailAddress();
        email.sendKeys(global_studentEmail);
        System.out.println("Student Email Address==="+global_studentEmail);
    }
    public void studentPassword(){
        password.sendKeys(global_studentPassword);
    }
    public void studentConfirmPassword(){
        confirmPassword.sendKeys(global_studentConfirmPassword);
    }
    public void inputDob(){
       utill.dropdownByVisibleText(month,"Dec");
       utill.dropdownByVisibleText(day,"20");
       utill.dropdownByVisibleText(year,"1985");
    }
    public void pickMail(){
        radioMale.click();
    }
    public void clickAgreeButton(){
        agreeCheckbox.click();
    }
    public void clickOnCreateAccountButton(){
        createMyAccount.click();
    }
    public void thanksMessage(){

        String exp="Thank you for sign up";
        String actual=successMessage.getText().substring(0,21);
        System.out.println("Actual message ==="+actual);
        Assert.assertEquals(actual,exp);
    }
    public void getStudentId(){
        TestData.global_studentId=studentId.getText().substring(38);
    }
    public void clickOnLoginButtonFromGnb(){
        clickLogInformGnb.click();
    }
}

