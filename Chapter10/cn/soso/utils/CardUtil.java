package cn.soso.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import cn.soso.common.Common;
import cn.soso.entity.ConsumInfo;
import cn.soso.entity.MobileCard;
import cn.soso.entity.NetPackage;
import cn.soso.entity.Scene;
import cn.soso.entity.ServicePackage;
import cn.soso.entity.SuperPackage;
import cn.soso.entity.TalkPackage;
import cn.soso.service.CallService;

public class CardUtil {
	/**
	 * ��ע�����ƶ��û��б�
	 */
	public Map<String, MobileCard> cards = new HashMap<String, MobileCard>();
	/**
	 * ���п������Ѽ�¼�б�
	 */
	public Map<String, List<ConsumInfo>> consumInfos = new HashMap<String, List<ConsumInfo>>();

	List<Scene> scenes = new ArrayList<Scene>();

	/**
	 * #��ʼ���û�#
	 */
	public void init() {
		MobileCard card1 = new MobileCard("������", "123", "13804578400",
				new TalkPackage(), 58.0, 42.0);
		MobileCard card2 = new MobileCard("��¶¶", "123", "13956712467",
				new NetPackage(), 68.0, 32.0);
		MobileCard card3 = new MobileCard("������", "123", "13911568956",
				new SuperPackage(), 78.0, 22.0);
		MobileCard card4 = new MobileCard("������", "123", "13924221868",
				new TalkPackage(), 78.0, 2.0);
		card4.setConsumAmount(98.0);
		card4.setRealTalkTime(500);
		card4.setRealSMSCount(100);
		cards.put("13804578400", card1);
		cards.put("13956712467", card2);
		cards.put("13911568956", card3);
		cards.put("13924221868", card4);
	}

	/**
	 * #ʹ�ó�����ʼ��#
	 */
	public void initScenes() {
		scenes.add(new Scene("ͨ��", 90, "�ʺ�ͻ���˭֪������Ѳ� ͨ��90����"));
		scenes.add(new Scene("ͨ��", 30, "ѯ����������״�� ����ͨ��30����"));
		scenes.add(new Scene("����", 5, "���뻷������ʵʩ�����ʾ���� ���Ͷ���5��"));
		scenes.add(new Scene("����", 50, "֪ͨ�����ֻ����ţ����Ͷ���50��"));
		scenes.add(new Scene("����", 1 * 1024, "��Ů��΢����Ƶ����   ʹ������1G"));
		scenes.add(new Scene("����", 2 * 1024, "�����ֻ����߿����磬������˯������ ʹ������ 2G"));
	}

