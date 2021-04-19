package stepdef;

import base.Config;
import io.cucumber.java.en.And;
import pageObject.WebTableHandeling;

public class Webtable_steps extends Config {
    WebTableHandeling webtable=new WebTableHandeling(driver);
    @And("I will verify firstName,lastName and email from WebTable recently created")
    public void iWillVerifyFirstNameLastNameAndEmailFromWebTableRecentlyCreated() {
        webtable.WebTableHandeling();
    }
}
