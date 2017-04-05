package Chapter05.Simple10;

public class Person {
	private String name = ""; // 姓名
	private int age = 0; // 年龄
	private String sex = "男";// 性别

	public void setSex(String sex) throws Exception {
		if (sex.equals("男") || sex.equals("女")) {
			this.sex = sex;
		} else {
			throw new Exception("性别必须是\"男\"或者\"女\"!");
		}
	}

	public void print() {
		System.out.println(this.name + "(" + this.sex + "," + this.age + "岁)");
	}

}
