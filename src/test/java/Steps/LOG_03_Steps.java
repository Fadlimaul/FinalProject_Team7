package Steps;

import Pages.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LOG_03_Steps {

    WebDriver driver;
    LoginPage login;
    ForgotPasswordPage forgotpass;
    VerCodePage vercode;
    LoginSuccessPage sukses;
    CreateNewPassPage createpass;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://rupiapp.me/");
        login = new LoginPage(driver);
        forgotpass = new ForgotPasswordPage(driver);
        vercode = new VerCodePage(driver);
        sukses = new LoginSuccessPage(driver);
        createpass = new CreateNewPassPage(driver);
    }

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        // Assuming the driver is already navigated to the login page in the setUp method
    }

    @When("the user enters {string} as username and {string} as password")
    public void the_user_enters_as_username_and_as_password(String username, String password) {
        login.InputUsername(username);
        login.InputPassword(password);
    }

    @When("the user clicks on the {string} link")
    public void the_user_clicks_on_the_link(String link) {
        login.ClickForgotPassword();
    }

    @When("the user enters {string} as username in the forgot password page")
    public void the_user_enters_as_username_in_the_forgot_password_page(String username) {
        forgotpass.InputUsername(username);
    }

    @When("the_user clicks on the {string} button")
    public void theuser_clicks_on_the_button(String button) {
        forgotpass.ClickSendButton();
    }

    @When("the user clicks on the {string} button on the success_page")
    public void the_user_clicks_on_the_button_on_the_success_page(String button) {
        sukses.ClickOkButton();
    }

    @When("the user enters the verification code {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_user_enters_the_verification_code(String code2, String code3, String code4, String code5, String code6, String code7) {
        vercode.InputCode2(code2);
        vercode.InputCode3(code3);
        vercode.InputCode4(code4);
        vercode.InputCode5(code5);
        vercode.InputCode6(code6);
        vercode.InputCode7(code7);
    }

    @When("the user clicks on_the {string} button")
    public void the_user_clicks_on_the_continue_button(String button) {
        vercode.ClickContinueButton2();
        // sukses.ClickOkButton();
    }

    @When("the user filling new password form {string}")
    public void the_user_filling_new_password_form(String newpassword) {
        createpass.InputNewPassword(newpassword);
    }

    @When("the user filling confirm password form {string}")
    public void the_user_filling_confirm_password_form(String confirmpassword) {
        createpass.InputConfirmPassword(confirmpassword);
    }

    @When("the user click lanjutkan")
    public void the_user_click_lanjutkan() {
        createpass.ClickContinueButton();
    }

    @Then("the verification logo should be displayed")
    public void the_verification_logo_should_be_displayed() {
        Assert.assertTrue(vercode.LogoDisplayed());
    }

    @Then("the success message should be displayed")
    public void the_success_message_should_be_displayed() {
        Assert.assertTrue(sukses.SuccessMessageDisplayed());
    }

    @Then("the title page should be displayed")
    public void the_title_page_should_be_displayed() {
        Assert.assertEquals(createpass.getTittlePageText(),"Buat Password Baru");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
