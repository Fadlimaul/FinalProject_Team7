
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

public class NA_01_Steps {
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
    NotifikasiPage notif;

    @Given("I on the login page")
    public void iOnTheLoginPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rupiapp.me/");
    }

    @When("I log in")
    public void iLogIn() {
        login = new LoginPage(driver);
        home = new HomePage(driver);
        login.InputUsername("testing2");
        login.InputPassword("Fadli798@");
        login.ClickLoginButton();
        sukses = new LoginSuccessPage(driver);
        sukses.ClickOkButton();
    }

    @And("I verify OTP")
    public void iVerifyOTP() {
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


    @And("I click notifikasi icon")
    public void iClickNotifikasiIcon() {
        home = new HomePage(driver);
        home.ClickNotifikasiButton();
    }

    @And("I click All notifikasi button")
    public void iClickNotifikasiButon() {
        home = new HomePage(driver);
        home.ClickAllNotifikasi();
    }


    @Then("I should see the title page text")
    public void iShouldSeeTheTitlePageText() {
        notif = new NotifikasiPage(driver);
        //Assert.assertTrue(notif.TitlePageTextDisplayed());
        Assert.assertEquals(notif.getTitlePageText(),"Notifikasi Aktivitas");
    }
}


