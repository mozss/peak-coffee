package com.mozss.pattern23.design7structural.structural07flyweight.sample_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

public class ConnectionPool {
	private static ConnectionPool instance = null;
	Connection connection = null;
	private Vector<Connection> pool;
	/*
	 * 公有属性
	 */
	private String url = "jdbc:mysql://localhost:3306/test";
	private String username = "root";
	private String password = "root";
	private String driverClassName = "com.mysql.jdbc.Driver";
	private int poolSize = 100;
	
	/*
	 * 使用构造方法来初始化一些工作
	 */
	private ConnectionPool() {
		pool = new Vector<Connection>(poolSize);
		
		for (int i = 0; i < poolSize; i++) {
			try {
				Class.forName(driverClassName);
				connection = DriverManager.getConnection(url, username, password);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			pool.add(connection);
		}
		
	}
	
	/*
	 * 返回连接到连接池
	 */
	public synchronized void release() {
		pool.add(connection);
	}
	
	/*
	 * 返回连接词中的一个数据库连接
	 */
	public synchronized Connection getConnection() {
		if (pool.size() > 0) {
			Connection connection = pool.get(0);
			pool.remove(connection);
			return connection;
		} else {
			return null;
		}
	}
}
