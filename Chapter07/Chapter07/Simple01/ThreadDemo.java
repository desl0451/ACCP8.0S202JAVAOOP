package Chapter07.Simple01;

public class ThreadDemo {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("��ǰ�߳���:" + t.getName());
		t.setName("MyJavaThread");
		System.out.println("��ǰ�߳�����:" + t.getName());
	}
}
