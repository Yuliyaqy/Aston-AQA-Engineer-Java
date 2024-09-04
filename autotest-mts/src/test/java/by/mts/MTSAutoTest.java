package by.mts;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
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

    @Test
    public void verifyOnlineReplenishmentProcess() {
        WebElement serviceDropDown = driver.findElement(By.xpath(".//span[@class = 'select__arrow']"));
        serviceDropDown.click();
        WebElement communicationServices = driver.findElement(By.xpath(".//ul[@class = 'select__list']/li[1]/p"));
        communicationServices.click();

        WebElement phoneNumberField = driver.findElement(By.xpath(".//input[@id = 'connection-phone']"));
        phoneNumberField.click();
        phoneNumberField.sendKeys("297777777");

        WebElement amountDeposit = driver.findElement(By.xpath(".//input[@id = 'connection-sum']"));
        amountDeposit.click();
        amountDeposit.sendKeys("30");

        WebElement continueButton = driver.findElement(By.xpath(".//form[@class = 'pay-form opened']/button"));
        continueButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.xpath(".//form[@class = 'pay-form opened']/button"))).click();
        driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@class = \"bepaid-iframe\"]")));
        WebElement windowPay = driver.findElement(By.xpath(".//div[@class = 'app-wrapper__content']"));
        if (windowPay.isDisplayed()) {
            System.out.println("Окно формы оплаты открылось успешно");
        } else {
            System.out.println("Окно формы оплаты не найдено");
        }
        driver.switchTo().defaultContent();
    }
}