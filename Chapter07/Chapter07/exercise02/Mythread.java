package Chapter07.exercise02;

public class Mythread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(i + ".���,�����߳�"
					+ Thread.currentThread().getName());
		}
	}
}
