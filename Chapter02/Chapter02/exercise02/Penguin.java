package Chapter02.exercise02;

public class Penguin extends Pet {
	private String sex;

	public String getSex() {
		return sex;
	}

	public Penguin(String name, String sex) {
		super(name);
		this.sex = sex;
	}

	public Penguin(String name, int health, int love, String sex) {
		super(name, health, love);
		this.sex = sex;
	}

	public Penguin() {
		super();
	}

	public void print() {
		super.print();
		System.out.println("企鹅的性别" + this.sex);
	}
}
