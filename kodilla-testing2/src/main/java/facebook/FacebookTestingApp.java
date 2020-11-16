package facebook;

import google.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp<formContainer> {

    public static final String XPATH_COOKIES = "//button[contains(@class, \"_42ft _4jy0 _9fws _4jy3 _4jy1 selected _51sy\")]";
    public static final String XPATH_REGISTER = "//a[contains(@class, \"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\")]";
    public static final String XPATH_SIGN_IN_DAY = "//span/select[contains(@class, \"_9407 _5dba _9hk6 _8esg\")][1]";
    public static final String XPATH_SIGN_IN_MONTH = "//span/select[contains(@class, \"_9407 _5dba _9hk6 _8esg\")][2]";
    public static final String XPATH_SIGN_IN_YEAR = "//span/select[contains(@class, \"_9407 _5dba _9hk6 _8esg\")][3]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        driver.findElement(By.xpath(XPATH_COOKIES)).click();
        driver.findElement(By.xpath(XPATH_REGISTER)).click();

        Thread.sleep(2000);

        while (!driver.findElement(By.xpath(XPATH_SIGN_IN_DAY)).isDisplayed()) ;

        WebElement dayField = driver.findElement(By.xpath(XPATH_SIGN_IN_DAY));
        Select daySelector = new Select(dayField);
        daySelector.selectByIndex(1);

        WebElement monthField = driver.findElement(By.xpath(XPATH_SIGN_IN_MONTH));
        Select monthSelector = new Select(monthField);
        monthSelector.selectByIndex(6);

        WebElement yearField = driver.findElement(By.xpath(XPATH_SIGN_IN_YEAR));
        Select yearSelector = new Select(yearField);
        yearSelector.selectByIndex(27);
    }
}
