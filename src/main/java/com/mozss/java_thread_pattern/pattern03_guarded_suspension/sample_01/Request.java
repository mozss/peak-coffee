package com.mozss.java_thread_pattern.pattern03_guarded_suspension.sample_01;

/**
 * 表示请求的类
 */
public class Request {
	private final String name;
	
	public Request(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Request{" +
				       "name='" + name + '\'' +
				       '}';
	}
}
