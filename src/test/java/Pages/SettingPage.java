package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SettingPage {
    WebDriver driver;
    WebDriverWait wait;

    By NameField = By.id(":r3h:");
    By EmailField = By.id(":r24:");
    By UbahPasswordField = By.id(":r10:");
    By UbahNoHPField = By.id(":r12:");
    By SimpanButton = By.xpath("//button[@aria-label='Simpan Perubahan Form']");
    By TabUbahPin = By.xpath("//div[@aria-labelledby='TabUbahPin']");
    By TabUbahPassword = By.xpath("//div[@aria-labelledby='TabUbahPassword']");
    By TabUbahHP = By.xpath("//div[@aria-labelledby='TabUbahHP']");
    By TabInformasi = By.xpath("//div[@aria-labelledby='TabInformasi']");
    By InputPinField1 = By.id("pin-input-0");
    By InputPinField2 = By.id("pin-input-1");
    By InputPinField3 = By.id("pin-input-2");
    By InputPinField4 = By.id("pin-input-3");
    By InputPinField5 = By.id("pin-input-4");
    By ContinueButtonPIN = By.xpath("//button[@aria-label='Lanjut Ganti Pin']");
    By ContinueButtonPassword = By.xpath("//button[@aria-label='Lanjut Ganti Password']");
    By TitleTabText = By.xpath("//h4[text()='Tentang Rupi App']");

    public SettingPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }


    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
    public void ClickContinueButtonPIN() {
        wait.until(ExpectedConditions.elementToBeClickable(ContinueButtonPIN));
        driver.findElement(ContinueButtonPIN).click();
    }
    public void ClickContinueButtonPassword() {
        wait.until(ExpectedConditions.elementToBeClickable(ContinueButtonPassword));
        driver.findElement(ContinueButtonPassword).click();
    }
    public void ClickNameField() {
        wait.until(ExpectedConditions.elementToBeClickable(NameField));
        driver.findElement(NameField).click();
    }
    public void InputNameField(String name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(NameField));
        driver.findElement(NameField).sendKeys(name);
    }
    public void InputUbahPasswordField(String Password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(UbahPasswordField));
        driver.findElement(UbahPasswordField).sendKeys(Password);
    }
    public void InputUbahNoHPField(String NoHP) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(UbahNoHPField));
        driver.findElement(UbahNoHPField).sendKeys(NoHP);
    }
    public void InputEmailField(String Email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(EmailField));
        driver.findElement(EmailField).sendKeys(Email);
    }

    public void ClickSimpanButton() {
        wait.until(ExpectedConditions.elementToBeClickable(SimpanButton));
        driver.findElement(SimpanButton).click();
    }

    public void ClickTabUbahPin() {
        wait.until(ExpectedConditions.elementToBeClickable(TabUbahPin));
        driver.findElement(TabUbahPin).click();
    }
    public void ClickTabUbahPassword() {
        wait.until(ExpectedConditions.elementToBeClickable(TabUbahPassword));
        driver.findElement(TabUbahPassword).click();
    }
    public void ClickTabUbahHP() {
        wait.until(ExpectedConditions.elementToBeClickable(TabUbahHP));
        driver.findElement(TabUbahHP).click();
    }
    public void ClickTabInformasi() {
        wait.until(ExpectedConditions.elementToBeClickable(TabInformasi));
        driver.findElement(TabInformasi).click();
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
    public String getTitleTabText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(TitleTabText));
        return driver.findElement(TitleTabText).getText();
    }

}
