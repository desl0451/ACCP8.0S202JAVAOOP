package Chapter01.Simple09Error;

class Dog {
	String name = "Œﬁ√˚ œ";
	int health = 100;
	int love = 0;

	public void play(int n) {
		// static int staticVar = 5;
		int staticVar = 5;
		health = health - n;
		System.out.println(name + " " + staticVar + " " + health);
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.play(5);
	}
}