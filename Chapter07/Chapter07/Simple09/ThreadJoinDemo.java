package Chapter07.Simple09;

public class ThreadJoinDemo {
	public static void main(String[] args) {
		System.out.println("***********�߳�ǿ��ִ��************");
		// �������̲߳�����
		Thread temp = new Thread(new MyThread());
		temp.start();
		for (int i = 0; i < 20; i++) {
			if (i == 5) {
				try {
					// �������߳�,���߳�ǿ��ִ��
					temp.join();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "����:" + i);
		}
	}
}
