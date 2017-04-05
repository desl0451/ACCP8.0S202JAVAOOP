package Chapter05.exercise03;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class TestLog1 {
	private static Logger logger = Logger.getLogger(TestLog1.class.getName());

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("请输入被除数:");
			int num1 = input.nextInt();
			logger.debug("输入被除数:" + num1);
			System.out.print("请输入除数:");
			int num2 = input.nextInt();
			logger.debug("输入除数:" + num2);
			System.out.println(String.format("%d/%d=%d", num1, num2, num1
					/ num2));
			logger.debug(String.format("%d/%d=%d", num1, num2, num1 / num2));
		} catch (InputMismatchException e) {
			System.out.println("被除数和除数必须是整数。");
			logger.error(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("除数不能为零。");
			logger.error(e.getMessage());
		} catch (Exception e) {
			System.out.println("其他未知异常。");
			logger.error(e.getMessage());
		} finally {
			System.out.println("感谢使用本程序!");
		}
	}
}
