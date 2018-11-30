package com.wjb.one.mybatis.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseDao extends Serializable{
	
	public List<Map<String, Object>>  selectAll(String sqlId,Map<String, Object> parame);
	
	public List<Map<String, Object>> selectPage(String sqlId, Map<String, Object> parame);
	
	public Map<String, Object> selectMap(String sqlId, Map<String, Object> parame);
	
	public int sqlExecute(String sqlId, Map<String, Object> parame);
	
}
