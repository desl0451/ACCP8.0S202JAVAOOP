package Chapter05.exercise02;

public class Person {
	private String name = "";// ����
	private int age = 0;// ����
	private String sex = "��"; // �Ա�

	public void setAge(int age) throws Exception {
		if (age < 1 || age > 100) {
			throw new Exception("���������1��100֮��!");
		} else {
			this.age = age;
		}
	}

	public void setSex(String sex) throws Exception {
		if (sex.equals("��") || sex.equals("Ů")) {
			this.sex = sex;
		} else {
			throw new Exception("�Ա������\"��\"����\"Ů\"!");
		}
	}

}
