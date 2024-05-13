package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainPage {
    private final SelenideElement
            mainPageText = $("[field=tn_text_1649669229426]"),
            contactPhoneElement = $("[field=tn_text_1652285293212]"),
            contactAddressElement = $("[field=tn_text_1652285260005]"),
            startedAnimationRu = $("#rec424911473"),
            enLanguageLink = $x("//a[text()='EN']"),
            ruLanguageLink = $x("//a[text()='RU']");

    ElementsCollection
            navBarList = $$(".t-menu__link-item t-menusub__target-link"),
            socialLinks = $$(".t-sociallinks__wrapper a");

    public MainPage openPage() {
        step("Открыть главную страницу", () -> {
            open("/");
        });
        return this;
    }

    public MainPage checkEndDownLoadPage() {
        step("Проверить, что стартовая анимация закончилась", () -> {
            startedAnimationRu.shouldHave(attribute("data-animationappear", "off"));
        });
        return this;
    }

    public MainPage checkMainPageText(String text) {
        step("Проверить, заголовок на главной страницу", () -> {
            mainPageText.shouldHave(text(text));
        });
        return this;
    }

    public MainPage checkPartOfSocialLinksHref(List<String> expectedResults) {
        step(String.format("Проверить наличие ссылок на социальные сети компании %s", expectedResults), () -> {
            for (int i = 0; i < socialLinks.size(); i++) {
                assertEquals(expectedResults.get(i), socialLinks.get(i).getAttribute("href"));
            }
        });
        return this;
    }

    public MainPage clickEnLanguageLink() {
        step("Нажать кнопку EN, для переключения языка на английский", () -> {
            enLanguageLink.click();
        });
        return this;
    }

    public MainPage clickRuLanguageLink() {
        step("Нажать кнопку RU, для переключения языка на русский", () -> {
            ruLanguageLink.click();
        });
        return this;
    }

    public MainPage checkNavBarLinksText(List<String> linksText) {
        step(String.format("Проверить текст ссылок %s в навбаре", linksText), () -> {
            for (int i = 0; navBarList.size() > i; i++) {
                assertEquals(navBarList.get(i).getText(), linksText.get(i));
            }
        });
        return this;
    }

    public MainPage checkContactPhone(String phone) {
        step("Проверка контактоного телефона", () -> {
            contactPhoneElement.shouldHave(text(phone));
        });
        return this;
    }

    public MainPage checkContactAddress(String address) {
        step("Проверка контактоного адреса", () -> {
            contactAddressElement.shouldHave(text(address));
        });
        return this;
    }
}