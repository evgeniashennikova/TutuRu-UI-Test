package ru.tutu.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:configs/${typeEnv}.properties"
})
/**
 * Класс для настройки конфигурации
 * [typeEnv] принимает значения local или remote, в зависимости от вариантов запуска тестов: локально или удалённо.
 */
public interface ProjectConfig extends Config {

    String selenoidUrl();

    String login();

    String password();

    @Key("browser")
    @DefaultValue("CHROME")
    String browser();

    @Key("versionBrowser")
    @DefaultValue("91.0")
    String versionBrowser();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String browserSize();


}
