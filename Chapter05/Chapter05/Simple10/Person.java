package Chapter05.Simple10;

public class Person {
	private String name = ""; // ����
	private int age = 0; // ����
	private String sex = "��";// �Ա�

	public void setSex(String sex) throws Exception {
		if (sex.equals("��") || sex.equals("Ů")) {
			this.sex = sex;
		} else {
			throw new Exception("�Ա������\"��\"����\"Ů\"!");
		}
	}

	public void print() {
		System.out.println(this.name + "(" + this.sex + "," + this.age + "��)");
	}

}
