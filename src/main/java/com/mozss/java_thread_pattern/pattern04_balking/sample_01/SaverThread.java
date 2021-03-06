package com.mozss.java_thread_pattern.pattern04_balking.sample_01;

import java.io.IOException;

public class SaverThread extends Thread {
	private final Data data;
	
	public SaverThread(String name, Data data) {
		super(name);
		this.data = data;
	}
	
	public void run() {
		while (true) {
			try {
				data.save();        //要求保存数据
				Thread.sleep(1000);     //休眠1秒
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
