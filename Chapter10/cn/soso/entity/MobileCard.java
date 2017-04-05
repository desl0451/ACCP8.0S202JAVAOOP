package cn.soso.entity;

/**
 * 嗖嗖移动卡
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
	 * 卡号
	 */
	public String cardNumber;
	/**
	 * 用户名
	 */
	public String userName;
	/**
	 * 密码
	 */
	public String passWord;
	/**
	 * 所属套餐
	 */
	public ServicePackage serPackage;
	/**
	 * 当月消费金额
	 */
	public double consumAmount;
	/**
	 * 账户余额
	 */
	public double money;
	/**
	 * 当月实际通话时长
	 */
	public int realTalkTime;
	/**
	 * 当月实际发送短信条数
	 */
	public int realSMSCount;
	/**
	 * 当月实际上网流量
	 */
	public int realFlow;

	/**
	 * 显示本卡信息和套餐信息
	 */
	public void showMeg() {
		System.out.println("  卡号:" + this.cardNumber + "  用户名:" + this.userName
				+ "  当前余额:" + this.money + "元。");
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
