package Chapter07.exercise03;

public class Test {
	public static void main(String[] args) {
		// ������ɽ����Ϊ1ǧ��,�ٶȲ�ͬ
		ClimbThread youngMan = new ClimbThread("������", 500, 1);
		ClimbThread oldMan = new ClimbThread("������", 1500, 1);
		System.out.println("***********��ʼ��ɽ**********");
		youngMan.start();
		oldMan.start();
	}
}
