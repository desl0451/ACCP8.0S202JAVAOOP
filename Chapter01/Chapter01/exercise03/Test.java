package Chapter01.exercise03;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎您来到宠物店!");
		// 1.输入宠物名称
		System.out.print("请输入要领养宠物的名字:");
		String name = input.next();
		// 2.选择宠物类型
		System.out.print("请选择要领养的宠物类型:(1、狗狗 2、企鹅)");
		switch (input.nextInt()) {
		case 1:
			// 2.1如果狗狗,选择狗狗品种
			System.out.println("请选择狗狗的品种:(1、聪明的拉布拉多犬 2、酷酷的雪纳瑞犬)");
			String strain = null;
			if (input.nextInt() == 1) {
				strain = "聪明的拉布拉多犬";
			} else {
				strain = "酷酷的雪纳瑞犬";
			}
			// 创建狗狗对象并赋值
			Dog dog = new Dog(name, strain);
			dog.print();
			break;
		case 2:
			// 2.2如果是企鹅,选择企鹅性别
			System.out.print("请选择企鹅的性别:(1、雄 2、雌)");
			String sex = null;
			if (input.nextInt() == 1) {
				sex = Penguin.SEX_MALE;
			} else {
				sex = Penguin.SEX_FEMALE;
			}
			//创建企鹅对象并赋值
			//自定义一个有参数构造，系统就不在默认分配无参数构造，使用无参数构造时，必须手动添加无参数构造的定义
			Penguin pgn = new Penguin(name, sex);
			pgn.print();
			break;
		default:
			break;
		}
	}
}
