package io.github.telepnev;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:default.properties",
        "classpath:local.properties"
        })
public interface WebDriverConfig extends Config {
    @DefaultValue("CHROME")
    @Key("webdriver.browser.name")
    BrowserName browserName();

    @DefaultValue("false")
    @Key("webdriver.remote")
    boolean remote();

    @Key("webdriver.remote.url")
    URL remoteURL();



}
