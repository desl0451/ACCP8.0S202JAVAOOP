package Chapter06.Simple06;

import java.util.ArrayList;
import java.util.List;

import Chapter06.Simple02.Dog;

public class Test6 {

	public static void main(String[] args) {
		/* 1.��������������� */
		Dog ououDog = new Dog("ŷŷ", "ѩ����");
		Dog yayaDog = new Dog("����", "��������");
		Dog meimeiDog = new Dog("����", "ѩ����");
		Dog feifeiDog = new Dog("�Ʒ�", "��������");

		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(ououDog);
		dogs.add(yayaDog);
		dogs.add(meimeiDog);
		dogs.add(2, feifeiDog);

		// 3.��ʾ������Ԫ�ص���Ϣ
		Dog dog3 = dogs.get(2);
		System.out.println("��������������Ϣ����:");
		System.out.println(dog3.getName() + "\t" + dog3.getStrain());
		/* 4.ʹ��foreach������dogs���� */
		System.out.println("\n���й�������Ϣ����:");
		for (Dog dog : dogs) {
			System.out.println(dog.getName() + "\t" + dog.getStrain());
		}
	}
}
