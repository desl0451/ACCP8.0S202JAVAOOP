package Chapter07.Simple09;

public class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);// �����߳̽���ִ�еļ���
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "����:" + i);
		}
	}
}
