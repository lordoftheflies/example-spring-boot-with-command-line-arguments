package org.cherubits.examples.springcommandline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by lordoftheflies on 2017.06.19..
 */
@Component
public class SpringCommandLineComponent {

    @Value("${domain}")
    private String domain;

    private static final Logger logger = LoggerFactory.getLogger(SpringCommandLineConfiguration.class);

    public void logConfiguration() {
        logger.info("Contains domain: " + domain);
    }
}
