package ru.tutu.tests.ui.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.sizeNotEqual;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static ru.tutu.tests.ui.TestData.*;

public class SearchPageTrainTickets {

    public static SelenideElement
            contentTrainSelector = $("[data-content='train']"),
            stationFromSelector = $("[name='schedule_station_from']"),
            stationToSelector = $("[name='schedule_station_to']"),
            dateDepartureSelector = $("[placeholder='Дата']");
    public static ElementsCollection resultCartSelector = $$("[data-ti='train-offer-card']");

    @Step("Открыть раздел Ж/д билеты")
    public void openPageTrainTickets() {
        contentTrainSelector.click();
    }

    @Step("Заполнить поле 'Откуда'")
    public void fillingFieldFrom() {
        stationFromSelector.setValue(stationFrom);
    }

    @Step("Заполнить поле 'Куда'")
    public void fillingFieldTo() {
        stationToSelector.setValue(stationTo);
    }

    @Step("Заполнить поле 'Дата поездки'")
    public void fillingFieldTravelDate() {
        dateDepartureSelector.setValue(dateDeparture).pressEnter();
    }

    @Step("Проверка результатов поиска")
    public void checkSearchResults() {
        resultCartSelector.shouldHave(sizeNotEqual(0));
    }

}

