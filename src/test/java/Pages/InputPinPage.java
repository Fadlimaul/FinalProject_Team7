package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InputPinPage {

    WebDriver driver;
    WebDriverWait wait;

    By InputPinField1 = By.id("pin-input-0");
    By InputPinField2 = By.id("pin-input-1");
    By InputPinField3 = By.id("pin-input-2");
    By InputPinField4 = By.id("pin-input-3");
    By InputPinField5 = By.id("pin-input-4");
    By InputPinField6 = By.id("pin-input-5");
    By ContinueButton1 = By.xpath("//button[@aria-label='Lanjutkan Transfer']");
    By ContinueButton2 = By.xpath("//button[@aria-label='submit pin']");
    By TittlePage = By.xpath("//h5[text()='Masukkan PIN']");
    By WarningText = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-97zew8' and text()='PIN diperlukan']");
    By InvalidText = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-97zew8' and text()='Invalid PIN']");
    By SaldoText = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-97zew8' and text()='Saldo tidak mencukupi']");
    public InputPinPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void InputPinField1(String pin) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(InputPinField1));
        driver.findElement(InputPinField1).sendKeys(pin);
    }

    public void InputPinField2(String pin) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(InputPinField2));
        driver.findElement(InputPinField2).sendKeys(pin);
    }

    public void InputPinField3(String pin) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(InputPinField3));
        driver.findElement(InputPinField3).sendKeys(pin);
    }

    public void InputPinField4(String pin) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(InputPinField4));
        driver.findElement(InputPinField4).sendKeys(pin);
    }

    public void InputPinField5(String pin) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(InputPinField5));
        driver.findElement(InputPinField5).sendKeys(pin);
    }

    public void InputPinField6(String pin) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(InputPinField6));
        driver.findElement(InputPinField6).sendKeys(pin);
    }

    public void ClickContinueButton1() {
        wait.until(ExpectedConditions.elementToBeClickable(ContinueButton1));
        driver.findElement(ContinueButton1).click();
    }
    public void ClickContinueButton2() {
        wait.until(ExpectedConditions.elementToBeClickable(ContinueButton2));
        driver.findElement(ContinueButton2).click();
    }

    public boolean TittlePageDisplayed() {
        return driver.findElement(TittlePage).isDisplayed();
    }
    public boolean WarningTextDisplayed() {
        return driver.findElement(WarningText).isDisplayed();
    }
    public boolean InvalidTexttDisplayed() {
        return driver.findElement(InvalidText).isDisplayed();
    }
    public boolean SaldoTextDisplayed() {
        return driver.findElement(SaldoText).isDisplayed();
    }
}
