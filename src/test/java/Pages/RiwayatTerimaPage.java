package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RiwayatTerimaPage {

    WebDriver driver;
    WebDriverWait wait;

    By FilterButton = By.xpath("//p[text()='Filter']");
    By PendingButton = By.xpath("//button[text()='Menunggu']");
    By RiwayatText = By.xpath("//p[text()='Riwayat']");

    public RiwayatTerimaPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void ClickFilterButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(FilterButton));

        // Scroll ke elemen TarikSetorMenu
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(FilterButton));

        // Tunggu hingga elemen dapat diklik
        wait.until(ExpectedConditions.elementToBeClickable(FilterButton));

        // Klik elemen TarikSetorMenu
        driver.findElement(FilterButton).click();
    }

    public void ClickPendingButton() {
        wait.until(ExpectedConditions.elementToBeClickable(PendingButton));
        driver.findElement(PendingButton).click();
    }

    public boolean RiwayatTextDisplayed() {
        return driver.findElement(RiwayatText).isDisplayed();
    }

}
