package Chapter06.exercise02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Chapter06.Simple02.Dog;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Map hashMap = new HashMap();
		// 1.����4����������
		Dog ououDog = new Dog("ŷŷ", "ѩ����");
		Dog yayaDog = new Dog("����", "��������");
		Dog meimeiDog = new Dog("����", "ѩ����");
		Dog feifeiDog = new Dog("�Ʒ�", "��������");

		hashMap.put(ououDog.getName(), ououDog);
		hashMap.put(yayaDog.getName(), yayaDog);
		hashMap.put(meimeiDog.getName(), meimeiDog);
		hashMap.put(feifeiDog.getName(), feifeiDog);

		System.out.println("��������:" + hashMap.size());
		System.out.print("������Ҫ���ҵĳ����ǳ�:");
		String name = input.next();

		if (hashMap.containsKey(name)) {
			Dog dog = (Dog) hashMap.get(name);
			dog.print();
		} else {
			System.out.println("Map�в����ڸö���");
		}
	}
}
