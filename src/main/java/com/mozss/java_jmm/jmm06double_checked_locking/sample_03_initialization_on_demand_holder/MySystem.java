package com.mozss.java_jmm.jmm06double_checked_locking.sample_03_initialization_on_demand_holder;

import java.util.Date;

public class MySystem {
	private Date date = new Date();
	
	private MySystem() {
	}
	
	public static MySystem getInstance() {
		return Holder.instance;
	}
	
	public Date getDate() {
		return date;
	}
	
	private static class Holder {
		public static MySystem instance = new MySystem();
	}
}
