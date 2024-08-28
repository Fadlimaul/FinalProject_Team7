package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateNewPinPage {

    WebDriver driver;
    WebDriverWait wait;

    By InputPinField1 = By.xpath("//div[@class='MuiBox-root css-zy4ij7']");
    By InputPinField2 = By.xpath("//div[@class='MuiBox-root css-zy4ij7']");
    By InputPinField3 = By.xpath("//div[@class='MuiBox-root css-zy4ij7']");
    By InputPinField4 = By.xpath("//div[@class='MuiBox-root css-zy4ij7']");
    By InputPinField5 = By.xpath("//div[@class='MuiBox-root css-zy4ij7']");
    By InputPinField6 = By.xpath("//div[@class='MuiBox-root css-zy4ij7']");
    By ContinueButton = By.xpath("//button[@aria-label='Button Lanjutkan']");
    By TittlePageText = By.id("");

    public CreateNewPinPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public String getTittlePageText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(TittlePageText));
        return driver.findElement(TittlePageText).getText();
    }

    public void InputPinField1(String pin) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(InputPinField1));
        driver.findElement(InputPinField1).sendKeys(pin);
    }

    public void InputPinField2(String pin) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(InputPinField2));
        driver.findElement(InputPinField2).sendKeys(pin);
    }

    public void InputPinField3(String pin) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(InputPinField3));
        driver.findElement(InputPinField3).sendKeys(pin);
    }

    public void InputPinField4(String pin) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(InputPinField4));
        driver.findElement(InputPinField4).sendKeys(pin);
    }

    public void InputPinField5(String pin) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(InputPinField5));
        driver.findElement(InputPinField5).sendKeys(pin);
    }

    public void InputPinField6(String pin) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(InputPinField6));
        driver.findElement(InputPinField6).sendKeys(pin);
    }

    public void ClickContinueButton() {
        wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
        driver.findElement(ContinueButton).click();
    }
}
