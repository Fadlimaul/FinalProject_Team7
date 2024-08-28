package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SetorTunaiPage {

    WebDriver driver;
    WebDriverWait wait;

    By ContinueButton = By.xpath("//button[text()='Lanjutkan']");
    By NamaToken = By.id("metode");

    public SetorTunaiPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void ClickContinueButton() {
        wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
        driver.findElement(ContinueButton).click();
    }

    public void InputNameToken(String Token) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(NamaToken));
        driver.findElement(NamaToken).sendKeys(Token);
    }
}
