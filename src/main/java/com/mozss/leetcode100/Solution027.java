package com.mozss.leetcode100;

/*
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 题目: No-027 移除元素
 * 知识点:
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * 描述:
 *      给定一个nums和一个值val, 原地移除所有数值等于val的元素,并返回移除后数组的新长度
 *      不使用额外的数组空间,使用o(1)额外空间并原地修改输入数组
 *      元素的顺序可以改变, 无须考虑数组中超出新长度后面的元素。
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
public class Solution027 {
	
	/**
	 * 使用同方向的双指针
	 * @param nums
	 * @param val
	 * @return
	 */
	public int removeElement(int[] nums,int val){
		int left = 0;
		for (int right = 0; right < nums.length; right++) {
			if(nums[right] != val){
				nums[left] = nums[right];
				left++;
			}
		}
		return left;
	}
	
	/**
	 * 使用向对方向的双指针
	 * 核心思想是:
	 *  同时从集合两头遍历,目标元素只固定往一边存放（比如左边）,
	 *  两个指针相遇时,元素将遍历完毕。需要的目标元素也都“放置”在某一边。
	 * @param nums
	 * @param val
	 * @return
	 */
	public int removeElement_02(int[] nums,int val){
		int left = 0;
		int right = nums.length;
		while (left < right){
			if(nums[left] == val){
				nums[left] = nums[right -1];
				right--;
			} else{
				left ++;
			}
		}
		return left;
	}
}
