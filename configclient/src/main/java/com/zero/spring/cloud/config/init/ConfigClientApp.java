package com.zero.spring.cloud.config.init;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * config-client entrance.
 * @date 2017年11月10日 上午10:54:06
 * @author zero
 */
@RefreshScope
@EnableEurekaClient
@SpringBootApplication(scanBasePackages= {"com.zero.spring.cloud.config"})
public class ConfigClientApp {
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigClientApp.class).web(true).run(args);
	}
}
