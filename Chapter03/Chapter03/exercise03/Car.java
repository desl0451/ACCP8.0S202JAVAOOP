package Chapter03.exercise03;

public final class Car extends MotoVehicle {
	/**
	 * ÐÍºÅ
	 */
	private String type;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String no, String brand, String type) {
		super(no, brand);
		this.type = type;
	}


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int calRent(int days) {
		if (type.equals("1")) {// ±¦Âí55i
			return days * 500;
		} else if (type.equals("2")) {// ±¦Âí55i
			return days * 600;
		} else {
			return days * 300;
		}
	}
}
