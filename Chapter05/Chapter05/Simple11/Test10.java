package Chapter05.Simple11;

import java.io.File;
import java.io.FileInputStream;

public class Test10 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			// 创建指定文件的流
			fis = new FileInputStream(new File("accp.txt"));
			// 关闭指定文件的流
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
