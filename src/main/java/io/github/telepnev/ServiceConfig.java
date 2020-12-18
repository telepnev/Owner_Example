package io.github.telepnev;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:default.properties"})
public interface ServiceConfig extends Config {

    @Key("service.base.url")
    String baseUrl();
}
