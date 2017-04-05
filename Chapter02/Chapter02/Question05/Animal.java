package Chapter02.Question05;

public abstract class Animal {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal(int age) {
		super();
		this.age = age;
	}

	public abstract void info();
}
