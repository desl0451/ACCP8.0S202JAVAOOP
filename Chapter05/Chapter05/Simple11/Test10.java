package Chapter05.Simple11;

import java.io.File;
import java.io.FileInputStream;

public class Test10 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			// ����ָ���ļ�����
			fis = new FileInputStream(new File("accp.txt"));
			// �ر�ָ���ļ�����
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
