package Chapter05.Simple12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test11 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			// ����ָ�����ļ���
			fis = new FileInputStream(new File("accp.txt"));
		} catch (FileNotFoundException e) {
			System.err.println("�޷�����ָ���ļ�!");
			e.printStackTrace();
		}
		try {
			// �ر�ָ���ļ�����
			fis.close();
		} catch (Exception e) {
			System.err.println("�ر�ָ���ļ�������ʱ�����쳣!");
			e.printStackTrace();
		}
	}
}
