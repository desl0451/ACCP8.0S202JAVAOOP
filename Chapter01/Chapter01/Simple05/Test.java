package Chapter01.Simple05;

public class Test {
	public static void main(String[] args) {
		//系统默认会分配一个无参数构造 ，调用无参数构造赋值
		Penguin pgn=new Penguin();
		System.out.println("第一个企鹅的性别是:"+pgn.sex+".");
		pgn=new Penguin();
		pgn.sex=pgn.SEX_FEMALE;
		System.out.println("第二个企鹅的性别是:"+pgn.sex+".");
		pgn.sex=pgn.SEX_MALE;
		System.out.println("第三个企鹅的性别是:"+pgn.sex+".");

	}
}
