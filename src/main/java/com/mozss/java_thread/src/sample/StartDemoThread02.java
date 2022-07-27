package com.mozss.java_thread.src.sample;

public class StartDemoThread02 implements Runnable {
	
	private String message;
	
	public StartDemoThread02(String message) {
		this.message = message;
	}
	
	public static void main(String[] args) {
		//这里需要注意: 不同于DemoThread01创建线程的启动
		new Thread(new StartDemoThread02("Meta")).start();
		new Thread(new StartDemoThread02("World")).start();
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(message);
		}
	}
}
