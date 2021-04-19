package stepdef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Signup_page;


public class Signup_steps extends Config {
    Signup_page signup=new Signup_page(driver);
    @And("I filled out the form with valid information")
    public void iFilledOutTheFormWithValidInformation() {
        signup.studentFirstName();
        signup.studentLastName();
        signup.studentEmail();
        signup.studentPassword();
        signup.studentConfirmPassword();
        signup.inputDob();
        signup.pickMail();


        
    }

    @And("I clicked on agree checkbox")
    public void iClickedOnAgreeCheckbox() {
        signup.clickAgreeButton();
        
    }

    @When("I click Create My Account button")
    public void iClickCreateMyAccountButton() {
        signup.clickOnCreateAccountButton();
        
    }

    @Then("I will verify Thank you message")
    public void iWillVerifyThankYouMessage() {
        signup.thanksMessage();
    }

    @And("I will store the dynamic studentId")
    public void iWillStoreTheDynamicStudentId() {
        signup.getStudentId();
    }

    @And("I click on Login Link")
    public void iClickOnLoginLink() {
        signup.clickOnLoginButtonFromGnb();
    }
}
