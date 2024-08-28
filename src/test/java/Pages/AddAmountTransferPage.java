package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddAmountTransferPage {

    WebDriver driver;
    WebDriverWait wait;

    By AmountField = By.id("amount");
    By TransferNoteField = By.id("description");
    By ContinueButton = By.xpath("//button[@aria-label='Lanjutkan Transfer']");
    By TextCatatanTransfer = By.xpath("//p[contains(@class, 'MuiTypography-root') and contains(@class, 'MuiTypography-body1') and text()='Catatan Transfer']");

    public AddAmountTransferPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public boolean GetTextCatatanTransfer() {
        return driver.findElement(TextCatatanTransfer).isDisplayed();
    }

    public void InputAmountField(Integer Amount) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(AmountField));
        driver.findElement(AmountField).sendKeys(Amount.toString());
    }

    public void InputTransferNoteField(String Note) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(TransferNoteField));
        driver.findElement(TransferNoteField).sendKeys(Note);
    }

    public void ClickContinueButton() {
        wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
        driver.findElement(ContinueButton).click();
    }
}
