package Chapter08.Simple07;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test {

	public static void main(String[] args) {
		Writer fw = null;
		try {
			// 创建一个FileWriter对象
			fw = new FileWriter("d:\\hello.txt");
			// 写入信息
			fw.write("我爱你中国");
			fw.flush();
		} catch (IOException e) {
			System.out.println("文件不存在!");
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
