package com.wjb.one.mybatis.datasource;

public class DataSourceUtil {
	 
	// 测试库
	public static void selectTestDataSource() {
		MultipleDataSource.setDataSourceKey("testDataSource");
	}
	
	// 正式库
	public static void selectDataSource() {
		MultipleDataSource.setDataSourceKey("dataSource");
	}
}

