package Steps;

import Pages.*;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.IOException;

public class TR_Steps {
    WebDriver driver;
    LoginPage login;
    HomePage home;
    TransferPage transfer;
    AddAccNumberPage accnumber;
    AddAmountTransferPage amounttransfer;
    ConfirmTransferPage confirmtrasfer;
    InputPinPage inputpin;
    TransferProofPage transferproof;
    VerCodePage vercode;
    LoginSuccessPage sukses;
    TransferSuccessPage transfersuccess;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rupiapp.me/login");
        login = new LoginPage(driver);
    }

    @When("I log in with username {string} and password {string}")
    public void i_log_in_with_username_and_password(String username, String password) {
        login.InputUsername(username);
        login.InputPassword(password);
        login.ClickLoginButton();
        sukses = new LoginSuccessPage(driver);
        sukses.ClickOkButton();
    }

    @When("I verify the OTP with code")
    public void i_verify_the_otp_with_code() {
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


    @When("I navigate to the transfer menu")
    public void i_navigate_to_the_transfer_menu() {
        home = new HomePage(driver);
        home.ClickTransferMenu();
    }

    @When("I cick add acc number")
    public void i_add_acc_number() {
        transfer = new TransferPage(driver);
        transfer.ClickAddAccountButton();
    }

    @When("I add an account with number {string}")
    public void i_add_an_account_with_number(String accNumber) {
        accnumber = new AddAccNumberPage(driver);
        accnumber.InputAccNumberField(accNumber);
    }

    @When("I click continue")
    public void i_click_continue() {
        accnumber = new AddAccNumberPage(driver);
        accnumber.ClickContinueButton();
    }

    @When("I enter amount {int} and note {string}")
    public void i_enter_amount_and_note(Integer amount, String note) {
        amounttransfer = new AddAmountTransferPage(driver);
        amounttransfer.InputAmountField(amount);
        amounttransfer.InputTransferNoteField(note);
        amounttransfer.ClickContinueButton();
    }

    @When("I confirm the transfer")
    public void i_confirm_the_transfer() {
        confirmtrasfer = new ConfirmTransferPage(driver);
        confirmtrasfer.ClickContinueButton();
    }

    @When("I input PIN {string} {string} {string} {string} {string} {string}")
    public void i_input_pin(String PinField1, String PinField2, String PinField3, String PinField4, String PinField5, String PinField6) {
        inputpin = new InputPinPage(driver);
        inputpin.InputPinField1(PinField1);
        inputpin.InputPinField2(PinField2);
        inputpin.InputPinField3(PinField3);
        inputpin.InputPinField4(PinField4);
        inputpin.InputPinField5(PinField5);
        inputpin.InputPinField6(PinField6);
    }

    @When("I click send pin")
    public void i_click_send_pin() {
        inputpin = new InputPinPage(driver);
        inputpin.ClickContinueButton1();
    }

    @When("I click bukti transfer")
    public void i_click_bukti_transfer() {
        transfersuccess = new TransferSuccessPage(driver);
        transfersuccess.ClickTransferProofButton();
    }

    @When("I click download button")
    public void i_click_download_button() {
        transferproof = new TransferProofPage(driver);
        transferproof.ClickDownloadButton();
    }

    @When("I click share button")
    public void i_click_share_button() {
        transferproof = new TransferProofPage(driver);
        transferproof.ClickShareButton();
    }

    @When("I click star icon")
    public void i_click_star_icon() throws IOException {
        transfer = new TransferPage(driver);
        transfer.ClickStarIcon();
    }

    @When("I click existing account")
    public void i_click_existing_account() {
        transfer = new TransferPage(driver);
        transfer.ClickExistingAccount();
    }

    @Then("I should see a transfer success message")
    public void i_should_see_a_transfer_success_message() {
        transfersuccess = new TransferSuccessPage(driver);
        Assert.assertEquals(transfersuccess.getTextTransferSuccess(), "Transaksi Berhasil");
        driver.quit();
    }

    @Then("I should see a logo displayed")
    public void i_should_see_a_logo_displayed() {
        accnumber = new AddAccNumberPage(driver);
        Assert.assertTrue(accnumber.LogoBCADisplayed());
        driver.quit();
    }

    @Then("I should see a bukti transfer")
    public void i_should_see_a_bukti_transfer() {
        transferproof = new TransferProofPage(driver);
        transferproof.TextDisplayed();
        driver.quit();
    }

    @Then("I shouldnt see a bukti transfer")
    public void i_shouldnt_see_a_bukti_transfer() {
        transferproof = new TransferProofPage(driver);
        Assert.assertFalse(transferproof.TextDisplayed());
        driver.quit();
    }

    @Then("I should see a text catatan transfer")
    public void i_should_see_a_text_catatan_transfer() {
        amounttransfer = new AddAmountTransferPage(driver);
        amounttransfer.GetTextCatatanTransfer();
        driver.quit();
    }

    @Then("I should see a Title page text")
    public void i_should_see_a_title_page_text() {
        inputpin = new InputPinPage(driver);
        inputpin.TittlePageDisplayed();
        driver.quit();
    }

    @Then("I shouldnt see a no favorite text")
    public void i_shouldnt_see_a_no_favorit_text() {
        transfer = new TransferPage(driver);
        Assert.assertFalse(transfer.noFavoriteTransactionTextDisplayed());
        driver.quit();
    }

    @Then("I should see a failed transaction")
    public void i_should_see_a_failed_transaction() {
        sukses = new LoginSuccessPage(driver);
        Assert.assertTrue(sukses.SuccessMessageDisplayed());
        driver.quit();
    }

    @Then("I should see a no favorite text")
    public void i_should_see_a_no_favorit_text() {
        transfer = new TransferPage(driver);
        Assert.assertTrue(transfer.noFavoriteTransactionTextDisplayed());
        driver.quit();
    }
}



