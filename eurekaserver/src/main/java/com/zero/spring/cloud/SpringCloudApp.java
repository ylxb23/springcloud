package com.zero.spring.cloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * spring-cloud application entrance.
 * @date 2017年11月2日 下午3:51:55
 * @author zero
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudApp {
	private static final Logger logger = LoggerFactory.getLogger(SpringCloudApp.class);
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new SpringApplicationBuilder(SpringCloudApp.class).run(args);
		int beans = context.getBeanDefinitionCount();
		logger.info("spring cloud application inited with {} beans.", beans);
	}
	
}
