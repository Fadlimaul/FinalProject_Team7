package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddAccNumberPage {

    WebDriver driver;
    WebDriverWait wait;

    By AccNumberField = By.id("account_number");
    By ContinueButton = By.xpath("//button[@aria-label='Lanjutkan Menyimpan Nomor Rekening']");
    By LogoBCA = By.xpath("//img[@alt='Logo BCA']");

    public AddAccNumberPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public void InputAccNumberField(String AccNumber) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(AccNumberField));
        driver.findElement(AccNumberField).sendKeys(AccNumber);
    }

    public void ClickContinueButton() {
        wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
        driver.findElement(ContinueButton).click();
    }

    public boolean LogoBCADisplayed() {
        return driver.findElement(LogoBCA).isDisplayed();
    }
}
