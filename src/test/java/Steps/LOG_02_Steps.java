package Steps;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.LoginSuccessPage;
import Pages.VerCodePage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LOG_02_Steps {

    WebDriver driver;
    LoginPage login;
    VerCodePage vercode;
    LoginSuccessPage sukses;
    HomePage home;

    @Given("The user is on the RupiApp login page")
    public void the_user_is_on_the_rupiapp_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rupiapp.me/");
        login = new LoginPage(driver);
        vercode = new VerCodePage(driver);
        sukses = new LoginSuccessPage(driver);
        home = new HomePage(driver);
    }

    @When("The user enters username {string}")
    public void the_user_enters_username(String username) {
        login = new LoginPage(driver);
        login.InputUsername(username);
    }

    @When("The user enters password {string}")
    public void the_user_enters_password(String password) {
        login = new LoginPage(driver);
        login.InputPassword(password);
    }

    @When("The user clicks the login button")
    public void the_user_clicks_the_login_button() {
        login.ClickLoginButton();
    }

    @When("The user clicks the ok button")
    public void the_user_clicks_the_ok_button() {
        sukses.ClickOkButton();
    }

    @When("The user click send new code")
    public void the_user_click_send_new_code() {
        vercode.ClickSendNewCode();
    }

    @When("The user enters the OTP code {string} {string} {string} {string} {string} {string}")
    public void the_user_enters_the_otp_code(String code1, String code2, String code3, String code4, String code5, String code6) {
        vercode.InputCode1(code1);
        vercode.InputCode2(code2);
        vercode.InputCode3(code3);
        vercode.InputCode4(code4);
        vercode.InputCode5(code5);
        vercode.InputCode6(code6);
    }
    @When("The user clicks send otp")
    public void the_user_clicks_send_otp() {
        vercode.ClickContinueButton1();
        sukses.ClickOkButton();
    }

    @When("the user clicks the eye icon to reveal the password")
    public void userClicksEyeIcon() {
        login.ClickEyeIcon();
    }

    @Then("the password should be displayed in the password field")
    public void passwordShouldBeDisplayed() {
        Assert.assertTrue(login.getPasswordText());
    }

    @Then("The user should be redirected to the home page and the app logo should be displayed")
    public void the_user_should_be_redirected_to_the_home_page_and_the_app_logo_should_be_displayed() {
        Assert.assertTrue(home.LogoAppDisplayed());
        driver.quit();
    }

    @Then("the text dashboard should be displayed")
    public void the_text_dashboard_should_be_displayed() {
        Assert.assertEquals(home.getTextDashboard(),"Rupi App");
        driver.quit();
    }

    @Then("I should see a warning message for the username field")
    public void i_should_see_a_warning_message_for_the_username_field() {
        Assert.assertEquals(login.getWarningUsernameText(), "Username harus diisi");
        driver.quit();
    }

    @Then("I should see a warning message for the password field")
    public void i_should_see_a_warning_message_for_the_password_field() {
        Assert.assertEquals(login.getWarningPasswordText(), "Password harus diisi");
        driver.quit();
    }

    @Then("I should see a warning message for the username and password field")
    public void i_should_see_a_warning_message_for_the_username_and_password_field() {
        Assert.assertEquals(login.getWarningUsernameText(), "Username harus diisi");
        Assert.assertEquals(login.getWarningPasswordText(), "Password harus diisi");
        driver.quit();
    }

    @Then("I should see a success message")
    public void I_should_see_a_success_message() {
        Assert.assertTrue(sukses.SuccessMessageDisplayed());
        driver.quit();
    }

    @Then("the app logo should be displayed")
    public void the_app_logo_should_be_displayed() {
        Assert.assertTrue(vercode.LogoDisplayed());
        driver.quit();
    }

    @Then("I should remain on the login page")
    public void i_should_remain_on_the_login_page() {
        Assert.assertEquals(login.getCurrentUrl(), "https://rupiapp.me/login");
        driver.quit();
    }


}
