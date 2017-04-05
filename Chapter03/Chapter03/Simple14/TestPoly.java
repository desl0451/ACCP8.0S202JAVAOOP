package Chapter03.Simple14;

import java.util.Scanner;

public class TestPoly {
	public static void main(String[] args) {
		Pet pet = new Dog("Å·Å·", "Ñ©ÄÉÈð");
		pet.eat();
		// pet.catchingFlyDisc();
		Dog dog = (Dog) pet;
		dog.catchingFlyDisc();
		Penguin pgn = (Penguin) pet;
		pgn.swimming();
	}
}
