package Chapter05.Simple14;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Test12 {
	private static Logger logger = Logger.getLogger(Test12.class.getName());

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			System.out.print("�����뱻����:");
			int num1 = in.nextInt();
			logger.debug("���뱻����:" + num1);
			System.out.print("���������:");
			int num2 = in.nextInt();
			logger.debug("�������:" + num2);
			System.out.println(String.format("%d / %d =%d", num1, num2, num1
					/ num2));
			logger.debug("���������:"
					+ String.format("%d/%d=%d", num1, num2, num1 / num2));
		} catch (InputMismatchException e) {
			logger.error("�������ͳ�������������", e);
		} catch (ArithmeticException e) {
			logger.error(e.getMessage());
		} catch (Exception e) {
			logger.error(e.getMessage());
		} finally {
			System.out.println("��ӭʹ�ñ�����!");
		}
	}
}
