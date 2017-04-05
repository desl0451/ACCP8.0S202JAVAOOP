package Chapter06.exercise04;

public class Penguin extends Pet {
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Penguin(Integer id, String name, String sex) {
		super(name);
		this.id = id;
		this.sex = sex;
	}

	private String sex;// �Ա�

	public Penguin(String name, String sex) {
		super(name);
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("�Ա���:" + this.sex + "��");
	}

	@Override
	public void eat() {
		super.health = super.health + 5;
		System.out.println("���" + super.name + "�Ա���!����ֵ����5��");
	}
}
