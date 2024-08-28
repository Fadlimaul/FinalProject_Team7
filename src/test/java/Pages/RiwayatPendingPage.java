package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RiwayatPendingPage {

    WebDriver driver;
    WebDriverWait wait;

    By FilterButton = By.id("");
    By TextInformation = By.xpath("//h6[text()='Hore! Saat ini tidak ada proses QR yang menunggu.']");
    By QRText = By.xpath("//p[text()='Riwayat QR Terima Transfer']");
    public RiwayatPendingPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void ClickFilterButton() {
        wait.until(ExpectedConditions.elementToBeClickable(FilterButton));
        driver.findElement(FilterButton).click();
    }

    public boolean TextInformationDisplayed() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(TextInformation));

        // Using JavaScriptExecutor to scroll to the element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        // Return whether the element is displayed
        return element.isDisplayed();
    }
    public String getQRText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(QRText));
        return driver.findElement(QRText).getText();
    }
}
