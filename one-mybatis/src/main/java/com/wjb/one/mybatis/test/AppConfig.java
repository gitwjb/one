package com.wjb.one.mybatis.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
	
	@Bean
	@Primary
	public TestBean getFirstBean() {
		return new TestBean();
	}
	
	@Bean
	public TestBean getSecondBean() {
		return new TestBean();
	}
}
