package Chapter07.Simple07;

public class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "��������:" + i);
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread(), "�߳�A");
		Thread t2 = new Thread(new MyThread(), "�߳�B");
		// �����̵߳����ȼ�
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		// �����̵߳����ȼ�
		System.out.println("�߳�A�����ȼ�:" + t1.getPriority());
		System.out.println("�߳�B�����ȼ�:" + t2.getPriority());
		System.out.println("*********************************");
		t1.start();
		t2.start();
	}
}