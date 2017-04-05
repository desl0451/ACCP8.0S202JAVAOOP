package cn.soso.entity;

import cn.soso.service.CallService;
import cn.soso.service.SendService;

/**
 * �����ײ�
 */
public class TalkPackage extends ServicePackage implements CallService,
		SendService {
	/**
	 * ͨ��ʱ��(����)
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
	 * ��������(��)
	 */
	public int smsCount;

	public TalkPackage() {
		this.talkTime = 500;// ͨ��ʱ��(����)
		this.smsCount = 30; // ��������
		this.price = 58; // �ʷ�(Ԫ/��)
	}

	@Override
	public void showInfo() {
		System.out.println("�����ײ�:ͨ��ʱ��Ϊ" + this.talkTime + "����/��,��������Ϊ"
				+ this.smsCount + "��/��");
	}

	public int call(int minCount, MobileCard card) {
		return 0;
	}

	public int send(int count, MobileCard card) {
		return 0;
	}
}
