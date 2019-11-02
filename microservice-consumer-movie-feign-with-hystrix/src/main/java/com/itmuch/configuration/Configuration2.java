package com.itmuch.configuration;

import feign.Feign;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Configuration2 {

    @Bean
    @Scope("prototype")
	public Feign.Builder feignBuilder(){
	    return Feign.builder();
    }
}
