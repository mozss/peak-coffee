package com.mozss.pattern23.design5creational.creational03builder.sample_02;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
		/*
		 * 客户告诉xx公司, 我要这样一个模型, 然后xx公司就告诉我老大
		 * 说要这样一个模型, 这样一个顺序, 然后我就来制造
		 */
		CarModelBenz carModelBenz = new CarModelBenz();
		//存放run的顺序
		ArrayList<String> sequence = new ArrayList<String>();
		sequence.add("engine boom"); //按照客户要求, run的时候先发动引擎
		sequence.add("start"); //启动起来
		sequence.add("stop"); //开一段停下来
		carModelBenz.setSequence(sequence);//我们把这个顺序赋予给奔驰车
		carModelBenz.run();
	}
}
