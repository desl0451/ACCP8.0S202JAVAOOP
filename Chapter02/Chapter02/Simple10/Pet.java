package Chapter02.Simple10;

public abstract class Pet {
	private String name = "无名氏";
	private int health = 100;
	private int love = 0;

	public Pet(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println("宠物的自白:\n我的名字叫" + this.name + ",健康值是" + this.health
				+ ",和主人的亲密度是" + this.love + "。");
	}
}
