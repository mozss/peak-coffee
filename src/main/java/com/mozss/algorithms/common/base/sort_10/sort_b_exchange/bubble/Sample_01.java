package com.mozss.algorithms.common.base.sort_10.sort_b_exchange.bubble;

public class Sample_01 {
	public static int[] sort(int[] array){
		//这里for循环表示总共需要比较多少轮
		for(int i = 1 ; i < array.length; i++){
			//设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已经完成。
			boolean flag = true;
			//这里for循环表示每轮比较参与的元素下标
			//对当前无序区间array[0......length-i]进行排序
			//j的范围很关键，这个范围是在逐步缩小的,因为每轮比较都会将最大的放在右边
			for(int j = 0 ; j < array.length-i ; j++){
				if(array[j]>array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					flag = false;
				}
			}
			if(flag){
				break;
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		int[] tobeSorted = {12, 2, 34, 8, 6, 11, 3, 18};
		tobeSorted = sort(tobeSorted);
		for (int i = 0; i < tobeSorted.length; i++) {
			System.out.print(tobeSorted[i]+" ");
		}
	}
}

