package com.mozss.common.structure;

/**
 * 双链表节点
 * @author
 */
public class ListNodeDouble {
	
	/**
	 * 不同于单链表 这里需要两个指针
	 * 注意 prev 和 next 的定义
	 */
	public int val;
	public ListNodeDouble prev;
	public ListNodeDouble next;
	
	public ListNodeDouble(int val){
		this.val = val;
	}
}
