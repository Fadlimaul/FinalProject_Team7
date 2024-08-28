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

public class MR_01_Steps {
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
    MutasiPage mutasi;
    DatePage date;
    TransferProofPage buktitransfer;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("The user login")
    public void user_login() {
        driver.get("https://rupiapp.me/");
    }

    @When("The user login with username {string} password {string}")
    public void user_login(String username, String password) {
        login = new LoginPage(driver);
        login.InputUsername(username);
        login.InputPassword(password);
        login.ClickLoginButton();
    }

    @When("The user entering OTP")
    public void user_entering_0TP() {
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

    @When("The user directed to {string}")
    public void user_directed_to(String menu) {
        home = new HomePage(driver);
        home.ClickMutasiMenu();
    }

    @When("The user click lihat bukti")
    public void user_click_lihat_bukti() {
        mutasi = new MutasiPage(driver);
        mutasi.ClickLihatBukti();
    }

    @When("The user click kategori transaksi")
    public void user_click_kategori_transaksi() {
        mutasi = new MutasiPage(driver);
        mutasi.ClickKategoriTransaksi();
    }

    @When("The user click download e-statement")
    public void user_click_download_estatement() {
        mutasi = new MutasiPage(driver);
        mutasi.ClickDownloadMutasi();
    }

    @When("The user click bagikan resi")
    public void user_click_bagikan_resi() {
        mutasi = new MutasiPage(driver);
        mutasi.ClickShareBukti();
    }

    @When("The user click download resi")
    public void user_click_download_resi() {
        mutasi = new MutasiPage(driver);
        mutasi.ClickDownloadBukti();
    }

    @When("The user choose kategori transaksi")
    public void user_choose_kategori_transaksi() {
        mutasi = new MutasiPage(driver);
        mutasi.ClickPengeluaran();
    }

    @When("The user choose date")
    public void user_choose_date() {
        mutasi = new MutasiPage(driver);
        date = new DatePage(driver);
        mutasi.ClickChooseDate();
        date.ClickStartDateChoose();
        date.ClickEndDateChoose();
    }



    @Then("The Text filter should be displayed")
    public void text_filter_should_be_displayed() {
    mutasi = new MutasiPage(driver);
    Assert.assertEquals(mutasi.getTextFilter(),"21 Agustus 2024");
    }

    @Then("The Bukti Transfer should be displayed")
    public void bukti_transfer_should_be_displayed() {
        buktitransfer = new TransferProofPage(driver);
        Assert.assertTrue(buktitransfer.TextDisplayed());
    }

    @Then("The Text pengeluaran should be displayed")
    public void text_pengeluaran_should_be_displayed() {
        mutasi = new MutasiPage(driver);
        Assert.assertEquals(mutasi.getTextPengeluaran(),"TRANSFER\n" +
                "Rupi App\n" +
                "maulana ilham\n" +
                "9319470400");
    }
    @Then("The Title Page Text shouldnt be displayed")
    public void title_page_text_shouldnt_be_displayed() {
        mutasi = new MutasiPage(driver);
        Assert.assertFalse(mutasi.TitlePageTextDisplayed());
    }


    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


