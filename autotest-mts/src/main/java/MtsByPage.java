import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MtsByPage {

    By paymentTypeDropDown = By.xpath(".//span[@class = 'select__arrow']");
    By continueButton = By.xpath(".//form[@class = 'pay-form opened']/button");

    By communicationServices = By.xpath(".//p[contains(text(), 'Услуги связи')]");
    By homeInternet = By.xpath(".//p[contains(text(), 'Домашний интернет')]");
    By installment = By.xpath(".//p[contains(text(), 'Рассрочка')]");
    By debt = By.xpath(".//p[contains(text(), 'Задолженность')]");

    By connectionPhoneField = By.xpath(".//input[@id = 'connection-phone']");
    By connectionSumField = By.xpath(".//input[@id = 'connection-sum']");
    By connectionEmailField = By.xpath(".//input[@id = 'connection-email']");

    By internetPhoneField = By.xpath(".//input[@id = 'internet-phone']");
    By internetSumField = By.xpath(".//input[@id = 'internet-sum']");
    By internetEmailField = By.xpath(".//input[@id = 'internet-email']");

    By accountNumberField = By.xpath(".//input[@id = 'score-instalment']");
    By instalmentSumField = By.xpath(".//input[@id = 'instalment-sum']");
    By instalmentEmailField = By.xpath(".//input[@id = 'instalment-email']");

    By numberAccountField = By.xpath(".//input[@id = 'score-arrears']");
    By debtSumField = By.xpath(".//input[@id = 'arrears-sum']");
    By debtEmailField = By.xpath(".//input[@id = 'arrears-email']");

    private final WebDriver driver;

    public MtsByPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickPaymentTypeDropDown() {
        WebElement paymentDropDownElement = driver.findElement(paymentTypeDropDown);
        paymentDropDownElement.click();
    }

    public void selectCommunicationServices() {
        WebElement communicationServicesElement = driver.findElement(communicationServices);
        communicationServicesElement.click();
    }

    public String getConnectionPhonePlaceholder() {
        WebElement connectionPhoneElement = driver.findElement(connectionPhoneField);
        return connectionPhoneElement.getAttribute("placeholder");
    }

    public String getConnectionSumPlaceholder() {
        WebElement connectionSumElement = driver.findElement(connectionSumField);
        return connectionSumElement.getAttribute("placeholder");
    }

    public String getConnectionEmailPlaceholder() {
        WebElement connectionEmailElement = driver.findElement(connectionEmailField);
        return connectionEmailElement.getAttribute("placeholder");
    }

    public String getInternetPhonePlaceholder() {
        WebElement internetPhoneElement = driver.findElement(internetPhoneField);
        return internetPhoneElement.getAttribute("placeholder");
    }

    public String getInternetSumPlaceholder() {
        WebElement internetSumElement = driver.findElement(internetSumField);
        return internetSumElement.getAttribute("placeholder");
    }

    public String getInternetEmailPlaceholder() {
        WebElement internetEmailElement = driver.findElement(internetEmailField);
        return internetEmailElement.getAttribute("placeholder");
    }

    public String getAccountNumberPlaceholder() {
        WebElement accountNumberElement = driver.findElement(accountNumberField);
        return accountNumberElement.getAttribute("placeholder");
    }

    public String getInstalmentSumPlaceholder() {
        WebElement instalmentSumElement = driver.findElement(instalmentSumField);
        return instalmentSumElement.getAttribute("placeholder");
    }

    public String getInstalmentEmailPlaceholder() {
        WebElement instalmentEmailElement = driver.findElement(instalmentEmailField);
        return instalmentEmailElement.getAttribute("placeholder");
    }

    public String getNumberAccountPlaceholder() {
        WebElement numberAccountElement = driver.findElement(numberAccountField);
        return numberAccountElement.getAttribute("placeholder");
    }

    public String getDebtSumPlaceholder() {
        WebElement debtSumElement = driver.findElement(debtSumField);
        return debtSumElement.getAttribute("placeholder");
    }

    public String getDebtEmailPlaceholder() {
        WebElement debtEmailElement = driver.findElement(debtEmailField);
        return debtEmailElement.getAttribute("placeholder");
    }

    public void enterConnectionPhone(String connectionPhone) {
        driver.findElement(connectionPhoneField).sendKeys(connectionPhone);
    }

    public void enterConnectionSum(String connectionSum) {
        driver.findElement(connectionSumField).sendKeys(connectionSum);
    }

    public void enterConnectionEmail(String connectionEmail) {
        driver.findElement(connectionEmailField).sendKeys(connectionEmail);
    }

    public void clickContinueButton() {
        WebElement continueButtonElement = driver.findElement(continueButton);
        continueButtonElement.click();
    }

}
