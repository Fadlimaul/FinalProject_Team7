package Pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    By TransferMenu = By.xpath("//img[@alt='Transfer Rupiah']");
    By MutasiMenu = By.xpath("//a[@aria-label='Tombol Menu Mutasi Rekening, ini akan membawa Anda ke halaman Mutasi Rekening']");
    By TarikSetorMenu = By.xpath("//img[@alt='Tarik & Setor Tunai']");
    By QRTerimaMenu =  By.xpath("//a[@href='/qr-terima-transfer']");
    By QRISMenu = By.xpath("//a[@aria-label='Tombol Menu QRIS, ini akan membawa Anda ke halaman QRIS']");
    By InfoSaldoMenu = By.xpath("//img[@alt='Tombol Info Saldo, ini akan membawa Anda ke halaman Saldo']");
    By RekapMenu = By.id("");
    By LogoApp = By.xpath("//img[@alt='Logo Rupi App']");
    By LogoText = By.id("logoText");
    By CopyIcon = By.xpath("//img[@alt='Tombol Salin, ini akan menyalin nomor rekening pengguna']");
    By SettingButton = By.xpath("//img[@alt='pengaturan' and @role='button' and @aria-label='tombol pengaturan']");
    By NotifikasiButton = By.xpath("//div[@role='button']//img[@alt='notifikasi aktivitas']");
    By AllNotifikasi = By.xpath("//a[contains(text(),'Lihat Semua Notif')]");


    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public boolean LogoAppDisplayed() {
        return driver.findElement(LogoApp).isDisplayed();
    }

    public boolean LogoTextDisplayed() {
        return driver.findElement(LogoText).isDisplayed();
    }

    public void ClickTransferMenu() {
        wait.until(ExpectedConditions.elementToBeClickable(TransferMenu));
        driver.findElement(TransferMenu).click();
    }
    public void ClickNotifikasiButton() {
        wait.until(ExpectedConditions.elementToBeClickable(NotifikasiButton));
        driver.findElement(NotifikasiButton).click();
    }
    public void ClickSettingButton() {
        wait.until(ExpectedConditions.elementToBeClickable(SettingButton));
        driver.findElement(SettingButton).click();
    }
    public void ClickAllNotifikasi() {
        wait.until(ExpectedConditions.elementToBeClickable(AllNotifikasi));
        driver.findElement(AllNotifikasi).click();
    }

    public void ClickMutasiMenu() {
        wait.until(ExpectedConditions.elementToBeClickable(MutasiMenu));
        driver.findElement(MutasiMenu).click();
    }

    public void CickQRTerimaMenu () throws IOException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(QRTerimaMenu));

        // Ambil screenshot sebelum mencoba klik
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("beforeClick.png"));

        // Klik elemen menggunakan JavaScript
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", driver.findElement(QRTerimaMenu));

        // Ambil screenshot setelah klik
        srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("afterClick.png"));
    }


//    public void CickTarikSetorMenu() {
//        // Wait for the element to be visible
//        wait.until(ExpectedConditions.visibilityOfElementLocated(TarikSetorMenu));
//
//        // Scroll halfway through the viewport
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        WebElement element = driver.findElement(TarikSetorMenu);
//
//        // Get the height of the viewport
//        Long viewportHeight = (Long) js.executeScript("return window.innerHeight;");
//
//        // Scroll halfway through the viewport
//        js.executeScript("window.scrollBy(0, arguments[0] / 2);", viewportHeight);
//
//        // Optionally, wait for a brief period to ensure the scrolling is complete
//        // This step is optional and might not be needed depending on the page
//        try {
//            Thread.sleep(500); // Sleep for 500 milliseconds (adjust as needed)
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        // Scroll the element into view if needed (this ensures it's within view)
//        js.executeScript("arguments[0].scrollIntoView(true);", element);
//
//        // Wait until the element is clickable
//        wait.until(ExpectedConditions.elementToBeClickable(TarikSetorMenu));
//
//        // Click the element
//        element.click();
//    }
public void ClickTarikSetorMenu() throws IOException {
    wait.until(ExpectedConditions.visibilityOfElementLocated(TarikSetorMenu));

    // Ambil screenshot sebelum mencoba klik
    File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(srcFile, new File("beforeClick.png"));

    // Klik elemen menggunakan JavaScript
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", driver.findElement(TarikSetorMenu));

    // Ambil screenshot setelah klik
    srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(srcFile, new File("afterClick.png"));
}

    public void ClickQRISMenu() {
        wait.until(ExpectedConditions.elementToBeClickable(QRISMenu));
        driver.findElement(QRISMenu).click();
    }

    public void ClickInfoSaldoMenu() {
        wait.until(ExpectedConditions.elementToBeClickable(InfoSaldoMenu));
        driver.findElement(InfoSaldoMenu).click();
    }

    public void ClickRekapMenu() {
        wait.until(ExpectedConditions.elementToBeClickable(RekapMenu));
        driver.findElement(RekapMenu).click();
    }

    public void ClickCopyIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(CopyIcon));
        driver.findElement(CopyIcon).click();
    }
    public String getTextDashboard() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LogoText));
        return driver.findElement(LogoText).getText();
    }
}
