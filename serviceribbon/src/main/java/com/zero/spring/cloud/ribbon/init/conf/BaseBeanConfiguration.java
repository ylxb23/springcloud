package com.zero.spring.cloud.ribbon.init.conf;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * base beans inject.
 * @date 2017年11月7日 下午11:31:08
 * @author zero
 */
@Configuration
public class BaseBeanConfiguration {
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}