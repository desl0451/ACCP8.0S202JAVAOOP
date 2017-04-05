package Chapter04.Question04;

public class Store {
	public static Animal get(String choice) {
		if (choice.equalsIgnoreCase("dog")) {
			return new Dog();
		} else if (choice.equalsIgnoreCase("pig")) {
			return new Pig();
		} else {
			return new Cat();
		}
	}
}
