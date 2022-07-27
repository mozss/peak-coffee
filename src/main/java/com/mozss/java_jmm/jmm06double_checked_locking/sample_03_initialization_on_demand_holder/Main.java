package com.mozss.java_jmm.jmm06double_checked_locking.sample_03_initialization_on_demand_holder;

public class Main {
	public static void main(String[] args) {
		// 线程A
		new Thread() {
			@Override
			public void run() {
				System.out.println(MySystem.getInstance().getDate());
			}
		}.start();
		
		// 线程B
		new Thread() {
			@Override
			public void run() {
				System.out.println(MySystem.getInstance().getDate());
			}
		}.start();
	}
}
