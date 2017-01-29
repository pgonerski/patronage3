package com.patronage.Steps;

import com.patronage.Pages.LoginPage;
import cucumber.api.java8.En;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by pgone on 29.01.2017.
 */
public class Login implements En {
    WebDriver driver = new ChromeDriver();
    LoginPage login = PageFactory.initElements(driver,LoginPage.class);
    public Login() {
        String baseUrl = "automationpractice.com/index.php?controller=authentication&back=my-account";
        After(Scenario -> {
            driver.quit();
        });
        Given("^user is on login page$", () -> {
            driver.get("http://" + baseUrl);
        });
        When("^user enter email as \"([^\"]*)\" and password as \"([^\"]*)\"$", (String email, String password) -> {
            login.getEmail().sendKeys(email);
            login.getPassword().sendKeys(password);
            login.getLoginButton().click();
        });
        And("^user click login button$", () -> {

        });
        Then("^user should see my account page$", () -> {
            WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("columns-container")));
            Assert.assertEquals(false, driver.findElements(By.className("columns-container")).contains(By.className("alert alert-danger")));
        });
        /*Then("^user enter following emails and passwords$", (DataTable table) -> {
            List<List<String>> logins = table.raw();
            System.out.print(logins.get(0).get(0));
            System.out.print(logins.get(0).get(1));
        });*/
        When("^user enter ([^\"]*) and ([^\"]*)$", (String email, String password) -> {
            // Write code here that turns the phrase above into concrete actions
            login.getEmail().sendKeys(email);
            login.getPassword().sendKeys(password);
            login.getLoginButton().click();
        });
    }
}
