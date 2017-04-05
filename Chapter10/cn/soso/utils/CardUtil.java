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
	 * 已注册嗖嗖移动用户列表
	 */
	public Map<String, MobileCard> cards = new HashMap<String, MobileCard>();
	/**
	 * 所有卡号消费记录列表
	 */
	public Map<String, List<ConsumInfo>> consumInfos = new HashMap<String, List<ConsumInfo>>();

	List<Scene> scenes = new ArrayList<Scene>();

	/**
	 * #初始化用户#
	 */
	public void init() {
		MobileCard card1 = new MobileCard("何玲玲", "123", "13804578400",
				new TalkPackage(), 58.0, 42.0);
		MobileCard card2 = new MobileCard("黄露露", "123", "13956712467",
				new NetPackage(), 68.0, 32.0);
		MobileCard card3 = new MobileCard("朱蓉蓉", "123", "13911568956",
				new SuperPackage(), 78.0, 22.0);
		MobileCard card4 = new MobileCard("桃跑跑", "123", "13924221868",
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
	 * #使用场景初始化#
	 */
	public void initScenes() {
		scenes.add(new Scene("通话", 90, "问候客户，谁知其如此难缠 通话90分钟"));
		scenes.add(new Scene("通话", 30, "询问妈妈身体状况 本地通话30分钟"));
		scenes.add(new Scene("短信", 5, "参与环境保护实施方案问卷调查 发送短信5条"));
		scenes.add(new Scene("短信", 50, "通知朋友手机换号，发送短信50条"));
		scenes.add(new Scene("上网", 1 * 1024, "和女友微信视频聊天   使用流量1G"));
		scenes.add(new Scene("上网", 2 * 1024, "晚上手机在线看韩剧，不留神睡着啦！ 使用流量 2G"));
	}

	/**
	 * #根据卡号和密码验证该卡是否注册#
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
	 * #根据卡号,验证该卡是否注册
	 * 
	 * @param number
	 * @return
	 */
	public boolean isExistCard(String number) {
		return true;
	}

	/**
	 * #生成随机卡号#
	 * 
	 * @return
	 */
	public String createNumber() {
		Random random = new Random();
		// 记录现有用户中是否存在此卡号用户是:true 否:false
		boolean isExist = false;
		String number = "";
		int temp = 0;
		do {
			isExist = false;// 标志位重置为false,用于控制外重循环
			// 生成的随机数是8位 不能小于10000000,否则重新生成
			do {
				temp = random.nextInt(100000000);
			} while (temp < 10000000);
			// 生成之前,前面加"139"
			number = "139" + temp;
			// 和现有用户的卡号比较,不能是重复的
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
	 * #根据套餐序号返回套餐对象#
	 * 
	 * @param packNum
	 *            套餐序号
	 * @return 套餐对象
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
	 * #生成随机卡号#
	 * 
	 * @param count
	 * @return
	 */
	public String[] getNewNumbers(int count) {
		String[] numbers = new String[count];
		for (int i = 0; i < count; i++) {
			numbers[i] = createNumber();// 返回139开头的11位卡号
		}
		return numbers;
	}

	/**
	 * #注册新卡
	 * 
	 * @param card
	 */
	public void addCard(MobileCard card) {
		cards.put(card.cardNumber, card);
		System.out.print("注册成功！");
		card.showMeg();
	}

	/**
	 * 办理退网
	 * 
	 * @param card
	 */
	public void delCard(MobileCard card) {

	}

	/**
	 * 套餐余量查询
	 * 
	 * @param number
	 */
	public void showRemainDetail(String searchNumber) {
		MobileCard card;// 要查询的卡
		int remainTalkTime;
		int remainSmsCount;
		int remainFlow;
		StringBuffer meg = new StringBuffer();
		card = cards.get(searchNumber);
		meg.append("您的卡号是" + searchNumber + ",套餐内剩余:\n");
		ServicePackage pack = card.getSerPackage();
		if (pack instanceof TalkPackage) {
			// 向下转型为话唠套餐对象
			TalkPackage cardPack = (TalkPackage) pack;
			remainTalkTime = cardPack.getTalkTime() > card.getRealTalkTime() ? cardPack
					.getTalkTime() - card.getRealTalkTime()
					: 0;
			meg.append("通话时长:" + remainTalkTime + "分钟\n");
			remainSmsCount = cardPack.getSmsCount() > card.getRealSMSCount() ? cardPack
					.getSmsCount() - card.getRealSMSCount()
					: 0;
			meg.append("短信条数:" + remainSmsCount + "条");
		} else if (pack instanceof NetPackage) {
			NetPackage cardPack = (NetPackage) pack;

			remainFlow = cardPack.getFlow() > card.getRealFlow() ? cardPack
					.getFlow() - card.getRealFlow() : 0;
			meg.append("上网流量：" + Common.dataFormat(remainFlow * 1.0 / 1024)
					+ "GB");
		} else {
			SuperPackage cardPack = (SuperPackage) pack;
			remainTalkTime = cardPack.getTalkTime() > card.getRealTalkTime() ? cardPack
					.getTalkTime() - card.getRealTalkTime()
					: 0;
			meg.append("通话时长:" + remainTalkTime + "分钟\n");
			remainSmsCount = cardPack.getSmsCount() > card.getRealSMSCount() ? cardPack
					.getSmsCount() - card.getRealSMSCount()
					: 0;
			meg.append("短信条数:" + remainSmsCount + "条");
			remainFlow = cardPack.getFlow() > card.getRealFlow() ? cardPack
					.getFlow() - card.getRealFlow() : 0;
			meg.append("上网流量：" + Common.dataFormat(remainFlow * 1.0 / 1024)
					+ "GB");
		}
		System.out.println(meg);
	}

	/**
	 * 本月账单查询
	 * 
	 * @param number
	 */
	public void showAmountDetail(String searchNumber) {
		MobileCard card;// 要查询的卡
		StringBuffer meg = new StringBuffer();
		card = cards.get(searchNumber);// 获取集合中一个元素
		meg.append("您的卡号:" + card.getCardNumber() + ",当月账单:\n");
		meg.append("套餐资费:" + card.getSerPackage().getPrice() + "元\n");
		meg.append("合计:" + Common.dataFormat(card.getConsumAmount()) + "元\n");
		meg.append("账户余额:" + Common.dataFormat(card.getMoney()) + "元");
		// 显示本月消费详细信息
		System.out.println(meg);
	}

	/**
	 * 添加指定卡号的消费记录
	 * 
	 * @param number
	 * @param info
	 */
	public void addConsumInfo(String number, ConsumInfo info) {

	}

	/**
	 * 使用嗖嗖
	 * 
	 * @param number
	 */
	public void useSoso(String number) {
		MobileCard card = cards.get(number);// 获取此对象
		ServicePackage pack = card.getSerPackage();// 获取此卡所属套餐
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
				// 序号为0或1为通话场景
				if (pack instanceof CallService) {
					// 执行通话方法
					System.out.println(scene.getDescription());
					CallService callService = (CallService) pack;
					try {
						temp = callService.call(scene.getData(), card);
					} catch (Exception e) {
						e.printStackTrace();
					}
					// 添加一条消费记录
					addConsumInfo(number,
							new ConsumInfo(number, scene.getType(), temp));
				} else {
					// 如果该套餐不支持通话功能，则重新生成随机数选择其他场景
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
	 * 资费说明
	 */
	public void showDescription() {

	}

	/**
	 * 套餐变更
	 * 
	 * @param number
	 * @param packNum
	 */
	public void changingPack(String number, String packNum) {

	}

	/**
	 * 添加和打印消费清单
	 * 
	 * @param number
	 */
	public void printConsumInfo(String number) {
		Writer fileWriter = null;
		try {
			fileWriter = new FileWriter(number + "消费记录.txt");
			Set<String> numbers = consumInfos.keySet();
			Iterator<String> it = numbers.iterator();
			List<ConsumInfo> infos = new ArrayList<ConsumInfo>();
			// 存储指定卡的所有消费记录
			// 现有消费列表中是否存在此卡号消费记录,是:true 否:false
			boolean isExist = false;
			// 省略从consumInfos中查找是否存在该卡消费记录的代码
			while (it.hasNext()) {
				if (it.next().equals(number)) {
					infos = consumInfos.get(number);
					isExist = true;
					break;
				}
			}
			if (isExist) {
				StringBuffer content = new StringBuffer("******************"
						+ number + "消费记录******************\n");
				content.append("序号\t类型\t数据(通话(条)/上网(MB)/短信(条))\n");
				for (int i = 0; i < infos.size(); i++) {
					ConsumInfo info = infos.get(i);
					content.append((i + 1) + ".\t" + info.getType() + "\t"
							+ info.getConsumData() + "\n");
				}
				fileWriter.write(content.toString());
				fileWriter.flush();
				System.out.println("消费记录打印完毕!");
			} else {
				StringBuffer content = new StringBuffer(
						"******************消费记录******************\n");
				System.out.println("对不起,不存在此号码的消费记录,不能打印!");
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
	 * 话费充值
	 * 
	 * @param number
	 * @param money
	 */
	public void chargeMoney(String number, double money) {

	}
}
