package Chapter03.Simple12;

public class Cat extends Pet {
	private String color;// ÑÕÉ«

	public Cat(String name, String color) {
		super(name);
		this.color = color;
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.health = super.health + 4;
		System.out.println("Ã¨ßä" + super.name + "³Ô±¥À²!½¡¿µÖµÔö¼Ó4¡£");
	}
}
