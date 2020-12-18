package io.github.telepnev;

import org.aeonbits.owner.Config;

import java.net.URL;


public interface WebDriverConfig extends Config {
    @DefaultValue("FIREFOX")
    @Key("webdriver.browser.name")
    BrowserName browserName();

    @DefaultValue("http://localhost:4444/wd/hub")
    @Key("webdriver.remote.url")
    URL remoteURL();

    @DefaultValue("false")
    @Key("webdriver.remote")
    boolean remote();

}
