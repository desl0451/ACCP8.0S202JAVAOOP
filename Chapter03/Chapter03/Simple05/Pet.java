package Chapter03.Simple05;

/**
 * 宠物类,狗狗和企鹅的父类
 */
public abstract class Pet {
	protected String name = "无名氏";// 昵称
	protected int health = 100;// 健康值
	protected int love = 0;// 亲密度

	public Pet() {

	}

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

	/**
	 * 抽象方法eat(),负责宠物吃饭功能
	 */
	public abstract void eat();
}
