package Chapter03.exercise03;

public final class Bus extends MotoVehicle {
	/**
	 * 座位数
	 */
	private int seatCount;

	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bus(String no, String brand, int seatCount) {
		super(no, brand);
		this.seatCount = seatCount;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	/**
	 * 计算租金
	 */
	@Override
	public int calRent(int days) {
		if (seatCount <= 16) {
			return days * 800;
		} else {
			return days * 1500;
		}
	}

}
