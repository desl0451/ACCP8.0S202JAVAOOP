package Chapter02.exercise01;

public class Dog extends Pet {
	private String strain;

	public String getStrain() {
		return strain;
	}

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, String strain) {
		super(name);
		this.strain = strain;
	}

	public Dog(String name, int health, int love, String strain) {
		super(name, health, love);
		this.strain = strain;
	}
	@Override
	public void print() {
		System.out.println("宠物的自白:\n我的名字叫" + this.getName() + ",健康值是"
				+ this.getHealth() + ",和主人的亲密度是" + this.getLove() + "。");
		System.out.println("狗狗的品种" + this.getStrain());
	}
}
