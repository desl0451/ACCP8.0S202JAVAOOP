package Chapter02.Question06;

public class Chook extends Fowl {

	public Chook(String name, String breed) {
		super(name, breed);
	}

	@Override
	public void showInfo() {
		System.out.println("我叫" + this.getName() + "是一只" + this.getBreed());
	}

	public void ding() {
		System.out.println("我会打鸣！");
	}
}
