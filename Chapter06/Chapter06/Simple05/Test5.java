package Chapter06.Simple05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import Chapter06.Simple02.Dog;

public class Test5 {
	public static void main(String[] args) {
		Map dogMap = new HashMap();
		// 1.创建4个狗狗对象
		Dog ououDog = new Dog("欧欧", "雪纳瑞");
		Dog yayaDog = new Dog("亚亚", "拉布拉多");
		Dog meimeiDog = new Dog("美美", "雪纳瑞");
		Dog feifeiDog = new Dog("菲菲", "拉布拉多");

		dogMap.put(ououDog.getName(), ououDog);
		dogMap.put(yayaDog.getName(), yayaDog);
		dogMap.put(meimeiDog.getName(), meimeiDog);
		dogMap.put(feifeiDog.getName(), feifeiDog);
		System.out.println("使用Iterator遍历所有狗狗的昵称和品种分别是:");
		Set keys = dogMap.keySet();
		Iterator it = keys.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			Dog dog = (Dog) dogMap.get(key);
			System.out.println(key + "\t" + dog.getStrain());
		}
	}
}
