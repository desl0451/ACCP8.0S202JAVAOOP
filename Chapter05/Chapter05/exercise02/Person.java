package Chapter05.exercise02;

public class Person {
	private String name = "";// 姓名
	private int age = 0;// 年龄
	private String sex = "男"; // 性别

	public void setAge(int age) throws Exception {
		if (age < 1 || age > 100) {
			throw new Exception("年龄必须在1到100之间!");
		} else {
			this.age = age;
		}
	}

	public void setSex(String sex) throws Exception {
		if (sex.equals("男") || sex.equals("女")) {
			this.sex = sex;
		} else {
			throw new Exception("性别必须是\"男\"或者\"女\"!");
		}
	}

}
