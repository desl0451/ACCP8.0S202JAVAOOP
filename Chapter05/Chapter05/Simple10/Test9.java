package Chapter05.Simple10;

public class Test9 {

	public static void main(String[] args) {
		Person person = new Person();
		try {
			// person.setSex("Male");
			person.setSex("ÄÐ");

			person.print();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
