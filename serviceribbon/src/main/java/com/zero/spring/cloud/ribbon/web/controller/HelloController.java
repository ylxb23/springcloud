package com.zero.spring.cloud.ribbon.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zero.spring.cloud.ribbon.domain.service.HelloService;

/**
 * for test
 * @date 2017年11月5日 下午10:39:08
 * @author zero
 */
@RestController
public class HelloController {
	private final Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@Autowired
	private HelloService helloService;
	
	@RequestMapping(value="/hi", method= {RequestMethod.GET})
	public String hi(@RequestParam String name) {
		logger.info("Request from {}, call /hi.", name);
		return helloService.hiService(name);
	}
	
}
