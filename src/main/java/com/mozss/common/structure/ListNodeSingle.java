package com.mozss.common.structure;

/**
 * 单链表节点
 * @author
 */
public class ListNodeSingle {
	
	public int val;
	/**
	 * next：注意next的定义
	 */
	public ListNodeSingle next;
	
	public ListNodeSingle(int val){
		this.val = val;
	}
	
	public ListNodeSingle(int val, ListNodeSingle next){
		this.val = val;
		this.next = next;
	}
}
