package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ForgotPasswordPage {

    WebDriver driver;
    WebDriverWait wait;

    By UsernameField = By.id("username");
    By SendButton = By.xpath("//*[@type='submit']");
    By BackToLogin = By.xpath("//a[@aria-label='Link untuk kembali ke halaman login' and @href='/login']");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void InputUsername(String username) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(UsernameField));
        driver.findElement(UsernameField).sendKeys(username);
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
