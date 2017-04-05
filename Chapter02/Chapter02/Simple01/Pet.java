package Chapter02.Simple01;

public class Pet {
	private String name = "无名氏";// 昵称
	private int health = 100;// 健康值
	private int love = 0;// 亲密度

	/**
	 * 无参构造方法
	 */
	public Pet() {
		this.health = 95;
		System.out.println("执行宠物的无参构造方法。");
	}
	/**
	 * 有参构造方法
	 * @param name
	 */
	public Pet(String name) {
		this.name = name;
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

	public void print() {
		System.out.println("宠物的自白:\n我的名字叫" + this.name + ",我的健康值是"
				+ this.health + ",我和主人的亲密程度是" + this.love + "。");
	}
}
