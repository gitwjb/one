package com.wjb.one.mybatis.dao.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.wjb.one.mybatis.dao.BaseDao;

 
@Repository
@Primary
public class BaseDaoImpl<T, ID extends Serializable> extends SqlSessionDaoSupport implements BaseDao {
	
    private SqlSessionTemplate sqlSessionTemplate;
	
	@Override 
	@Autowired
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public List<Map<String, Object>> selectAll(String sqlId, Map<String, Object> parame) {
		// TODO Auto-generated method stub
		return null;
	} 
	
	@Override
	public List<Map<String, Object>> selectPage(String sqlId, Map<String, Object> parame) {
		// TODO Auto-generated method stub
		return null;
	} 
	@Override
	public Map<String, Object> selectMap(String sqlId, Map<String, Object> parame) {
		// TODO Auto-generated method stub
		return null;
	} 
	
	@Override
	public int sqlExecute(String sqlId, Map<String, Object> parame) {
		
		return 0;
	}
	
//    private SqlSessionFactory sqlSessionFactory;	
//    
//	@Override
//	@Autowired
//	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
//		super.setSqlSessionFactory(sqlSessionFactory);
//		this.sqlSessionFactory = sqlSessionFactory;
//	}

}

