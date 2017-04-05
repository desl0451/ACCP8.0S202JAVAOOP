package Chapter02.Simple04;

import Chapter02.Simple02.Pet;

public class Penguin extends Pet {
	private String sex;// ÐÔ±ð

	public Penguin(String name, String sex) {
		super(name);
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
}
