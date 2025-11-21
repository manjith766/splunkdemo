package com.neoteric;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SplunkdemoApplication {

    private static final Logger log = LoggerFactory.getLogger(SplunkdemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SplunkdemoApplication.class, args);
        log.info("Application Started Successfully.");
        log.debug("Debugging Information.");
        log.error("Error Message Example.");

	}


}
