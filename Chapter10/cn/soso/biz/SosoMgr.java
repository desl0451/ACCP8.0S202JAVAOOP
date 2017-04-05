package cn.soso.biz;

import java.util.Scanner;

import cn.soso.entity.MobileCard;
import cn.soso.entity.ServicePackage;
import cn.soso.utils.CardUtil;

public class SosoMgr {
	private Scanner input = new Scanner(System.in);
	private CardUtil cardUtil = new CardUtil();
	private String searchNumber = "";

	/**
	 * #登录菜单
	 */
	public void mainMenu() {
		cardUtil.init();
		cardUtil.initScenes();
		boolean isBack = true;
		do {
			System.out
					.println("******************欢迎使用搜搜移动业务大厅********************");
			System.out.println("1.用户登录  2.用户注册 3.使用嗖嗖 4.话费充值 5.资费说明 6.退出系统");
			System.out.print("请选择:");
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("用户登录");
				System.out.print("请输入手机卡号:");
				String number = input.next();
				System.out.print("请输入密码:");
				String password = input.next();
				boolean bl = cardUtil.isExistCard(number, password);
				if (bl == true) {
					System.out.println("登录成功!");
					isBack = false;
					searchNumber = number;
					cardMenu();
				} else {
					System.out.println("登录失败!请重新登录");
				}
				break;
			case 2:
				System.out.println("用户注册");
				registCard();
				break;
			case 3:
				System.out.println("使用嗖嗖");
				break;
			case 4:
				System.out.println("话费充值");
				break;
			case 5:
				System.out.println("资费说明");
				break;
			case 6:
				System.out.println("退出系统");
				System.exit(1);
				break;
			default:
				System.out.println("输入错误");
				break;
			}
		} while (isBack);
	}

	/**
	 * 二级菜单
	 */
	public void cardMenu() {
		do {
			System.out.println("************嗖嗖移动用户菜单**************");
			System.out.println("1.本月账单查询");
			System.out.println("2.套餐余量查询");
			System.out.println("3.打印消费详单");
			System.out.println("4.套餐变更");
			System.out.println("5.办理退网 ");
			System.out.print("请选择(输入1-5选择功能,其他键返回上一级):");
			int i = input.nextInt();
			switch (i) {
			case 1:
				System.out.println("\n*****本月账单查询*****");
				cardUtil.showAmountDetail(searchNumber);
				continue;
			case 2:
				System.out.println("\n*****套餐余量查询*****");
				cardUtil.showRemainDetail(searchNumber);
				continue;
			case 3:
				System.out.println("3.打印消费详单");
				cardUtil.printConsumInfo(searchNumber);
				continue;
			case 4:
				System.out.println("4.套餐变更");
				continue;
			case 5:
				System.out.println("5.办理退网 ");
				System.exit(1); // 办理退网后退出系统
			}
			break;
		} while (true);
	}

	/**
	 * #用户注册流程
	 */
	public void registCard() {
		System.out.println("*****可选择的卡号*****");
		String[] numbers = cardUtil.getNewNumbers(9);
		for (int i = 1; i <= numbers.length; i++) {
			System.out.print(i + "." + numbers[i - 1] + "\t");
			if (i % 3 == 0 && i > 0) {
				System.out.println("");
			}
		}
		MobileCard mCard = new MobileCard();
		System.out.print("请选择卡号(输入1-9的序号):");
		int i = input.nextInt();
		mCard.cardNumber = numbers[i - 1];// 保存卡号
		System.out.print("1.话唠套餐  2.网虫套餐  3.超人套餐,请选择套餐(输入序号):");
		int packId = input.nextInt();
		ServicePackage serPackage = cardUtil.createPack(packId);
		mCard.serPackage = serPackage;
		System.out.print("请输入姓名:");
		mCard.userName = input.next();
		System.out.print("请输入密码:");
		mCard.passWord = input.next();
		System.out.print("请输入预存话费金额:");
		double money = input.nextDouble();
		while (money < serPackage.getPrice()) {
			System.out.print("您预存的话费金额不足以支付本月固定套餐资费，请重新充值：");
			money = input.nextDouble();
		}
		// 创建新卡
		mCard.money = money;
		cardUtil.addCard(mCard);

	}

	public static void main(String[] args) {
		SosoMgr soso = new SosoMgr();
		soso.mainMenu();
		System.out.println("谢谢使用！");
	}
}
