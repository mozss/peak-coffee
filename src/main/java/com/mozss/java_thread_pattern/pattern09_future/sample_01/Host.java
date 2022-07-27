package com.mozss.java_thread_pattern.pattern09_future.sample_01;

public class Host {
	public Data request(final int count, final char c) {
		System.out.println("    request(" + count + ", " + c + ") BEGIN");
		
		//1.创建FutureData的实例
		final FutureData future = new FutureData();
		//2.启动一个新线程, 用于创建RealData的实例
		new Thread() {
			public void run() {
				RealData realData = new RealData(count, c);
				future.setRealData(realData);
			}
		}.start();
		System.out.println("    request(" + count + ", " + c + ")END");
		//3.返回FutureData的实例
		return future;
	}
}
