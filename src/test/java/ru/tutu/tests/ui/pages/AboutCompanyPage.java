package ru.tutu.tests.ui.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;
import static ru.tutu.tests.ui.TestData.*;

public class AboutCompanyPage {

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
