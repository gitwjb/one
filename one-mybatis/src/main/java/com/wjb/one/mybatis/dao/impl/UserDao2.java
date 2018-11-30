package com.wjb.one.mybatis.dao.impl;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.wjb.one.mybatis.entity.User;

@Repository
public class UserDao2 extends SqlSessionDaoSupport{
    
    public User getUser(int id) {
        return this.getSqlSession().selectOne(this.getClass().getName() + ".getUser", 1);
    }
    
	@Override
	@Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        // TODO Auto-generated method stub
        super.setSqlSessionFactory(sqlSessionFactory);
    }
}
