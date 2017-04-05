package Chapter02.Question06;

public class Duck extends Fowl {

	public Duck(String name, String breed) {
		super(name, breed);
	}

	@Override
	public void showInfo() {
		System.out.println("我叫"+this.getName()+"是一只"+this.getBreed());
	}

	public void swimming() {
		System.out.println("我会游泳！");
	}
}
