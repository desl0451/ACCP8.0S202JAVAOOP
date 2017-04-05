package Chapter05.exercise01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1:C#\t2:Java编程\t3:SQL基础");
		try {
			System.out.print("请输入课程代号:");
			int i = input.nextInt();
			switch (i) {
			case 1:
				System.out.println("C#编程");
				break;
			case 2:
				System.out.println("Java编程");
				break;
			case 3:
				System.out.println("SQL基础");
				break;
			default:
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println("课程代号必须是数字!");
		} catch (Exception e) {
			System.out.println("其它未知异常!");
		} finally {
			System.out.println("感谢使用本程序!");
		}
	}
}
