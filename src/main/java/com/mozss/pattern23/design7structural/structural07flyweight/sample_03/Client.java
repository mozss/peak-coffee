package com.mozss.pattern23.design7structural.structural07flyweight.sample_03;

public class Client {
	public static void main(String[] args) {
		//初始化对象池
		for (int i = 0; i < 4; i++) {
			String subject = "科目" + i;
			//初始化地址
			for (int j = 0; j < 30; j++) {
				String key = subject + "考试地点" + j;
				SignInfoFactory.getSignInfo(key);
			}
		}
		//我们测试两个直接从池子中取的例子
		//结果输出为: 该对象在池中, 直接从池中获取!!!!!
		SignInfo signInfo01 = SignInfoFactory.getSignInfo("科目1考试地点1");
		SignInfo signInfo02 = SignInfoFactory.getSignInfo("科目2考试地点13");
	}
}
