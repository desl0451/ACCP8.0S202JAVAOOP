package Chapter02.Simple07;

import Chapter02.Simple02.Pet;

public class Penguin extends Pet {
	private String sex;// 性别

	public Penguin(String name, String sex) {
		super(name);
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	/**
	 * 重写父类的print()方法
	 */
	public void print() {
		super.print();
		System.out.println("性别是" + this.sex + "。");
	}
}
