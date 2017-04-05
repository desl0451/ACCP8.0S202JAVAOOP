package Chapter03.Question06;

public class Friend {
	private String nationality; // ¹ú¼®
	private String name; // ÐÕÃû

	public Friend(String nationality, String name) {
		super();
		this.nationality = nationality;
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void eat(String food) {
		System.out.println("³Ô" + food + "¡£");
	}
}
