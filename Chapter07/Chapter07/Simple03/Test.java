package Chapter07.Simple03;

public class Test {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();
		thread1.start();// ����thread1
		thread2.start();// ����thread2
	}
}
