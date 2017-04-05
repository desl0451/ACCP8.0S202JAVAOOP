package Chapter04.Question05;

public class Dog extends Pet implements Eatable, FlyingDiscCatchable {
	private String strain;// 品种

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, String strain) {
		super(name);
		this.strain = strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	public String getStrain() {
		return strain;
	}

	/**
	 * 重写父类的print()方法
	 */
	@Override
	public void print() {
		System.out.println("宠物的自白:\n我的名字叫" + this.name + ",我的健康值是"
				+ this.health + ",我和主人的亲密程度是" + this.love + "。");
		System.out.println("我是一只" + this.strain + "。");
	}

	/**
	 * 实现狗狗吃饭的方法
	 */
	@Override
	public void eat() {
		super.health = super.health + 3;
		System.out.println("狗狗" + super.name + "吃饱啦!健康值增加3.");
	}

	public void catchingFlyDisc() {
		System.out.println("狗狗" + super.name + "正在接飞盘。");
		super.health = super.health - 10;
		super.love = super.love + 5;
	}
}
