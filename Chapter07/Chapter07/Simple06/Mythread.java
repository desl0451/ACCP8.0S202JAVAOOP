package Chapter07.Simple06;

public class Mythread implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println("�߳�t������!");
			Thread.sleep(500);
			System.out.println("�߳�t��500�������ߺ���������!");
		} catch (Exception e) {
			System.out.println("�̱߳��ж�");
		}
	}

	public static void main(String[] args) {
		Thread t = new Thread(new Mythread());
		System.out.println("�߳�tΪ�½�!");
		t.start();
		System.out.println("�߳�tΪ����!");
	}
}
