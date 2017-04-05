package Chapter03.Simple15;

import java.util.Scanner;

public class TestPoly2 {
	public static void main(String[] args) {
		Pet pet = new Penguin("éªéª", "QÃÃ");
		pet.eat();
		if (pet instanceof Dog) {
			Dog dog = (Dog) pet;
			dog.catchingFlyDisc();
		} else if (pet instanceof Penguin) {
			Penguin pgn = (Penguin) pet;
			pgn.swimming();
		}
	}
}
