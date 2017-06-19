package org.cherubits.examples.springcommandline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.PropertySource;
import org.springframework.core.env.SimpleCommandLinePropertySource;

@SpringBootApplication
public class SpringCommandLineApplication implements ApplicationRunner {

    private static final Logger logger = LoggerFactory.getLogger(SpringCommandLineApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringCommandLineApplication.class, args);
    }

    @Value("${domain}")
    private String domain;

    @Autowired
    private SpringCommandLineComponent comp;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        for (String name : args.getOptionNames()) {
            logger.info("arg-" + name + "=" + args.getOptionValues(name));
        }
        logger.info(String.format("Domain from MAIN: %s", domain));


        if (args.getOptionValues("domain") != null) {
            String domanOption = args.getOptionValues("domain").get(0);
            logger.info("Contains domain: " + domanOption);
        }

        comp.logConfiguration();
    }
}
