package Chapter03.exercise02;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Master master = new Master("小宝", 1000);
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎您来到宠物店!");
		System.out.print("请选择要领养的宠物类型:(1.狗狗\t2.企鹅):");
		int typeId = input.nextInt();
		Pet pet = master.getPet(typeId);
		if (pet != null) {
			System.out.println("领养成功!");
			master.feed(pet);
			master.play(pet);
		} else {
			System.out.println("对不起,没有此类型的宠物,领养失败");
		}
	}
}
