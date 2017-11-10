package com.zero.spring.cloud.config.init;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * spring-config application entrance.
 * @date 2017年11月9日 下午11:47:22
 * @author zero
 */
@EnableConfigServer
public class ConfigClientApp {
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigClientApp.class).web(true).run(args);
	}
	
}
