package com.mozss.datastructure.hash;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 题目: No- 706 设计哈希映射
 * 知识点:
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 描述:
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
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
public class MyHashMap {
	
	//使用Pair实现配对
	private class Pair{
		private int key;
		private int value;
		
		public Pair(int key, int value){
			this.key = key;
			this.value = value;
		}
		
		public int getKey(){
			return key;
		}
		
		public int getValue(){
			return value;
		}
		
		public void setValue(int value){
			this.value = value;
		}
	}
	
	/**
	 * 定义BASE 和 data
	 * */
	private static final int BASE = 769;
	private LinkedList[] data;
	
	/**
	 * 初始化数据结构
	 */
	public MyHashMap(){
		data = new LinkedList[BASE];
		for (int i = 0; i < BASE; i++) {
			data[i] = new LinkedList<Pair>();
		}
	}
	
	private static int hash(int key){
		return key % BASE;
	}
	
	public void put(int key,int value){
		int h = hash(key);
		Iterator<Pair> iterator = data[h].iterator();
		while (iterator.hasNext()){
			Pair pair = iterator.next();
			if(pair.getKey() == key){
				pair.setValue(value);
				return;
			}
		}
		data[h].offerLast(new Pair(key,value));
	}
	
	public int get(int key){
		int h = hash(key);
		Iterator<Pair> iterator = data[h].iterator();
		while (iterator.hasNext()){
			Pair pair = iterator.next();
			if(pair.getKey() == key){
				return pair.value;
			}
		}
		return -1;
	}
	
	public void remove(int key){
		int h = hash(key);
		Iterator<Pair> iterator = data[h].iterator();
		while (iterator.hasNext()){
			Pair pair = iterator.next();
			if (pair.key == key){
				data[h].remove(pair);
				return;
			}
		}
	}
}
