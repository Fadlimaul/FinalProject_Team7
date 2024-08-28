package Steps;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.IOException;

public class TT_01_Steps {
    WebDriver driver;
    LoginPage login;
    HomePage home;
    TarikTunaiPage tarik;
    ConfirmTarikPage confirmtarik;
    InputPinPage inputpin;
    TarikSuccessPage suksestarik;
    LoginSuccessPage sukses;
    VerCodePage vercode;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().window().setSize(new Dimension(1024, 768));
    }

    @Given("The user is on the login")
    public void user_is_on_the_login() {
        driver.get("https://rupiapp.me/");
    }

    @When("The user log in with username {string} and password {string}")
    public void user_log_in(String username, String password) {
        login = new LoginPage(driver);
        login.InputUsername(username);
        login.InputPassword(password);
        login.ClickLoginButton();
    }

    @When("The user completes the OTP")
    public void user_completes_0TP() {
        sukses = new LoginSuccessPage(driver);
        vercode = new VerCodePage(driver);

        sukses.ClickOkButton();
        vercode.InputCode1("1");
        vercode.InputCode2("2");
        vercode.InputCode3("3");
        vercode.InputCode4("4");
        vercode.InputCode5("5");
        vercode.InputCode6("6");
        vercode.ClickContinueButton1();
        sukses.ClickOkButton();
    }

    @When("The user navigates to the menu")
    public void user_navigates_to_menu() throws IOException {
        home = new HomePage(driver);
        home.ClickTarikSetorMenu();
    }

    @When("The user enters an amount of {string} and name token {string}")
    public void user_enters_amount_and_name_token(String amount, String nameToken) {
        tarik = new TarikTunaiPage(driver);
        tarik.InputAmount(amount);
        tarik.InputNameToken(nameToken);
    }

    @When("The user click lanjutkan button")
    public void user_click_lanjutkan() {
        tarik = new TarikTunaiPage(driver);
        tarik.ClickContinueButton();
    }

    @When("The user confirms the withdrawal")
    public void user_confirms_withdrawal() throws IOException {
        confirmtarik = new ConfirmTarikPage(driver);
        confirmtarik.ClickContinueButton();
    }

    @When("The user enter PIN {string} {string} {string} {string} {string} {string}")
    public void user_enter_pin(String PinField1, String PinField2, String PinField3, String PinField4, String PinField5, String PinField6) {
        inputpin = new InputPinPage(driver);
        inputpin.InputPinField1(PinField1);
        inputpin.InputPinField2(PinField2);
        inputpin.InputPinField3(PinField3);
        inputpin.InputPinField4(PinField4);
        inputpin.InputPinField5(PinField5);
        inputpin.InputPinField6(PinField6);
    }

    @When("The user click lanjutkan button pin")
    public void user_click_lanjutkan_pin() {
        inputpin = new InputPinPage(driver);
        inputpin.ClickContinueButton2();
    }

    @Then("The withdrawal should be successful")
    public void withdrawal_should_be_successful() {
        suksestarik = new TarikSuccessPage(driver);
        inputpin = new InputPinPage(driver);
        tarik = new TarikTunaiPage(driver);
        Assert.assertTrue(suksestarik.TextDisplayed());
        Assert.assertEquals(tarik.getCurrentUrl(), "https://rupiapp.me/tarik-setor-tunai");
//        Assert.assertTrue(tarik.WarningTextDisplayed());
//        Assert.assertTrue(inputpin.TittlePageDisplayed());
//        Assert.assertTrue(inputpin.WarningTextDisplayed());

    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


