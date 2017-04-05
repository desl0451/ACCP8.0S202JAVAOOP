package Chapter07.Simple10;

public class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "正在运行:" + i);
			if (i == 3) {
				System.out.println("线程礼让:");
				Thread.yield();
			}
		}
	}
}
