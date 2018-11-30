package com.wjb.one.mybatis.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(AppConfig.class);
		ctx.refresh();
		
		TestBean testBean = ctx.getBean(TestBean.class);
		System.out.println(testBean.toString());
		
		((ConfigurableApplicationContext)ctx).close();
	}
}
