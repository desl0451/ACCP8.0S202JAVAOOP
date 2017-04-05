package Chapter06.Simple07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import Chapter06.Simple02.Dog;

public class Test7 {
	public static void main(String[] args) {
		/* 1.��������������� */
		Dog ououDog = new Dog("ŷŷ", "ѩ����");
		Dog yayaDog = new Dog("����", "��������");
		Dog meimeiDog = new Dog("����", "ѩ����");
		Dog feifeiDog = new Dog("�Ʒ�", "��������");

		Map<String, Dog> dogsMap = new HashMap<String, Dog>();
		dogsMap.put(ououDog.getName(), ououDog);
		dogsMap.put(yayaDog.getName(), yayaDog);
		dogsMap.put(meimeiDog.getName(), meimeiDog);
		dogsMap.put(feifeiDog.getName(), feifeiDog);

		System.out.println("\nIterator���й�������Ϣ����:");
		Set<String> keys = dogsMap.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			Dog dog = (Dog) dogsMap.get(key);
			System.out.println(dog.getName() + "\t" + dog.getStrain());
		}
		System.out.println("\nforeach���й�������Ϣ����:");
		for (String key : keys) {
			Dog dog = (Dog) dogsMap.get(key);
			System.out.println(dog.getName() + "\t" + dog.getStrain());
		}
	}
}
