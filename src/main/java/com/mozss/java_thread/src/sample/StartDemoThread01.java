package com.mozss.java_thread.src.sample;

public class StartDemoThread01 extends Thread {
	private String message;
	
	public StartDemoThread01(String message) {
		this.message = message;
	}
	
	public static void main(String[] args) {
		new StartDemoThread01("Good!").start();
		new StartDemoThread01("google").start();
		//效果与上面一致
		new Thread(new StartDemoThread01("Happy")).start();
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(message);
		}
	}
}
