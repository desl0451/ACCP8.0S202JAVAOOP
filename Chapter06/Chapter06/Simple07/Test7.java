package Chapter06.Simple07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import Chapter06.Simple02.Dog;

public class Test7 {
	public static void main(String[] args) {
		/* 1.创建多个狗狗对象 */
		Dog ououDog = new Dog("欧欧", "雪纳瑞");
		Dog yayaDog = new Dog("亚亚", "拉布拉多");
		Dog meimeiDog = new Dog("美美", "雪纳瑞");
		Dog feifeiDog = new Dog("菲菲", "拉布拉多");

		Map<String, Dog> dogsMap = new HashMap<String, Dog>();
		dogsMap.put(ououDog.getName(), ououDog);
		dogsMap.put(yayaDog.getName(), yayaDog);
		dogsMap.put(meimeiDog.getName(), meimeiDog);
		dogsMap.put(feifeiDog.getName(), feifeiDog);

		System.out.println("\nIterator所有狗狗的信息如下:");
		Set<String> keys = dogsMap.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			Dog dog = (Dog) dogsMap.get(key);
			System.out.println(dog.getName() + "\t" + dog.getStrain());
		}
		System.out.println("\nforeach所有狗狗的信息如下:");
		for (String key : keys) {
			Dog dog = (Dog) dogsMap.get(key);
			System.out.println(dog.getName() + "\t" + dog.getStrain());
		}
	}
}
