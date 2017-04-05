package Chapter01.Simple13;

public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog("Å·Å·", "¿á¿áµÄÑ©ÄÉÈð");
		dog.play();
		System.out.println("½¡¿µÖµÊÇ:" + dog.getHealth());
		dog.eat();
		dog.print();
	}
}
