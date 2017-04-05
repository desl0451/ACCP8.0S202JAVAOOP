package Chapter07.Simple04;

public class Test {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.run();
		t2.run();
	}
}
