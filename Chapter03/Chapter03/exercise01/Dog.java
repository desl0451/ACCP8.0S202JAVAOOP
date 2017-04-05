package Chapter03.exercise01;

public class Dog extends Pet {
	/**
	 * 品种
	 */
	private String strain;

	public Dog() {
		super();
	}

	public Dog(String name, String strain) {
		super(name);
		this.strain = strain;
	}

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	@Override
	public void eat() {
		if (this.health > 100) {
			System.out.println("狗狗" + this.getName() + "吃饱了，不需要喂食了！");
		} else {
			this.setHealth(this.getHealth() + 3);
			System.out.println("健康值增加3");
		}
	}
}
