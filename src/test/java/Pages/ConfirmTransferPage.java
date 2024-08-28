package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ConfirmTransferPage {

    WebDriver driver;
    WebDriverWait wait;

    By TextBiayaTransfer = By.id("biaya-transfer");
    By ContinueButton = By.xpath("//button[@aria-label='Lanjutkan Transfer']");

    public ConfirmTransferPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void ClickContinueButton() {
        wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
        driver.findElement(ContinueButton).click();
    }

    public boolean TextBiayaTransfer() {
        return driver.findElement(TextBiayaTransfer).isDisplayed();
    }
}
