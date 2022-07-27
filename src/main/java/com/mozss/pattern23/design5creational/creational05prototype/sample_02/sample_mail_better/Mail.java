package com.mozss.pattern23.design5creational.creational05prototype.sample_02.sample_mail_better;

public class Mail implements Cloneable {
	//收件人
	private String receiver;
	//邮件名称
	private String subject;
	//称谓
	private String appellation;
	//邮件内容
	private String contxt;
	//邮件的尾部, 一般都是"xxx版权所有"等相关签名
	private String tail;
	
	//构造函数
	public Mail(AdTemplate adTemplate) {
		this.contxt = adTemplate.getAdContext();
		this.subject = adTemplate.getAdSubject();
	}
	
	@Override
	public Mail clone() {
		Mail mail = null;
		try {
			mail = (Mail) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mail;
	}
	//以下为getter/setter方法
	
	public String getReceiver() {
		return receiver;
	}
	
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getAppellation() {
		return appellation;
	}
	
	public void setAppellation(String appellation) {
		this.appellation = appellation;
	}
	
	public String getContxt() {
		return contxt;
	}
	
	public void setContxt(String contxt) {
		this.contxt = contxt;
	}
	
	public String getTail() {
		return tail;
	}
	
	public void setTail(String tail) {
		this.tail = tail;
	}
}
