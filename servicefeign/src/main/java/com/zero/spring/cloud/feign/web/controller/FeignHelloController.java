package com.zero.spring.cloud.feign.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zero.spring.cloud.feign.domain.service.FeignHelloService;

/**
 * 曝露给客户端的接口调用
 * @date 2017年11月8日 上午11:31:33
 * @author zero
 */
@Configuration
@RestController
public class FeignHelloController {
	private final Logger logger = LoggerFactory.getLogger(FeignHelloController.class);
	
	@Autowired
	private FeignHelloService feignHelloService;
	
	
	@GetMapping(value="/consumer")
	public String sayHi(@RequestParam String name) {
		logger.info("invoke '/dc' with name=[{}]", name);
		return feignHelloService.dc();
	}
	
}
