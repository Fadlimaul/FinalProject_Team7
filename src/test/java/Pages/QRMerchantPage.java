package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class QRMerchantPage {

    WebDriver driver;
    WebDriverWait wait;

    By QRMerchantText = By.xpath("//p[text()='Qr Merchan']");

    public QRMerchantPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public boolean QRMerchantTextDisplayed() {
        return driver.findElement(QRMerchantText).isDisplayed();
    }

}