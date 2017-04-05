package Chapter01.Question05;

public class Student2 {
	private String name;
	private int age;
	private String sex;
	private String subject; // 专业

	/**
	 * 自我介绍
	 */
	public void ShowInfo() {
		System.out.println("自我介绍");
		System.out.println("姓名:" + this.getName() + "年龄:" + this.getAge());
		System.out.println("性别" + this.getSex() + "专业:" + this.getSubject());

	}

	public Student2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.sex = "男";
		this.subject = "ACCP";
	}

	public Student2(String name, int age, String sex, String subject) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}
