package Steps;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.en.*;

import java.io.IOException;

public class ST_01_Steps {
    WebDriver driver;
    LoginPage login;
    HomePage home;
    TarikTunaiPage tarik;
    InputPinPage inputpin;
    SetorSuccessPage suksessetor;
    LoginSuccessPage sukses;
    VerCodePage vercode;
    SetorTunaiPage setor;
    ConfirmSetorPage confirmsetor;

    @Given("The user is on login page")
    public void user_is_on_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://rupiapp.me/");
    }

    @When("The user enters a valid username and password")
    public void user_enters_valid_username_password() {
        login = new LoginPage(driver);
        login.InputUsername("testing2");
        login.InputPassword("Fadli798@");
    }

    @And("The user clicks on the login button")
    public void user_clicks_login_button() {
        login.ClickLoginButton();
        sukses = new LoginSuccessPage(driver);
        sukses.ClickOkButton();
    }

    @And("The user enters the verification code")
    public void user_enters_verification_code() {
        vercode = new VerCodePage(driver);
        vercode.InputCode1("1");
        vercode.InputCode2("2");
        vercode.InputCode3("3");
        vercode.InputCode4("4");
        vercode.InputCode5("5");
        vercode.InputCode6("6");
        vercode.ClickContinueButton1();
        sukses.ClickOkButton();
    }


    @And("The user navigates to the deposit page")
    public void user_navigates_deposit_page() throws IOException {
        home = new HomePage(driver);
        home.ClickTarikSetorMenu();
        tarik = new TarikTunaiPage(driver);
        tarik.ClickSetorButton();
    }

    @And("user confirms deposit")
    public void user_confirms_deposit() {
        setor = new SetorTunaiPage(driver);
        setor.ClickContinueButton();
        confirmsetor = new ConfirmSetorPage(driver);
        confirmsetor.ClickContinueButton();
    }

    @And("The user enters the PIN {string} {string} {string} {string} {string} {string}")
    public void user_enters_pin(String PinField1, String PinField2, String PinField3, String PinField4, String PinField5, String PinField6) {
        inputpin = new InputPinPage(driver);
        inputpin.InputPinField1(PinField1);
        inputpin.InputPinField2(PinField2);
        inputpin.InputPinField3(PinField3);
        inputpin.InputPinField4(PinField4);
        inputpin.InputPinField5(PinField5);
        inputpin.InputPinField6(PinField6);
    }

    @And("The user click lanutkan")
    public void user_click_lanjutkan() {
        inputpin = new InputPinPage(driver);
        inputpin.ClickContinueButton2();
    }

    @Then("The user should see the PIN confirmation page")
    public void user_should_see_pin_confirmation_page() {
        Assert.assertTrue(inputpin.TittlePageDisplayed());
        driver.quit();
    }

    @Then("The deposit is successful")
    public void deposit_is_successful() {
        suksessetor = new SetorSuccessPage(driver);
        Assert.assertTrue(suksessetor.TextDisplayed());
        driver.quit();
    }
}
