package cn.soso.entity;

import cn.soso.service.NetService;

/**
 * �����ײ�
 */
public class NetPackage extends ServicePackage implements NetService {
	/**
	 * ����
	 */
	public int flow;

	public int getFlow() {
		return flow;
	}

	public void setFlow(int flow) {
		this.flow = flow;
	}

	public NetPackage() {
		this.flow = 1024 * 3;
		this.price = 68;
	}

	@Override
	public void showInfo() {
		System.out.println("�����ײ�:��������(GB)" + this.flow / 1024 + "GB/�¡�");
	}

	public int netPlay(int flow, MobileCard card) {
		return 0;
	}
}
