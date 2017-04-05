package Chapter01.exercise02;

public class Dog {
	private String name = "无名氏";
	private int health = 100;
	private int love = 0;
	private String strain = "聪明的拉布拉多犬";

	public Dog() {
	}

	public Dog(String name, String strain) {
		super();
		this.name = name;
		this.strain = strain;
	}

	public Dog(String name, int health, int love, String strain) {
		this.name = name;
		this.health = health;
		this.love = love;
		this.strain = strain;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	public void print() {
		System.out.println("宠物的自白:\n我的名字叫" + this.name + ",健康值是" + this.health
				+ ",和主人的亲密度是" + this.love + ",性别是" + this.strain + "。");
	}
}
