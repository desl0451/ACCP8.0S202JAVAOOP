package Chapter07.code02;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println("Å¼Êý:" + i);
			}
		}
	}

}
