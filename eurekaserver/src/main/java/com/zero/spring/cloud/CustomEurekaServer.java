package com.zero.spring.cloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

/**
 * spring-cloud application entrance.
 * @date 2017年11月2日 下午3:51:55
 * @author zero
 */
//@EnableConfigServer	// 集成配置中心
@EnableEurekaServer
@SpringBootApplication
@PropertySource(value= {"application.properties"})
public class CustomEurekaServer {
	private static final Logger logger = LoggerFactory.getLogger(CustomEurekaServer.class);
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new SpringApplicationBuilder(CustomEurekaServer.class).run(args);
		int beans = context.getBeanDefinitionCount();
		logger.info("CustomEurekaServer inited with {} beans.", beans);
	}
	
}
