package org.cherubits.examples.springcommandline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.PropertySource;
import org.springframework.core.env.SimpleCommandLinePropertySource;

/**
 * Created by lordoftheflies on 2017.06.19..
 */
@Configuration
public class SpringCommandLineConfiguration {
    private static final Logger logger = LoggerFactory.getLogger(SpringCommandLineConfiguration.class);

    @Value("${domain}")
    private String domain;

    public SpringCommandLineConfiguration() {
    }
}
