package Chapter06.Simple02;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		// 1.����4����������
		Dog ououDog = new Dog("ŷŷ", "ѩ����");
		Dog yayaDog = new Dog("����", "��������");
		Dog meimeiDog = new Dog("����", "ѩ����");
		Dog feifeiDog = new Dog("�Ʒ�", "��������");

		// 2.����ArrayList���϶��󲢰�4�����������������
		List dogs = new ArrayList();
		dogs.add(ououDog);
		dogs.add(yayaDog);
		dogs.add(meimeiDog);
		dogs.add(2, feifeiDog);// ���feifeiDog��ָ��λ��

		// 3.��������й���������
		System.out.println("������" + dogs.size() + "��������");

		// 4.ɾ�������е�һ��������feifeiDog����
		dogs.remove(0);
		dogs.remove(feifeiDog);
		System.out.println("\nɾ��֮����" + dogs.size() + "��������");

		// 5.ͨ������������ʾ����������Ϣ
		System.out.println("�ֱ���:");
		for (int i = 0; i < dogs.size(); i++) {
			Dog dog = (Dog) dogs.get(i);
			System.out.println(dog.getName() + "\t" + dog.getStrain());
		}

		// 6.�жϼ������Ƿ����ָ��������Ϣ
		if (dogs.contains(meimeiDog)) {
			System.out.println("\n�����а�����������Ϣ");
		} else {
			System.out.println("\n�����в�������������Ϣ");
		}
	}

}
