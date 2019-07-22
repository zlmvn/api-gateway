package com.xuxl.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.xuxl.apigateway.listener.EnableDubboConsumerBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@EnableDubboConsumerBean(basePackages = "com.xuxl")
public class ApiGatewayApplication extends SpringBootServletInitializer {

	private static final Logger logger = LoggerFactory.getLogger(ApiGatewayApplication.class);

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ApiGatewayApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
		logger.info("api-gateway has started");
	}
}
