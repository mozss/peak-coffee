package com.mozss.pattern23.design11behavior.behavior06responsibilitychain.sample_01;

public class Client {
	public static void main(String[] args) {
		RequestHandle hr = new HrRequestHandle();
		RequestHandle pm = new PmRequestHandle(hr);
		TLRequestHandle tl = new TLRequestHandle(pm);
		
		//处理离职请求
		Request request = new Request();
		tl.handleRequest(request);
		System.out.println("==========");
		
		//处理加薪请求
		request = new AddMoneyRequest();
		tl.handleRequest(request);
		System.out.println("==========");
		
		//pm处理辞职请求
		request = new DimissionRequest();
		pm.handleRequest(request);
		
	}
}
