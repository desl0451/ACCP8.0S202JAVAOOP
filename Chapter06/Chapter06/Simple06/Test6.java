package Chapter06.Simple06;

import java.util.ArrayList;
import java.util.List;

import Chapter06.Simple02.Dog;

public class Test6 {

	public static void main(String[] args) {
		/* 1.创建多个狗狗对象 */
		Dog ououDog = new Dog("欧欧", "雪纳瑞");
		Dog yayaDog = new Dog("亚亚", "拉布拉多");
		Dog meimeiDog = new Dog("美美", "雪纳瑞");
		Dog feifeiDog = new Dog("菲菲", "拉布拉多");

		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(ououDog);
		dogs.add(yayaDog);
		dogs.add(meimeiDog);
		dogs.add(2, feifeiDog);

		// 3.显示第三个元素的信息
		Dog dog3 = dogs.get(2);
		System.out.println("第三个狗狗的信息如下:");
		System.out.println(dog3.getName() + "\t" + dog3.getStrain());
		/* 4.使用foreach语句遍历dogs对象 */
		System.out.println("\n所有狗狗的信息如下:");
		for (Dog dog : dogs) {
			System.out.println(dog.getName() + "\t" + dog.getStrain());
		}
	}
}
