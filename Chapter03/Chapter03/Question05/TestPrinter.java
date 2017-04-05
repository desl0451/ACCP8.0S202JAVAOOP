package Chapter03.Question05;

public class TestPrinter {
	public static void main(String[] args) {
		Printer dp = new DotMatrixPrinter();
		dp.print();
		Printer ip = new InkpetPrinter();
		ip.print();
		Printer lp = new LaserPrinter();
		lp.print();
	}
}
