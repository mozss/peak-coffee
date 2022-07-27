package com.mozss.java_thread_pattern.pattern01_single_threaded_execution.sample_01_unsafe;

/**
 * 门： 它会在人们通过门的时候记录其姓名与出生地
 */
public class Gate {
	//已经通过的人数
	private int counter = 0;
	//最后一个通行者的“姓名”
	private String name = "Nodody";
	//最后一个通行者的出生地
	private String address = "Nowhere";
	
	/**
	 * 表示通过门
	 *
	 * @param myname
	 * @param myaddress
	 */
	public void pass(String myname, String myaddress) {
		this.counter++;
		this.name = name;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.address = address;
		check();
	}
	
	/**
	 * 用于检查门的当前状态（最后一个通行者的记录数据是否正确）：如果姓名和出生地的首字母不同，说明记录数据是异常的。
	 * 如果出错，使用toString方法显示门的状态
	 */
	private void check() {
		if (name.charAt(0) != address.charAt(0)) {
			System.out.println("****** 这里出错了******" + toString());
		}
	}
	
	@Override
	public String toString() {
		return "Gate{" +
				       "counter=" + counter +
				       ", name='" + name + '\'' +
				       ", address='" + address + '\'' +
				       '}';
	}
}
