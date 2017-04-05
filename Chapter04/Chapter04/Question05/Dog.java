package Chapter04.Question05;

public class Dog extends Pet implements Eatable, FlyingDiscCatchable {
	private String strain;// Ʒ��

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, String strain) {
		super(name);
		this.strain = strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	public String getStrain() {
		return strain;
	}

	/**
	 * ��д�����print()����
	 */
	@Override
	public void print() {
		System.out.println("������԰�:\n�ҵ����ֽ�" + this.name + ",�ҵĽ���ֵ��"
				+ this.health + ",�Һ����˵����̶ܳ���" + this.love + "��");
		System.out.println("����һֻ" + this.strain + "��");
	}

	/**
	 * ʵ�ֹ����Է��ķ���
	 */
	@Override
	public void eat() {
		super.health = super.health + 3;
		System.out.println("����" + super.name + "�Ա���!����ֵ����3.");
	}

	public void catchingFlyDisc() {
		System.out.println("����" + super.name + "���ڽӷ��̡�");
		super.health = super.health - 10;
		super.love = super.love + 5;
	}
}
