package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
public class ConfigClientRefreshApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientRefreshApplication.class, args);
	}

}
