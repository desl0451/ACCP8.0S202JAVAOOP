package Chapter05.Simple08;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		try {
			divide();
		} catch (Exception e) {
			System.err.println("���ִ���:�������ͳ���������������������Ϊ��");
			e.printStackTrace();
		}
	}

	public static void divide() throws Exception {
		Scanner in = new Scanner(System.in);
		System.out.print("�����뱻����:");
		int num1 = in.nextInt();
		System.out.print("���������:");
		int num2 = in.nextInt();
		System.out.println(String.format("%d/%d=%d", num1, num2, num1 / num2));
	}
}
