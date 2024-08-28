package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateNewPassPage {

    WebDriver driver;
    WebDriverWait wait;

    By NewPasswordField = By.id("password");
    By ConfirmPasswordField = By.id("confirm_password");
    By ContinueButton = By.xpath("//button[@aria-label='Button lanjutkan buat password baru']");
    By EyeIcon = By.id("");
    By TittlePageText = By.xpath("//h4[text()='Buat Password Baru']");
    By PasswordText = By.id("");

    public CreateNewPassPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public String getPasswordText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordText));
        return driver.findElement(PasswordText).getText();
    }

    public String getTittlePageText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(TittlePageText));
        return driver.findElement(TittlePageText).getText();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public void InputNewPassword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(NewPasswordField));
        driver.findElement(NewPasswordField).sendKeys(password);
    }

    public void InputConfirmPassword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ConfirmPasswordField));
        driver.findElement(ConfirmPasswordField).sendKeys(password);
    }

    public void ClickContinueButton() {
        wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
        driver.findElement(ContinueButton).click();
    }

    public void ClickEyeIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(EyeIcon));
        driver.findElement(EyeIcon).click();
    }
}
