package LOG_1;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TC_LOG_001 {
    WebDriver driver;
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://rupiapp.me/");
    }
    @Test
    public void TC_LOG_001() {
        LoginPage login = new LoginPage(driver);
        VerCodePage vercode = new VerCodePage(driver);
        LoginSuccessPage sukses = new LoginSuccessPage(driver);
        CreateNewPassPage createpass = new CreateNewPassPage(driver);
        CreateNewPinPage createnewpin = new CreateNewPinPage(driver);
        ConfirmPinPage confirmPinPage = new ConfirmPinPage(driver);
        HomePage home = new HomePage(driver);

        login.InputUsername("ilham");
        login.InputPassword("Ilham123@");
        login.ClickLoginButton();
        sukses.ClickOkButton();
        vercode.InputCode1("1");
        vercode.InputCode2("2");
        vercode.InputCode3("3");
        vercode.InputCode4("4");
        vercode.InputCode5("5");
        vercode.InputCode6("6");
        vercode.ClickContinueButton1();
        createpass.InputNewPassword("Ilham123@");
        createpass.InputConfirmPassword("Ilham123@");
        createpass.ClickContinueButton();
        createnewpin.InputPinField1("1");
        createnewpin.InputPinField2("2");
        createnewpin.InputPinField3("3");
        createnewpin.InputPinField4("4");
        createnewpin.InputPinField5("5");
        createnewpin.InputPinField6("6");
        createnewpin.ClickContinueButton();
        confirmPinPage.InputPinField1("1");
        confirmPinPage.InputPinField2("2");
        confirmPinPage.InputPinField3("3");
        confirmPinPage.InputPinField4("4");
        confirmPinPage.InputPinField5("5");
        confirmPinPage.InputPinField6("6");
        confirmPinPage.ClickContinueButton();


        // Assert.assertEquals(vercode.getCurrentUrl(), "");
        Assert.assertTrue(home.LogoAppDisplayed());
        // Assert.assertTrue(vercode.TittlePageDisplayed());
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}