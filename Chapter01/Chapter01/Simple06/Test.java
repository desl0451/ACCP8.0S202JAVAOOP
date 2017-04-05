package Chapter01.Simple06;

public class Test {
	public static void main(String[] args) {
		Penguin pgn=new Penguin();
		System.out.println("第一个企鹅的性别是:"+pgn.sex+".");
		pgn=new Penguin();
		pgn.sex=pgn.SEX_FEMALE;
		System.out.println("第二个企鹅的性别是:"+pgn.sex+".");
		pgn.sex=pgn.SEX_MALE;
		System.out.println("第三个企鹅的性别是:"+pgn.sex+".");

	}
}
