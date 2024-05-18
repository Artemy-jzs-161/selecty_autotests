package data;

import java.util.List;

public class TestData {

    private String contactPhone = "+7 (499) 288 87 71";

    private String contactAddress = "г. Москва, Садовническая ул. 14, с. 2, 6 этаж (БЦ Кристалл-плаза)";

    private String ruTitleText = "ЦИФРОВАЯ ТРАНСФОРМАЦИЯ ПОД КЛЮЧ";

    private String enTitleText = "End-to-end digital transformation";

    private List<String> ruLanguageLinkText = List.of("Selecty", "Услуги", "Карьера", "Блог", "Контакты");

    private List<String> enLanguageLinkText = List.of("Selecty", "Services", "Career", "Contacts");

    private List<String> expectedSocialLinks = List.of(
            "https://vk.com/selecty1",
            "https://www.linkedin.com/company/selecty-hr/",
            "https://career.habr.com/companies/selecty",
            "https://t.me/selecty_inside",
            "https://ekaterinburg.hh.ru/employer/2406247",
            "https://vc.ru/selecty"
    );

    public List<String> getRuLanguageLinkText() {
        return ruLanguageLinkText;
    }

    public List<String> getEnLanguageLinkText() {
        return enLanguageLinkText;
    }

    public List<String> getExpectedSocialLinks() {
        return expectedSocialLinks;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public String getRuTitleText() {
        return ruTitleText;
    }

    public String getEnTitleText() {
        return enTitleText;
    }
}



