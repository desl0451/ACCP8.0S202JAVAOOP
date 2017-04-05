package Chapter04.Question05;

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

	public abstract void print();

}
