package Chapter03.exercise01;

public class Master {
	private String name = "";// 主人名字
	private int money = 0; // 元宝数

	public Master() {
	}

	public Master(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void feed(Pet pet) {
		pet.eat();
	}
}
