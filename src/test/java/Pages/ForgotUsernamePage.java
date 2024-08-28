package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ForgotUsernamePage {

    WebDriver driver;
    WebDriverWait wait;

    By NoHPField = By.id("");
    By SendButton = By.id("");
    By BackToLogin = By.id("");

    public ForgotUsernamePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void InputNoHP(String NoHP) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(NoHPField));
        driver.findElement(NoHPField).sendKeys(NoHP);
    }

    public void ClickSendButton() {
        wait.until(ExpectedConditions.elementToBeClickable(SendButton));
        driver.findElement(SendButton).click();
    }

    public void ClickBackToLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(BackToLogin));
        driver.findElement(BackToLogin).click();
    }
}
