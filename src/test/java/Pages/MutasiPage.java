package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MutasiPage {

    WebDriver driver;
    WebDriverWait wait;

    By SearchField = By.id("");
    By ChooseStartDate = By.id(":r1:");
    By KategoriTransaksi = By.xpath("//div[@aria-label='Kategori Transaksi']");
    By Pengeluaran = By.xpath("//li[text()='Pengeluaran']");
    By DownloadMutasi = By.xpath("//button[@aria-label='Download E-statement mutasi rekening']");
    By SortingAmount = By.id("");
    By LihatBukti = By.xpath("//button[contains(@class, 'MuiButtonBase-root') and contains(@class, 'MuiButton-root') and contains(@class, 'MuiButton-standar') and contains(@class, 'MuiButton-standarPrimary') and contains(@class, 'MuiButton-sizeMedium') and contains(@class, 'MuiButton-standarSizeMedium') and contains(@class, 'MuiButton-colorPrimary') and contains(@class, 'css-z5q91q')]");
    By ShareBukti = By.xpath("//button[@aria-label='Bagikan bukti transaksi']");
    By DownloadBukti = By.xpath("//button[@aria-label='Download bukti transaksi']");
    By TextFilter = By.xpath("//span[text()='21 Agustus 2024']");
    By TextPengeluaran = By.xpath("//div[span[contains(text(), 'TRANSFER')] and span[contains(text(), 'Rupi App')] and span[contains(text(), 'maulana ilham')] and span[contains(text(), '9319470400')]]");
    By TitlePageText = By.xpath("//div[text()='Mutasi Rekening']");

    public MutasiPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void InputSearchField(String Search) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(SearchField));
        driver.findElement(SearchField).sendKeys(Search);
    }

    public void ClickChooseDate() {
        wait.until(ExpectedConditions.elementToBeClickable(ChooseStartDate));
        driver.findElement(ChooseStartDate).click();
    }

    public void ClickPengeluaran() {
        wait.until(ExpectedConditions.elementToBeClickable(Pengeluaran));
        driver.findElement(Pengeluaran).click();
    }
    public void ClickKategoriTransaksi() {
        wait.until(ExpectedConditions.elementToBeClickable(KategoriTransaksi));
        driver.findElement(KategoriTransaksi).click();
    }


    public void ClickDownloadMutasi() {
        wait.until(ExpectedConditions.elementToBeClickable(DownloadMutasi));
        driver.findElement(DownloadMutasi).click();
    }

    public void ClickSortingAmount() {
        wait.until(ExpectedConditions.elementToBeClickable(SortingAmount));
        driver.findElement(SortingAmount).click();
    }

    public void ClickLihatBukti() {
        wait.until(ExpectedConditions.elementToBeClickable(LihatBukti));
        driver.findElement(LihatBukti).click();
    }

    public void ClickShareBukti() {
        wait.until(ExpectedConditions.elementToBeClickable(ShareBukti));
        driver.findElement(ShareBukti).click();
    }

    public void ClickDownloadBukti() {
        wait.until(ExpectedConditions.elementToBeClickable(DownloadBukti));
        driver.findElement(DownloadBukti).click();
    }
    public String getTextFilter() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(TextFilter));
        return driver.findElement(TextFilter).getText();
    }
    public String getTextPengeluaran() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(TextPengeluaran));
        return driver.findElement(TextPengeluaran).getText();
    }
    public boolean TitlePageTextDisplayed() {
        return driver.findElement(TitlePageText).isDisplayed();
    }
}
