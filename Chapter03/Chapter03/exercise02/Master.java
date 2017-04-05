package Chapter03.exercise02;

public class Master {
	private String name = "";// 主人名字
	private int money = 0;// 元宝数

	public Master(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}

	/**
	 * 宠物喂食
	 */
	public void feed(Pet pet) {
		pet.eat();
	}

	public void play(Pet pet) {
		if (pet instanceof Dog) {
			Dog dog = (Dog) pet;
			dog.catchingFlyDisc();
		} else if (pet instanceof Penguin) {
			Penguin pgn = (Penguin) pet;
			pgn.swimming();
		}
	}

	public Pet getPet(int typeId) {
		Pet pet = null;
		if (typeId == 1) {
			pet = new Dog("欧欧", "藏獒");
		} else if (typeId == 2) {
			pet = new Penguin("小仔仔", "Q仔");
		}
		return pet;
	}

}
