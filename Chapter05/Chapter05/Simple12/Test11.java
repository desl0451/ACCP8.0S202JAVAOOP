package Chapter05.Simple12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test11 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			// 创建指定的文件流
			fis = new FileInputStream(new File("accp.txt"));
		} catch (FileNotFoundException e) {
			System.err.println("无法批到指定文件!");
			e.printStackTrace();
		}
		try {
			// 关闭指定文件的流
			fis.close();
		} catch (Exception e) {
			System.err.println("关闭指定文件输入流时出现异常!");
			e.printStackTrace();
		}
	}
}
