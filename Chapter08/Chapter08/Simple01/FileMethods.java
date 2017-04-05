package Chapter08.Simple01;

import java.io.File;

public class FileMethods {
	public static void main(String[] args) {
		FileMethods fm = new FileMethods();
		File file = new File("D:\\hello.txt");
		fm.showFileInfo(file);
	}

	public void showFileInfo(File file) {
		if (file.exists()) {
			if (file.isFile()) {
				System.out.println("����:" + file.getName());
				System.out.println("���·��:" + file.getPath());
				System.out.println("����·��:" + file.getAbsolutePath());
				System.out.println("�ļ���С:" + file.length() + "�ֽ�");
			}
			if (file.isDirectory()) {
				System.out.println("���ļ���Ŀ¼");
			}
		} else {
			System.out.println("�ļ�������");
		}
	}
}
