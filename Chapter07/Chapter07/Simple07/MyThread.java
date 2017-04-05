package Chapter07.Simple07;

public class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "正在运行:" + i);
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread(), "线程A");
		Thread t2 = new Thread(new MyThread(), "线程B");
		// 设置线程的优先级
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		// 设置线程的优先级
		System.out.println("线程A的优先级:" + t1.getPriority());
		System.out.println("线程B的优先级:" + t2.getPriority());
		System.out.println("*********************************");
		t1.start();
		t2.start();
	}
}
