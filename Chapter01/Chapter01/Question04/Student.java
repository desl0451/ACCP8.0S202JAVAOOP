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
			System.out.println("���䲻��С��16��");
		} else {
			this.age = age;
		}
	}

	public void showInfo() {
		System.out.println("���ҽ���");
		System.out.println("����:" + this.getName() + "\t����" + this.getAge());
	}
}
