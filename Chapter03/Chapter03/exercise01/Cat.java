package Chapter03.exercise01;

public class Cat extends Pet {
	private String color;// 颜色

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Cat(String name, String color) {
		super(name);
		this.color = color;
	}

	@Override
	public void eat() {
		if (this.health > 100) {
			System.out.println("猫猫" + this.getName() + "吃饱了，不需要喂食了！");
		} else {
			this.setHealth(this.getHealth() + 4);
			System.out.println("健康值增加4");
		}
	}
}
