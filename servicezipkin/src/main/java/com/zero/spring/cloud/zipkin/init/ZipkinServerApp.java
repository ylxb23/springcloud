package com.zero.spring.cloud.zipkin.init;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import zipkin.server.EnableZipkinServer;

/**
 * 分布式系统中服务追踪
 * @date 2017年11月10日 下午6:42:40
 * @author zero
 */
@EnableZipkinServer
@SpringBootApplication
public class ZipkinServerApp {
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(ZipkinServerApp.class).web(true).run(args);
	}
	
}
