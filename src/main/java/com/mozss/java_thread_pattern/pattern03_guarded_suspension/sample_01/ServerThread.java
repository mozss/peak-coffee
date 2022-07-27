package com.mozss.java_thread_pattern.pattern03_guarded_suspension.sample_01;

import java.util.Random;

/**
 * 用来接收请求的ServerThread
 */
public class ServerThread extends Thread {
	private final Random random;
	
	private final RequestQueue requestQueue;
	
	public ServerThread(RequestQueue requestQueue, String name, long seed) {
		super(name);
		this.requestQueue = requestQueue;
		this.random = new Random(seed);
	}
	
	public void run() {
		for (int i = 0; i < 10000; i++) {
			Request request = requestQueue.getRequest();
			System.out.println(Thread.currentThread().getName() + "handles " + request);
			try {
				Thread.sleep(random.nextInt(1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
