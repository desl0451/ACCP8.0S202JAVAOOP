package Chapter02.Simple08;

public class Student extends Person {
	String school;// ѧУ

	public Student() {
		System.out.println("execute Student()");
	}

	public Student(String name, String school) {
		super(name);
		this.school = school;
		System.out.println("execute Student(name,school)");
	}
}
