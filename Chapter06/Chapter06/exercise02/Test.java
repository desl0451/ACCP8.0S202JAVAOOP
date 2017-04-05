package Chapter06.exercise02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Chapter06.Simple02.Dog;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Map hashMap = new HashMap();
		// 1.创建4个狗狗对象
		Dog ououDog = new Dog("欧欧", "雪纳瑞");
		Dog yayaDog = new Dog("亚亚", "拉布拉多");
		Dog meimeiDog = new Dog("美美", "雪纳瑞");
		Dog feifeiDog = new Dog("菲菲", "拉布拉多");

		hashMap.put(ououDog.getName(), ououDog);
		hashMap.put(yayaDog.getName(), yayaDog);
		hashMap.put(meimeiDog.getName(), meimeiDog);
		hashMap.put(feifeiDog.getName(), feifeiDog);

		System.out.println("宠物数量:" + hashMap.size());
		System.out.print("请输入要查找的宠物昵称:");
		String name = input.next();

		if (hashMap.containsKey(name)) {
			Dog dog = (Dog) hashMap.get(name);
			dog.print();
		} else {
			System.out.println("Map中不存在该对象。");
		}
	}
}
