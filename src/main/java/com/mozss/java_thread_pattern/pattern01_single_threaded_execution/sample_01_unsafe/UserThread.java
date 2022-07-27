package com.mozss.java_thread_pattern.pattern01_single_threaded_execution.sample_01_unsafe;

/**
 * 人：表示人不断通过门
 */
public class UserThread extends Thread {
	
	//不期望被重复赋值 声明为final
	private final Gate gate;
	private final String myname;
	private final String myaddress;
	
	//这使用Blank Final的方式
	public UserThread(Gate gate, String myname, String myaddress) {
		this.gate = gate;
		this.myname = myname;
		this.myaddress = myaddress;
	}
	
	
	public void run() {
		System.out.println(myname + " BEGIN");
		while (true) {
			gate.pass(myname, myaddress);
		}
	}
}
