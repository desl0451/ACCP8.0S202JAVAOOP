package Chapter03.exercise02;

public abstract class Pet {
	protected String name = "无名氏";// 昵称
	protected int health = 100;// 健康值
	protected int love = 0;// 亲密度

	public Pet() {
		super();
	}

	public Pet(String name) {
		super();
		this.name = name;
	}

	public Pet(String name, int health, int love) {
		super();
		this.name = name;
		this.health = health;
		this.love = love;
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

	/**
	 * 输出宠物信息
	 */
	public void print() {
		System.out.println("宠物的自白:\n我的名字叫" + this.name + ",健康值是" + this.health
				+ ",和主人的亲密度是" + this.love + "。");
	}

	/**
	 * 抽象方法eat(),负责宠物吃饭功能
	 */
	public abstract void eat();

}
