package Steps;

import Pages.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class IS_01_Steps {
    WebDriver driver;
    LoginPage login;
    HomePage home;
    TarikTunaiPage tarik;
    ConfirmTarikPage confirmtarik;
    InputPinPage inputpin;
    TarikSuccessPage suksestarik;
    LoginSuccessPage sukses;
    VerCodePage vercode;
    InfoSaldoPemasukanPage infosaldopemasukan;
    InfoSaldoPengeluaranPage infosaldopengeluaran;
    InfoTransferPage infotransfer;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("The user on the login")
    public void user_on_the_login() {
        driver.get("https://rupiapp.me/");
    }

    @When("The user log in with username {string} password {string}")
    public void user_log_in(String username, String password) {
        login = new LoginPage(driver);
        login.InputUsername(username);
        login.InputPassword(password);
        login.ClickLoginButton();
    }

    @When("The user complete OTP")
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

//    @When("The user click copy icon")
//    public void user_click_copy_icon() {
//        home = new HomePage(driver);
//        home.ClickCopyIcon();
//    }

    @When("The user directed to the {string}")
    public void user_directed_to_the(String menu) {
        home = new HomePage(driver);
        home.ClickInfoSaldoMenu();
    }

    @When("The user click eye icon")
    public void user_click_eye_icon() {
        infosaldopemasukan = new InfoSaldoPemasukanPage(driver);
        infosaldopemasukan.ClickEyeIcon();
    }

    @When("The user click change month")
    public void user_click_change_month() {
        infosaldopemasukan = new InfoSaldoPemasukanPage(driver);
        infosaldopemasukan.ClickChangeMonth();
    }

    @When("The user click transfer rupiah")
    public void user_click_transfer_rupiah() {
        infosaldopemasukan = new InfoSaldoPemasukanPage(driver);
        infosaldopemasukan.ClickTransferRupiah();
    }

    @When("The user click pengeluaran")
    public void user_click_pengeluaran() {
        infosaldopemasukan = new InfoSaldoPemasukanPage(driver);
        infosaldopemasukan.ClickPengeluaran();
    }

    @Then("The info saldo should be hidden")
    public void info_saldo_should_be_hidden() {
    infosaldopemasukan = new InfoSaldoPemasukanPage(driver);
    infosaldopemasukan.HiddenBalanceDisplayed();
    }

    @Then("The month info should be displayed")
    public void month_info_should_be_displayed() {
        infosaldopemasukan = new InfoSaldoPemasukanPage(driver);
        Assert.assertEquals(infosaldopemasukan.getMonthInformation(), "Juli 2024");
    }

    @Then("The pie chart shouldnt be displayed")
    public void pie_chart_shouldnt_be_displayed() {
        infosaldopemasukan = new InfoSaldoPemasukanPage(driver);
        Assert.assertFalse(infosaldopemasukan.PieChartDisplayed());
    }

    @Then("The text info should be displayed")
    public void text_info_should_be_displayed() {
        infotransfer = new InfoTransferPage(driver);
        Assert.assertTrue(infotransfer.TitleTextDisplayed());
    }

    @Then("The text total pengeluaran should be displayed")
    public void text_total_pengeluaran_should_be_displayed() {
        infosaldopengeluaran = new InfoSaldoPengeluaranPage(driver);
        Assert.assertEquals(infosaldopengeluaran.getText(), "Pengeluaran");
        // Assert.assertTrue(infosaldopengeluaran.pictDisplayed());
    }

    @Then("The user click copy icon")
    public void user_click_copy_icon() {
        home = new HomePage(driver);
        home.ClickCopyIcon();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


