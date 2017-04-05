package Chapter01.Simple05;

public class Penguin {
	String name = "无名氏";
	int health = 100;
	int love = 0;
	final String SEX_MALE = "Q仔";
	final String SEX_FEMALE = "Q妹";
	String sex = SEX_MALE;// 性别

	public void print() {
		System.out.println("宠物的自白:\n我的名字叫" + this.name + ",健康值是" + this.health
				+ ",和主人的亲密度是" + this.love + ",性别是" + this.sex + "。");
	}
}
