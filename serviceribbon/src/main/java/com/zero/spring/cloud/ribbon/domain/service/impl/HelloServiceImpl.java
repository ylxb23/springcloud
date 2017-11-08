package com.zero.spring.cloud.ribbon.domain.service.impl;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.client.utils.URIBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zero.spring.cloud.ribbon.domain.service.HelloService;

/**
 * for test.
 * @date 2017年11月7日 下午11:47:57
 * @author zero
 */
@Service
public class HelloServiceImpl implements HelloService {
	private final Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);

	/**
	 * 通过 RestTemplate.getForObject() 实现负载均衡，可以访问不同运行中的实例提供的服务
	 */
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	@HystrixCommand(fallbackMethod = "hiError")
	public String hiService(String name) {
		try {
			URI uri = new URIBuilder()
					.setScheme("http").setHost("EUREKA-CLIENT")
					.setPath("/dc").addParameter("name", name).build();
			return restTemplate.getForObject(uri.toString(), String.class);
		} catch(URISyntaxException e) {
			logger.error("invoke hiService with name[{}] occurred URISyntaxException: ", name, e);
			return "ERROR";
		}
	}
	
	@Override
	public String hiError(String name) {
		return "Hi, " + name + ", sorry, service error!";
	}
}
