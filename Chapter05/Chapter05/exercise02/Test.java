package Chapter05.exercise02;

public class Test {
	public static void main(String[] args) {
		try {
			Person person = new Person();
			person.setAge(-3);
			person.setSex("Male");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
