package stepdef;

import base.Config;
import io.cucumber.java.en.Then;
import pageObject.Profile_page;

public class Profile_steps extends Config {
    Profile_page profile=new Profile_page(driver);
    @Then("I will verify I successfully logged into my existing account")
    public void iWillVerifyISuccessfullyLoggedIntoMyExistingAccount() {
        profile.verifyHomepagelogo();

    }
}
