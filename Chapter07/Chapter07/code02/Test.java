package Chapter07.code02;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�߳�ʵ�����100����ż��:");
		System.out.println("1.Thread����ʵ��  2.Runnable����ʵ��");
		int i = input.nextInt();
		switch (i) {
		case 1:
			MyThread t = new MyThread();
			t.start();
			break;
		case 2:
			MyRunnable r = new MyRunnable();
			Thread tr = new Thread(r);
			tr.run();
		default:
			break;
		}
	}

}
