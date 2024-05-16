package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;

@Tags({@Tag("all_tests"),})
@Owner("Artemy-jzs-161")
public class MainPageTests extends TestBase {

    @Tag("ru_test")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверить, что стартовая анимация закончилась")
    @Test
    void endDownLoadPageTest() {
        mainPage
                .openPage()
                .checkEndDownLoadPage();
    }

    @Tag("ru_test")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка телефонного номера на главной странице")
    @Test
    void checkContactPhoneTest() {
        mainPage
                .openPage()
                .checkContactPhone(data.getContactPhone());
    }
    @Tag("ru_test")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка адреса на главной странице")
    @Test
    void checkContactAddressTest() {
        mainPage
                .openPage()
                .checkContactAddress(data.getContactAddress());
    }

    @Tag("ru_test")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка заголовка на главной странице русскоязычной версии сайта")
    @Test
    void checkRuTitleTest() {
        mainPage
                .openPage()
                .checkMainPageText(data.getRuTitleText());
    }

    @Tag("eng_test")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка заголовка на главной странице англоязычной версии сайта")
    @Test
    void checkEnTitleTest() {
        mainPage
                .openPage()
                .clickEnLanguageLink()
                .checkMainPageText(data.getEnTitleText());
    }

    @Tag("ru_test")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка ссылок на социальные сети")
    @Test
    public void checkSocialLinksHref() {
        mainPage
                .openPage()
                .checkPartOfSocialLinksHref(data.getExpectedSocialLinks());
    }

    @Tag("ru_test")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка ссылок навигационной панели на русскоязычной версии сайта")
    @Test
    public void checkNavBarLinksRuLanguageText() {
        mainPage
                .openPage()
                .checkNavBarLinksText(data.getRuLanguageLinkText());
    }

    @Tag("eng_test")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка ссылок навигационной панели на англоязычной версии сайта")
    @Test
    public void checkNavBarLinksEnLanguageText() {
        mainPage
                .openPage()
                .clickEnLanguageLink()
                .checkNavBarLinksText(data.getEnLanguageLinkText());
    }
}