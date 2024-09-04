import by.mts.WebDriverSettings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MtsByPageTest extends WebDriverSettings {

    @Test
    void verifyContainsPlaceholders1() {
        MtsByPage page = new MtsByPage(driver);

        page.clickPaymentTypeDropDown();

        System.out.println("\nПроверка для варианта оплаты услуг: Услуги связи");
        String connectionPhonePlaceholder = page.getConnectionPhonePlaceholder();
        System.out.println("Placeholder текст в поле для услуг связи: " + connectionPhonePlaceholder);
        String connectionSumPlaceholder = page.getConnectionSumPlaceholder();
        System.out.println("Placeholder текст в поле для услуг связи: " + connectionSumPlaceholder);
        String connectionEmailPlaceholder = page.getConnectionEmailPlaceholder();
        System.out.println("Placeholder текст в поле для услуг связи: " + connectionEmailPlaceholder);

        System.out.println("\nПроверка для варианта оплаты услуг: Домашний интернет");
        String internetPhonePlaceholder = page.getInternetPhonePlaceholder();
        System.out.println("Placeholder текст в поле для услуг связи: " + internetPhonePlaceholder);
        String internetSumPlaceholder = page.getInternetSumPlaceholder();
        System.out.println("Placeholder текст в поле для услуг связи: " + internetSumPlaceholder);
        String internetEmailPlaceholder = page.getInternetEmailPlaceholder();
        System.out.println("Placeholder текст в поле для услуг связи: " + internetEmailPlaceholder);

        System.out.println("\nПроверка для варианта оплаты услуг: Рассрочка");
        String accountNumberPlaceholder = page.getAccountNumberPlaceholder();
        System.out.println("Placeholder текст в поле для услуг связи: " + accountNumberPlaceholder);
        String instalmentSumPlaceholder = page.getInstalmentSumPlaceholder();
        System.out.println("Placeholder текст в поле для услуг связи: " + instalmentSumPlaceholder);
        String instalmentEmailPlaceholder = page.getInstalmentEmailPlaceholder();
        System.out.println("Placeholder текст в поле для услуг связи: " + instalmentEmailPlaceholder);

        System.out.println("\nПроверка для варианта оплаты услуг: Задолженность");
        String numberAccountPlaceholder = page.getNumberAccountPlaceholder();
        System.out.println("Placeholder текст в поле для услуг связи: " + numberAccountPlaceholder);
        String debtSumPlaceholder = page.getDebtSumPlaceholder();
        System.out.println("Placeholder текст в поле для услуг связи: " + debtSumPlaceholder);
        String debtEmailPlaceholder = page.getDebtEmailPlaceholder();
        System.out.println("Placeholder текст в поле для услуг связи: " + debtEmailPlaceholder);

    }

    @Test
    void verifyContainsPlaceholders2() {
        MtsByPage page = new MtsByPage(driver);

        page.clickPaymentTypeDropDown();
        page.selectCommunicationServices();

        page.enterConnectionPhone("297777777");
        page.enterConnectionSum("30");
        page.enterConnectionEmail("");

        page.clickContinueButton();

        PaymentWindowPage paymentWindowPage = new PaymentWindowPage(driver);
        paymentWindowPage.waiter();
        paymentWindowPage.switchPaymentWindow();

        String paySumText = paymentWindowPage.getPaySumText();
        assertTrue(paySumText.contains("30.00 BYN"));

        String paySumButtonText = paymentWindowPage.getPaySumButtonText();
        assertTrue(paySumButtonText.contains("Оплатить 30.00 BYN"));

        String phoneNumberText = paymentWindowPage.getPhoneNumberText();
        assertTrue(phoneNumberText.contains("Номер:375297777777"));

        String cardNumberText = paymentWindowPage.getCardNumberText();
        assertTrue(cardNumberText.contains("Номер карты"));

        String validityPeriodText = paymentWindowPage.getValidityPeriodText();
        assertTrue(validityPeriodText.contains("Срок действия"));

        String cardCvcText = paymentWindowPage.getCardCvcText();
        assertTrue(cardCvcText.contains("CVC"));

        String cardNameText = paymentWindowPage.getCardNameText();
        assertTrue(cardNameText.contains("Имя держателя (как на карте)"));

        boolean isVisaIconDisplayed = paymentWindowPage.isVisaIconDisplayed();
        if (isVisaIconDisplayed) {
            System.out.println("Иконка Visa отображается в поле ввода номера карты.");
        } else {
            System.out.println("Иконка Visa не отображается в поле ввода номера карты.");
        }

        boolean isMastercardIconDisplayed = paymentWindowPage.isMastercardIconDisplayed();
        if (isMastercardIconDisplayed) {
            System.out.println("Иконка Mastercard отображается в поле ввода номера карты.");
        } else {
            System.out.println("Иконка Mastercard не отображается в поле ввода номера карты.");
        }

        boolean isBelkartIconDisplayed = paymentWindowPage.isBelkartIconDisplayed();
        if (isBelkartIconDisplayed) {
            System.out.println("Иконка Belkart отображается в поле ввода номера карты.");
        } else {
            System.out.println("Иконка Belkart не отображается в поле ввода номера карты.");
        }

        boolean isMaestroMirIconDisplayed = paymentWindowPage.isMaestroMirIconDisplayed();
        if (isMaestroMirIconDisplayed) {
            System.out.println("Иконка MaestroMir отображается в поле ввода номера карты.");
        } else {
            System.out.println("Иконка MaestroMir не отображается в поле ввода номера карты.");
        }

        driver.switchTo().defaultContent();
    }
}