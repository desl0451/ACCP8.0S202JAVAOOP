package Chapter01.Simple03;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 1.输入宠物名称
		System.out.println("请输入要领养宠物的名字:");
		String name = input.next();
		// 2.选择宠物的类型
		System.out.println("请选择要领养的宠物类型:(1.狗狗 2.企鹅）");
		switch (input.nextInt()) {
		case 1:
			// 2.1如果是狗狗,选择狗狗品种
			System.out.println("请选择狗狗的品种:(1、聪明的拉布拉多犬 2、酷酷的雪纳瑞犬)");
			String strain = null;
			if (input.nextInt() == 1) {
				strain = "聪明的拉布拉多犬";
			} else {
				strain = "酷酷的雪纳瑞犬";
			}
			// 创建狗狗对象并赋值
			Dog dog = new Dog();
			dog.name = name;
			dog.strain = strain;
			// 狗出狗狗信息
			dog.print();
			break;
		case 2:
			// 2.2如果是企鹅，选择企鹅性别
			System.out.println("请选择企鹅的性别:(1、Q仔 2、Q妹）");
			String sex = null;
			if (input.nextInt() == 1) {
				sex = "Q仔";
			} else {
				sex = "Q妹";
			}
			// 创建企鹅对象并赋值
			Penguin pgn = new Penguin();
			pgn.name = name;
			pgn.sex = sex;
			// 输出企鹅信息
			pgn.print();
			break;
		default:
			break;
		}
	}

}
