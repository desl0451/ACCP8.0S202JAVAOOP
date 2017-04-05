package Chapter03.exercise01;

public class Test {
	public static void main(String[] args) {

		Dog dog = new Dog("欧欧", "拉布拉多犬");
		Cat cat = new Cat("小白", "Q仔");
		Penguin pgn = new Penguin("楠楠", "Q妹");
		Master master = new Master("小宝", 100);
		dog.print();
		master.feed(dog);
		cat.print();
		master.feed(cat);
		pgn.print();
		master.feed(pgn);
	}
}
