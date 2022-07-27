package com.mozss.java_thread_pattern.pattern01_single_threaded_execution.sample_01_unsafe;

public class Client {
	public static void main(String[] args) {
		System.out.println("Testing Gate, hit CTRL+C to exit");
		Gate gate = new Gate();
		
		//创建门，并让三个人不断地通过
		new UserThread(gate, "Alice", "Alaskea").start();
		new UserThread(gate, "Bobby", "Brazil").start();
		new UserThread(gate, "Chris", "Canada").start();
	}
}
