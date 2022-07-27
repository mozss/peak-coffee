package com.mozss.pattern23.design7structural.structural04proxy.sample;

/**
 * <pre>
 * 这里的after和before方法只是举例
 * 一个代理类可以代理多个委托者或被代理这, 因此一个代理类具体代理哪个真实主题角色,是由场景决定的.
 * 当然, 最简单的情况剧场一个主题类和一个代理类, 这是最简洁的代理模式.
 * 通常情况下, 一个接口只需要一个代理类就可以了, 具体代理哪个实现类由高层模块来决定, 也就是在代理类
 * 的构造函数中传递被代理者, 例如我们可以在代理类中加入如下构造函数:
 * public Proxy(Subject _subject){
 *     this.subject = _subject;
 * }</pre>
 */
public class SubjectImplProxy implements Subject {
	
	/**
	 * 要代理哪个实现类
	 */
	private Subject subject = null;
	
	/**
	 * 默认被代理者
	 */
	public SubjectImplProxy() {
		this.subject = new SubjectImplProxy();
	}
	
	/**
	 * 通过构造函数传递代理者
	 *
	 * @param objects
	 */
	public SubjectImplProxy(Object... objects) {
	}
	
	/**
	 * 实现接口中定义的方法
	 */
	@Override
	public void request() {
		this.before();
		this.subject.request();
		this.after();
	}
	
	//预处理
	private void before() {
		//do something
	}
	
	//善后处理
	private void after() {
		//do something
	}
}
