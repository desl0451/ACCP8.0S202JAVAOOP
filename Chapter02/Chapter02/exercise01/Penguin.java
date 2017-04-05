package Chapter02.exercise01;

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

	@Override
	public void print() {
		System.out.println("宠物的自白:\n我的名字叫" + this.getName() + ",健康值是"
				+ this.getHealth() + ",和主人的亲密度是" + this.getLove() + "。");
		System.out.println("企鹅的性别" + this.getSex());
	}
}
