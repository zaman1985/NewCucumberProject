package pageObject;

import base.Config;
import base.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTableHandeling extends Config {
    public WebTableHandeling(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    public void WebTableHandeling() {
        List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"page-content-wrapper\"]/div/table/tbody/tr"));
        System.out.println(rows.size());

        String beforeXpath = "//*[@id=\"page-content-wrapper\"]/div/table/tbody/tr[";
        String afterXpath = "]/td[1]";
        for (int i = 1; i <= rows.size(); i++) {
            String actualXpath = beforeXpath + i + afterXpath;
            WebElement element = driver.findElement(By.xpath(actualXpath));

            if (element.getText().contains(global_studentFirstName)) {
                System.out.println("Student newly FirstName===" + element.getText());
                break;

            }
        }
        String afterXpathLastname = "]/td[2]";
        for (int i = 1; i <= rows.size(); i++) {
            String actualXpath = beforeXpath + i + afterXpathLastname;
            WebElement element = driver.findElement(By.xpath(actualXpath));

            if (element.getText().contains(global_studentLastName)) {
                System.out.println("Student newly LastName===" + element.getText());
                break;
            }

        }
        String emailXpath = "]/td[3]";
        for (int i = 1; i <= rows.size(); i++) {
            String actualXpath = beforeXpath + i + emailXpath;
            WebElement element = driver.findElement(By.xpath(actualXpath));
            if (element.getText().contains(global_studentEmail)) {
                System.out.println("Student newly Email===" + element.getText());
                break;
            }
        }

    }
}
