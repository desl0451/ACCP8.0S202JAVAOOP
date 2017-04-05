package Chapter03.exercise01;

public class Penguin extends Pet {
	private String sex;

	public Penguin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Penguin(String name, String sex) {
		super(name);
		this.sex = sex;
	}

	@Override
	public void eat() {
		if (this.health > 100) {
			System.out.println("企鹅" + this.getName() + "吃饱了，不需要喂食了！");
		} else {
			this.setHealth(this.getHealth() + 5);
			System.out.println("健康值增加5");
		}
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}
}
