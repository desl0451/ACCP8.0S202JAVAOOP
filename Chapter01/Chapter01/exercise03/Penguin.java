package Chapter01.exercise03;

/**
 * 宠物企鹅类，使用静态常量。
 */
public class Penguin {
	String name = "无名氏"; // 昵称
	int health = 100; // 健康值
	int love = 20; // 亲密度
	// static final String SEX_MALE ="Q仔";
	// static final String SEX_FEMALE="Q妹";
	static final String SEX_MALE = "雄";
	static final String SEX_FEMALE = "雌";
	String sex = ""; // 性别

	/**
	 * 无参数构造： 
	 * 1）方法名与类同名 
	 * 2）没有返回值 
	 * 3）与返回的修饰符无关 
	 * 作用：给成员属性默认赋予初始值
	 */
	public Penguin() {
		name = "无名氏";
		health = 100;
		love = 10;

	}
	 /**
     * 注意:参数变量和成员变量同名，必须使用this给成员变量指定 
     *  this本类中的对象 
     * @param name
     * @param health
     * @param love
     * @param sex
     */
	public Penguin(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}

	/**
	 * 输出企鹅的信息。
	 */
	public void print() {
		System.out.println("宠物的自白：\n我的名字叫" + this.name + "，健康值是" + this.health
				+ "，和主人的亲密度是" + this.love + "，性别是 " + this.sex + "。");
	}
}
