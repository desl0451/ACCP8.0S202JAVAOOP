package Chapter06.Simple03;

import java.util.LinkedList;

import Chapter06.Simple02.Dog;

public class Test3 {
	public static void main(String[] args) {
		// 1.����4����������
		Dog ououDog = new Dog("ŷŷ", "ѩ����");
		Dog yayaDog = new Dog("����", "��������");
		Dog meimeiDog = new Dog("����", "ѩ����");
		Dog feifeiDog = new Dog("�Ʒ�", "��������");

		// 2.����LinkedList���϶��󲢰Ѷ�����������������
		LinkedList dogs = new LinkedList();
		dogs.add(ououDog);
		dogs.add(yayaDog);
		dogs.addLast(meimeiDog);
		dogs.addFirst(feifeiDog);

		// 3.�鿴�����е�һ���������ǳ�
		Dog dogFirst = (Dog) dogs.getFirst();
		System.out.println("��һ���������ǳ���" + dogFirst.getName() + "��");

		// 4.�鿴���������һ���������ǳ�
		Dog dogLast = (Dog) dogs.getLast();
		System.out.println("���һ���������ǳ���" + dogLast.getName() + "��");

		// 5.ɾ�������е�һ�����������һ������
		dogs.removeFirst();
		dogs.removeLast();

		// 6.��ʾɾ�����ֹ����󼯺��и���������Ϣ
		System.out.println("\nɾ�����ֹ�������" + dogs.size() + "��������");
		System.out.println("�ֱ���:");
		for (int i = 0; i < dogs.size(); i++) {
			Dog dog = (Dog) dogs.get(i);
			System.out.println(dog.getName() + "\t" + dog.getStrain());
		}
	}
}
