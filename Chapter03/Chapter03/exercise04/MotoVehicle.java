package Chapter03.exercise04;

public abstract class MotoVehicle {
	/**
	 * 车牌号
	 */
	private String no;
	/**
	 * 品牌
	 */
	private String brand;

	public MotoVehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MotoVehicle(String no, String brand) {
		this.no = no;
		this.brand = brand;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * 计算租金
	 * 
	 * @param days
	 * @return
	 */
	public abstract int calRent(int days);

}
