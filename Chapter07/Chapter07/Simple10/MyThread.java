package Chapter07.Simple10;

public class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "��������:" + i);
			if (i == 3) {
				System.out.println("�߳�����:");
				Thread.yield();
			}
		}
	}
}
