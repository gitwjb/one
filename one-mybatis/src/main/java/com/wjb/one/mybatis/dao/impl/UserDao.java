package com.wjb.one.mybatis.dao.impl;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.wjb.one.mybatis.entity.User;

@Repository
public class UserDao{

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;
    
    public User getUser(int id) {
        return sqlSessionTemplate.selectOne(this.getClass().getName() + ".getUser", 1);
    }   
}
