package com.mozss.java_thread_pattern.pattern03_guarded_suspension.sample_01;

public class Main {
	public static void main(String[] args) {
		RequestQueue requestQueue = new RequestQueue();
		//6353897L和314592L作为随机数的种子,没有特别的意义
		new ClientThread(requestQueue, "Alice", 314592L).start();
		new ClientThread(requestQueue, "Bobby", 6353897L).start();
	}
}
