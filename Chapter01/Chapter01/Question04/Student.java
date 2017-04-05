package Chapter01.Question04;

public class Student {
	private String name;
	private int age;

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
		if (age < 16) {
			System.out.println("年龄不能小于16岁");
		} else {
			this.age = age;
		}
	}

	public void showInfo() {
		System.out.println("自我介绍");
		System.out.println("姓名:" + this.getName() + "\t年龄" + this.getAge());
	}
}
