package Chapter05.Simple04;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("�����뱻����:");
		try {
			int num1 = in.nextInt();
			System.out.print("���������:");
			int num2 = in.nextInt();
			System.out.println(String.format("%d / %d =%d", num1, num2, num1
					/ num2));
		} catch (Exception e) {
			System.err.println("���ִ���:�������ͳ�������������,��������Ϊ��");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("��лʹ�ñ�����!");
		}
	}

}
