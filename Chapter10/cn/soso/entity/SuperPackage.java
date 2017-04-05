package cn.soso.entity;

import cn.soso.service.CallService;
import cn.soso.service.NetService;
import cn.soso.service.SendService;

/**
 * �����ײ�
 */
public class SuperPackage extends ServicePackage implements CallService,
		SendService, NetService {
	public int talkTime;
	public int smsCount;

	public int flow;

	public SuperPackage() {
		this.talkTime = 200;// ͨ��ʱ��(����)
		this.smsCount = 50; // ��������
		this.flow = 1024; // ����
		this.price = 78; // �ʷ�(Ԫ/��)
	}

	@Override
	public void showInfo() {
		System.out.println("�����ײ�:ͨ��ʱ��Ϊ" + this.talkTime + "����/��,��������Ϊ"
				+ this.smsCount + "��/��,��������Ϊ" + this.flow / 1024 + "GB/�¡�");
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
