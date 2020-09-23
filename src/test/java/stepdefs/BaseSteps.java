package stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseSteps {
    public static WebDriver driver;

    public BaseSteps() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "c:\\temp\\chromedriver.exe");
            driver = new ChromeDriver();
        }
    }
}
