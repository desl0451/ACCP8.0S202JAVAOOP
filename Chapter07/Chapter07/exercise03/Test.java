package Chapter07.exercise03;

public class Test {
	public static void main(String[] args) {
		// 两人爬山，均为1千米,速度不同
		ClimbThread youngMan = new ClimbThread("年轻人", 500, 1);
		ClimbThread oldMan = new ClimbThread("老年人", 1500, 1);
		System.out.println("***********开始爬山**********");
		youngMan.start();
		oldMan.start();
	}
}
