package Chapter02.Simple06;

public class Test {
	public static void main(String[] args) {
		// 1.创建宠物对象Pet并输出信息
		Pet pet = new Pet("贝贝");
		pet.print();
		System.out.println("======================================");
		// 2.创建狗狗对象dog并输出信息
		Dog dog = new Dog("欧欧", "雪纳瑞");
		dog.print();
		System.out.println("======================================");
		// 3.创建企鹅对象pgn并输出信息
		Penguin pgn = new Penguin("楠楠", "Q妹");
		pgn.print();
	}
}