	/**
	 * #���ݿ��ź�������֤�ÿ��Ƿ�ע��#
	 * 
	 * @param number
	 * @param passWord
	 * @return
	 */
	public boolean isExistCard(String number, String passWord) {
		Set<String> numbers = cards.keySet();
		Iterator<String> it = numbers.iterator();
		while (it.hasNext()) {
			String searchNum = it.next();
			if (searchNum.equals(number)
					&& cards.get(searchNum).getPassWord().equals(passWord)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * #���ݿ���,��֤�ÿ��Ƿ�ע��
	 * 
	 * @param number
	 * @return
	 */
	public boolean isExistCard(String number) {
		return true;
	}

	/**
	 * #�����������#
	 * 
	 * @return
	 */
	public String createNumber() {
		Random random = new Random();
		// ��¼�����û����Ƿ���ڴ˿����û���:true ��:false
		boolean isExist = false;
		String number = "";
		int temp = 0;
		do {
			isExist = false;// ��־λ����Ϊfalse,���ڿ�������ѭ��
			// ���ɵ��������8λ ����С��10000000,������������
			do {
				temp = random.nextInt(100000000);
			} while (temp < 10000000);
			// ����֮ǰ,ǰ���"139"
			number = "139" + temp;
			// �������û��Ŀ��űȽ�,�������ظ���
			Set<String> cardNumbers = cards.keySet();
			for (String cardNumber : cardNumbers) {
				if (number.equals(cardNumber)) {
					isExist = true;
					break;
				}
			}
		} while (isExist);
		return number;
	}

	/**
	 * #�����ײ���ŷ����ײͶ���#
	 * 
	 * @param packNum
	 *            �ײ����
	 * @return �ײͶ���
	 */
	public ServicePackage createPack(int packId) {
		ServicePackage sPackage = null;
		switch (packId) {
		case 1:
			sPackage = new TalkPackage();
			break;
		case 2:
			sPackage = new SuperPackage();
			break;
		case 3:
			sPackage = new NetPackage();
		}
		return sPackage;
	}

	/**
	 * #�����������#
	 * 
	 * @param count
	 * @return
	 */
	public String[] getNewNumbers(int count) {
		String[] numbers = new String[count];
		for (int i = 0; i < count; i++) {
			numbers[i] = createNumber();// ����139��ͷ��11λ����
		}
		return numbers;
	}

	/**
	 * #ע���¿�
	 * 
	 * @param card
	 */
	public void addCard(MobileCard card) {
		cards.put(card.cardNumber, card);
		System.out.print("ע��ɹ���");
		card.showMeg();
	}

	/**
	 * ��������
	 * 
	 * @param card
	 */
	public void delCard(MobileCard card) {

	}

	/**
	 * �ײ�������ѯ
	 * 
	 * @param number
	 */
	public void showRemainDetail(String searchNumber) {
		MobileCard card;// Ҫ��ѯ�Ŀ�
		int remainTalkTime;
		int remainSmsCount;
		int remainFlow;
		StringBuffer meg = new StringBuffer();
		card = cards.get(searchNumber);
		meg.append("���Ŀ�����" + searchNumber + ",�ײ���ʣ��:\n");
		ServicePackage pack = card.getSerPackage();
		if (pack instanceof TalkPackage) {
			// ����ת��Ϊ�����ײͶ���
			TalkPackage cardPack = (TalkPackage) pack;
			remainTalkTime = cardPack.getTalkTime() > card.getRealTalkTime() ? cardPack
					.getTalkTime() - card.getRealTalkTime()
					: 0;
			meg.append("ͨ��ʱ��:" + remainTalkTime + "����\n");
			remainSmsCount = cardPack.getSmsCount() > card.getRealSMSCount() ? cardPack
					.getSmsCount() - card.getRealSMSCount()
					: 0;
			meg.append("��������:" + remainSmsCount + "��");
		} else if (pack instanceof NetPackage) {
			NetPackage cardPack = (NetPackage) pack;

			remainFlow = cardPack.getFlow() > card.getRealFlow() ? cardPack
					.getFlow() - card.getRealFlow() : 0;
			meg.append("����������" + Common.dataFormat(remainFlow * 1.0 / 1024)
					+ "GB");
		} else {
			SuperPackage cardPack = (SuperPackage) pack;
			remainTalkTime = cardPack.getTalkTime() > card.getRealTalkTime() ? cardPack
					.getTalkTime() - card.getRealTalkTime()
					: 0;
			meg.append("ͨ��ʱ��:" + remainTalkTime + "����\n");
			remainSmsCount = cardPack.getSmsCount() > card.getRealSMSCount() ? cardPack
					.getSmsCount() - card.getRealSMSCount()
					: 0;
			meg.append("��������:" + remainSmsCount + "��");
			remainFlow = cardPack.getFlow() > card.getRealFlow() ? cardPack
					.getFlow() - card.getRealFlow() : 0;
			meg.append("����������" + Common.dataFormat(remainFlow * 1.0 / 1024)
					+ "GB");
		}
		System.out.println(meg);
	}

	/**
	 * �����˵���ѯ
	 * 
	 * @param number
	 */
	public void showAmountDetail(String searchNumber) {
		MobileCard card;// Ҫ��ѯ�Ŀ�
		StringBuffer meg = new StringBuffer();
		card = cards.get(searchNumber);// ��ȡ������һ��Ԫ��
		meg.append("���Ŀ���:" + card.getCardNumber() + ",�����˵�:\n");
		meg.append("�ײ��ʷ�:" + card.getSerPackage().getPrice() + "Ԫ\n");
		meg.append("�ϼ�:" + Common.dataFormat(card.getConsumAmount()) + "Ԫ\n");
		meg.append("�˻����:" + Common.dataFormat(card.getMoney()) + "Ԫ");
		// ��ʾ����������ϸ��Ϣ
		System.out.println(meg);
	}

	/**
	 * ���ָ�����ŵ����Ѽ�¼
	 * 
	 * @param number
	 * @param info
	 */
	public void addConsumInfo(String number, ConsumInfo info) {

	}

	/**
	 * ʹ����
	 * 
	 * @param number
	 */
	public void useSoso(String number) {
		MobileCard card = cards.get(number);// ��ȡ�˶���
		ServicePackage pack = card.getSerPackage();// ��ȡ�˿������ײ�
		Random random = new Random();
		int ranNum = 0;
		int temp = 0;
		do {
			ranNum = random.nextInt(6);
			Scene scene = scenes.get(ranNum);
			switch (ranNum) {
			case 0:
				break;
			case 1:
				// ���Ϊ0��1Ϊͨ������
				if (pack instanceof CallService) {
					// ִ��ͨ������
					System.out.println(scene.getDescription());
					CallService callService = (CallService) pack;
					try {
						temp = callService.call(scene.getData(), card);
					} catch (Exception e) {
						e.printStackTrace();
					}
					// ���һ�����Ѽ�¼
					addConsumInfo(number,
							new ConsumInfo(number, scene.getType(), temp));
				} else {
					// ������ײͲ�֧��ͨ�����ܣ����������������ѡ����������
				}
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;

			default:
				break;
			}
		} while (true);

	}

	/**
	 * �ʷ�˵��
	 */
	public void showDescription() {

	}

	/**
	 * �ײͱ��
	 * 
	 * @param number
	 * @param packNum
	 */
	public void changingPack(String number, String packNum) {

	}

	/**
	 * ��Ӻʹ�ӡ�����嵥
	 * 
	 * @param number
	 */
	public void printConsumInfo(String number) {
		Writer fileWriter = null;
		try {
			fileWriter = new FileWriter(number + "���Ѽ�¼.txt");
			Set<String> numbers = consumInfos.keySet();
			Iterator<String> it = numbers.iterator();
			List<ConsumInfo> infos = new ArrayList<ConsumInfo>();
			// �洢ָ�������������Ѽ�¼
			// ���������б����Ƿ���ڴ˿������Ѽ�¼,��:true ��:false
			boolean isExist = false;
			// ʡ�Դ�consumInfos�в����Ƿ���ڸÿ����Ѽ�¼�Ĵ���
			while (it.hasNext()) {
				if (it.next().equals(number)) {
					infos = consumInfos.get(number);
					isExist = true;
					break;
				}
			}
			if (isExist) {
				StringBuffer content = new StringBuffer("******************"
						+ number + "���Ѽ�¼******************\n");
				content.append("���\t����\t����(ͨ��(��)/����(MB)/����(��))\n");
				for (int i = 0; i < infos.size(); i++) {
					ConsumInfo info = infos.get(i);
					content.append((i + 1) + ".\t" + info.getType() + "\t"
							+ info.getConsumData() + "\n");
				}
				fileWriter.write(content.toString());
				fileWriter.flush();
				System.out.println("���Ѽ�¼��ӡ���!");
			} else {
				StringBuffer content = new StringBuffer(
						"******************���Ѽ�¼******************\n");
				System.out.println("�Բ���,�����ڴ˺�������Ѽ�¼,���ܴ�ӡ!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * ���ѳ�ֵ
	 * 
	 * @param number
	 * @param money
	 */
	public void chargeMoney(String number, double money) {

	}
}
