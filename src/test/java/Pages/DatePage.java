package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DatePage {

    WebDriver driver;
    WebDriverWait wait;

    By StartDateChoose = By.xpath("//button[text()='17']");
    By EndDateChoose = By.xpath("//button[text()='21']");


    public DatePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void ClickStartDateChoose() {
        wait.until(ExpectedConditions.elementToBeClickable(StartDateChoose));
        driver.findElement(StartDateChoose).click();
    }

    public void ClickEndDateChoose() {
        wait.until(ExpectedConditions.elementToBeClickable(EndDateChoose));
        driver.findElement(EndDateChoose).click();
    }
}
