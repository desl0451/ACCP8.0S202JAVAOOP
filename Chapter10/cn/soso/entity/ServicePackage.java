package cn.soso.entity;

public abstract class ServicePackage {
	/**
	 * �ʷ�
	 */
	public double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public abstract void showInfo();
}
