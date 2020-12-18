package io.github.telepnev;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

public class SimpleTestLoadType {

    @Test
    public void testLoadPolicy() {
        WebDriverConfig config = ConfigFactory.newInstance().create(WebDriverConfig.class);
        System.out.println(config.browserName());
    }
}
