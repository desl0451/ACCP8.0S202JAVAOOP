package Chapter02.exercise03;

import java.util.Scanner;

public class TestRent {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String No = "";// 车牌
		int rent = 0;// 租金
		System.out.println("欢迎无情为到汽车租赁公司!");
		System.out.print("请输入要租赁的天数:");
		int days = input.nextInt();
		System.out.print("请输入要租赁的汽车类型(1.轿车  2.客车):");
		String type = input.next();
		if (type.equals("1")) {
			System.out.print("请输入要租赁的汽车品牌(1.宝马  2.别克):");
			String carBrand = input.next();
			No = "京BK5543";
			if (carBrand.equals("1")) {
				System.out.println("您选择的车型是:宝马550i");
			} else {
				System.out.print("请输入轿车的型号  2.商务舱GL8  3.林荫大道:");
				carBrand = input.next();
				if (carBrand.equals("2")) {
					System.out.println("您选择的车型是:商务舱GL8");
				} else {
					System.out.println("您选择的车型是:林荫大道");
				}
			}
			System.out.println("分配给您的汽车牌号是:" + No);
			Car car = new Car(No, type, carBrand);
			rent = car.calRent(days);

		} else {
			System.out.print("请输入你要租赁的品牌(1.金杯   2.金龙):");
			String busBrand = input.next();
			System.out.print("请输入客车的座位数:");
			int seatCount = input.nextInt();
			if (busBrand.equals("1")) {
				System.out.println("您选择的车型是:金杯");
			} else {
				System.out.println("您选择的车型是:金龙");
			}
			No = "京AU8769";
			System.out.println("分配给您的汽车牌号是:" + No);
			Bus bus = new Bus(No, busBrand, seatCount);
			rent = bus.calRent(days);
		}
		System.out.println("\n顾客您好!您需要支付的租赁费用是" + rent + ".");
	}
}
