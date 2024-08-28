package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;

public class TarikTunaiPage {

    WebDriver driver;
    WebDriverWait wait;

    By AmountField = By.id("amount");
    By NameTokenField = By.id("namaToken");
    By ContinueButton = By.xpath("//button[@aria-label='submit request tarik tunai form']");
//By ContinueButton = By.xpath("//button[contains(@class, 'MuiButton-containedPrimary') and text()='Lanjutkan']");
    By SetorButton = By.xpath("//button[contains(text(), 'Setor')]");
    By WarningText = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-rduto9' and text()='Nominal Tarik Tunai minimal IDR 50.000']");


    public TarikTunaiPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void InputAmount(String Amount) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(AmountField));
        driver.findElement(AmountField).sendKeys(Amount);
    }

    public void InputNameToken(String Token) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(NameTokenField));
        driver.findElement(NameTokenField).sendKeys(Token);
    }

    public void ClickContinueButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ContinueButton));
        driver.findElement(ContinueButton).click();
    }

    public void ClickSetorButton() {
        wait.until(ExpectedConditions.elementToBeClickable(SetorButton));
        driver.findElement(SetorButton).click();
    }
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
    public boolean WarningTextDisplayed() {
        return driver.findElement(WarningText).isDisplayed();
    }
//    public void ClickContinueButton() {
//        // Atur WebDriverWait dengan durasi 30 detik
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//
//        // Tunggu hingga elemen terlihat
//        wait.until(ExpectedConditions.visibilityOfElementLocated(ContinueButton));
//
//        // Gunakan JavascriptExecutor untuk menggulir ke elemen
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(ContinueButton));
//
//        // Tunggu hingga elemen dapat diklik
//        wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
//
//        // Klik elemen ContinueButton
//        driver.findElement(ContinueButton).click();
//    }
}
