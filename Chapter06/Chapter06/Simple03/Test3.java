package Chapter06.Simple03;

import java.util.LinkedList;

import Chapter06.Simple02.Dog;

public class Test3 {
	public static void main(String[] args) {
		// 1.创建4个狗狗对象
		Dog ououDog = new Dog("欧欧", "雪纳瑞");
		Dog yayaDog = new Dog("亚亚", "拉布拉多");
		Dog meimeiDog = new Dog("美美", "雪纳瑞");
		Dog feifeiDog = new Dog("菲菲", "拉布拉多");

		// 2.创建LinkedList集合对象并把多个狗狗对象放入其中
		LinkedList dogs = new LinkedList();
		dogs.add(ououDog);
		dogs.add(yayaDog);
		dogs.addLast(meimeiDog);
		dogs.addFirst(feifeiDog);

		// 3.查看集合中第一条狗狗的昵称
		Dog dogFirst = (Dog) dogs.getFirst();
		System.out.println("第一条狗狗的昵称是" + dogFirst.getName() + "。");

		// 4.查看集合中最后一条狗狗的昵称
		Dog dogLast = (Dog) dogs.getLast();
		System.out.println("最后一条狗狗的昵称是" + dogLast.getName() + "。");

		// 5.删除集合中第一条狗狗和最后一条狗狗
		dogs.removeFirst();
		dogs.removeLast();

		// 6.显示删除部分狗狗后集合中各条狗狗信息
		System.out.println("\n删除部分狗狗后还有" + dogs.size() + "条狗狗。");
		System.out.println("分别是:");
		for (int i = 0; i < dogs.size(); i++) {
			Dog dog = (Dog) dogs.get(i);
			System.out.println(dog.getName() + "\t" + dog.getStrain());
		}
	}
}
