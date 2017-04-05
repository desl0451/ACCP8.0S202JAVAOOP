package Chapter01.Simple01;

public class Dog {
	String name = "无名氏";// 昵称
	int health = 100; // 健康值
	int love = 0; // 亲密度
	String strain = "聪明的拉布拉多犬";// 品种

	public void print() {
		System.out.println("宠物的自白:\n我的名字叫" + this.name + ",健康值是" + this.health
				+ ",和主人的亲密度是" + this.love + ",我是一只" + this.strain + "。");
	}
}
