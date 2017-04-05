package Chapter03.exercise03;

import java.util.Scanner;

public class TestRent {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int days;// 租赁天数
		int totalRent;// 总租赁价
		int money = 0;
		// 客户租赁的多辆汽车信息及租赁天数
		MotoVehicle motos[] = new MotoVehicle[4];
		motos[0] = new Car("京NY28588", "宝马", "550i");
		motos[1] = new Car("京NNN3284", "宝马", "550i");
		motos[2] = new Car("京NT43765", "别克", "林荫大道");
		motos[3] = new Bus("京5643765", "金龙", 34);
		days = 5;
		System.out.println("汽车牌号\t\t汽车品牌");
		for (int i = 0; i < motos.length; i++) {
			System.out.println(motos[i].getNo() + "\t" + motos[i].getBrand());
			money += motos[i].calRent(days);
		}
		String name = "沈伟";
		System.out.println("\n客户名:" + name + ",租赁天数:" + days + ",租凭总费用:"
				+ money);
	}
}
