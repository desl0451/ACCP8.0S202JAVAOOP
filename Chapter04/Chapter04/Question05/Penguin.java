package Chapter04.Question05;

public class Penguin extends Pet implements Swimmable, Eatable {
	private String sex;// 性别

	public Penguin(String name, String sex) {
		super(name);
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public void print() {
		System.out.println("宠物的自白:\n我的名字叫" + this.name + ",我的健康值是"
				+ this.health + ",我和主人的亲密程度是" + this.love + "。");

		System.out.println("性别是:" + this.sex + "。");
	}

	@Override
	public void eat() {
		super.health = super.health + 5;
		System.out.println("企鹅" + super.name + "吃饱啦!健康值增加5。");
	}

	public void swimming() {
		System.out.println("企鹅" + super.name + "正在游泳。");
		super.health = super.health - 10;
		super.love = super.love + 5;
	}
}
