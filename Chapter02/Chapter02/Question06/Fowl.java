package Chapter02.Question06;

/**
 * 家禽
 */
public abstract class Fowl {
	/**
	 * 名字
	 */
	private String name;
	/**
	 * 种类
	 */
	private String breed;

	public Fowl() {
		super();
	}

	/**
	 * 吃
	 * 
	 * @param food
	 */
	public void eat(String food) {
		System.out.println("我喜欢吃" + food);
	}

	public Fowl(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public abstract void showInfo();
}
