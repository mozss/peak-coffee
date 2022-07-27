package com.mozss.java_thread.src.sample;

public class HelloThread extends Thread {
	public static void main(String[] args) {
		HelloThread helloThread = new HelloThread();
		
		helloThread.start();
		//这里输出main, 说明是main线程
		System.out.println(Thread.currentThread().getName());
		
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Nice!");
		}
		//这里输出执行线程的名称
		System.out.println(Thread.currentThread().getName());
	}
}


