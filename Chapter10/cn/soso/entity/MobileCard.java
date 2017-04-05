package cn.soso.entity;

/**
 * ���ƶ���
 */
public class MobileCard {
	public MobileCard() {
	}

	public MobileCard(String userName, String passWord, String cardNumber,
			ServicePackage serPackage, double consumAmount, double money) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.cardNumber = cardNumber;
		this.serPackage = serPackage;
		this.consumAmount = consumAmount;
		this.money = money;
	}

	/**
	 * ����
	 */
	public String cardNumber;
	/**
	 * �û���
	 */
	public String userName;
	/**
	 * ����
	 */
	public String passWord;
	/**
	 * �����ײ�
	 */
	public ServicePackage serPackage;
	/**
	 * �������ѽ��
	 */
	public double consumAmount;
	/**
	 * �˻����
	 */
	public double money;
	/**
	 * ����ʵ��ͨ��ʱ��
	 */
	public int realTalkTime;
	/**
	 * ����ʵ�ʷ��Ͷ�������
	 */
	public int realSMSCount;
	/**
	 * ����ʵ����������
	 */
	public int realFlow;

	/**
	 * ��ʾ������Ϣ���ײ���Ϣ
	 */
	public void showMeg() {
		System.out.println("  ����:" + this.cardNumber + "  �û���:" + this.userName
				+ "  ��ǰ���:" + this.money + "Ԫ��");
		this.serPackage.showInfo();
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public ServicePackage getSerPackage() {
		return serPackage;
	}

	public void setSerPackage(ServicePackage serPackage) {
		this.serPackage = serPackage;
	}

	public double getConsumAmount() {
		return consumAmount;
	}

	public void setConsumAmount(double consumAmount) {
		this.consumAmount = consumAmount;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public int getRealTalkTime() {
		return realTalkTime;
	}

	public void setRealTalkTime(int realTalkTime) {
		this.realTalkTime = realTalkTime;
	}

	public int getRealSMSCount() {
		return realSMSCount;
	}

	public void setRealSMSCount(int realSMSCount) {
		this.realSMSCount = realSMSCount;
	}

	public int getRealFlow() {
		return realFlow;
	}

	public void setRealFlow(int realFlow) {
		this.realFlow = realFlow;
	}

}
