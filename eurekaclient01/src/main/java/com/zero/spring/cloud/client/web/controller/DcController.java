package com.zero.spring.cloud.client.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * for test
 * @date 2017年11月5日 下午10:39:08
 * @author zero
 */
@RestController
public class DcController {
	private final Logger logger = LoggerFactory.getLogger(DcController.class);
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Value("${server.port}")
	private Integer port;
	
	@GetMapping(value="/dc")
	public String dc() {
		String services = "Services: " + discoveryClient.getServices() + ", on port[" + port + "]";
		logger.info("EurekaClientOne DcController, get services: {}", services);
		return services;
	}
	
}
