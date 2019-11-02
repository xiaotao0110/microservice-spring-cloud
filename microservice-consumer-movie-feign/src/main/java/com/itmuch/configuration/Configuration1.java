package com.itmuch.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Contract;

@Configuration
public class Configuration1 {

	/**
	 * 使用feign策略，注解
	 * @return
	 */
	@Bean
	public Contract feignContract() {
		return new feign.Contract.Default();
	}
}
