package Chapter08.Simple04;

import java.io.FileOutputStream;

public class Test {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			String str = "好好学习Java";
			byte[] words = str.getBytes();
			fos = new FileOutputStream("D:\\hello.txt");
			fos.write(words, 0, words.length);
			System.out.println("hello文件已更新!");
		} catch (Exception e) {
			System.out.println("创建文件时出错!");
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
