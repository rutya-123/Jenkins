package com.cts.springlearnbuild;

import javax.annotation.PostConstruct;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringLearnBuildApplication {
	public static org.slf4j.Logger Logger = LoggerFactory.getLogger(SpringLearnBuildApplication.class);
	
	@PostConstruct
	public void init() {
		Logger.info("Application Started");
	}
	public static void main(String[] args) {
		Logger.info("Application executed");
		SpringApplication.run(SpringLearnBuildApplication.class, args);
	}

}
