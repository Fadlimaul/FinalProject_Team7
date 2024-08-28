package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InfoSaldoPengeluaranPage {

    WebDriver driver;
    WebDriverWait wait;

    By CopyIcon = By.id("");
    By EyeIcon = By.id("");
    By TransferRupiah = By.id("");
    By QRIS = By.id("");
    By TarikTunai = By.id("");
    By MonthInformation = By.id("");
    By Pemasukan = By.id("");
    By LihatMutasiButton = By.id("");
    By Text = By.xpath("//div[text()='Pengeluaran']");
    By pict = By.xpath("//g[contains(@transform, 'translate(202.5, 250)')]//path[contains(@class, 'MuiPieArc-root') and contains(@class, 'MuiPieArc-series-auto-generated-id-0') and contains(@class, 'css-1b95g7z')]");


    public InfoSaldoPengeluaranPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void ClickCopyIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(CopyIcon));
        driver.findElement(CopyIcon).click();
    }

    public void ClickEyeIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(EyeIcon));
        driver.findElement(EyeIcon).click();
    }

    public void ClickTransferRupiah() {
        wait.until(ExpectedConditions.elementToBeClickable(TransferRupiah));
        driver.findElement(TransferRupiah).click();
    }

    public void ClickQRIS() {
        wait.until(ExpectedConditions.elementToBeClickable(QRIS));
        driver.findElement(QRIS).click();
    }

    public void ClickTarikTunai() {
        wait.until(ExpectedConditions.elementToBeClickable(TarikTunai));
        driver.findElement(TarikTunai).click();
    }

    public void ClickMonthInformation() {
        wait.until(ExpectedConditions.elementToBeClickable(MonthInformation));
        driver.findElement(MonthInformation).click();
    }

    public void ClickPemasukan() {
        wait.until(ExpectedConditions.elementToBeClickable(Pemasukan));
        driver.findElement(Pemasukan).click();
    }

    public void ClickLihatMutasiButton() {
        wait.until(ExpectedConditions.elementToBeClickable(LihatMutasiButton));
        driver.findElement(LihatMutasiButton).click();
    }

    public String getText() {
        // Wait until the element is located
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(Text));

        // Scroll the element into view using JavaScript
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        // Return the text of the element
        return element.getText();
    }
    public boolean pictDisplayed() {
        return driver.findElement(pict).isDisplayed();
    }
}
