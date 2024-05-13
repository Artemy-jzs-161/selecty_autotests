package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;

@Tags({@Tag("first_test"), @Tag("second_test")})
@Owner("Artemy-jzs-161")
public class MainPageTests extends TestBase {

    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверить, что стартовая анимация закончилась")
    @Test
    void endDownLoadPageTest() {
        mainPage
                .openPage()
                .checkEndDownLoadPage();
    }

    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка телефонного номера на главной странице")
    @Test
    void checkContactPhoneTest() {
        mainPage
                .openPage()
                .checkContactPhone(data.getContactPhone());
    }

    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка адреса на главной странице")
    @Test
    void checkContactAddressTest() {
        mainPage
                .openPage()
                .checkContactAddress(data.getContactAddress());
    }

    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка заголовка на главной странице русскоязычной версии сайта")
    @Test
    void checkRuTitleTest() {
        mainPage
                .openPage()
                .clickRuLanguageLink()
                .checkMainPageText(data.getRuTitleText());
    }

    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка заголовка на главной странице англоязычной версии сайта")
    @Test
    void checkEnTitleTest() {
        mainPage
                .openPage()
                .clickEnLanguageLink()
                .checkMainPageText(data.getEnTitleText());
    }

    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка ссылок на социальные сети")
    @Test
    public void checkSocialLinksHref() {
        mainPage
                .openPage()
                .checkPartOfSocialLinksHref(data.getExpectedSocialLinks());
    }

    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка ссылок навигационной панели на русскоязычной версии сайта")
    @Test
    public void checkNavBarLinksRuLanguageText() {
        mainPage
                .openPage()
                .clickRuLanguageLink()
                .checkNavBarLinksText(data.getRuLanguageLinkText());
    }

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
