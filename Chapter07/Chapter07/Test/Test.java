package Chapter07.Test;

public class Test {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		// start����߳�ͬʱ��������״̬
//		t1.start();
//		t2.start();
		// run�����ǰ�˳��ִ��
		 t1.run();
		 t2.run();
	}
}
