package Pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class TransferPage {

    WebDriver driver;
    WebDriverWait wait;

    By AddAccountButton = By.id("tambah-rekening-baru");
    By StarIcon = By.id("button-transaksi-favorite");
    By ExistingAccount = By.xpath("//span[text()='9319470400']");
    By noFavoriteTransactionText = By.xpath("//span[text()='Tidak ada transaksi favorit.']");


    public TransferPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void ClickAddAccountButton() {
        wait.until(ExpectedConditions.elementToBeClickable(AddAccountButton));
        driver.findElement(AddAccountButton).click();
    }

    public void ClickStarIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(StarIcon));
        driver.findElement(StarIcon).click();
    }
    public void ClickExistingAccount() {
        wait.until(ExpectedConditions.elementToBeClickable(ExistingAccount));
        driver.findElement(ExistingAccount).click();
    }

//    public void ClickStarIcon() throws IOException {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(StarIcon));
//
//        // Ambil screenshot sebelum mencoba klik
//        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(srcFile, new File("beforeClick.png"));
//
//        // Klik elemen menggunakan JavaScript
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();", driver.findElement(StarIcon));
//
//        // Ambil screenshot setelah klik
//        srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(srcFile, new File("afterClick.png"));
//    }

//    public void ClickExistingAccount() {
//        WebElement element = driver.findElement(ExistingAccount);
//
//        // Pastikan elemen terlihat
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//        wait.until(ExpectedConditions.elementToBeClickable(element));
//
//        // Gunakan Actions untuk mengklik
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }

//    public void ClickStarIcon() {
//        WebElement element = driver.findElement(StarIcon);
//
//        // Pastikan elemen terlihat
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//        wait.until(ExpectedConditions.elementToBeClickable(element));
//
//        // Gunakan Actions untuk mengklik
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().perform();
//    }


    public boolean noFavoriteTransactionTextDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // 30-second wait
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(noFavoriteTransactionText));
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
