package com.mozss.pattern23.design11behavior.behavior06responsibilitychain.sample_01;

public interface RequestHandle {
	//这是需要注意的是, 引入org.omg.CORBA.Request包
	void handleRequest(Request request);
}
