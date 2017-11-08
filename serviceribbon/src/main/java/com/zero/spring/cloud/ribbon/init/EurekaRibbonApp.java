package com.zero.spring.cloud.ribbon.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * spring-cloud eureka application
 * @date 2017年11月5日 下午10:34:00
 * @author zero
 */
@EnableHystrix	// 可使用断路器
@EnableHystrixDashboard	// 断路器仪表盘,通过 /hystrix 访问
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(value= {"com.zero.spring.cloud.ribbon"})
public class EurekaRibbonApp {
	private static final Logger logger = LoggerFactory.getLogger(EurekaRibbonApp.class);
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new SpringApplicationBuilder(EurekaRibbonApp.class).web(true).run(args);
		logger.info("EurekaRibbonApp inited with {} beans", context.getBeanDefinitionCount());
	}
}
