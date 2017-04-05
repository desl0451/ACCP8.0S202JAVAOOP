package Chapter05.exercise03;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class TestLog1 {
	private static Logger logger = Logger.getLogger(TestLog1.class.getName());

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("�����뱻����:");
			int num1 = input.nextInt();
			logger.debug("���뱻����:" + num1);
			System.out.print("���������:");
			int num2 = input.nextInt();
			logger.debug("�������:" + num2);
			System.out.println(String.format("%d/%d=%d", num1, num2, num1
					/ num2));
			logger.debug(String.format("%d/%d=%d", num1, num2, num1 / num2));
		} catch (InputMismatchException e) {
			System.out.println("�������ͳ���������������");
			logger.error(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("��������Ϊ�㡣");
			logger.error(e.getMessage());
		} catch (Exception e) {
			System.out.println("����δ֪�쳣��");
			logger.error(e.getMessage());
		} finally {
			System.out.println("��лʹ�ñ�����!");
		}
	}
}
