package com.mozss.pattern23.design5creational.creational05prototype.sample_03;

import java.io.*;

public class Prototype_02 implements Cloneable, Serializable {
	
	private static final long serialVersionUID = 1L;
	private String string;
	private SerializableObbject obj;
	
	/**
	 * 浅拷贝
	 *
	 * @return
	 * @throws CloneNotSupportedException
	 */
	public Object clone() throws CloneNotSupportedException {
		Prototype_02 prototype_02 = (Prototype_02) super.clone();
		return prototype_02;
	}
	
	
	/**
	 * 深拷贝
	 * <p>
	 * 需要采用流的形式读入当前对象的二进制输入, 在写出二进制数据对应的对象.
	 *
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public Object deepClone() throws IOException, ClassNotFoundException {
		//写入当前对象的二进制流
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		//读出二进制流产生的新对象
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}
	
	public String getString() {
		return string;
	}
	
	public void setString(String string) {
		this.string = string;
	}
	
	public SerializableObbject getObj() {
		return obj;
	}
	
	public void setObj(SerializableObbject obj) {
		this.obj = obj;
	}
}
















