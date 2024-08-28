package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class QRTerimaPage {

    WebDriver driver;
    WebDriverWait wait;

    By CreateNewQRButton = By.xpath("//button[.//img[@alt='Scan QR'] and contains(text(),'Buat QR Baru')]");
    By ShareQRButton = By.xpath("//button[contains(., 'Bagikan QR')]");
    By HistoryButton = By.xpath("//img[@alt='Riwayat']");
    By AddAmount = By.xpath("//button[text()='Tambah Nominal']");
    By AmountField = By.id(":r0:");
    By QRImage = By.xpath("//img[starts-with(@src, 'data:image/png;base64,')]");
    By TitlePageText = By.xpath("//div[text()='QR Terima Transfer']");
    By BottomPageText = By.xpath("//p[text()='© Copyright 2024 Tim 7 SYNRGY 7']");

    public QRTerimaPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void ClickShareQRButton() {
        WebElement element = driver.findElement(ShareQRButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void ClickCreateNewQRButton() {
        WebElement element = driver.findElement(CreateNewQRButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }


    public void ClickHistoryButton() {
        wait.until(ExpectedConditions.elementToBeClickable(HistoryButton));
        driver.findElement(HistoryButton).click();
    }

    public void ClickAddAmount() {
        wait.until(ExpectedConditions.elementToBeClickable(AddAmount));
        driver.findElement(AddAmount).click();
    }

    public void InputAmountField(Integer Amount) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(AmountField));

        // Scroll to the element using JavaScript
        WebElement element = driver.findElement(AmountField);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        // Input the amount
        element.sendKeys(Amount.toString());
    }
    public boolean QRImageDisplayed() {
        return driver.findElement(QRImage).isDisplayed();
    }
    public boolean TitlePageTextDisplayed() {
        return driver.findElement(TitlePageText).isDisplayed();
    }
    public boolean BottomPageTextDisplayed() {
        return driver.findElement(BottomPageText).isDisplayed();
    }
    public String getTitlePageText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(TitlePageText));
        return driver.findElement(TitlePageText).getText();
    }

}
