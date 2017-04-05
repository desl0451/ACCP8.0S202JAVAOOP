package Chapter02.Simple08;

public class Person {
	String name;// 姓名

	public Person() {
		// super();//有没有该语句，效果都一样
		System.out.println("execute Person()");
	}

	public Person(String name) {
		this.name = name;
		System.out.println("execute Person(name)");
	}
}
