package Chapter08.exercise01;

import java.io.File;

public class FileMethods {

	public static void main(String[] args) {
		FileMethods fm = new FileMethods();
		File file = new File("D:\\hello.txt");
		fm.create(file);
		fm.showFileInfo(file);
	}

	public void create(File file) {
		if (!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("�ļ��Ѵ���!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void delete(File file) {
		if (file.exists()) {
			file.delete();
			System.out.println("�ļ�ɾ��");
		}
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
