package Chapter08.Simple04;

import java.io.FileOutputStream;

public class Test {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			String str = "�ú�ѧϰJava";
			byte[] words = str.getBytes();
			fos = new FileOutputStream("D:\\hello.txt");
			fos.write(words, 0, words.length);
			System.out.println("hello�ļ��Ѹ���!");
		} catch (Exception e) {
			System.out.println("�����ļ�ʱ����!");
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
