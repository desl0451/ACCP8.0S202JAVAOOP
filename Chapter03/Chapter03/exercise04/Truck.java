package Chapter03.exercise04;

public class Truck extends MotoVehicle {
	private int tonnage;

	public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Truck(String no, String brand, int tonnage) {
		super(no, brand);
		this.tonnage = tonnage;
	}

	@Override
	public int calRent(int days) {
		return tonnage * 50 * days;// tonnage´ú±í¶ÖÎ»
	}

}
