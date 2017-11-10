package com.zero.spring.cloud.zuul.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 路由
 * @date 2017年11月8日 下午6:14:23
 * @author zero
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class CustomEurekaZuulApp {
	
	public static void main(String[] args) {
		SpringApplication.run(CustomEurekaZuulApp.class, args);
	}

}
