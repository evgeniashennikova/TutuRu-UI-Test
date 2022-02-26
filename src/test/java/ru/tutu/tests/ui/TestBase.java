package ru.tutu.tests.ui;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import ru.tutu.attach.Attach;
import ru.tutu.tests.ui.pages.AboutCompanyPage;
import ru.tutu.tests.ui.pages.HomePage;
import ru.tutu.tests.ui.pages.SearchPageTrainTickets;

import static com.codeborne.selenide.Selenide.open;
import static ru.tutu.config.WebDriverConfig.webConfiguration;
import static io.qameta.allure.Allure.step;

public class TestBase {

    HomePage homePageSteps = new HomePage();
    SearchPageTrainTickets searchPageTrainTicketsSteps = new SearchPageTrainTickets();
    AboutCompanyPage aboutCompanyPageSteps = new AboutCompanyPage();

    @BeforeAll
    static void setup() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        webConfiguration();
    }

    @BeforeEach
    void openMainPage() {
        step("Открыть главную страницу сайта Tutu.ru", () -> open("https://www.tutu.ru/"));
    }

    @AfterEach
    public void tearDown() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}

