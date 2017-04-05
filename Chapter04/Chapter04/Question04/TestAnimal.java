package Chapter04.Question04;

public class TestAnimal {
	public static void main(String[] args) {
		Pig pig = new Pig();
		String strAnimal = "pig";
		Animal animal = Store.get(strAnimal);
		animal.shout();
	}
}
