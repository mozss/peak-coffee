package com.mozss.java_thread.src.sample;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class StartDemoThread03 extends Thread {
	private String message;
	
	public StartDemoThread03(String message) {
		this.message = message;
	}
	
	public static void main(String[] args) {
		//这里利用ThreadFactory来启动线程
		ThreadFactory factory = Executors.defaultThreadFactory();
		factory.newThread(new StartDemoThread03("Nice")).start();
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(message);
		}
	}
}
