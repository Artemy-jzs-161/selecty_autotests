package tests;

import io.qameta.allure.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

@Tags({@Tag("first_test"), @Tag("second_test")})
public class MainPageTests extends TestBase {
    @Feature("Какая то фича")
    @Story("Какаято стори Practice Form")
    @Owner("Artemy-jzs-161")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка перехода на страницу информации о компании с главной страницы сайта")
    @Test
    void menuItemExistInMenuTest() {
        mainPage
                .openPage()
                .verifyElementsAreLoaded();
    }

    @Owner("Artemy-jzs-161")
    @DisplayName("Проверка адреса и телефонного номера")
    @Tag("tag")
    @Test
    public void phoneAndAddressAreCorrectTest() {
        mainPage
                .openPage()
                .checkContactPhone("+7 (499) 288 87 71")
                .checkContactAddress("г. Москва, Садовническая ул. 14, с. 2, 6 этаж (БЦ Кристалл-плаза)");

    }
}
