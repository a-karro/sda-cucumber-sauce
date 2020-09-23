package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends BasePage {
    By userName = By.id("user-name");
    By password = By.id("password");
    By loginButton = By.id("login-button");

    public LoginPage(WebDriver driver) throws Exception {
        super(driver);
    }

    public void setUserName(String username) {
        WebElement element = driver.findElement(userName);
        element.sendKeys(username);
    }

    public void setPassword(String pwd) {
        WebElement element = driver.findElement(password);
        element.sendKeys(pwd);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}
