package com.zero.spring.cloud.config.init;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * spring-config server application entrance(配置中心).
 * 根据配置文件 application.yml 中配置的 spring.cloud.config.server.git.* 项中的仓库，将读取该路径(searchPaths)下的所有"*.properties","*.yml"配置的内容
 * 通过http获取配置信息的方式为：http://localhost:3050/{key}/{env}
 * 
 * /{application}/{profile}[/{label}]
 * /{application}-{profile}.yml
 * /{label}/{application}-{profile}.yml
 * /{application}-{profile}.properties
 * /{label}/{application}-{profile}.properties
 * @date 2017年11月9日 下午11:47:22
 * @author zero
 */
@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApp {
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigServerApp.class).web(true).run(args);
	}
	
}
