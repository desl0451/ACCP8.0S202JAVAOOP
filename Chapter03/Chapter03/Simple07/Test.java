package Chapter03.Simple07;

public class Test {
	public static void main(String[] args) {
		Master master = new Master("ÍõÏÈÉú", 100);
		Pet dog = new Dog("Å·Å·", "Ñ©ÄÉÈğ");
		Pet pgn = new Penguin("éªéª", "QÃÃ");
		master.feed(dog);
		master.feed(pgn);
	}
}
