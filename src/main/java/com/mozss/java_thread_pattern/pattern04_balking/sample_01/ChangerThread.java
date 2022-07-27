package com.mozss.java_thread_pattern.pattern04_balking.sample_01;

import java.io.IOException;
import java.util.Random;

public class ChangerThread extends Thread {
	private final Data data;
	private final Random random = new Random();
	
	public ChangerThread(String name, Data data) {
		super(name);
		this.data = data;
	}
	
	public void run() {
		for (int i = 0; true; i++) {
			try {
				data.change("NO." + i);         //修改数据
				Thread.sleep(random.nextInt(1000));
				data.save();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
