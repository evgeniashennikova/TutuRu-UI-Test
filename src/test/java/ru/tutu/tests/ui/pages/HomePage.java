package ru.tutu.tests.ui.pages;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.title;
import static ru.tutu.tests.ui.TestData.*;

public class HomePage {

    @Step("Проверка заголовка страницы")
    public void checkTitle() {

        String actualTitle = title();
        Assertions.assertEquals(expectedTitle, actualTitle);

    }

    @Step("Проверка наличия логотипа на главной странице")
    public void checkLogo() {
        logoSelector.shouldBe(visible);
    }

    @Step("Проверка наличия слогана  на главной странице")
    public void checkSlogan() {
        sloganSelector.shouldHave(text(textSlogan));
    }

    @Step("Проверка наличия табa Авиабилеты")
    public void checkTabAirlineTickets() {
        tabAviaSelector.shouldHave(text("Авиабилеты"));
    }

    @Step("Проверка наличия табa Ж/Д билеты")
    public void checkTabTrainTickets() {
        tabTrainSelector.shouldHave(text("Ж/д билеты"));
    }

    @Step("Проверка наличия табa Автобусы")
    public void checkTabBusTickets() {
        tabBusSelector.shouldHave(text("Автобусы"));
    }

    @Step("Проверка наличия табa Электрички")
    public void checkTabEtrainTickets() {
        tabEtrainSelector.shouldHave(text("Электрички"));
    }

    @Step("Проверка наличия табa Туры")
    public void checkTabTours() {
        tabToursSelector.shouldHave(text("Туры"));
    }

    @Step("Проверка наличия табa Приключения")
    public void checkTabAdventure() {
        tabTripSelector.shouldHave(text("Приключения"));
    }

    @Step("Проверка наличия табa Отели")
    public void checkTabHotels() {
        tabHotelsSelector.shouldHave(text("Отели"));
    }

    @Step("Проверка наличия табa Командировки")
    public void checkTabBusinessTravel() {
        tabCorporateSelector.shouldHave(text("Командировки"));
    }

    @Step("Проверка наличия табa Аэроэкспрессы")
    public void checkTabAeroexpress() {
        tabAeroexpressSelector.shouldHave(text("Аэроэкспрессы"));
    }

}
