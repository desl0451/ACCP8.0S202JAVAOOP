package cn.soso.entity;

import cn.soso.service.CallService;
import cn.soso.service.NetService;
import cn.soso.service.SendService;

/**
 * 超人套餐
 */
public class SuperPackage extends ServicePackage implements CallService,
		SendService, NetService {
	public int talkTime;
	public int smsCount;

	public int flow;

	public SuperPackage() {
		this.talkTime = 200;// 通话时长(分钟)
		this.smsCount = 50; // 短信条数
		this.flow = 1024; // 流量
		this.price = 78; // 资费(元/月)
	}

	@Override
	public void showInfo() {
		System.out.println("超人套餐:通话时长为" + this.talkTime + "分钟/月,短信条数为"
				+ this.smsCount + "条/月,上网流量为" + this.flow / 1024 + "GB/月。");
	}

	public int call(int minCount, MobileCard card) {
		return 0;
	}

	public int send(int count, MobileCard card) {
		return 0;
	}

	public int netPlay(int flow, MobileCard card) {
		return 0;
	}

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

	public int getFlow() {
		return flow;
	}

	public void setFlow(int flow) {
		this.flow = flow;
	}

}
