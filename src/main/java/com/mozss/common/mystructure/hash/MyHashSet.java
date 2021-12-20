package com.mozss.common.mystructure.hash;

import java.util.Iterator;
import java.util.LinkedList;
import java.lang.Integer;

/*
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 题目: No-705 设计一个哈希集合(HashSet)
 * 知识点:
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 描述:
 *      Your MyHashSet object will be instantiated and called as such:
 *          MyHashSet obj = new MyHashSet();
 *          obj.add(key);
 *          obj.remove(key);
 *          boolean param_3 = obj.contains(key);
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * eg 1>:
 * Input:
 * Output:
 * 说明:
 *
 * eg 2>:
 * Input:
 * Output:
 * 说明:
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 思路:
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 */
public class MyHashSet {
	//这是使用链地址法解决冲突
	
	private static final int BASE = 769;
	private LinkedList[] data;
	
	/**
	 * 初始化数据结构
	 */
	public MyHashSet(){
		data = new LinkedList[BASE];
		for (int i = 0; i < BASE; i++) {
			data[i] = new LinkedList<Integer>();
		}
	}
	
	/**
	 * 定义Hash算法
	 * @param key
	 * @return
	 */
	private static int hash(int key){
		return key % BASE;
	}
	/**
	 * @param key
	 */
	public void add(int key){
		int h = hash(key);
		Iterator<Integer> iterator = data[h].iterator();
		while (iterator.hasNext()){
			Integer element = iterator.next();
			if(element == key){
				return;
			}
		}
		data[h].offerLast(key);
	}
	
	public void remove(int key){
		int h = hash(key);
		Iterator<Integer> iterator = data[h].iterator();
		while (iterator.hasNext()){
			Integer element = iterator.next();
			if (element == key){
				data[h].remove(element);
				return;
			}
		}
	}
	
	public boolean contains(int key){
		int h = hash(key);
		Iterator<Integer> iterator = data[h].iterator();
		while(iterator.hasNext()){
			Integer element = iterator.next();
			if(element == key){
				return true;
			}
		}
		return false;
	}
}
