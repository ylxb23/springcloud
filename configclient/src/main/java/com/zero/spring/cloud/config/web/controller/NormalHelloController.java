package com.zero.spring.cloud.config.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * for test
 * @date 2017年11月10日 上午10:56:10
 * @author zero
 */
@RestController
public class NormalHelloController {
	
	/**
	 * 配置在 
	 * uri: git@github.com:ylxb23/scc.git
	 * searchPaths: configclient
	 * 配置文件中的内容
	 */
//	@Value("${normal.key}")
//	private String normalKey;
//	
//	@Value("${normal.value}")
//	private String normalValue;
	
	@Value("${normal}")
	private String normal;
	
	@RequestMapping(value="/normalpro", method= {RequestMethod.GET})
	public String normal() {
//		return "[normal.key=" + normalKey + ", normal.value=" + normalValue + "]";
		return "normal: " + normal;
	}
	
}
