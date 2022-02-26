package ru.tutu.tests.ui.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;
import static ru.tutu.tests.ui.TestData.*;

public class AboutCompanyPage {

    public static SelenideElement
            infoAboutCompanySelector = $(byText("О компании")),
            textAboutCompanySelector = $("[field='tn_text_1562852752675']"),
            textAboutCompanyTwoSelector = $("[field='tn_text_1568892305541']");

    @Step("Перейти в раздел 'О компании'")
    public void openPageAboutCompany() {
        infoAboutCompanySelector.scrollTo().click();
    }

    @Step("Проверка URL страницы 'О компании'")
    public void checkUrlPageAboutCompany() {
        webdriver().shouldHave(url(expectedUrl));
    }

    @Step("Проверка необходимой информации на странице 'О компании'")
    public void checkInfoAboutCompany() {
        textAboutCompanySelector.shouldHave(text(textAboutCompany));
        textAboutCompanyTwoSelector.shouldHave(text(textAboutCompanyTwo));
    }
}

