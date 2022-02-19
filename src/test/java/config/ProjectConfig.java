package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/${typeEnv}.properties"
//        "classpath:config/locale.properties",
//        "classpath:config/remote.properties"
})

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
