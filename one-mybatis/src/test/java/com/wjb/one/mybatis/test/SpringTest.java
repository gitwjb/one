package com.wjb.one.mybatis.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-base.xml"})
//@ContextConfiguration(classes=AppConfig.class)
public class SpringTest {
	
	@Autowired
	TestBean testBean;
	
	@Test
	public void test() {
		System.out.println(testBean.toString());
	}
}