package Chapter02.Simple12;

public abstract class Pet {
	private String name = "ÎŞÃûÊÏ";
	private int health = 100;
	private int love = 0;

	public Pet(String name) {
		this.name = name;
	}

	public abstract void print();

}
