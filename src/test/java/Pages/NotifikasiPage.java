package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NotifikasiPage {

    WebDriver driver;
    WebDriverWait wait;

    //By OkButton = By.xpath("//button[contains(@class, 'swal2-confirm') and contains(@class, 'custom-swal-confirm-button')]");
    By TitlePageText = By.xpath("//h4[text()='Notifikasi Aktivitas']");

    public NotifikasiPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

//    public void ClickOkButton() {
//        wait.until(ExpectedConditions.elementToBeClickable(OkButton));
//        driver.findElement(OkButton).click();
//    }

    public boolean TitlePageTextDisplayed() {
        return driver.findElement(TitlePageText).isDisplayed();
    }

    public String getTitlePageText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(TitlePageText));
        return driver.findElement(TitlePageText).getText();
    }
}