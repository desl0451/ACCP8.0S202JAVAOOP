package Chapter07.Simple08;

public class Wait {
	public static void bySec(long s) {
		for (int i = 0; i < s; i++) {
			System.out.println(i + 1 + "��");
			try {
				Thread.sleep(1000);// ˯��1��
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
