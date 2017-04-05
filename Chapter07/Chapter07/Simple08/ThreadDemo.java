package Chapter07.Simple08;

public class ThreadDemo {
	public static void main(String[] args) {
		System.out.println("Wait");
		Wait.bySec(5);// 让主线程等待5秒再执行
		System.out.println("Start");
	}
}
