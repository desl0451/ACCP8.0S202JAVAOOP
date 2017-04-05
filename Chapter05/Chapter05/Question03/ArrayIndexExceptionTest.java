package Chapter05.Question03;

public class ArrayIndexExceptionTest {

	public static void main(String[] args) {
		int[] num = { 32, 532, 236, 1, 2 };
		try {
			for (int i = 0; i <= num.length; i++) {
				System.out.print(num[i]+" ");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组越界!");
		}
	}

}
