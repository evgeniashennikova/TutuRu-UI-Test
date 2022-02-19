package ru.tutu.tests.ui.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.sizeNotEqual;
import static ru.tutu.tests.ui.TestData.*;

public class SearchPageTrainTickets {

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
