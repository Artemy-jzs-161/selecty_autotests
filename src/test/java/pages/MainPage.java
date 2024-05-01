package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.*;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.cssValue;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
        private final SelenideElement
            mainPageBlock = $("[field=tn_text_1649669229426]"),
            selectyElement = $("[data-menu-item-number='1']"),
            servicesElement = $("[data-menu-item-number='2']"),
            careerElement = $("[data-menu-item-number='3']"),
            blogElement = $("[data-menu-item-number='4']"),
            contactElement = $("[data-menu-item-number='5']"),
            contactPhoneElement = $("[field=tn_text_1652285293212]"),
            contactAddressElement = $("[field=tn_text_1652285260005]");


    @Step("Открыть главную страницу")
    public MainPage openPage() {
        open("/");
        mainPageBlock.shouldHave(text("ЦИФРОВАЯ " + "ТРАНСФОРМАЦИЯ" + " ПОД КЛЮЧ"));
        return this;
    }

    @Step("Checking elements on main page are loaded")
    public MainPage verifyElementsAreLoaded() {
        selectyElement.shouldBe(visible);
        servicesElement.shouldBe(visible);
        careerElement.shouldBe(visible);
        blogElement.shouldBe(visible);
        contactElement.shouldBe(visible);
        return this;
    }

    @Step("Checking phone")
    public MainPage checkContactPhone(String phone) {
        contactPhoneElement.shouldHave(text(phone));
        return this;
    }

    @Step("Checking phone")
    public MainPage checkContactAddress(String address) {
        contactAddressElement.shouldHave(text(address));
        return this;
    }
}