package google;

import google.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static google.config.WebDriverConfig.*;

public class GoogleTestingApp {
    public static void main(String[] args) {


        WebDriver driver = getDriver(CHROME);
        driver.get("https://www.google.com");

        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("Kodilla");
        searchField.submit();

    }
}
