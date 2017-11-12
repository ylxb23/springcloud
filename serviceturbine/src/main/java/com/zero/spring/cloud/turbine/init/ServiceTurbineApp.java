package com.zero.spring.cloud.turbine.init;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * hystrix turbine application entrance.
 * @date 2017年11月12日 下午3:03:46
 * @author zero
 */
@EnableEurekaClient
@EnableTurbine
@SpringBootApplication
public class ServiceTurbineApp {
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(ServiceTurbineApp.class).web(true).run(args);
	}
	
}
