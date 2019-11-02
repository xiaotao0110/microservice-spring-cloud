package com.itmuch.cloud.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/**
 *     自定义规则：指定服务为user的采用此策略
 * @author XIAOTAO
 *
 */
/*
 * @Configuration
 * 
 * @RibbonClient(name = "microservice-consumer-user",configuration = TestConfiguration.class)
 */
public class TestConfiguration {
	/*
	 * @Bean public IRule ribbonRule(IClientConfig config) { return new
	 * RandomRule(); }
	 */
	
}
