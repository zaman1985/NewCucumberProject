package base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;


public class Utill extends Config {

    public void dropdownByXpathUsingValue(String loc, String value) {
        Select se = new Select(driver.findElement(By.xpath(loc)));
        se.selectByValue(value);
    }

    public void dropdownByValue(WebElement element, String value) {
        Select se = new Select(element);
        se.selectByValue(value);

    }

    public void dropdownByVisibleText(WebElement element, String value) {
        Select se = new Select(element);
        se.selectByVisibleText(value);

    }

    public void dropdownByIndex(WebElement element, int indexNum) {
        Select se = new Select(element);
        se.selectByIndex(indexNum);
    }

    public static void screenShot(String screenshotName) throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File(System.getProperty("users.dir") + "\\screenShots\\" + screenshotName + ".png"));
        System.out.println("Screenshot has been taken. Please go to: workspace-SpaFinder-screenShots Folder to view it. Thanks");
    }
}