package com.mozss.pattern23.design5creational.creational05prototype.sample_02.sample_mail_better;

public class AdTemplate {
	// 广告信名称
	private String adSubject = "xx银行端午活动";
	//广告信内容
	private String adContext = "活动详情: 只要充值够1w,送一盒稻香村粽子!";
	
	//取得广告信的名称
	public String getAdSubject() {
		return this.adSubject;
	}
	
	//取得广告信的内容
	public String getAdContext() {
		return this.adContext;
	}
}
