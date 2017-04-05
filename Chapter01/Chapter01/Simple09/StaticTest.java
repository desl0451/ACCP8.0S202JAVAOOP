package Chapter01.Simple09;

public class StaticTest {
	static int i;
	static int m = 30;
	int j;
	int k = 25;
	static {
		i = 10;
		System.out.println("i的初始化值为:" + i);
	}

	public StaticTest() {
		j = 20;
		System.out.println("j的初始化值为:" + j);
	}

	public static void getNum() {
		System.out.println("得到i的值为:" + i);
	}

	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		System.out.println("i的值为:"+StaticTest.i);
		st.getNum();
		System.out.println("m的值为:"+st.m);
		System.out.println("k的值为:"+st.k);
	}
}
