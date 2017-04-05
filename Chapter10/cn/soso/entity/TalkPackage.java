package cn.soso.entity;

import cn.soso.service.CallService;
import cn.soso.service.SendService;

/**
 * 话唠套餐
 */
public class TalkPackage extends ServicePackage implements CallService,
		SendService {
	/**
	 * 通话时长(分钟)
	 */
	public int talkTime;

	public int getTalkTime() {
		return talkTime;
	}

	public void setTalkTime(int talkTime) {
		this.talkTime = talkTime;
	}

	public int getSmsCount() {
		return smsCount;
	}

	public void setSmsCount(int smsCount) {
		this.smsCount = smsCount;
	}

	/**
	 * 短信条数(条)
	 */
	public int smsCount;

	public TalkPackage() {
		this.talkTime = 500;// 通话时长(分钟)
		this.smsCount = 30; // 短信条数
		this.price = 58; // 资费(元/月)
	}

	@Override
	public void showInfo() {
		System.out.println("话唠套餐:通话时长为" + this.talkTime + "分钟/月,短信条数为"
				+ this.smsCount + "条/月");
	}

	public int call(int minCount, MobileCard card) {
		return 0;
	}

	public int send(int count, MobileCard card) {
		return 0;
	}
}
