package Chapter03.exercise04;

public class Customer {
	String id;//客户编号
	String name;//客户姓名	
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Customer(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int calcTotalRent(MotoVehicle motos[], int days) {
		int sum = 0;
		for (int i = 0; i < motos.length; i++) {
			sum += motos[i].calRent(days);
		}
		return sum;
	}
}
