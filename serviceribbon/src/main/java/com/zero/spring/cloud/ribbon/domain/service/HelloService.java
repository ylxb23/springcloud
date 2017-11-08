package com.zero.spring.cloud.ribbon.domain.service;

/**
 * for test
 * @date 2017年11月7日 下午11:33:44
 * @author zero
 */
public interface HelloService {

	/**
	 * get service. [for test]
	 * @param name
	 * @return
	 */
	String hiService(String name);

	/**
	 * hiService 熔断之后的 fallbackMethod
	 * @param name
	 * @return
	 */
	String hiError(String name);
	
	
}
