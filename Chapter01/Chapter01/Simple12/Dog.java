package Chapter01.Simple12;

class Dog {
	private String name = "无名氏";
	private int health = 100;
	private int love = 0;
	private String strain = "聪明的拉布拉多犬";

	public Dog(String name, int health) {
		this.name = name;
		this.health = health;
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
		if (health > 100 || health < 0) {
			this.health = 40;
			System.out.println("健康值应该在0和100之间,默认值是40");
		} else {
			this.health = health;
		}
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

	public void eat() {
		if (health >= 100) {
			System.out.println("狗狗需要多运动呀!");
		} else {
			health = health + 3;
			System.out.println("狗狗吃饱饭了!");
		}
	}

	public void play() {
		if (health < 60) {
			System.out.println("狗狗生病了!");
		} else {
			System.out.println("狗狗正在和主人玩耍。");
			health = health - 10;
			love = love + 5;
		}
	}
	
}