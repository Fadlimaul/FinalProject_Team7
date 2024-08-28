package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ConfirmSetorPage {

    WebDriver driver;
    WebDriverWait wait;

    By ContinueButton = By.xpath("//button[text()='Lanjutkan']");

    public ConfirmSetorPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void ClickContinueButton () {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ContinueButton));

        // Menggunakan JavascriptExecutor untuk menggulung ke elemen
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(ContinueButton));

        // Tunggu hingga elemen dapat diklik
        wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));

        // Tambahkan sedikit waktu tunggu sebelum mengklik
        try {
            Thread.sleep(1000);  // Tunggu 1 detik sebelum mengklik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Klik elemen ContinueButton
        driver.findElement(ContinueButton).click();
    }
}