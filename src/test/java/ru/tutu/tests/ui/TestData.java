package ru.tutu.tests.ui;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class TestData {

    public static String expectedTitle = "Tutu.ru: Авиа, ЖД, билеты на автобус и туры онлайн. Стоимость железнодорожных " +
            "билетов и расписание, цены на 2022 год, заказ ж/д билетов, авиабилетов, туров и билетов на автобусы.",
            textSlogan = "Больше пользы для ваших путешествий",
            textAboutCompany = "Делаем сервис удобных путешествий",
            textAboutCompanyTwo = "Делаем так, чтобы вам было удобно в любой поездке",
            stationFrom = "Санкт-Петербург",
            stationTo = "Москва",
            dateDeparture = "02.04.2022",
            expectedUrl = "https://company.tutu.ru/";

    public static SelenideElement
            logoSelector = $(".logo"),
            sloganSelector = $(".slogan"),
            tabAviaSelector = $("[data-content='avia']").$(".link"),
            tabTrainSelector = $("[data-content='train']").$(".link"),
            tabBusSelector = $("[data-content='bus']").$(".link"),
            tabEtrainSelector = $("[data-content='etrain']").$(".link"),
            tabToursSelector = $(".tab_tours").$(".link"),
            tabTripSelector = $(".tab_trip").$(".link"),
            tabHotelsSelector = $(".tab_hotels").$(".link"),
            tabCorporateSelector = $(".tab_corporate").$(".link"),
            tabAeroexpressSelector = $(".tab_aeroexpress").$(".link"),
            contentTrainSelector = $("[data-content='train']"),
            stationFromSelector = $("[name='schedule_station_from']"),
            stationToSelector = $("[name='schedule_station_to']"),
            dateDepartureSelector = $("[placeholder='Дата']"),
            infoAboutCompanySelector = $(byText("О компании")),
            textAboutCompanySelector = $("[field='tn_text_1562852752675']"),
            textAboutCompanyTwoSelector = $("[field='tn_text_1568892305541']");

    public static ElementsCollection resultCartSelector = $$("[data-ti='train-offer-card']");

}
