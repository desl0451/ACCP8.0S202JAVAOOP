package Chapter07.exercise01;

public class Mythread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(i + ".���,�����߳�"
					+ Thread.currentThread().getName());
		}
	}
}
