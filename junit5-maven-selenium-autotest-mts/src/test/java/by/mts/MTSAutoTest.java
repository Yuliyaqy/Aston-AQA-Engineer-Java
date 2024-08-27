package by.mts;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MTSAutoTest extends WebDriverSettings{

    @Test
    public void verifyBlockTitle() {
        WebElement blockTitle = driver.findElement(By.xpath(".//section[@class = 'pay']/div/h2"));
        String expectedTitle = "Онлайн пополнение\nбез комиссии";
        String actualTitle = blockTitle.getText();
        assertEquals(expectedTitle, actualTitle, "Название блока не совпадает с ожидаемым");
    }

    @Test
    public void verifyPaymentSystemLogos() {
        List<WebElement> logos = driver.findElements(By.xpath(".//div[@class = 'pay__partners']/ul"));
        assertFalse(logos.isEmpty(), "Логотипы платежных систем отсутствуют");
    }

    @Test
    public void verifyInfoLink() {
        WebElement infoLink = driver.findElement(By.xpath(".//section[@class = 'pay']/div/a"));
        infoLink.click();
        String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        String actualUrl = driver.getCurrentUrl();
        assertEquals(expectedUrl, actualUrl, "URL после перехода по ссылке не соответствует ожидаемому");
    }

}
