package com.mozss.java_thread_pattern.pattern02_immutable.sample_01;

/**
 * 1.类声明为final,表示无法创建子类,虽不是Immutable模式的必要条件,但可以防止子类修改其字段的值
 * <p>
 * 2.因为字段为final,不设置setter方法,该类的实例被创建之后,其字段不能被修改.
 * <p>
 * 3.字段为final, 也不是Immutable模式的必备, 只是为了明确编程人员的意图. 即使写了赋值代码,在编译的时候也会出错.
 */
public final class Person {
	private final String name;
	private final String address;
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "Person{" +
				       "name='" + name + '\'' +
				       ", address='" + address + '\'' +
				       '}';
	}
}
