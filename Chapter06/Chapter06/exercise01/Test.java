package Chapter06.exercise01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Chapter06.Simple02.Dog;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 1���������������
		Penguin ououPenguin = new Penguin("ŷŷ", "Q��");
		Penguin yayaPenguin = new Penguin("����", "Q��");
		Penguin meimeiPenguin = new Penguin("����", "Q��");
		Penguin feifeiPenguin = new Penguin("�Ʒ�", "Q��");

		// 2������ArrayList���϶��󲢰Ѷ���������������
		List penList = new ArrayList();
		penList.add(ououPenguin);
		penList.add(yayaPenguin);
		penList.add(meimeiPenguin);
		penList.add(2, feifeiPenguin); // ���feifeiPenguin��ָ��λ��

		// 3�������������������
		System.out.println("������" + penList.size() + "ֻ��졣");

		// 4��ͨ������������ʾ��ֻ�����Ϣ
		System.out.println("�ֱ��ǣ�");
		for (int i = 0; i < penList.size(); i++) {
			Penguin dog = (Penguin) penList.get(i);
			System.out.println(dog.getName() + "\t" + dog.getSex());
		}

		// 5��ɾ�������е�һ������feifeiPenguin���
		penList.remove(penList.size() - 1);
		penList.remove(feifeiPenguin);

		// 6����ʾɾ���󼯺��и�ֻ�����Ϣ
		System.out.println("\nɾ��֮����" + penList.size() + "ֻ��졣");
		System.out.println("�ֱ��ǣ�");
		for (int i = 0; i < penList.size(); i++) {
			Penguin dog = (Penguin) penList.get(i);
			System.out.println(dog.getName() + "\t" + dog.getSex());
		}
		// 7���жϼ������Ƿ����ָ�������Ϣ
		if (penList.contains(meimeiPenguin))
			System.out.println("\n�����а�����������Ϣ");
		else
			System.out.println("\n�����в�������������Ϣ");
	}
}
