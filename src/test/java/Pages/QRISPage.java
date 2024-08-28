package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class QRISPage {

    WebDriver driver;
    WebDriverWait wait;

    By QRlogo = By.xpath("//img[@alt='Button Tampilkan QR']");

    public QRISPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void ClickQRlogo() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(QRlogo));

        // Scroll to the element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(QRlogo);
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        // Wait for the element to be clickable
        wait.until(ExpectedConditions.elementToBeClickable(QRlogo));

        // Click the element
        element.click();
    }

}
