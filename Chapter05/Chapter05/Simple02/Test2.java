package Chapter05.Simple02;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("�����뱻����:");
		int num1 = 0;
		if (in.hasNextInt()) {
			num1 = in.nextInt();
		} else {
			System.err.println("����ı�������������,�����˳���");
			System.exit(1);// ��������ִ��
		}
		System.out.print("���������:");
		int num2 = 0;
		if (in.hasNext()) {
			num2 = in.nextInt();
			if (num2 == 0) {
				System.out.println("����ĳ�����0,�����˳���");
				System.exit(1);
			}
		} else {
			System.out.println("����ĳ�����������,�����˳���");
			System.exit(1);
		}
		System.out.println(String.format("%d/%d=%d", num1, num2, num1 / num2));
		System.out.println("��лʹ�ñ�����!");
	}

}
