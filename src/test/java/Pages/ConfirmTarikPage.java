package Pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ConfirmTarikPage {

    WebDriver driver;
    WebDriverWait wait;

    By ContinueButton = By.xpath("//button[text()='Lanjutkan']");

    public ConfirmTarikPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void ClickContinueButton() throws IOException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ContinueButton));

        // Ambil screenshot sebelum mencoba klik
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("beforeClick.png"));

        // Klik elemen menggunakan JavaScript
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", driver.findElement(ContinueButton));

        // Ambil screenshot setelah klik
        srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("afterClick.png"));
    }

}
