package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FilterPage {

    WebDriver driver;
    WebDriverWait wait;

    By StartDateButton = By.xpath("//button[@aria-label='Choose date']");
    By EndDateButton = By.xpath("//button[@aria-label='Choose date']");
    By TerapkanButton = By.xpath("//button[contains(@class,'MuiButtonBase-root') and text()='Terapkan']");
    By dateText = By.xpath("//p[text()='Qr Terima Transfer']");

    public FilterPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void ClickStartDateButton() {
        wait.until(ExpectedConditions.elementToBeClickable(StartDateButton));
        driver.findElement(StartDateButton).click();
    }

    public void ClickEndDateButton() {
        wait.until(ExpectedConditions.elementToBeClickable(EndDateButton));
        driver.findElement(EndDateButton).click();
    }

    public void ClickTerapkanButton() {
        wait.until(ExpectedConditions.elementToBeClickable(TerapkanButton));
        driver.findElement(TerapkanButton).click();
    }

    public boolean dateTextDisplayed() {
        return driver.findElement(dateText).isDisplayed();
    }
    public String getdateText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(dateText));
        return driver.findElement(dateText).getText();
    }
}
