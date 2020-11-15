package ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static google.config.WebDriverConfig.CHROME;
import static google.config.WebDriverConfig.getDriver;

public class EBayTestingApp {

    public static void main(String[] args) {


        WebDriver driver = getDriver(CHROME);
        driver.get("https://www.ebay.com/");

        WebElement searchField = driver.findElement(By.id("gh-ac"));
        searchField.sendKeys("Laptop");
        searchField.submit();
    }
}
