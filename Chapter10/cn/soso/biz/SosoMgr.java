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
	 * #��¼�˵�
	 */
	public void mainMenu() {
		cardUtil.init();
		cardUtil.initScenes();
		boolean isBack = true;
		do {
			System.out
					.println("******************��ӭʹ�������ƶ�ҵ�����********************");
			System.out.println("1.�û���¼  2.�û�ע�� 3.ʹ���� 4.���ѳ�ֵ 5.�ʷ�˵�� 6.�˳�ϵͳ");
			System.out.print("��ѡ��:");
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("�û���¼");
				System.out.print("�������ֻ�����:");
				String number = input.next();
				System.out.print("����������:");
				String password = input.next();
				boolean bl = cardUtil.isExistCard(number, password);
				if (bl == true) {
					System.out.println("��¼�ɹ�!");
					isBack = false;
					searchNumber = number;
					cardMenu();
				} else {
					System.out.println("��¼ʧ��!�����µ�¼");
				}
				break;
			case 2:
				System.out.println("�û�ע��");
				registCard();
				break;
			case 3:
				System.out.println("ʹ����");
				break;
			case 4:
				System.out.println("���ѳ�ֵ");
				break;
			case 5:
				System.out.println("�ʷ�˵��");
				break;
			case 6:
				System.out.println("�˳�ϵͳ");
				System.exit(1);
				break;
			default:
				System.out.println("�������");
				break;
			}
		} while (isBack);
	}

	/**
	 * �����˵�
	 */
	public void cardMenu() {
		do {
			System.out.println("************���ƶ��û��˵�**************");
			System.out.println("1.�����˵���ѯ");
			System.out.println("2.�ײ�������ѯ");
			System.out.println("3.��ӡ�����굥");
			System.out.println("4.�ײͱ��");
			System.out.println("5.�������� ");
			System.out.print("��ѡ��(����1-5ѡ����,������������һ��):");
			int i = input.nextInt();
			switch (i) {
			case 1:
				System.out.println("\n*****�����˵���ѯ*****");
				cardUtil.showAmountDetail(searchNumber);
				continue;
			case 2:
				System.out.println("\n*****�ײ�������ѯ*****");
				cardUtil.showRemainDetail(searchNumber);
				continue;
			case 3:
				System.out.println("3.��ӡ�����굥");
				cardUtil.printConsumInfo(searchNumber);
				continue;
			case 4:
				System.out.println("4.�ײͱ��");
				continue;
			case 5:
				System.out.println("5.�������� ");
				System.exit(1); // �����������˳�ϵͳ
			}
			break;
		} while (true);
	}

	/**
	 * #�û�ע������
	 */
	public void registCard() {
		System.out.println("*****��ѡ��Ŀ���*****");
		String[] numbers = cardUtil.getNewNumbers(9);
		for (int i = 1; i <= numbers.length; i++) {
			System.out.print(i + "." + numbers[i - 1] + "\t");
			if (i % 3 == 0 && i > 0) {
				System.out.println("");
			}
		}
		MobileCard mCard = new MobileCard();
		System.out.print("��ѡ�񿨺�(����1-9�����):");
		int i = input.nextInt();
		mCard.cardNumber = numbers[i - 1];// ���濨��
		System.out.print("1.�����ײ�  2.�����ײ�  3.�����ײ�,��ѡ���ײ�(�������):");
		int packId = input.nextInt();
		ServicePackage serPackage = cardUtil.createPack(packId);
		mCard.serPackage = serPackage;
		System.out.print("����������:");
		mCard.userName = input.next();
		System.out.print("����������:");
		mCard.passWord = input.next();
		System.out.print("������Ԥ�滰�ѽ��:");
		double money = input.nextDouble();
		while (money < serPackage.getPrice()) {
			System.out.print("��Ԥ��Ļ��ѽ�����֧�����¹̶��ײ��ʷѣ������³�ֵ��");
			money = input.nextDouble();
		}
		// �����¿�
		mCard.money = money;
		cardUtil.addCard(mCard);

	}

	public static void main(String[] args) {
		SosoMgr soso = new SosoMgr();
		soso.mainMenu();
		System.out.println("ллʹ�ã�");
	}
}
