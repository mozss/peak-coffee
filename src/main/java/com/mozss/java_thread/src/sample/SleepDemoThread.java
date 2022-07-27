package com.mozss.java_thread.src.sample;

public class SleepDemoThread {
	public static void main(String[] args) {
		for (int i = 0; i < 19; i++) {
			System.out.print("Hi ");
			try {
				//间隔1秒
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
