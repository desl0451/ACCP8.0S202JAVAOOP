package cn.soso.entity;

import cn.soso.service.NetService;

/**
 * 网虫套餐
 */
public class NetPackage extends ServicePackage implements NetService {
	/**
	 * 流量
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
		System.out.println("网虫套餐:上网流量(GB)" + this.flow / 1024 + "GB/月。");
	}

	public int netPlay(int flow, MobileCard card) {
		return 0;
	}
}
