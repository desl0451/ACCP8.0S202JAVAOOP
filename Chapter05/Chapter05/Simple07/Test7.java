package Chapter05.Simple07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("�����뱻����:");
		try {
			int num1 = in.nextInt();
			System.out.print("���������:");
			int num2 = in.nextInt();
			System.out.println(String.format("%d/%d=%d", num1, num2, num1
					/ num2));
		} catch (InputMismatchException e) {
			System.err.println("�������ͳ���������������");
		} catch (ArithmeticException e) {
			System.err.println("��������Ϊ�㡣");
		} catch (Exception e) {
			System.err.println("����δ֪�쳣��");
		} finally {
			System.out.println("��лʹ�ñ�����!");
		}
	}

}
