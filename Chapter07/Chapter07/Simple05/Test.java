package Chapter07.Simple05;

public class Test {
	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread myThread = new Thread(myRunnable);
		myThread.start();
	}
}
