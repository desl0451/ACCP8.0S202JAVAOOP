package Chapter08.Simple05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Test {

	public static void main(String[] args) {
		Reader fr = null;
		StringBuffer sbf = null;
		try {
			fr = new FileReader("d:\\���.txt");
			char ch[] = new char[1024];
			sbf = new StringBuffer();
			int length = fr.read(ch);// ���ַ���������
			// ѭ����ȡ׷���ַ�
			while (length != -1) {
				sbf.append(ch);
				length = fr.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(sbf.toString());
	}
}
