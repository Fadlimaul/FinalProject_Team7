
package Steps;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class QR_02_Steps {
    WebDriver driver;
    LoginPage login;
    HomePage home;
    QRTerimaPage qrterima;
    VerCodePage vercode;
    LoginSuccessPage sukses;
    TransferSuccessPage transfersuccess;
    RiwayatTerimaPage terimapage;
    QRISPage qris;
    QRMerchantPage qrmerchant;
    InputPinPage inputpin;

    @Given("Im on the login page")
    public void imOnTheLoginPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rupiapp.me/");
    }

    @When("I log in with valid credentials")
    public void iLogInWithValidCredentials() {
        login = new LoginPage(driver);
        home = new HomePage(driver);
        login.InputUsername("testing2");
        login.InputPassword("Fadli798@");
        login.ClickLoginButton();
        sukses = new LoginSuccessPage(driver);
        sukses.ClickOkButton();
    }

    @And("I verify the OTP")
    public void iVerifyTheOTP() {
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

    @And("I navigate to the QRIS menu")
    public void iNavigateToTheQRISMenu() {
        home.ClickQRISMenu();
    }

    @And("I select the QR logo")
    public void iSelectTheQRLogo() {
        qris = new QRISPage(driver);
        qris.ClickQRlogo();
    }

    @And("I enter the PIN")
    public void iEnterThePIN() {
        inputpin = new InputPinPage(driver);
        inputpin.InputPinField1("1");
        inputpin.InputPinField2("2");
        inputpin.InputPinField3("3");
        inputpin.InputPinField4("4");
        inputpin.InputPinField5("5");
        inputpin.InputPinField6("6");
        inputpin.ClickContinueButton1();
    }

    @Then("I should see the QR Merchant text")
    public void iShouldSeeTheQRMerchantText() {
        qrmerchant = new QRMerchantPage(driver);
        Assert.assertTrue(qrmerchant.QRMerchantTextDisplayed());
    }
}


