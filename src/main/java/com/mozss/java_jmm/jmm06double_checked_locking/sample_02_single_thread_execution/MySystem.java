package com.mozss.java_jmm.jmm06double_checked_locking.sample_02_single_thread_execution;

import java.util.Date;

public class MySystem {
	private static MySystem instance = null;
	private Date date = new Date();
	
	private MySystem() {
	}
	
	public static synchronized MySystem getInstance() {
		if (instance == null) {
			instance = new MySystem();
		}
		return instance;
	}
	
	public Date getDate() {
		return date;
	}
}
