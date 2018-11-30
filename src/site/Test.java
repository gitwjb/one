package com.wjb.one.mybatis.test;

import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

public class Test {
	@Autowired
	DruidDataSource ss;
	
	private void test() {
		try {
			DruidPooledConnection conn = ss.getConnection();
			Statement sat = conn.createStatement();
			sat.addBatch("");
			sat.executeBatch();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
	}
}
