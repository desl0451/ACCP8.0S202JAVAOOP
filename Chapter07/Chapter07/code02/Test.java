package Chapter07.code02;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("线程实现输出100以内偶数:");
		System.out.println("1.Thread方法实现  2.Runnable方法实现");
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
