package com.mozss.algorithms.common;

/**
 * 单链表节点
 *
 * @author
 */
public class ListNodeSingle {
	
	public int val;
	
	/**
	 * <pre>注意next的定义, 但是这里该怎么理解呢?
	 *
	 * next相当于ListNodeSingle.java类内部声明的变量, 也是ListNodeSingle类型的.
	 * 如其他类创建了ListNodeSingle.java的实例a, 实例a中自然也包括了next变量.
	 * 实例a是ListNodeSingle类型的, 同样next变量也是ListNodeSingle类型的.
	 * 相当于ListNodeSingle类型中包含了ListNodeSingle类型.
	 *
	 * 这样声明链表结构的Node很是巧妙, 同样树结构的Node也是这样定义的</pre>
	 */
	public ListNodeSingle next;  //引用类型
	
	public ListNodeSingle(int val) {
		this.val = val;
	}
	
	public ListNodeSingle(int val, ListNodeSingle next) {
		this.val = val;
		this.next = next;
	}
}
