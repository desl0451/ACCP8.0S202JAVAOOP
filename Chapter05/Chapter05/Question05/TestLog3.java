package Chapter05.Question05;

import org.apache.log4j.Logger;

public class TestLog3 {
	private static Logger logger = Logger.getLogger(TestLog3.class.getName());

	public static void main(String[] args) {
		int[] num = { 23, 234, 45, 456, 7, 12 };
		try {
			for (int i = 0; i <= num.length; i++) {
				System.out.print(num[i] + " ");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			logger.debug("数组越界" + e.getMessage());
		}
	}
}
