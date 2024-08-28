package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TransferProofPage {

    WebDriver driver;
    WebDriverWait wait;

    By ShareButton = By.xpath("//button[text()='Bagikan Resi']");
    By DownloadButton = By.xpath("//button[text()='Download']");
    By Text = By.xpath("//h6[text()='Transfer Berhasil']");

    public TransferProofPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public boolean TextDisplayed() {
        return driver.findElement(Text).isDisplayed();
    }

    public void ClickShareButton() {
        wait.until(ExpectedConditions.elementToBeClickable(ShareButton));
        driver.findElement(ShareButton).click();
    }

    public void ClickDownloadButton() {
        wait.until(ExpectedConditions.elementToBeClickable(DownloadButton));
        driver.findElement(DownloadButton).click();
    }
}
