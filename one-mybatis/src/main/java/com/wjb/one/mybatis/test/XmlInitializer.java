package com.wjb.one.mybatis.test;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.wjb.one.mybatis.dao.BaseDao;
import com.wjb.one.mybatis.dao.TestMapper;
import com.wjb.one.mybatis.dao.impl.UserDao;
import com.wjb.one.mybatis.dao.impl.UserDao2;
import com.wjb.one.mybatis.entity.User;

/**
 * @description  xml 方式加载bean
 * @author wjb
 */
public class XmlInitializer {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		System.out.println("加载....");
		
		UserDao userDao = context.getBean(UserDao.class);
		User user = userDao.getUser(1);
		System.out.println(user);
		
		UserDao2 userDao2 = context.getBean(UserDao2.class);
		User user2 = userDao2.getUser(1);
		System.out.println(user2);
		
		TestMapper testMapper = context.getBean(TestMapper.class);
		
		PageHelper.startPage(1, 3, true);
		List<Map<String, Object>> lst = testMapper.findAll();
		System.out.println(lst.size());
		
		BaseDao baseDao = context.getBean(BaseDao.class);
		List<Map<String, Object>> list = baseDao.selectAll("com.wjb.one.mybatis.dao.TestMapper.findAll", Collections.EMPTY_MAP);
		System.out.println(list);
		
		((ConfigurableApplicationContext)context).close();
	}
}
