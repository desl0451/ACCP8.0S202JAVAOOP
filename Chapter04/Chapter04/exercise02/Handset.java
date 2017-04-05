package Chapter04.exercise02;

public abstract class Handset {
	private String brand; // 品牌
	private String type; // 型号

	public abstract void call();

	public abstract void sendInfo();

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void ShowInfo() {
		System.out.println("这是一款型号为" + type + "的" + brand + "手机:");
	}
}
