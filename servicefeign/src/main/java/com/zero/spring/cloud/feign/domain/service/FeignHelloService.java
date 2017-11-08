package com.zero.spring.cloud.feign.domain.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 声明是调用 eureka-client(服务提供方的{@code spring.application.name})的服务。
 * 该服务与 serviceribbon中的{@link HelloService}的作用类似。
 * @date 2017年11月8日 上午11:24:18
 * @author zero
 */
@FeignClient(value="eureka-client", fallback= FeignHelloServiceHystric.class)
public interface FeignHelloService {
	
	/**
	 * 声明该方法可以调用注册服务提供的'/dc'接口
	 * @param name
	 * @return
	 */
	@GetMapping(value="/dc")
	String dc();
	
}
