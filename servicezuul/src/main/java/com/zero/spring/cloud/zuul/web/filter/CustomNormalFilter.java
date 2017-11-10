package com.zero.spring.cloud.zuul.web.filter;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * 使用zuul的过滤器功能
 * @date 2017年11月8日 下午6:23:56
 * @author zero
 */
@Component
public class CustomNormalFilter extends ZuulFilter {
	private final Logger logger = LoggerFactory.getLogger(CustomNormalFilter.class);

	@Override
	public boolean shouldFilter() {
		return true;
	}

	/**
	 * 过滤逻辑，可以使用复杂的过滤逻辑，譬如权限管理
	 */
	@Override
	public Object run() {
		RequestContext crc = RequestContext.getCurrentContext();
		HttpServletRequest request = crc.getRequest();
		Object token = request.getParameter("token");
		if(token == null) {// 假设未传token则不允许请求访问
			logger.warn("Method[{}], URI[{}], request param without token, rejust it.", request.getMethod(), request.getRequestURI());
			crc.setSendZuulResponse(false);
			crc.setResponseStatusCode(503);
			try {
				crc.getResponse().getWriter().write("token is empty!");
			} catch(IOException e) {
				logger.error("Method[{}], URI[{}], request param without token, write back occurred IO exception.", request.getMethod(), request.getRequestURI(), e);
			}
		}
		logger.info("Method[{}], URI[{}], CustomNormalFilter allowed to access.", request.getMethod(), request.getRequestURI());
		return null;
	}

	/**
	 * 四种类型
	 * pre：路由之前
	 * routing：路由之时
	 * post： 路由之后
	 * error：发送错误调用
	 */
	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

}
