package com.zero.spring.cloud.client.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/**
 * spring-cloud eureka application
 * @date 2017年11月5日 下午10:34:00
 * @author zero
 */
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(value= {"com.zero.spring.cloud.client"})
@PropertySource(value= {"application.properties"})
public class CustomEurekaClient {
	private static final Logger logger = LoggerFactory.getLogger(CustomEurekaClient.class);
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new SpringApplicationBuilder(CustomEurekaClient.class).web(true).run(args);
		logger.info("CustomEurekaClient:Two inited with {} beans", context.getBeanDefinitionCount());
	}
}
