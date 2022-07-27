package com.mozss.pattern23.design7structural.structural07flyweight.sample;

/**
 * <pre>
 * 抽象享元对象: 一般为抽象类
 * 在实际项目中, 一般是一个实现类, 它是描述一类事物的方法.
 * 在抽象角色中, 一般需要把外部状态和内部状态(可以没有内部状态,只有行为也是可以的)定义出来,
 * 避免子类的随意扩展</pre>
 */
public abstract class Flyweight {
	//外部状态, 公有属性
	protected final String Extrinsic;
	//内部状态
	private String intrinsic;
	
	//要求享元角色必须接受外部状态
	protected Flyweight(String _Extrinsic) {
		this.Extrinsic = _Extrinsic;
	}
	
	//定义业务操作
	public abstract void operate();
	
	//内部状态的getter/setter
	public String getIntrinsic() {
		return intrinsic;
	}
	
	public void setIntrinsic(String intrinsic) {
		this.intrinsic = intrinsic;
	}
	
}
