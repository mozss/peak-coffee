package com.mozss.java_thread_pattern.pattern09_future.sample_01;

public class Main {
	public static void main(String[] args) {
		System.out.println("Main BEGIN");
		Host host = new Host();
		Data data1 = host.request(10, 'A');
		Data data2 = host.request(10, 'A');
		Data data3 = host.request(10, 'A');
		
		System.out.println("main other job BEGIN");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		
		}
		System.out.println("main otherjob END");
		
		System.out.println("data1 = " + data1.getContent());
		System.out.println("data2 = " + data2.getContent());
		System.out.println("data3 = " + data3.getContent());
		System.out.println("main END");
	}
}
