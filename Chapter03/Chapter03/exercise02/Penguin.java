package Chapter03.exercise02;

public class Penguin extends Pet {
	private String sex;

	@Override
	public void print() {
		super.print();
		System.out.println("性别是" + this.sex + "。");
	}

	public Penguin(String name, String sex) {
		super(name);
		this.sex = sex;
	}

	@Override
	public void eat() {
		super.health = super.health + 5;
		System.out.println("企鹅" + super.name + "吃饱啦!健康值增加5。");
	}

	public void swimming() {
		System.out.println("主人和企鹅玩游泳游戏");
		super.health = super.health - 10;
		super.love = super.love + 5;
	}
}
