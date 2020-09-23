package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.LoginPage;
import pages.MainPage;

public class LoginSteps extends BaseSteps {
    LoginPage loginPage;
    MainPage mainPage;

    public LoginSteps() throws Exception {
        super();
        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);
    }


    @Given("user navigates to {string}")
    public void userNavigatesTo(String pageName) {
        driver.get(pageName);
        BasePage.waitForLoad(driver);
    }

    @When("user enters {string} in user name field")
    public void userSetsUName(String name) {
        loginPage.setUserName(name);
    }

    @And("user enters {string} in password field")
    public void userEntersInPasswordField(String password) {
        loginPage.setPassword(password);
    }

    @And("user clicks Login button")
    public void userClicksLoginButton() {
        loginPage.clickLogin();
    }

    @Then("user is logged in the application")
    public void userIsLoggedInTheApplication() {
        assert mainPage.isPageLoaded();
    }
}
