package com.zero.spring.cloud.feign.domain.service;

/**
 * 
 * @date 2017年11月8日 下午5:43:40
 * @author zero
 */
public class FeignHelloServiceImpl implements FeignHelloService {

	@Override
	public String dc() {
		return "sorry, /dc service support was cracked.";
	}

}
