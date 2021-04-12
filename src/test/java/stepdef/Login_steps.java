package stepdef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObject.Login_page;

public class Login_steps extends Config {
    Login_page login=new Login_page(driver);
    @Given("I am at talentTEK Home Page")
    public void iAmAtTalentTEKHomePage() {
        Assert.assertEquals(driver.getTitle(),"Sign In");
        System.out.println(driver.getTitle());

    }

    @And("I enter valid email address")
    public void iEnterValidEmailAddress() {
        login.inputEmailOrId("opu.ny2018@gmail.com");
    }

    @And("I enter valid password")
    public void iEnterValidPassword() {
        login.inputPassword("Kamrul201285");
    }

    @When("I click on Log In button")
    public void iClickOnLogInButton() {
        login.clickOnLoginButton();
    }
}
