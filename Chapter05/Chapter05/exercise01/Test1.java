package Chapter05.exercise01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1:C#\t2:Java���\t3:SQL����");
		try {
			System.out.print("������γ̴���:");
			int i = input.nextInt();
			switch (i) {
			case 1:
				System.out.println("C#���");
				break;
			case 2:
				System.out.println("Java���");
				break;
			case 3:
				System.out.println("SQL����");
				break;
			default:
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println("�γ̴��ű���������!");
		} catch (Exception e) {
			System.out.println("����δ֪�쳣!");
		} finally {
			System.out.println("��лʹ�ñ�����!");
		}
	}
}
