package Chapter02.exercise02;

public class Pet {
	private String name = "无名氏";// 昵称
	private int health = 100;// 健康值
	private int love = 0;// 亲密度

	public Pet() {
		
	}

	public Pet(String name) {
		super();
		this.name = name;
	}

	public Pet(String name, int health, int love) {
		this.name = name;
		this.health = health;
		this.love = love;
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public int getLove() {
		return love;
	}

	public void print() {
		System.out.println("宠物的自白:\n我的名字叫" + this.name + ",健康值是" + this.health
				+ ",和主人的亲密度是" + this.love + "。");
	}
}
