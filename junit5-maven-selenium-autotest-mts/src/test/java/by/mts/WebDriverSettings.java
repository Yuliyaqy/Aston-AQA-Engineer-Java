package by.mts;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
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
        try {
            WebElement cookieButton = driver.findElement(By.xpath("//button[contains(text(), 'Принять')]"));
            if (cookieButton.isDisplayed()) {
                cookieButton.click();
                System.out.println("Куки успешно закрыты.");
            }
        } catch (org.openqa.selenium.NoSuchElementException e) {
                System.out.println("Куки не закрыты: элемент не найден.");
        } catch (TimeoutException e) {
            System.out.println("Куки не закрыты: время ожидания истекло");
        }

    }

    @AfterEach
    public void close() {
        driver.quit();
    }
}
