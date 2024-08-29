package by.mts;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverSettings {

    public ChromeDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\Rabota\\Git\\Aston-AQA-Engineer-Java\\junit5-maven-selenium-autotest-mts\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.mts.by/");
        WebElement cookieButton = driver.findElement(By.xpath("//button[contains(text(), 'Принять')]"));
        cookieButton.click();
    }

    @AfterEach
    public void close() {
        driver.quit();
    }
}
