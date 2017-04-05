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
				System.out.println("名称:" + file.getName());
				System.out.println("相对路径:" + file.getPath());
				System.out.println("绝对路径:" + file.getAbsolutePath());
				System.out.println("文件大小:" + file.length() + "字节");
			}
			if (file.isDirectory()) {
				System.out.println("此文件是目录");
			}
		} else {
			System.out.println("文件不存在");
		}
	}
}
