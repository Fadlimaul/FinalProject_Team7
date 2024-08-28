package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginSuccessPage {

    WebDriver driver;
    WebDriverWait wait;

    By OkButton = By.xpath("//button[contains(@class, 'swal2-confirm') and contains(@class, 'custom-swal-confirm-button')]");
    By SuccessMessage = By.id("swal2-html-container");

    public LoginSuccessPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void ClickOkButton() {
        wait.until(ExpectedConditions.elementToBeClickable(OkButton));
        driver.findElement(OkButton).click();
    }

    public boolean SuccessMessageDisplayed() {
        // Wait for the success message to be visible before checking its display status
        WebDriverWait waitWithLongerTimeout = new WebDriverWait(driver, Duration.ofSeconds(70));
        WebElement successMessageElement = waitWithLongerTimeout.until(ExpectedConditions.visibilityOfElementLocated(SuccessMessage));
        return successMessageElement.isDisplayed();
    }
}
