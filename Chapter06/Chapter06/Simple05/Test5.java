package Chapter06.Simple05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import Chapter06.Simple02.Dog;

public class Test5 {
	public static void main(String[] args) {
		Map dogMap = new HashMap();
		// 1.����4����������
		Dog ououDog = new Dog("ŷŷ", "ѩ����");
		Dog yayaDog = new Dog("����", "��������");
		Dog meimeiDog = new Dog("����", "ѩ����");
		Dog feifeiDog = new Dog("�Ʒ�", "��������");

		dogMap.put(ououDog.getName(), ououDog);
		dogMap.put(yayaDog.getName(), yayaDog);
		dogMap.put(meimeiDog.getName(), meimeiDog);
		dogMap.put(feifeiDog.getName(), feifeiDog);
		System.out.println("ʹ��Iterator�������й������ǳƺ�Ʒ�ֱַ���:");
		Set keys = dogMap.keySet();
		Iterator it = keys.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			Dog dog = (Dog) dogMap.get(key);
			System.out.println(key + "\t" + dog.getStrain());
		}
	}
}
