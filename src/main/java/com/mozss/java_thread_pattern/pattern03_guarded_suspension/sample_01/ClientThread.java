package com.mozss.java_thread_pattern.pattern03_guarded_suspension.sample_01;

import java.util.Random;

/**
 * 发送请求的类
 */
public class ClientThread extends Thread {
	private final Random random;
	private final RequestQueue requestQueue;
	
	public ClientThread(RequestQueue requestQueue, String name, long seed) {
		super(name);
		this.requestQueue = requestQueue;
		this.random = new Random(seed);
	}
	
	public void run() {
		for (int i = 0; i < 10000; i++) {
			Request request = new Request("No." + i);
			System.out.println(Thread.currentThread().getName() + "requests" + request);
			requestQueue.putRequest(request);
			try {
				//这里使用随机数来进行sleep
				Thread.sleep(random.nextInt(1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
