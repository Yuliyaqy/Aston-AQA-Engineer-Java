import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentWindowPage {

    By continue2Button = By.xpath(".//form[@class = 'pay-form opened']/button");
    By bePaidIframe = By.xpath(".//iframe[@class = \"bepaid-iframe\"]");
    By windowPayment = By.xpath(".//div[@class = 'app-wrapper__content']");
    By paySumTitle = By.xpath(".//span[contains(text(), '30.00 BYN')]");
    By paySumButton = By.xpath(".//*[contains(text(), ' Оплатить  30.00 BYN ')]");
    By phoneNumberTitle = By.xpath(".//span[contains(text(), 'Номер:375297777777')]");
    By cardNumberField = By.xpath(".//label[contains(text(), 'Номер карты')]");
    By cardValidityPeriod = By.xpath(".//label[contains(text(), 'Срок действия')]");
    By cardCvcField = By.xpath(".//label[contains(text(), 'CVC')]");
    By cardNamePerson = By.xpath(".//label[contains(text(), 'Имя держателя (как на карте)')]");
    By paymentSystemLogos = By.xpath(".//div[@class = 'cards-brands ng-tns-c46-1']/div");
    By visaIcon = By.xpath(".//img[@src = 'assets/images/payment-icons/card-types/visa-system.svg']");
    By mastercardIcon = By.xpath(".//img[@src = 'assets/images/payment-icons/card-types/mastercard-system.svg']");
    By belkartIcon = By.xpath(".//img[@src = 'assets/images/payment-icons/card-types/belkart-system.svg']");
    By maestroMirIcon = By.xpath(".//div[@class = 'cards-brands cards-brands_random ng-tns-c61-0 ng-star-inserted']");

    protected WebDriver driver;

    public PaymentWindowPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void waiter() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(continue2Button));
    }

    public void switchPaymentWindow() {
        driver.switchTo().frame(driver.findElement(bePaidIframe));
        WebElement paymentWindow = new WebDriverWait(driver, 30).until(
                ExpectedConditions.visibilityOfElementLocated(windowPayment));
    }

    public String getPaySumText() {
        return driver.findElement(paySumTitle).getText();
    }

    public String getPaySumButtonText() {
        return driver.findElement(paySumButton).getText();
    }

    public String getPhoneNumberText() {
        return driver.findElement(phoneNumberTitle).getText();
    }

    public String getCardNumberText() {
        return driver.findElement(cardNumberField).getText();
    }

    public String getValidityPeriodText() {
        return driver.findElement(cardValidityPeriod).getText();
    }

    public String getCardCvcText() {
        return driver.findElement(cardCvcField).getText();
    }

    public String getCardNameText() {
        return driver.findElement(cardNamePerson).getText();
    }

    public boolean isVisaIconDisplayed() {
        WebElement visaIconElement = driver.findElement(visaIcon);
        return visaIconElement.isDisplayed();
    }

    public boolean isMastercardIconDisplayed() {
        WebElement mastercardIconElement = driver.findElement(mastercardIcon);
        return mastercardIconElement.isDisplayed();
    }

    public boolean isBelkartIconDisplayed() {
        WebElement belkartIconElement = driver.findElement(belkartIcon);
        return belkartIconElement.isDisplayed();
    }

    public boolean isMaestroMirIconDisplayed() {
        WebElement maestroMirIconElement = driver.findElement(maestroMirIcon);
        return maestroMirIconElement.isDisplayed();
    }
}
