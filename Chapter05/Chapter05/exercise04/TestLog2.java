package Chapter05.exercise04;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class TestLog2 {
	private static Logger logger = Logger.getLogger(TestLog2.class.getName());

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			System.out.print("�����뱻����:");
			int num1 = in.nextInt();
			System.out.print("���������:");
			int num2 = in.nextInt();
			System.out.println(String.format("%d / %d = %d", num1, num2, num1
					/ num2));
			logger.info(String.format("%d / %d = %d", num1, num2, num1 / num2));
		} catch (InputMismatchException e) {
			logger.error("�������ͳ���������������");
		} catch (ArithmeticException e) {
			logger.warn("��������Ϊ�㡣");
		} catch (Exception e) {
			logger.error("�����쳣", e);
		} finally {
			System.out.println("��лʹ�ñ�����");
		}
	}
}
