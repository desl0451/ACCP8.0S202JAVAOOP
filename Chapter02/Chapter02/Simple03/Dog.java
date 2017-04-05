package Chapter02.Simple03;

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
}
