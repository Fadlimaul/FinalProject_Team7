package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InfoTransferPage {

    WebDriver driver;
    WebDriverWait wait;

    By TitleText = By.xpath("//h2[text()='Daftar Transaksi']");


    public InfoTransferPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public boolean TitleTextDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // 30-second wait
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(TitleText));
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
