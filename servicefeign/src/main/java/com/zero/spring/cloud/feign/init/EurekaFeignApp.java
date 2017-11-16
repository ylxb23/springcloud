package com.zero.spring.cloud.feign.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * feign application entrance.
 * Feign是一个声明式的伪Http客户端，它使得写Http客户端变得更简单。
 * 使用Feign，只需要创建一个接口并注解。
 * 它具有可插拔的注解特性，可使用Feign 注解和JAX-RS注解。
 * Feign支持可插拔的编码器和解码器。
 * Feign默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果。
 * @date 2017年11月8日 上午11:17:48
 * @author zero
 */
@EnableEurekaClient
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication()
public class EurekaFeignApp {
	private static final Logger logger = LoggerFactory.getLogger(EurekaFeignApp.class);
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(EurekaFeignApp.class, args);
		int beans = context.getBeanDefinitionCount();
		logger.info("EurekaFeignApp inited with {} beans.", beans);
	}
	
}
