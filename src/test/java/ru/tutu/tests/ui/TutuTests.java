package ru.tutu.tests.ui;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@Owner("Щенникова Е.")
public class TutuTests extends TestBase {

    @Test
    @AllureId("7521")
    @Story("Атрибуты главной страницы")
    @Severity(value = SeverityLevel.NORMAL)
    @DisplayName("Проверка текста заголовка на главной странице")
    void titleTextTest() {

        homePageSteps.checkTitle();

    }

    @Test
    @AllureId("7522")
    @Story("Атрибуты главной страницы")
    @Severity(value = SeverityLevel.CRITICAL)
    @DisplayName("Проверка наличия логотипа и слогана")
    void checkLogoTest() {

        homePageSteps.checkLogo();
        homePageSteps.checkSlogan();

    }

    @Test
    @AllureId("7523")
    @Story("Функция поиска")
    @Severity(value = SeverityLevel.CRITICAL)
    @DisplayName("Проверка наличие табов поиска")
    void checkTabsTest() {

        homePageSteps.checkTabAirlineTickets();
        homePageSteps.checkTabTrainTickets();
        homePageSteps.checkTabBusTickets();
        homePageSteps.checkTabEtrainTickets();
        homePageSteps.checkTabTours();
        homePageSteps.checkTabAdventure();
        homePageSteps.checkTabHotels();
        homePageSteps.checkTabBusinessTravel();
        homePageSteps.checkTabAeroexpress();

    }

    @Test
    @AllureId("7524")
    @Story("Функция поиска")
    @Severity(value = SeverityLevel.CRITICAL)
    @DisplayName("Проверка функции поиска ж/д билетов на сайте")
    void searchTest() {

        searchPageTrainTicketsSteps.openPageTrainTickets();
        searchPageTrainTicketsSteps.fillingFieldFrom();
        searchPageTrainTicketsSteps.fillingFieldTo();
        searchPageTrainTicketsSteps.fillingFieldTravelDate();
        searchPageTrainTicketsSteps.checkSearchResults();

    }

    @Test
    @AllureId("7525")
    @Story("Информация")
    @Severity(value = SeverityLevel.NORMAL)
    @DisplayName("Footer содержит раздел 'О компании'")
    void checkInfoCompanyTest() {

        aboutCompanyPageSteps.openPageAboutCompany();
        aboutCompanyPageSteps.checkUrlPageAboutCompany();
        aboutCompanyPageSteps.checkInfoAboutCompany();

    }
}
