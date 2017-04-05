package Chapter03.Simple06;

public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog("Å·Å·", "Ñ©ÄÉÈğ");
		Penguin pgn = new Penguin("éªéª", "QÃÃ");
		Master master = new Master("ÍõÏÈÉú", 100);
		master.feed(dog);
		master.feed(pgn);
	}
}
