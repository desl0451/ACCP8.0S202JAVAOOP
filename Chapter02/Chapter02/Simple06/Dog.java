package Chapter02.Simple06;

public class Dog extends Pet {
	private String strain;// 品种

	/**
	 * 有参构造方法
	 * 
	 * @param name昵称
	 * @param strain品种
	 *            　
	 */
	public Dog(String name, String strain) {
		super(name);
		this.strain = strain;
	}

	public String getStrain() {
		return strain;
	}

	/**
	 * 重写父类的print()方法
	 */
	public void print() {
		super.print();// 调用父类的print()方法
		System.out.println("我是一只" + this.strain + "。");
	}
}
