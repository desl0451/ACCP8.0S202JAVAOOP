package Chapter05.Simple02;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("请输入被除数:");
		int num1 = 0;
		if (in.hasNextInt()) {
			num1 = in.nextInt();
		} else {
			System.err.println("输入的被除数不是整数,程序退出。");
			System.exit(1);// 结束程序执行
		}
		System.out.print("请输入除数:");
		int num2 = 0;
		if (in.hasNext()) {
			num2 = in.nextInt();
			if (num2 == 0) {
				System.out.println("输入的除数是0,程序退出。");
				System.exit(1);
			}
		} else {
			System.out.println("输入的除数不是整数,程序退出。");
			System.exit(1);
		}
		System.out.println(String.format("%d/%d=%d", num1, num2, num1 / num2));
		System.out.println("感谢使用本程序!");
	}

}
