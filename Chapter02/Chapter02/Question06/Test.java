package Chapter02.Question06;

public class Test {
	public static void main(String[] args) {
		Chook luhuaji = new Chook("à¸à¸", "Â«»¨¼¦");
		luhuaji.showInfo();
		luhuaji.eat("³æ×Ó");
		luhuaji.ding();
		System.out.println("--------------------");
		Duck banzuiya = new Duck("¸Â¸Â", "°ß×ìÑ¼");
		banzuiya.showInfo();
		banzuiya.eat("Ð¡ÓãÏº");
		banzuiya.swimming();
	}
}
