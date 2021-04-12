package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Profile_page {
    public Profile_page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
@FindBy(how= How.XPATH,using = "//*[@id=\"profile_form\"]/h5")
    public WebElement verifyHomepage;

    public void verifyHomepagelogo(){
        String exp="Update Profile";
        String actual= verifyHomepage.getText();
        System.out.println(actual);
        Assert.assertEquals(actual,exp);
    }

}

