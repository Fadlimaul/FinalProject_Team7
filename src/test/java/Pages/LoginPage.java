package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    By UsernameField = By.id("username");
    By PasswordField = By.id("password");
    By LoginButton = By.xpath("//*[@type='submit']");
    By EyeIcon = By.xpath("//*[@data-testid='VisibilityIcon']");
    By ForgotPassword = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-true css-14to75f']//a[text()='Lupa Username/Password?']");
    By WrongLogo = By.id("");
    By WelcomeText = By.id("");
    By PasswordText = By.xpath("//input[@value='Anggit']");
    By WarningTextUsername = By.id("username-error");
    By WarningTextPassword = By.id("password-error");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public Boolean getPasswordText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordText));
        return driver.findElement(PasswordText).isDisplayed();
    }

    public String getWelcomeText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(WelcomeText));
        return driver.findElement(WelcomeText).getText();
    }

    public boolean WrongLogoDisplayed() {
        return driver.findElement(WrongLogo).isDisplayed();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public void InputUsername(String username) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(UsernameField));
        driver.findElement(UsernameField).sendKeys(username);
    }

    public void InputPassword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordField));
        driver.findElement(PasswordField).sendKeys(password);
    }

    public void ClickLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(LoginButton));
        driver.findElement(LoginButton).click();
    }

    public void ClickEyeIcon() {
        if (driver.findElements(EyeIcon).size() > 0) {
            wait.until(ExpectedConditions.elementToBeClickable(EyeIcon));
            driver.findElement(EyeIcon).click();
        } else {
            System.out.println("EyeIcon is not available");
        }
    }

    public void ClickForgotPassword() {
        wait.until(ExpectedConditions.elementToBeClickable(ForgotPassword));
        driver.findElement(ForgotPassword).click();
    }

    public String getWarningUsernameText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(WarningTextUsername));
        return driver.findElement(WarningTextUsername).getText();
    }

    public String getWarningPasswordText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(WarningTextPassword));
        return driver.findElement(WarningTextPassword).getText();
    }

    public boolean WarningTextPasswordDisplayed() {
        return driver.findElement(WarningTextPassword).isDisplayed();
    }
}
