package by.mts;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebDriverSettings {

    public ChromeDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
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
