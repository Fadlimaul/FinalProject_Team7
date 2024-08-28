package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VerCodePage {
    WebDriver driver;
    WebDriverWait wait;

    By CodeField1 = By.id(":r2:");
    By CodeField2 = By.id(":r3:");
    By CodeField3 = By.id(":r4:");
    By CodeField4 = By.id(":r5:");
    By CodeField5 = By.id(":r6:");
    By CodeField6 = By.id(":r7:");
    By CodeField7 = By.id(":r8:");
    By ContinueButton1 = By.xpath("//button[@aria-label='Button Lanjutkan verifikasi kode OTP']");
    By ContinueButton2 = By.xpath("//button[@aria-label='Button lanjutkan verifikasi kode otp lupa password']");
    By SendNewCode = By.xpath("//p[@aria-label='Button request kode otp baru']");
    By Logo = By.xpath("//img[@alt='Logo Rupi App']");
    By TittlePage = By.xpath("//h5[@class='MuiTypography-root']");
    By Text = By.xpath("//h3[normalize-space(text())='Verifikasi Gagal']");


    public VerCodePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    public boolean LogoDisplayed() {
        return driver.findElement(Logo).isDisplayed();
    }

    public boolean TextDisplayed() {
        return driver.findElement(Text).isDisplayed();
    }

    public boolean TittlePageDisplayed() {
        return driver.findElement(TittlePage).isDisplayed();
    }

    public void InputCode1(String code) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CodeField1));
        driver.findElement(CodeField1).sendKeys(code);
    }

    public void InputCode2(String code) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CodeField2));
        driver.findElement(CodeField2).sendKeys(code);
    }

    public void InputCode3(String code) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CodeField3));
        driver.findElement(CodeField3).sendKeys(code);
    }

    public void InputCode4(String code) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CodeField4));
        driver.findElement(CodeField4).sendKeys(code);
    }

    public void InputCode5(String code) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CodeField5));
        driver.findElement(CodeField5).sendKeys(code);
    }

    public void InputCode6(String code) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CodeField6));
        driver.findElement(CodeField6).sendKeys(code);
    }

    public void InputCode7(String code) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CodeField7));
        driver.findElement(CodeField7).sendKeys(code);
    }

    public void ClickContinueButton1() {
        wait.until(ExpectedConditions.elementToBeClickable(ContinueButton1));
        driver.findElement(ContinueButton1).click();
    }

    public void ClickContinueButton2() {
        wait.until(ExpectedConditions.elementToBeClickable(ContinueButton2));
        driver.findElement(ContinueButton2).click();
    }

    public void ClickSendNewCode() {
        wait.until(ExpectedConditions.elementToBeClickable(SendNewCode));
        driver.findElement(SendNewCode).click();
    }

}
