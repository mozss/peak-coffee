package com.mozss.pattern23.design7structural.structural07flyweight.sample_03;

/**
 * <pre>
 * 为什么定义子类, 并定义key的属性呢? 为什么不在SignInfo添加呢?
 * </pre>
 */
public class SignInfo4Pool extends SignInfo {
	//定义一个对象池提取的KEY值
	private String key;
	
	//构造函数获得相同标志
	public SignInfo4Pool(String _key) {
		this.key = _key;
	}
	
	public String getKey() {
		return key;
	}
	
	public void setKey(String key) {
		this.key = key;
	}
}
